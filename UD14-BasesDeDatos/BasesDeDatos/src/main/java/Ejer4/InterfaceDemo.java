package Ejer4;

import Ejer2.DataBaseConnection;

public class InterfaceDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pass = "1234";
        String dbName = "instituto";

        DataBaseConnection bbdd = new DataBaseConnection(url, user, pass, dbName);
        new Interface(bbdd);
    }
}
