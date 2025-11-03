package JavaSwing.Interfaces.Ejer1;

import javax.swing.*;
import java.awt.*;

public class VentanaSimple{
    public static void main(String[] args) {
        JFrame ventana = new JFrame();

        ventana.setTitle("Ventana basica");
        ventana.setSize(200, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());

        // Añadiendo JLabel

        JLabel etiqueta = new JLabel("¡Hola, mundo!");
        ventana.add(etiqueta);

        ventana.setVisible(true);
    }
}
