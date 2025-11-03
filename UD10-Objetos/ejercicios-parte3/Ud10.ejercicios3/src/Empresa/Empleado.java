package Empresa;

import java.util.Date;

public class Empleado {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private Date aniosAntiguedad;
    private String telefono;
    private double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    public String inforEmpleado() {
        return "Informacion sobre el empleado: \n"+
                "Nombre: "+nombre+"\n"+
                "Apellidos: "+apellidos+ "\n"+
                "DNI: "+dni+ "\n"+
                "Direccion: "+direccion+ "\n"+
                "Telefono: "+telefono+ "\n"+
                "Salario: "+salario+"\n"+
                "Supervisor: " + supervisor;
    }

    public double incrementarSalario(){
        return salario;
    }

    public Empleado cambioSuperVisor(Empleado supervisorCambio){
        return this.supervisor = supervisorCambio;
    }
}
