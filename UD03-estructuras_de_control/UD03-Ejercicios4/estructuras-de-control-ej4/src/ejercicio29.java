/* 
 * Crea un programa que "dibuje" un rectángulo hueco, cuyo borde sea una fila
    (o columna) de asteriscos y cuyo interior esté formado por espacios en
    blanco, con el ancho y el alto que indique el usuario.
*/
// Diseño del algoritmo (Pseudocodigo):
//Proceso rectangulo_hueco
//      Definir ancho, alto, i, j Como Entero;
//      Escribir "Dame la altura del triangulo"
//      Leer alto;
//      Escribir "Dame el ancho del triangulo"
//      Leer ancho;
//      i <- 0
//      j <- 0
//      Para i hasta alto con paso +1;
//          Para j hasta ancho con paso +1;
//              si (i = 0  o i = alto-1)
//                  escribir "*";
//              Sino
//                  si (j = 0 o j = ancho-1)
//                      escribir "*"
//                  si (j != 0 y j != ancho-1)
//                      escribir " "
//      escribir saltar
//FinProceso
import java.util.Scanner;
public class ejercicio29 {
    public static void main(String[] args) {
        // Crear el escaner de lectura para las variables alto y ancho
        Scanner sc = new Scanner(System.in);
        // Creamos las variables que necesitamos (alto, ancho, i y j)
        int alto, ancho, i, j;
        // Pedimos los datos al usuario
        System.out.println("Digite el alto del rectangulo");
        alto = sc.nextInt();
        System.out.println("Digite el ancho del rectangulo");
        ancho = sc.nextInt();
        // Este for es para imprimir las filas (alto) del rectangulo
        for (i = 0; i < alto; i++) {
            //este for es para imprimir las columnas (ancho) del rectangulo
            for(j = 0 ; j< ancho; j++){
                // Para imprimir la primera linea y la ultima con asteriscos(alto del rectangulo)
                if(i==0 || i == alto-1){
                    System.out.print("*");
                } else{
                // para imprimir el primer y ultimo asterisco del ancho
                // el primer condicional es solo para poner un asterisco al principio y uno al final del ancho
                    if(j == 0 || j == ancho-1)
                        System.out.print("*");
                        // Este segundo condicional es para poner el espacio en blanco
                        // si el valor de j es diferente de 0 y ancho-1 es decir, si la posicion de j es 1 entonces pondrá un espacio en blanco
                        // si el valor de j es diferente del final del ancho, es decir si el final del ancho es 5, y j es 4 o 3, se pondrá un espacio
                    if(j != 0 && j != ancho-1) 
                        System.out.print(" ");
                }        
            }
            // salto de linea al finalizar la iteracion de j
            System.out.print("\n");
        }
    }
}