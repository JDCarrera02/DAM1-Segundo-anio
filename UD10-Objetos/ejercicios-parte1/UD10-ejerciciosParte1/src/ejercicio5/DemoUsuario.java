package ejercicio5;

import java.util.Scanner;

public class DemoUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita tu contrasena: ");
        String contrasena = sc.nextLine();
        Usuario usuario1 = new Usuario("Diego",contrasena);

        System.out.println("Escribe nuevamente tu contrasena: ");
        contrasena = sc.nextLine();

        boolean comprobar = usuario1.verificarContrasena(contrasena);

        if (comprobar){
            System.out.println("La contrasena coincide con la almacenada");
        } else {
            System.out.println("La contrasena no coincide con la almacenada");
            System.out.println("Cambia la contrasena: ");

            contrasena = sc.nextLine();;
            System.out.println(usuario1.cambiarContrasena(contrasena));
        }
    }
}