package Ejer5;

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

@XmlRootElement (name = "gerente")
@XmlAccessorType(XmlAccessType.FIELD)
public class Gerente extends Empleado{
    private double bono;

    private static final String carpetaPadre = "gerenteLogs"+File.separator;
    private static final String carpetaJson = carpetaPadre+"jsonGerente"+File.separator;
    private static final String carpetaXml = carpetaPadre+"xmlGerente"+File.separator;
    private static final String gerenteJson = carpetaJson+"gerente.json";
    private static final String gerenteXml = carpetaXml+"gerente.xml";

    public Gerente(int id, String nombre, double salario, double bono) {
        super(id, nombre, salario);
        this.bono = bono;
    }

    public Gerente() {

    }

    public double getBono() {
        return bono;
    }

    public boolean comprobarDirectorios(){
        Path dirVirtualPadre = Paths.get(carpetaPadre);
        Path dirVirtualJson = Paths.get(carpetaJson);
        Path dirVirtualXml = Paths.get(carpetaXml);

        try {
            if (Files.notExists(dirVirtualPadre)){
                Files.createDirectories(dirVirtualPadre);
            }

            if (Files.notExists(dirVirtualJson)){
                Files.createDirectories(dirVirtualJson);
            }

            if (Files.notExists(dirVirtualXml)){
                Files.createDirectories(dirVirtualXml);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        return true;
    }

    public void serializarGerenteJson(Gerente gerente){
        Path archivoJson = Paths.get(gerenteJson);

        if (!comprobarDirectorios()){
            return;
        }

        try {
            if (Files.notExists(archivoJson)){
                Files.createFile(archivoJson);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        try (BufferedWriter escritor = Files.newBufferedWriter(archivoJson, StandardOpenOption.APPEND)){
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(gerente);
            escritor.write(json);
            System.out.println("Serializacion json realizada");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void serializarGerenteXml(Gerente gerente){
        Path archivoXml = Paths.get(gerenteXml);
        if (!comprobarDirectorios()){
            return;
        }

        try {
            if (Files.notExists(archivoXml)){
                Files.createFile(archivoXml);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        try (BufferedWriter escritor = Files.newBufferedWriter(archivoXml, StandardOpenOption.APPEND)){
            try {
                JAXBContext context = JAXBContext.newInstance(Gerente.class);
                Marshaller marshaller = context.createMarshaller();
                StringWriter contenido = new StringWriter();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshaller.marshal(gerente, contenido);
                escritor.write(contenido.toString());
                System.out.println("Serializacion xml realizada");
            } catch (JAXBException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}