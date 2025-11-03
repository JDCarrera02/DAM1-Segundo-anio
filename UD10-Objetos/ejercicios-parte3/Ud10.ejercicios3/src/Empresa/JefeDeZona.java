package Empresa;

import java.util.ArrayList;

public class JefeDeZona extends Empleado {
    private Despacho oficina;
    private Secretario secretario;
    private ArrayList<Vendedor> listaVendedores;
    private CocheEmpresa cocheEmp;
    private final double incremento = 0.2;
    private double nuevoSalario;

    public JefeDeZona(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, Despacho oficina, Secretario secretario, ArrayList<Vendedor> listaVendedores, CocheEmpresa cocheEmp) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.oficina = oficina;
        this.secretario = secretario;
        this.listaVendedores = listaVendedores;
        this.cocheEmp = cocheEmp;
    }

    @Override
    public String inforEmpleado() {
        return super.inforEmpleado()+"Puesto en la empresa: Jefe de zona";
    }

    public Secretario cambioSecretario(Secretario secretarioCambio){
        return this.secretario = secretarioCambio;
    }

    public CocheEmpresa cambioCoche(CocheEmpresa cocheCambio){
        return this.cocheEmp = cocheCambio;
    }

    @Override
    public double incrementarSalario() {
        return nuevoSalario += super.incrementarSalario()*incremento+super.incrementarSalario();
    }
}
