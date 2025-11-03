package Ejer3;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@XmlRootElement (name = "configuracion")
@XmlAccessorType (XmlAccessType.FIELD)
public class Configuracion {
    protected String tema, idioma;
    protected int volumen;

    private static final String rutaCarpetaPadre = "archivos"+File.separator;
    private static final String rutaCarpetaJson = rutaCarpetaPadre+"json"+File.separator;
    private static final String rutaCarpetaXml = rutaCarpetaPadre+"xml"+File.separator;
    private static final String archivojson = rutaCarpetaJson+"config.json";
    private static final String archivoxml = rutaCarpetaXml+"config.xml";

    public Configuracion(String tema, String idioma, int volumen) {
        this.tema = tema;
        this.idioma = idioma;
        this.volumen = volumen;
    }

    public Configuracion() {

    }

    public String getTema() {
        return tema;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getVolumen() {
        return volumen;
    }

    public boolean comprobarCarpetas(){
        Path carpetaVirtualPadre = Paths.get(rutaCarpetaPadre);
        Path carpetaVirtualJson = Paths.get(rutaCarpetaJson);
        Path carpetaVirtualXml = Paths.get(rutaCarpetaXml);

        try {
            if (Files.notExists(carpetaVirtualPadre)){
                Files.createDirectories(carpetaVirtualPadre);
            }

            if (Files.notExists(carpetaVirtualJson)){
                Files.createDirectories(carpetaVirtualJson);
            }

            if (Files.notExists(carpetaVirtualXml)){
                Files.createDirectories(carpetaVirtualXml);
            }
        } catch (IOException e){
            e.getMessage();
        }
        return true;
    }

    public void serializarConfJson(Configuracion config){
        // Creo el Path para utilizar los metodos para la serializacion
        Path archivoVirtual = Paths.get(archivojson);

        // Compruebo que la estructura de directorios esté creada, si no, no procedo a serializar
        if (!comprobarCarpetas()){
            return;
        }

        try { // Compruebo si el archivo existe, en caso contrario, lo creo y prosigo
            if (Files.notExists(archivoVirtual)){
                System.out.println("Creando archivo json...");
                Files.createFile(archivoVirtual);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        // Si todo esta correcto, entonces procedo al bloque try donde se realizara la serializacion json
        try (BufferedWriter escritor = Files.newBufferedWriter(archivoVirtual, StandardOpenOption.APPEND)){
            // ObjectMapper para serializar
            ObjectMapper mapper = new ObjectMapper();
            // String para escribir el objeto config (parametro) en una cadena
            String json = mapper.writeValueAsString(config);
            // Escribir en el archivo
            escritor.write(json);
            escritor.newLine(); // Nueva linea para separar en el caso que sean mas registros

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void serializarConfXml(Configuracion config){
        Path archivoVirtualXml = Paths.get(archivoxml);

        if (!comprobarCarpetas()) {
            return;
        }

        try {
            if (Files.notExists(archivoVirtualXml)){
                Files.createFile(archivoVirtualXml);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter escritor = Files.newBufferedWriter(archivoVirtualXml, StandardOpenOption.APPEND)){
            try {
                JAXBContext context = JAXBContext.newInstance(Configuracion.class);

                Marshaller marshaller = context.createMarshaller();

                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

                StringWriter contenido = new StringWriter();

                marshaller.marshal(config, contenido);

                escritor.write(contenido.toString());

            } catch (JAXBException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}