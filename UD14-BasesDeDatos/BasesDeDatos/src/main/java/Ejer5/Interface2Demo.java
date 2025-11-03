package Ejer5;

import Ejer2.DataBaseConnection;

public class Interface2Demo {
    public static void main(String[] args) {
        String url, user, password, dbName;
        url = "jdbc:mysql://localhost/";
        user = "root";
        password = "1234";
        dbName = "instituto";

        DataBaseConnection bbdd = new DataBaseConnection(url,user,password,dbName);
        new Interface2(bbdd);

    }
}