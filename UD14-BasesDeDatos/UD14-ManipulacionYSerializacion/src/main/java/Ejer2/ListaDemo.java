package Ejer2;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class ListaDemo {
    public static void main(String[] args) {
        Path archivojson = Paths.get("listaProductosJson.txt");
        Path archivoXml = Paths.get("listaProductosXml.txt");

        try {
            if (Files.notExists(archivojson)){
                System.out.println("Creando archivo json...");
                Files.createFile(archivojson);
                System.out.println("Archivo creado en: " + archivojson.toAbsolutePath());
            }
            if (Files.notExists(archivoXml)){
                System.out.println("Creando fichero xml...");
                Files.createFile(archivoXml);
                System.out.println("Archivo creado en: " + archivoXml.toAbsolutePath());
            }
        } catch (IOException e){
            e.getMessage();
        }

        ListaProductos1 listaProductos = new ListaProductos1();

        listaProductos.getListaProductos().add(new Producto(1,"Atun",4.20));
        listaProductos.getListaProductos().add(new Producto(2,"Jamon York", 2.30));

        // Convertir lista a JSON
        ObjectMapper obj = new ObjectMapper();
        try {
            String json = obj.writeValueAsString(listaProductos);
            System.out.println("Serializacion realizada");
            try(BufferedWriter escritor = Files.newBufferedWriter(archivojson, StandardOpenOption.APPEND)){
                escritor.write(json);
                escritor.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        ListaProductos listaProductos2 = new ListaProductos();

        listaProductos2.getListaProductos().add(new Producto2(1,"Atun",4.20));
        listaProductos2.getListaProductos().add(new Producto2(2, "Jamon York", 2.30));


        // Convertir lista a XML
        try (BufferedWriter escritor = Files.newBufferedWriter(archivoXml, StandardOpenOption.APPEND)){
            JAXBContext context = JAXBContext.newInstance(ListaProductos.class);

            Marshaller marshaller = context.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            StringWriter contenido = new StringWriter();

            marshaller.marshal(listaProductos2, contenido);

            escritor.write(contenido.toString());
            escritor.newLine();

            System.out.println("Serializacion XML realizada correctamente");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}