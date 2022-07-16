package semana.cuatro;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiPanel extends JPanel {

    public MiPanel() {
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        JLabel tituloEtiqueta = new JLabel("Mi primer etiqueta");
        tituloEtiqueta.setFont(new Font("Arial", Font.BOLD, 30));
        tituloEtiqueta.setForeground(Color.BLUE);
        tituloEtiqueta.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField texto= new JTextField(20);
        texto.setFont(new Font("Jokerman", Font.ITALIC, 20));
        texto.setHorizontalAlignment(JTextField.LEFT);

    
        JButton boton= new JButton("Enviar");
        boton.setFont(new Font("Calibri", Font.BOLD, 50));
        
        JCheckBox check = new JCheckBox("Hola");
        
        
        add(tituloEtiqueta);
        add(texto);
        add(boton);
        add(check);
    }

}
