package Ejercicio2;

public class EmpleadoFijo extends Empleado{
    private double salarioFijo;
    public EmpleadoFijo(String nombre, double salarioFijo) {
        super(nombre);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSalario() {
        return salarioFijo;
    }
}
