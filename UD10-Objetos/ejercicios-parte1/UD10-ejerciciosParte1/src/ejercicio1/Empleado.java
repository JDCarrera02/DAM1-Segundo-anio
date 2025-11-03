package ejercicio1;

public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String mostrarInfo(){
        return "Informacion del empleado: " + "\n" +
                "Nombre: " + nombre + "\n" +
                "Salario base: " + salario + "\n";
    }
}
