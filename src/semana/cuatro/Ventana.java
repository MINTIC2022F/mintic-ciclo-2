package semana.cuatro;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class Ventana extends JFrame {
    
    public Ventana(){
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        
        setTitle("Mi primer interfaz");
        setLocation(500,300);
        setSize(700,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String[] encabezados={"Pais", "Oro", "Plata", "Bronce"};
        String[][] valores={
            {"China", "29", "17", "16"},
            {"Estados Unidos", "22", "25", "17"},
            {"Japón", "17", "6", "10"}
        };
        
        JTable tabla = new JTable(valores, encabezados);
        JScrollPane scroll = new JScrollPane(tabla);
        add(scroll);
        //pack();
        
        
        
        //MiPanel panel = new MiPanel();
        //add(panel);
        setVisible(true);
        
    }
    
}
