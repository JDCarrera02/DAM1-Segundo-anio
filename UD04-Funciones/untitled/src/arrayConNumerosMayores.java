import java.util.ArrayList;
import java.util.Scanner;

public class arrayConNumerosMayores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] listaNumeros = new int[5];
        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Escribir el numero: ");
        int numero = sc.nextInt();

        ArrayList<Integer> mayores = new ArrayList<>(numerosMayores(listaNumeros, numero));

        for (Integer num : mayores){
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> numerosMayores (int [] listaNumeros, int numero){
        ArrayList<Integer> mayores = new ArrayList<>();
        for (int listaNumero : listaNumeros) {
            if (listaNumero > numero) {
                mayores.add(listaNumero);
            }
        }
        return mayores;
    }
}