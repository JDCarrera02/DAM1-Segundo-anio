package pruebaEjerConf;

import Ejer3.Configuracion;

public class demoConfig {
    public static void main(String[] args) {
        Configuracion configuracion = new Configuracion("Verde", "Spanish", 34);

        // configuracion.serializarConfJson(configuracion);

        configuracion.serializarConfXml(configuracion);
    }
}
