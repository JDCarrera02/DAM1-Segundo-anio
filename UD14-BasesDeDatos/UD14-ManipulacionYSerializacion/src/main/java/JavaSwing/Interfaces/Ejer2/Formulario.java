package JavaSwing.Interfaces.Ejer2;

import javax.swing.*;
import java.awt.*;

public class Formulario {
    private static final String USER = "admin";
    private static final String PASSWORD = "1234";
    private static JTextField campoUsuario, campoPaswd;

    public static void main(String[] args) {

        JFrame ventana = new JFrame();

        ventana.setTitle("Inicio de sesion");
        ventana.setSize(500, 450);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel usuario = new JLabel("Usuario:");
        ventana.add(usuario);

        campoUsuario = new JTextField(15);
        ventana.add(campoUsuario);

        JLabel contrasena = new JLabel("Contraseña:");
        ventana.add(contrasena);

        campoPaswd = new JTextField(15);
        ventana.add(campoPaswd);

        JButton botonIniciar = new JButton("Iniciar sesion");
        ventana.add(botonIniciar);

        botonIniciar.addActionListener(e -> iniciarSesion());

        ventana.setVisible(true);
    }

    private static void iniciarSesion(){
        String usuario = campoUsuario.getText();
        String password = campoPaswd.getText();

        if (usuario.equals(USER) && password.equals(PASSWORD)){
            new NewWindow();
        } else {
            System.out.println("El usuario o contraseña no son validos");
        }
    }
}