package Ejer4;

import Ejer2.DataBaseConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Interface extends JFrame{
    private JTextField campoNombre, campoApellidos, campoDireccion;
    private JButton botonInsertar, botonCerrar;
    private DataBaseConnection bbdd;
    private Connection conexion;

    public Interface(DataBaseConnection bd){
        this.bbdd = bd; // establecer la base de datos al objeto
        this.conexion = bbdd.conectarBase(); // inicializar la variable conexion

        // Configuracion de la interfaz grafica
        setTitle("Insercion de alumnos");
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Elementos de la ventana
        add(new JLabel("Nombre: "));
        campoNombre = new JTextField(); // inicializacion del atributo del objeto Interface
        add(campoNombre); // añadir el atributo a la ventana

        add(new JLabel("Apellidos: "));
        campoApellidos = new JTextField();
        add(campoApellidos);

        add(new JLabel("Direccion: "));
        campoDireccion = new JTextField();
        add(campoDireccion);

        botonInsertar = new JButton("Insertar alumno");
        add(botonInsertar);

        botonCerrar = new JButton("Terminar");
        add(botonCerrar);

        setVisible(true);

        botonInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertarAlumno();
            }
        });

        botonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarProceso();
            }
        });
    }

    public void insertarAlumno(){
        String nombre = campoNombre.getText();
        String apellidos = campoApellidos.getText();
        String direccion = campoDireccion.getText();

        String consulta = "INSERT INTO alumno (nombre, apellidos, direccion) VALUES (?, ?, ?)";

        try (PreparedStatement pst = conexion.prepareStatement(consulta)) {
            pst.setString(1, nombre);
            pst.setString(2, apellidos);
            pst.setString(3, direccion);

            pst.executeUpdate();
            System.out.println("Insercion realizada correctamente");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void cerrarProceso(){
        bbdd.desconectar();
        dispose();
    }
}