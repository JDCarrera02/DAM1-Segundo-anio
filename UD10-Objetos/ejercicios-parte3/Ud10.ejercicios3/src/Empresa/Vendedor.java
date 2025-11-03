package Empresa;

import java.util.ArrayList;

public class Vendedor extends Empleado{
    private CocheEmpresa coche;
    private String telefono;
    private String areaVenta;
    private ArrayList<Cliente>listaClientes;
    private double comisiones;
    private final double incrementoS = 0.1;
    private double nuevoSalario;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, CocheEmpresa coche, String telefono1, String areaVenta, ArrayList<Cliente> listaClientes, double comisiones) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.coche = coche;
        this.telefono = telefono1;
        this.areaVenta = areaVenta;
        this.listaClientes = listaClientes;
        this.comisiones = comisiones;
    }

    @Override
    public double incrementarSalario() {
        return nuevoSalario += super.incrementarSalario()*incrementoS+super.incrementarSalario();
    }

    @Override
    public String inforEmpleado() {
        return super.inforEmpleado()+"Puesto en la empresa: Vendedor";
    }

    public Cliente darDeAlta(Cliente nuevoCliente){
        listaClientes.add(nuevoCliente);
        return nuevoCliente;
    }

    public CocheEmpresa cambioCoche(CocheEmpresa cocheCambio){
        return this.coche = cocheCambio;
    }

    public void darDeBajaCliente(Cliente clienteBaja){
        listaClientes.remove(clienteBaja);
    }
}