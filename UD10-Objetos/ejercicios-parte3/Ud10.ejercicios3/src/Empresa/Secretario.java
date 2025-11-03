package Empresa;

public class Secretario extends Empleado{
    private String numeroFax;
    private Despacho oficina;
    private final double incremento = 0.05;
    private double nuevoSalario;

    public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String numeroFax) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.numeroFax = numeroFax;
    }

    @Override
    public double incrementarSalario() {
        return nuevoSalario += super.incrementarSalario() * incremento + super.incrementarSalario();
    }

    @Override
    public String inforEmpleado() {
        return super.inforEmpleado()+ "Puesto en la empresa: Secretario";
    }
}
