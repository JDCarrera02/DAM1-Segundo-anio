package GestionDeContactos;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ContactosDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Path archivo = Paths.get("contactos.txt");

        System.out.print("Escribe el nombre del contacto: ");
        String nombre = sc.nextLine();
        System.out.println();
        System.out.print("Escribe el telefono del contacto: ");
        String telefono = sc.nextLine();
        System.out.println();
        System.out.print("Escribe el correo del contacto: ");
        String correo = sc.nextLine();

        Contacto contacto1 = new Contacto(nombre,telefono,correo);

        System.out.println("Guardando contacto...");

        contacto1.guardarContacto(contacto1);

        System.out.println("Mostrando información almacenanda en el fichero");

        contacto1.leerArchivo(archivo);
    }
}
