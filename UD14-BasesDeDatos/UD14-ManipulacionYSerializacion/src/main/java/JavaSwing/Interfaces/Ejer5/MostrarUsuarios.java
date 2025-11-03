package JavaSwing.Interfaces.Ejer5;

import JavaSwing.Interfaces.Ejer4.DataBase;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MostrarUsuarios extends JFrame {
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private DataBase bbdd;
    private Connection conexion;

    public MostrarUsuarios(DataBase ddbb){
        this.bbdd = ddbb;
        this.conexion = bbdd.conectarBase();


        setTitle("Usuarios");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        modeloTabla = new DefaultTableModel();
        tabla = new JTable(modeloTabla);
        JButton actualizar = new JButton("Actualizar");
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);
        add(actualizar);

        String sql = "SELECT * FROM usuario";
        try (Statement statement = conexion.createStatement()){
            ResultSet rSet = statement.executeQuery(sql);
            modeloTabla.addColumn("id");
            modeloTabla.addColumn("nombre");
            modeloTabla.addColumn("correo");

            while (rSet.next()){
                modeloTabla.addRow(new Object[] {
                        rSet.getInt("id"),
                        rSet.getString("nombre"),
                        rSet.getString("correo")
                });
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }

        colHeaders();

        setVisible(true);
    }

    public void colHeaders(){
        TableColumnModel modeloColumn = tabla.getColumnModel();
        modeloColumn.getColumn(0).setHeaderValue("Id");
        modeloColumn.getColumn(1).setHeaderValue("Nombre");
        modeloColumn.getColumn(2).setHeaderValue("Correo");

        tabla.getTableHeader().repaint();
    }
}