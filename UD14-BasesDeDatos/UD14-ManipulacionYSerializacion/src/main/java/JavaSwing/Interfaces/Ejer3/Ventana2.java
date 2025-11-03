package JavaSwing.Interfaces.Ejer3;

import javax.swing.*;
import java.awt.*;

public class Ventana2 extends JFrame {
    protected JTextField campoNombre;

    public Ventana2(){
        setTitle("Index");
        setSize(new Dimension(500,500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2,10,10));

        JLabel etiquetaNombre = new JLabel("Escribe tu nombre:");
        add(etiquetaNombre);

        campoNombre = new JTextField(15);
        add(campoNombre);

        JButton botonEnviar = new JButton("Intro");
        add(botonEnviar);

        botonEnviar.addActionListener(e -> abrirSaludo());

        setVisible(true);
    }

    private void abrirSaludo() {
        String nombre = campoNombre.getText();
        if (!nombre.isBlank()) {
            new VentanaSaludo(nombre);
        } else {
            System.out.println("No escribiste nada, vuelve a intentarlo");
        }
    }

    public static void main(String[] args) {
        new Ventana2();
    }
}