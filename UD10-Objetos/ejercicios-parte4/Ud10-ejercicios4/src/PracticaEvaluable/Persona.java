package PracticaEvaluable;


// Clase base Persona
public class Persona {
    protected String nombre, apellidos, dni, direccion, telefono;
    protected int edad;

    public Persona(String nombre, String apellidos, String dni, String direccion, String telefono, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
    }

    public double calcularBeneficios() {
        return 0;
    }

    public void actualizarDatos(String nuevaDireccion, String nuevoTelefono) {
        this.direccion = nuevaDireccion;
        this.telefono = nuevoTelefono;
    }
}

