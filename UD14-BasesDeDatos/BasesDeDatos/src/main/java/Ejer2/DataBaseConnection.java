package Ejer2;

import java.sql.*;
import java.util.List;

public class DataBaseConnection {
    private Connection conexion;
    private String url, user, password, dbName;

    public DataBaseConnection(String url, String user, String password, String dbName) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.dbName = dbName;
    }

    public DataBaseConnection() {

    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getDbName() {
        return dbName;
    }

    public Connection conectarBase(){
        try {
            conexion = DriverManager.getConnection(url+dbName,user,password);
            System.out.println("Conexion realizada correctamente");
        } catch (SQLException e){
            System.out.println("Error al conectar la base de datos");
        }
        return conexion;
    }

    public void desconectar(){
        try {
            if (conexion != null){
                conexion.close();
                System.out.println("Desconexion exitosa");
            }
        } catch (SQLException e){
            System.out.println("Error al desconectar la base de datos");
        }
    }

    public void realizarInsercion(List<String[]> alumnos){
        if (!alumnos.isEmpty()){
            String sql = "INSERT INTO alumno (nombre, apellidos, direccion) VALUES (?, ?, ?)";
            try (PreparedStatement prepared = conexion.prepareStatement(sql)) {
                for (String [] alumno : alumnos){
                    prepared.setString(1,alumno[0]);
                    prepared.setString(2, alumno[1]);
                    prepared.setString(3, alumno[2]);
                    prepared.addBatch();
                }
                prepared.executeBatch();
                System.out.println("Alumnos insertados correctamente");
            } catch (SQLIntegrityConstraintViolationException e) {
                System.out.println("El id ya existe en la base de datos"); // Manejo de excepcion si se inserta un id existente (importante declarar en mysql el id como llave primaria)

            } catch (SQLException e){
                System.out.println("Error al realizar la insercion de los datos, intenta nuevamente");
            }
        } else {
            System.out.println("La lista no puede estar vacia, insercion cancelada...");
        }
    }

    public void mostrarDatos(){
        String sql = "SELECT * FROM alumno";
        try (Statement statement = conexion.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {
             System.out.println("ID | Nombre | Apellidos | Dirección");
             System.out.println("-----------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String direccion = rs.getString("direccion");

                System.out.printf("%d | %s | %s | %s%n", id, nombre, apellidos, direccion);
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar los alumnos: " + e.getMessage());
        }
    }
}