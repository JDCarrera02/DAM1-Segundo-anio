package Ejer7;

import Ejer2.DataBaseConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Interface4 extends JFrame {
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private DataBaseConnection bbdd;
    private Connection conexion;

    public Interface4(DataBaseConnection bd){
        this.bbdd = bd;
        this.conexion = bd.conectarBase();

        // Creacion de la ventana
        setTitle("Alumnos");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        modeloTabla = new DefaultTableModel();
        tabla = new JTable(modeloTabla);
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);

        String consulta = "SELECT * FROM alumno";
        try (Statement statement = conexion.createStatement()) {
            ResultSet resultSet = statement.executeQuery(consulta);
            modeloTabla.addColumn("id");
            modeloTabla.addColumn("nombre");
            modeloTabla.addColumn("apellidos");
            modeloTabla.addColumn("direccion");

            while (resultSet.next()){
                modeloTabla.addRow(new Object[]{
                        resultSet.getInt("id"),
                        resultSet.getString("nombre"),
                        resultSet.getString("apellidos"),
                        resultSet.getString("direccion")
                });
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        colHeaders();

        setVisible(true);

    }

    public void colHeaders(){
        TableColumnModel modeloColumn = tabla.getColumnModel();
        modeloColumn.getColumn(0).setHeaderValue("Id");
        modeloColumn.getColumn(1).setHeaderValue("Nombre");
        modeloColumn.getColumn(2).setHeaderValue("Apellidos");
        modeloColumn.getColumn(3).setHeaderValue("Direccion");

        tabla.getTableHeader().repaint();

    }
}
