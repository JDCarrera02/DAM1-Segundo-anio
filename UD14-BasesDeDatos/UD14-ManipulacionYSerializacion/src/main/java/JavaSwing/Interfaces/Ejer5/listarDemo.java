package JavaSwing.Interfaces.Ejer5;

import JavaSwing.Interfaces.Ejer4.DataBase;

public class listarDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pass = "1234";
        String bdName = "usuarios";

        DataBase baseDeDatos = new DataBase(url,user,pass,bdName);
        new MostrarUsuarios(baseDeDatos);
    }
}