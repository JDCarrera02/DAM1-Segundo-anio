package Ejer1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "persona2")
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona2 {
    private String nombre;
    private int edad;
    private String correo;


    public Persona2(){

    }

    public Persona2(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }


    public String getCorreo() {
        return correo;
    }
}