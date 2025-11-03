package JavaSwing.Interfaces.Ejer3;

import javax.swing.*;
import java.awt.*;

public class VentanaSaludo extends JFrame {
    public VentanaSaludo (String nombre){
        setTitle("Index");
        setSize(new Dimension(300,200));
        dispose();
        setLayout(new GridLayout(1,1,10,10));

        JLabel etiquetaNombre = new JLabel("Hola, " + nombre + " !");
        add(etiquetaNombre);

        setVisible(true);
    }
}