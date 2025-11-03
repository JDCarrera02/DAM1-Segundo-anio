import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@XmlRootElement (name = "configuracion")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfiguracionBeta {
    private String tema, idioma;
    private int volumen;

    private static final String directorio = "archivos/";
    private static final Path archivoJson = Paths.get("config.json");
    private static final Path archivoXml = Paths.get("config.xml");

    public ConfiguracionBeta(String tema, String idioma, int volumen) {
        this.tema = tema;
        this.idioma = idioma;
        this.volumen = volumen;
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

    public ConfiguracionBeta() {
    }


    public void guardarConfiguracionJson(){
        try {
            Path carpeta = Paths.get(directorio);
            Files.createDirectories(carpeta);

            Path archivojson = carpeta.resolve(archivoJson);
            ObjectMapper ob = new ObjectMapper();
            String contenido = ob.writeValueAsString(this);

            try (BufferedWriter escritor = Files.newBufferedWriter(archivojson, StandardOpenOption.APPEND)){
                escritor.write(contenido);
                escritor.newLine();
            }

            System.out.println("Configuracion guardada correctamente en: " + archivojson.toAbsolutePath());
        } catch (IOException e){
            System.out.println("Error");
        }
    }

    public void guardarConfiguracionXml(){
        try {
            Path carpeta = Paths.get(directorio);
            Files.createDirectories(carpeta);

            Path archivoxml = carpeta.resolve(archivoXml);
            JAXBContext context = JAXBContext.newInstance(ConfiguracionBeta.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(this, stringWriter);
            String contenidoXml = stringWriter.toString();

            try (BufferedWriter escritor = Files.newBufferedWriter(archivoxml, StandardOpenOption.APPEND)){
                escritor.write(contenidoXml);
                escritor.newLine();
            }

            System.out.println("Configuración guardada como XML en: " + archivoxml.toAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}