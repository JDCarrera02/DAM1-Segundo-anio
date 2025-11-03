/**
 * Crea un programa que genere un array de 10 números aleatorios entre -10 y
10. El programa mostrará los números contenidos en el array. Después el
programa debe mostrar los elementos que no se repiten.
 */

public class ejercicio10 {
    public static void main(String[] args) {
        int [] arreglo1 = new int[10];
        int [] no_reps1 = new int [arreglo1.length];
        int contador = 0;
        boolean logic_not_reps;
        // llenamos el array con los numeros aleatorios:
        for (int i = 0; i < arreglo1.length; i++) {
            int aleatorio = (int) (Math.random()*21)-10;
            arreglo1[i] = aleatorio;
            // Mostramos los numeros en el array:
            System.out.print(arreglo1[i] + " ");
        }
        System.out.println();
        // recorremos el array en busqueda de los elementos que no se repiten:
        for (int i = 0; i < arreglo1.length; i++) {
            logic_not_reps = true;
            for (int j = 0; j < arreglo1.length; j++) {
                if (i != j && arreglo1[i] == arreglo1[j]) {
                    logic_not_reps = false;
                    break;
                }
            }
            if (logic_not_reps){
                no_reps1[contador] = arreglo1[i];
                contador++;
            }
        }
        System.out.println("Elementos no repetidos: ");
        int [] no_repsDef = new int[contador];
        for (int i = 0; i < contador; i++) {
            no_repsDef[i] = no_reps1[i];
            System.out.print(no_repsDef[i]+ " ");
        } 
    }
    
}
