package GestionDeContactos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void guardarContacto(Contacto contacto){
        Path archivo = Paths.get("contactos.txt");

        if (contacto == null){
            System.out.println("El contacto debe tener informacion");
        } else {
            try(BufferedWriter escritor = Files.newBufferedWriter(archivo)){
                escritor.write(nombre);
                escritor.newLine();
                escritor.write(telefono);
                escritor.newLine();
                escritor.write(email);

            }catch (IOException e){
                System.out.println("Ha ocurrido un error al escribir el contacto");
            }
        }

    }

    public void leerArchivo(Path archivo){
        if (archivo == null){
            System.out.println("El archivo no existe");
        } else {
            try(BufferedReader lector = Files.newBufferedReader(archivo)){
                String linea;
                while ((linea = lector.readLine()) != null){
                    System.out.println(linea);
                }
            } catch (IOException e){
                System.out.println("Error al leer el archivo");
            }
        }
    }
}
