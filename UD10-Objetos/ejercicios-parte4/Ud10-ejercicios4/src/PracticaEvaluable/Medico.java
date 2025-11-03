package PracticaEvaluable;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Persona {
    protected String numColegiado, especialidad;
    protected List<Paciente> pacientes;
    protected double salarioBase;

    public Medico(String nombre, String apellidos, String dni, String direccion, String telefono, int edad,
                  String numColegiado, String especialidad, double salarioBase) {
        super(nombre, apellidos, dni, direccion, telefono, edad);
        this.numColegiado = numColegiado;
        this.especialidad = especialidad;
        this.salarioBase = salarioBase;
        this.pacientes = new ArrayList<>();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Nº Colegiado: " + numColegiado);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Pacientes: " + pacientes.size());
    }

    @Override
    public double calcularBeneficios() {
        return pacientes.size() * 10; // Incentivo de 10€ por paciente atendido
    }

    public void anadirPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void eliminarPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public void actualizarDatos(String nuevaDireccion, String nuevoTelefono, String nuevaEspecialidad) {
        super.actualizarDatos(nuevaDireccion, nuevoTelefono);
        this.especialidad = nuevaEspecialidad;
    }
}