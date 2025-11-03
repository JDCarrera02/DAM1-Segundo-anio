package Ejer3;

public class AplicacionDemo {
    public static void main(String[] args) {

        Configuracion config = new Configuracion("Azul", "English", 43);

        //config.serializarConfJson(config);

        //config.serializarConfXml(config);

        CargarConfig cargar = new CargarConfig();

        //cargar.deserealizarJson();

        cargar.deserializarXml();



    }
}