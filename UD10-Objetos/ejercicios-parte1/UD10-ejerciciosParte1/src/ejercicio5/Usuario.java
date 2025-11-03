package ejercicio5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
    private String nombreUsuario;
    private String contrasena;

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean verificarContrasena(String ingreso){
        return (ingreso.equals(contrasena));
    }

    public String cambiarContrasena(String nuevaContrasena){
        String regex = "\\b(?=.*[A-z])(?=.*\\d).{8,}\\b";
        Pattern patron = Pattern.compile(regex);
        Matcher matcher = patron.matcher(nuevaContrasena);

        if (matcher.matches()){
            return "La contraseña cumple con lo requerido";
        }else {
            return "La contraseña no cumple con lo requerido";
        }
    }
}