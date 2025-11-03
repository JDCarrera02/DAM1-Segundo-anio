package Strings;
/**
 * Codifica una función que devuelva una cadena de caracteres con los
 * caracteres en el orden inverso al orden original.
 * “Hola mundo” = “odnum aloH”.
 */

public class ejercicio15 {
    public static void main(String[] args) {
        /**
         * Forma de realizarlo con un for, empezando desde el final del String
         * Orden inverso es un String vacío en el que estaremos guardando con cada iteración el caracter obtenido,
         * por eso utilizamos charAt(i), para que el caracter ecnotrado en i se obtenga y se pueda guardar en el string
         * ordenInverso.
         */
        String texto = "Hola mundo";
        String ordenInverso = "";
        for (int i = texto.length()-1; i >= 0; i--) {
            ordenInverso += texto.charAt(i);
        }
        System.out.println(texto + " = " + ordenInverso);
        System.out.println("Otra forma de invertir la cadena pero con StringBuilder(): ");
        System.out.println(StringInvertido(texto));
    }
    /**
     * Función para invertir una cadena utilizando StringBuilder():
     */

    static String StringInvertido (String textExample){
        return new StringBuilder(textExample).reverse().toString();
    }
}