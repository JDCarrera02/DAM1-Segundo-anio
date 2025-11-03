/**
 * Crea un programa que genere un array de 10 números aleatorios entre -10 y
10. El programa mostrará los números contenidos en el array. Después el
programa debe mostrar los elementos que se repiten.
 */
public class ejercicio9 {
    public static void main(String[] args) {
        /**
         * Primero creamos el arreglo donde guardaremos los números aleatorios entre -10 y 10
         */
        int [] array1 = new int[10];

        /**
         * Creamos la respectiva copia del arreglo para trabajar sobre él, esto es recomendable ya que el arreglo original lo mantendremos intacto.
         * <p>
         * Esto puede realizarse con la librería Arrays.copy para seleccionar el objeto y realizar una mejor copia de manera más eficiente
         */
        int [] repetidos1 = new int[array1.length];

        /**
         * Este for es para llenar el array original con los números. Con cada iteración vamos imprimiendo los valores.
         */

        for (int i = 0; i < array1.length; i++) {
            int num_random = (int) (Math.random()*21)-10;
            array1[i] = num_random;
            System.out.print(array1[i]+ " ");
        }
        /**
         * Hacemos un salto de línea y mostramos un mensaje que indica que ahora se realizará el proceso de mostrar los números que se repiten en el array
         * original.
         * 
         */
        System.out.println();
        System.out.println("se mostrarán los elementos que se repiten: ");
        /**
         * Creamos dos variables para realizar un mejor control sobre los elementos que se repiten
         * "num_repetidos" será la variable contadora que determinará el tamaño dela copia del array que contendrá los números que se repiten
         * "repite" es una variable booleana que nos permite romper el tercer for anidado, donde realizamos la comprobación del número repetido.
         * Con ella podemos realizar otra comprobación donde determinamos el guardado del elemento, ya sea que la variable esté en false o true
         * si está en false, no se añade a la copia, si está en true, se añadirá.
         */

        int num_repetidos = 0;
        boolean repite;
        /**
         * Primer for, para comenzar desde la posición 0 del array
         */

        for (int i = 0; i < array1.length; i++) {
            /**
             * Segundo for, para comenzar desde la segunda posición del array, es el número que compararemos con la posición inicial.
             * Esto nos permite comparar parejas de números, con ello recorremos el array en menor número de iteraciones
             */
            for (int j = i + 1; j < array1.length; j++) {
                /**
                 * Con este if comparamos el número de la posición del primer for con el del segundo, que vendría siendo una posición adelante 
                 * del primer for. Si estamos en la posición 0 en el primero for, estaremos en la posición 1 del segundo for, y así sucesivamente con cada 
                 * iteración
                 */
                if (array1[i]==array1[j]) {
                    /**
                     * Si son iguales, inicializamos nuestra variable booleana en false para dar por hecho que no se repite en las demás posiciones
                     */
                    repite = false;
                    /**
                     * Tercer for, lo utilizamos para llenar el siguiente array(la copia)
                     */
                    for (int k = 0; k < num_repetidos; k++) {
                        /**
                         * Con este if comparamos con la posición del número almacenado en la copia del array, con la posición del número en el array original.
                         * Si son iguales, entonces "repite" será true, significa que este valor si está repetido. A continuación con la sentencia break, rompemos ese bucle
                         * y salimos del for, para dirigirnos al siguiente if que está presente en el segundo for(el de la posición j= i+1)
                         */
                        if (repetidos1[k] == array1[i]) {
                            repite = true;
                            break;
                        }    
                    }
                    /**
                     * Si repite no es false, entonces almacenamos el número en el array copia
                     */
                if (!repite) {
                    /**
                     * Con num_repetidos determinamos el tamaño del array y así almacenar los valores correspondientes de manera "controlada", este procedimiento puede
                     * hacerse en menos lineas de codigo con el uso de un ArrayList.
                     * 
                     */
                    repetidos1[num_repetidos] = array1[i];
                    num_repetidos++;
                }
                break;   
                }    
            }    
        }
        /**
         * Llenamos el array con los números repetidos (si los hay), si no, no se llena 
         */
        int [] repetidos2 = new int[num_repetidos];
        for (int i = 0; i < num_repetidos; i++) {
            repetidos2[i] = repetidos1[i];
            System.out.print(repetidos2[i] + " ");
        }

    }
    
}
