package Ejercicio2;

public abstract class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularSalario();
}
