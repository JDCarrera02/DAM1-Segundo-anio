package JavaSwing.Interfaces.Ejer4;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Formulario2 extends JFrame {
    private JTextField campoNombre, campoCorreo;
    private DataBase baseDeDatos;
    private Connection conexion;

    public Formulario2(DataBase bbdd){
        this.baseDeDatos = bbdd; // inicializacion de los atributos de la interfaz
        this.conexion = baseDeDatos.conectarBase(); // Inicializacion de la conexion

        setTitle("Insercion de usuarios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500,500));
        setLayout(new GridLayout(3,2,10,10));

        JLabel etNombre = new JLabel("Nombre:");
        add(etNombre);
        campoNombre = new JTextField(12);
        add(campoNombre);

        JLabel etCorreo = new JLabel("Correo:");
        add(etCorreo);
        campoCorreo = new JTextField(12);
        add(campoCorreo);

        JButton botonRegistrar = new JButton("Registrar");
        add(botonRegistrar);

        JButton botonCerrar = new JButton("Cerrar");
        add(botonCerrar);

        botonRegistrar.addActionListener(e -> registrar());

        botonCerrar.addActionListener(e -> cerrarVentana());

        setVisible(true);
    }

    private void cerrarVentana(){
        baseDeDatos.desconectar();
        dispose();
    }

    private void registrar(){
        String nombre = campoNombre.getText();
        String correo = campoCorreo.getText();

        String sql = "INSERT INTO usuario (nombre, correo) VALUES (?, ?)";

        try {
            PreparedStatement prst = conexion.prepareStatement(sql);
            prst.setString(1,nombre);
            prst.setString(2,correo);

            if (prst.executeUpdate() >= 1) {
                System.out.println("Insercion realizada correctamente");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}