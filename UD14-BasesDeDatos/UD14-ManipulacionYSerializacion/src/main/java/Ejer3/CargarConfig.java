package Ejer3;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CargarConfig {
    private final Path archivojson = Paths.get("archivos"+File.separator+"json"+File.separator+"config.json");
    private final Path archivoxml = Paths.get("archivos"+File.separator+"xml"+File.separator+"config.xml");

    public CargarConfig (){

    }

    public void deserealizarJson(){
        try (BufferedReader lector = Files.newBufferedReader(archivojson)){
            String lineaJson;
            while ((lineaJson = lector.readLine()) != null){
                ObjectMapper mapper = new ObjectMapper();
                try {
                    Configuracion conf = mapper.readValue(lineaJson, Configuracion.class);
                    System.out.println(conf.getTema() + " | " + conf.getIdioma() + " | " + conf.getVolumen());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Deserializacion json completada");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void deserializarXml(){
        try (BufferedReader lector = Files.newBufferedReader(archivoxml)){
            try {
                JAXBContext context = JAXBContext.newInstance(Configuracion.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                Configuracion config = (Configuracion) unmarshaller.unmarshal(lector);
                System.out.println(config.getTema() + " | " + config.getIdioma() + " | " + config.getVolumen());
            } catch (JAXBException e){
                throw new RuntimeException(e);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println("Deserializacion xml realizada");
    }
}