package Ejercicio2;

public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;
    private double tarifaHoras;
    private double salario;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHoras) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHoras = tarifaHoras;
    }

    @Override
    public double calcularSalario() {
        return salario += horasTrabajadas*tarifaHoras;
    }
}
