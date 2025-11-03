package ejercicio5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prueba {
    public static void main(String[] args) {
        String texto = "wsc2yhUb";
        String regex = "\\b(?=.*[A-z])(?=.*\\d).{8,}\\b";
        Pattern patron = Pattern.compile(regex);
        Matcher matcher = patron.matcher(texto);

        if (matcher.matches()){
            System.out.println("Correcto");
        } else {
            System.out.println("incorrecto");
        }
    }
}
