package Ejer5;

import Ejer2.DataBaseConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Interface2 extends JFrame{
    private JTextField campoId, campoNombre, campoApellidos, campoDireccion;
    private JButton botonModificar, botonCerrar;
    private DataBaseConnection bbdd;
    private Connection conexion;

    public Interface2(DataBaseConnection bd){
        this.bbdd = bd; // establecer la base de datos al objeto
        this.conexion = bbdd.conectarBase(); // inicializar la variable conexion

        // Configuracion de la interfaz grafica
        setTitle("Modificacion de alumnos");
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Elementos de la ventana
        add(new JLabel("Id del registro a modificar: "));
        campoId = new JTextField();
        add(campoId);

        add(new JLabel("Nombre: "));
        campoNombre = new JTextField(); // inicializacion del atributo del objeto Interface
        add(campoNombre); // añadir el atributo a la ventana

        add(new JLabel("Apellidos: "));
        campoApellidos = new JTextField();
        add(campoApellidos);

        add(new JLabel("Direccion: "));
        campoDireccion = new JTextField();
        add(campoDireccion);

        botonModificar = new JButton("Modificar alumno");
        add(botonModificar);

        botonCerrar = new JButton("Terminar");
        add(botonCerrar);

        setVisible(true);

        botonModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarAlumno();
            }
        });

        botonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarProceso();
            }
        });

        setVisible(true);
    }

    public void editarAlumno(){
        // Creo la instruccion sql para la modificacion del alumno especificado por el campo "Id"
        String sql = "UPDATE alumno SET nombre = ?, apellidos = ?, direccion = ? WHERE id = ?"; // Sentencia de modificacion
        // Creo las variables donde se guardarán los resultados de la consulta
        String id = campoId.getText();
        String nombre = campoNombre.getText();
        String apellidos = campoApellidos.getText();
        String direccion = campoDireccion.getText();

        // El bloque try para trabajar con el preparedStatement y ejecutar la modificacion en cada uno de los campos requeridos
        try (PreparedStatement prst = conexion.prepareStatement(sql)){
            prst.setString(1,nombre); // el primer '?' de la consulta
            prst.setString(2,apellidos); // el segundo '?' de la consulta
            prst.setString(3,direccion); // el tercer '?' de la consulta
            prst.setInt(4, Integer.parseInt(id)); // el ultimo '?' de la consulta
            int rows =  prst.executeUpdate(); // guardar filas afectadas si ocurre la modificacion
            if (rows >= 1){ // condicional para mostrar un mensaje de exito o de error
                System.out.println("Modificacion exitosa");
            } else {
                System.out.println("No se ha realizado la modificacion, utiliza un id existente"); // en el caso que no se digite un id existente o no valido
            }
        } catch (SQLException e){
            e.printStackTrace(); // si otro error inesperado ocurre
        }
    }

    public void cerrarProceso(){ // Metodo para cerrar la conexion con la base de datos y cerrar la ventana
        bbdd.desconectar();
        dispose();
    }
}