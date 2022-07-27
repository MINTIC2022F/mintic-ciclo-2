package semana.seis;

import java.sql.Connection;
import java.util.ArrayList;

public class Ejecucion {

    public static void main(String[] args) {
        Connection conn = ConexionBD.conectarBD();

        Concesionario concesionario = new Concesionario(123, "Bogota centro");
        //Camioneta camioneta = new Camioneta("ZZZ-204", 3100, "4X2", "Peru", "Rio", 123);
        Camioneta camioneta = new Camioneta(202, "ZZZ-204", 2200);

        //CRUD
        //C->create
//        boolean resultado=CamionetaDAO.insertarCaminioneta(conn, camioneta);
//        if(resultado==true){
//            System.out.println("INSERTÓ CORRECTAMENTE");
//        }else{
//            System.out.println("NO SE CREO EL REGISTRO");
//        }
        //R->Read
//        ArrayList<Camioneta> listaCamioneta=CamionetaDAO.obtenerCamioneta(conn);
//        System.out.println(listaCamioneta);
//        //U->update
//        boolean resultado=CamionetaDAO.actualizarCamioneta(conn, camioneta);
//        if(resultado==true){
//            System.out.println("ACTUALIZÓ CORRECTAMENTE");
//        }else{
//            System.out.println("NO SE ACTUALIZÓ EL REGISTRO");
//        }
//    }
        //D->delete
        boolean resultado = CamionetaDAO.borrarCamioneta(conn, camioneta.getId());
        if (resultado == true) {
            System.out.println("BORRÓ CORRECTAMENTE");
        } else {
            System.out.println("NO SE BORRÓ EL REGISTRO");
        }
    }

}
