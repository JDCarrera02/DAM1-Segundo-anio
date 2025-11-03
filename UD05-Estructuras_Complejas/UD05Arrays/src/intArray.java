
import java.util.Arrays;
import java.util.Scanner;

/**
 * a) Codifica una función que genere un array de una longitud dada de
enteros aleatorios pertenecientes a un rango dado empezando en un
entero mínimo dado.
b) Codifica una función que recorra todos los elementos de un array de
enteros y los muestre por consola en una línea.
c) Codifica una función que busque un valor entre los elementos de un
array de enteros, el valor de retorno de la función será el primer índice
en el que se ha encontrado al número o -1 si no existe en el array.
d) Codifica una función que busque un valor entre los elementos de un
array de enteros a partir de un índice dado, el valor de retorno de la
función será el primer índice en el que se ha encontrado al número o -
1 si no existe en el array.
e) Codifica una función que devuelva el mínimo de los datos en el array.
f) Codifica una función que devuelva el máximo de los datos en el array.
g) Codifica una función que devuelva la suma de los datos en el array.
h) Codifica una función que devuelva la media aritmética de los datos en
el array.
i) Si queremos obtener los datos que devuelven las funciones anteriores
estamos recorriendo el array 4 veces. Esto no es un problema para
pocos valores, pero sería un desperdicio de tiempo para arrays con
muchos datos. Codifica una función que reciba un array de tipo int y
devuelva otro array de longitud 4 y tipo double con los siguientes
valores y en ese orden: suma, media, mínimo, máximo.
 */

public class intArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digita el tamaño del arreglo ");
        int dimension = sc.nextInt();
        System.out.println("Digite el valor minimo por el que quiere que empiece el arreglo: ");
        int mn = sc.nextInt();
        System.out.println("Digite el valor maximo por el que quiere que termine el arreglo: ");
        int mx = sc.nextInt();
        int[] arreglo1 = crearArray(mn, mx, dimension);
        leerArray(arreglo1);
        System.out.println();
        System.out.print("indica el número que quieres buscar dentro del arreglo: ");
        int find = sc.nextInt();
        encontrar(arreglo1, find);
        System.out.println();
        System.out.println("Se buscará el número menor del arreglo: ");
        System.out.println("El número minimo es: " + getMinimo(arreglo1));
        System.out.println("Se buscará el número mayor del arreglo: ");
        System.out.println("El número mayor es: "+ getMax(arreglo1));
        System.out.println("Suma de los valores: "+sumValues(arreglo1));
        System.out.println("media de los valores: "+mediaValues(arreglo1));
        System.out.println();
        System.out.println("Array con las operaciones: ");
        Arrays.toString(operaciones(arreglo1));           
        sc.close();
        sc.close();
        
    }
    /**
     * Función para crear un array con números aleatorios en un rango elegido por el usuario
     * <p>
     * Se pasan tres parámetros que son los que determinarán: el rango por el que se empieza la creación de los números aleatorios,
     * el valor por el que termina ese rango y la dimensión o tamaño del arreglo
     * </p>
     * 
     * @param min el primer valor del rango de numeros aleatorios
     * @param max el ultimo valor del rango de numeros aleatorios
     * @param dimension el tamaño del arreglo
     * @return un arreglo con numeros aleatorios
     * 
     */
    static int [] crearArray (int min, int max, int dimension){
        int [] c = new int[dimension];
        for (int i = 0; i < c.length; i++) {
            int num_random = (int) (Math.random()*(max-min+1)+min);
            c[i] = num_random;
        }
        return c;
    }
    /**
     * Procedimiento para leer un arreglo
     * @param a un arreglo a imprimir por consola
     */
    static void leerArray (int []a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
    /**
     * Función para buscar un valor dentro de un arreglo
     * @param a el arreglo en el que se buscará el valor solicitado
     * @param buscar el valor que se buscará en el arreglo
     * @return Si se encuentra el valor, se devolverá el índice de ese número en el arreglo
     * @return Si no se encuentra, el valor de retorno es -1
     */
    static int encontrar(int []a, int buscar){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == buscar) {
                System.out.println("Se ha encontrado el número en la posición: "+ i);
                return i;
            }
        }
        System.out.println("No se ha encontrado el número dentro del arreglo: ");
        return -1;
    }
    /**
     * Función para buscar un número a partir de un indice dado por teclado.
     * 
     * @param a el arreglo donde se buscará el número
     * @param index el índice donde se comenzará a buscar
     * @return si se encuentra el valor, se retornará el índice donde se encontró el número
     * @return si no se encuentra se retornará -1.
     */
    static int encontrar2(int []a, int index, int buscar){
        for (int i = index; i < a.length; i++) {
            if (a[i] == buscar) {
                System.out.println("Se ha encontrado el número en la posición: "+ i);
                return a[i];
            }
        }
        System.out.println("No se ha encontrado el número");
        return -1;
    }
    /**
     * Función para obtener el valor minimo de un arreglo
     * @param a un arreglo donde se buscará el valor minimo
     */
    static int getMinimo(int []a){
        int aux = 0;
        int minimo = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[i] <= a[j]){
                    minimo = a[i];
                }                
            }
            if(minimo <= aux){
                aux = minimo;
            }

        }
        return minimo;
    }
    static int getMax(int []a){
        int aux = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {        
                if(a[i] >= a[j]){
                    max = a[i];
                }
            }
            if(max >= aux){
                aux = max;
            }
        }
        return aux;
    }
    static int sumValues(int[]a){
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];            
        }
        return suma;
    }
    static double mediaValues(int[]a){
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];            
        }
        return (double) (suma/a.length);
    }
    static int [] operaciones (int []a){
        int []b = new int[4];
        b[0] = sumValues(a);
        b[1] = (int)mediaValues(a);
        b[2] = getMax(a);
        b[3] = getMinimo(a);
        return b;
    }
}
