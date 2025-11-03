package BibliotecaVirtual;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BibliotecaDemo {
    public static void main(String[] args) {
        Path archivo = Path.of("publicaciones.txt");
        ArrayList<Publicacion> listaPublicaciones = new ArrayList<>(4);

        Publicacion libro1 = new Libro("Brave new world","Aldous Huxley", LocalDate.of(1932,2,4));
        Publicacion revista1 = new Revista("Pronto", "Mariano Nadal", LocalDate.of(1972,1,1));
        Publicacion libro2 = new Libro("1984", "George Orwell", LocalDate.of(1949,8,6));

        listaPublicaciones.add(libro1);
        listaPublicaciones.add(libro2);
        listaPublicaciones.add(revista1);

        leerArchivo(archivo);
        guardarPublicacion(archivo,listaPublicaciones);

    }

    public static void leerArchivo(Path archivo){
        if (!Files.exists(archivo)){
            System.out.println("El archivo no existe, procediendo a crearlo...");
            try {
                Files.createFile(archivo);
                System.out.println("Archivo creado " + archivo.getFileName() + " en: " + archivo.toAbsolutePath());
                leerArchivo(archivo);
            } catch (IOException e) {
                System.out.println("Error al crear el archivo");
            }
        } else {
            System.out.println("Informacion: ");
            try (BufferedReader lector = Files.newBufferedReader(archivo)){
                String linea;
                while ((linea = lector.readLine()) !=null){
                    System.out.println(linea);
                }
            }catch (IOException e){
                System.out.println("Error al leer el archivo");
            }
        }
    }

    public static void guardarPublicacion(Path archivo, ArrayList<Publicacion> listaPub){
        if (listaPub.isEmpty()){
            System.out.println("La lista no puede estar vacia");
        } else {
            try (BufferedWriter escritor = Files.newBufferedWriter(archivo,StandardOpenOption.APPEND)){
                String linea;
                for (Publicacion publicacion: listaPub){
                    if (publicacion instanceof Libro){
                        linea = publicacion.mostrarInfo();
                        escritor.write(linea);
                        escritor.newLine();
                    } else if (publicacion instanceof Revista) {
                        linea = publicacion.mostrarInfo();
                        escritor.write(linea);
                        escritor.newLine();
                    }
                }
                System.out.println("Publicaciones guardadas correctamente");
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo");
            }
        }
    }
}