package ejercicio1;

public class EmpresaDemo {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 1500);
        Gerente gerente1 = new Gerente("Alejandro", 2100, 150);

        System.out.println(empleado1.mostrarInfo());
        System.out.println(gerente1.mostrarInfo());
    }
}
