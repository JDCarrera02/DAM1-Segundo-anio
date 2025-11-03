package Ejer1;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Persona2DeserialXml {
    public static void main(String[] args) {
        Path archivo = Paths.get("Persona2XML.txt");
        try (BufferedReader lector = Files.newBufferedReader(archivo)) {
            try {
                JAXBContext context = JAXBContext.newInstance(Persona2.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();

                Persona2 persona = (Persona2) unmarshaller.unmarshal(lector);

                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Edad: " + persona.getEdad());
                System.out.println("Correo: " + persona.getCorreo());
            } catch (Exception e){
                e.printStackTrace();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
