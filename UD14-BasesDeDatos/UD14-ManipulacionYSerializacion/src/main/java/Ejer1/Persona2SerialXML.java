package Ejer1;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Persona2SerialXML {
    public static void main(String[] args) {
        Path archivo = Paths.get("Persona2XML.txt");

        try {
            if (Files.notExists(archivo)) {
                System.out.println("Creando el archivo...");
                Files.createFile(archivo);
                System.out.println("Archivo creado en: " + archivo.toAbsolutePath());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        // Creo el objeto persona
        Persona2 personaXML = new Persona2("Gabriel",34,"ejemplo1234gmail.com");
        // Serializar el objeto

        try (BufferedWriter escritor = Files.newBufferedWriter(archivo, StandardOpenOption.APPEND)) {

            JAXBContext context = JAXBContext.newInstance(Persona2.class);

            Marshaller marsh = context.createMarshaller();

            marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

            // Para capturar el XML en una cadena
            StringWriter cadenaXML = new StringWriter();

            marsh.marshal(personaXML, cadenaXML);

            // Luego de realizar el XML, escribo en el archivo creado y guardo el XML
            escritor.write(cadenaXML.toString());
            escritor.newLine();

            System.out.println("Escritura correcta");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}