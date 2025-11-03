package Ejer1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Persona1DeserialJson {
    public static void main(String[] args) {
        Path archivo = Paths.get("PersonaJson.txt");

        try (BufferedReader lector = Files.newBufferedReader(archivo)){
            String linea;
            ObjectMapper obj = new ObjectMapper();
            while ((linea = lector.readLine()) != null){
                Persona persona = obj.readValue(linea,Persona.class);

                System.out.println("Nombre: " + persona.getNombre() + " | Edad: " + persona.getEdad() + " | Correo: " + persona.getCorreo());
            }
            System.out.println("Deserializacion exitosa");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}