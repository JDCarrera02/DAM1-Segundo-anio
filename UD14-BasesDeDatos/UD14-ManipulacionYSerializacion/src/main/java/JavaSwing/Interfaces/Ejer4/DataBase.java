package JavaSwing.Interfaces.Ejer4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private String url, user, password, dbName;
    private Connection conexion;

    public DataBase(String url, String user, String password, String dbName) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.dbName = dbName;
    }

    public DataBase(){

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
            throw new RuntimeException(e);
        }
        return conexion;
    }

    public void desconectar(){
        try {
            if (conexion != null){
                conexion.close();
                System.out.println("Desconexion exitosa");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}