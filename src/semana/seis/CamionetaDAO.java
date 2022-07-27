package semana.seis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CamionetaDAO {

    public static boolean insertarCaminioneta(Connection conn, Camioneta camioneta) {
        int filasAfectadas = 0;
        String sql = "INSERT INTO camioneta(cam_placa, cam_cilindraje, "
                + "cam_referencia, cam_pais, cam_ciu_pla, cam_con_id) VALUES"
                + "(?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            //statement.setInt(1, camioneta.getId());
            statement.setString(1, camioneta.getPlaca());
            statement.setInt(2, camioneta.getCilindraje());
            statement.setString(3, camioneta.getReferencia());
            statement.setString(4, camioneta.getPais());
            statement.setString(5, camioneta.getCidadPlaca());
            statement.setInt(6, camioneta.getConcesionarioIdenticacion());

            filasAfectadas = statement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("ERROR EN CREACION SQL");
            ex.printStackTrace();

        }
        if (filasAfectadas > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<Camioneta> obtenerCamioneta(Connection conn) {
        ArrayList<Camioneta> listaCamioneta = new ArrayList<>();
        String sql = "SELECT cam_id, cam_placa, cam_cilindraje, cam_con_id FROM camioneta";

        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                int id = resultado.getInt(1);
                String placa = resultado.getString(2);
                int cilindraje = resultado.getInt(3);
                int id_concesionario = resultado.getInt(4);
                Camioneta camioneta = new Camioneta(id, placa, cilindraje, id_concesionario);
                listaCamioneta.add(camioneta);

            }

        } catch (SQLException e) {
            System.out.println("ERROR EN CONSULTA SQL");
            e.printStackTrace();
        }
        return listaCamioneta;
    }

    public static boolean actualizarCamioneta(Connection conn, Camioneta camioneta) {
        int filasAfectadas = 0;
        String sql = "UPDATE camioneta SET cam_cilindraje=?, cam_placa=? WHERE cam_id=? ";

        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, camioneta.getCilindraje());
            statement.setString(2, camioneta.getPlaca());
            statement.setInt(3, camioneta.getId());

            filasAfectadas = statement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("ERROR EN ACTUALIZACION SQL");
            ex.printStackTrace();

        }
        if (filasAfectadas > 0) {
            return true;
        } else {
            return false;
        }
    }
    
     public static boolean borrarCamioneta(Connection conn, int id) {
        int filasAfectadas = 0;
        String sql = "DELETE FROM camioneta WHERE cam_id=? ";

        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            filasAfectadas = statement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("ERROR EN ELIMINACION SQL");
            ex.printStackTrace();

        }
        if (filasAfectadas > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    

}
