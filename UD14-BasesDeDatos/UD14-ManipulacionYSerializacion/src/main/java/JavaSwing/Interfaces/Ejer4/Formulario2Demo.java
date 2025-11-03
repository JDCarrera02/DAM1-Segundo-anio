package JavaSwing.Interfaces.Ejer4;

public class Formulario2Demo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/";
        String user = "root";
        String password = "1234";
        String dbName = "usuarios";
        DataBase baseDeDatos = new DataBase(url,user,password,dbName);
        new Formulario2(baseDeDatos);
    }
}