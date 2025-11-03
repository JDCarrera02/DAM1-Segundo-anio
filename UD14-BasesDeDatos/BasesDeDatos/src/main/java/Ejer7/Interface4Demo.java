package Ejer7;

import Ejer2.DataBaseConnection;

public class Interface4Demo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pass = "1234";
        String bdName = "instituto";

        DataBaseConnection bbdd = new DataBaseConnection(url,user,pass,bdName);
        new Interface4(bbdd);
    }
}
