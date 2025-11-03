package Ejercicio2;

import java.util.ArrayList;

public class EmpresaDemo {
    public static void main(String[] args) {
        ArrayList <Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new EmpleadoFijo("Juan", 1500));
        listaEmpleados.add(new EmpleadoPorHoras("Edison", 40,12));

        double total =0;
        for (Empleado empleado:listaEmpleados){
            total+=empleado.calcularSalario();
        }
        System.out.println("Total monto de salarios: " + total);
    }
}