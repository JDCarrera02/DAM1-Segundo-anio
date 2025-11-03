package Ejer1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PersonaSerialJsonDemo {
    public static void main(String[] args) {
        Path archivo = Paths.get("PersonaJson.txt");

        try {
            if (Files.notExists(archivo)){ // Si el archivo no existe, lo creo
                System.out.println("Creando el archivo...");
                Files.createFile(archivo);
                System.out.println("Archivo creado en: " + archivo.toAbsolutePath());
            }
        } catch (IOException e){
            System.out.println("Error al crear el archivo");
        }

        // Creo el objeto persona
        Persona persona1 = new Persona("Juan", 21, "jdcExample@gmail.com");

        // Serializacion del objeto persona

        ObjectMapper obj = new ObjectMapper(); // Objeto Mapper

        // Creo el objeto bufferedWriter para escribir lo guardado en el json al archivo creado al principio del programa
        // StandardOpenOption.APPEND : para que cada vez que se abra el documento, no sobreescriba la informacion existente
        try (BufferedWriter escritor = Files.newBufferedWriter(archivo, StandardOpenOption.APPEND)){
            String json = obj.writeValueAsString(persona1);
            escritor.write(json);
            escritor.newLine();
            System.out.println("Escritura realizada con exito");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}