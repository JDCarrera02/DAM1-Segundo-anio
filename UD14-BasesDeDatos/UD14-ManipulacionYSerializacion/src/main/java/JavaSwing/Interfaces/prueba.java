package JavaSwing.Interfaces;

import javax.swing.*;
import java.awt.*;

public class prueba {
    public static void main(String[] args) {

        JLabel etiqueta1 = new JLabel();
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(Color.RED);
        etiqueta1.setBounds(50,50,200,200);

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setOpaque(true);
        etiqueta2.setBackground(Color.BLUE);
        etiqueta2.setBounds(100,100,200,200);

        JLabel etiqueta3 = new JLabel();
        etiqueta3.setBackground(Color.DARK_GRAY);
        etiqueta3.setBounds(150,150,200,200);

        JLayeredPane pane = new JLayeredPane();
        pane.setBounds(0,0,500,500);

        pane.add(etiqueta1);
        pane.add(etiqueta2);
        pane.add(etiqueta3);

        JFrame ventana = new JFrame("Prueba 1");

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(new Dimension(500,500));
        ventana.setLayout(null);

        ventana.add(pane);

        ventana.setVisible(true);
    }
}