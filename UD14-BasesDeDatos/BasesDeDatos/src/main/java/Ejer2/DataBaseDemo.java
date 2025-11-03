package Ejer2;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Primero creamos lo necesario para conectarnos a la base de datos
        String url, user, password, dbName;
        url = "jdbc:mysql://localhost/";
        user = "root";
        password = "1234";
        dbName = "instituto";

        // Objeto DataBaseConnection, le paso los parametros
        DataBaseConnection baseDeDatos = new DataBaseConnection(url,user,password,dbName);
        // Creo la variable conexion para guardar los resultados del metodo conectarBase()
        // Creo la lista de arrays de String donde se guardaran los alumnos
        List<String[]> listaAlumnos = new ArrayList<>();
        // Lleno la lista
        String nombre, apellidos, direccion;
        while (listaAlumnos.size() < 10){
            System.out.print("Escribe un nombre: ");
            nombre = sc.nextLine();
            System.out.print("Escribe un apellido: ");
            apellidos = sc.nextLine();
            System.out.print("Escribe una direccion: ");
            direccion = sc.nextLine();
            System.out.println();
            // Al trabajar con una lista de arreglos de String, definimos los campos con lo que se va escribiendo en el orden especificado
            // Siendo la posicion [0] el nombre, [1] los apellidos, [2] la direccion = esto quiere decir que tenemos arrays de Strings con dimension de 3 elementos
            // (Si quisieramos añadir mas, lo podemos hacer, ya que la lista nos permite trabajar con datos de este tipo)
            listaAlumnos.add(new String[]{nombre,apellidos,direccion});
        }

        // Realizamos la insercion de los datos obtenidos
        try (Connection conexion = baseDeDatos.conectarBase()) {
            if (conexion != null){ // Nos aseguramos de que debe de conectarse a la base de datos para realizar la insercion de los datos
                baseDeDatos.realizarInsercion(listaAlumnos); // Llamamos al metodo insertar para meter la lista llena y realizar la consulta de insercion
                baseDeDatos.desconectar(); // Cerramos la conexion a la base de datos
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Mostramos los registros de la base de datos
        try (Connection connection = baseDeDatos.conectarBase()) {
            if (connection != null) {
                baseDeDatos.mostrarDatos();
                baseDeDatos.desconectar(); // Cerramos la conexion a la base de datos
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Para el ejercicio tres (insertar un id existente)
    }
}