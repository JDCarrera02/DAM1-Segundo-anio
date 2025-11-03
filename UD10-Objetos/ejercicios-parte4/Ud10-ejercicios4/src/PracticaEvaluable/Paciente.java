package PracticaEvaluable;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private String numHistorial;
    private List<String> enfermedades;
    private String medicoCabecera;
    private int visitas;

    public Paciente(String nombre, String apellidos, String dni, String direccion, String telefono, int edad,
                    String numHistorial, String medicoCabecera) {
        super(nombre, apellidos, dni, direccion, telefono, edad);
        this.numHistorial = numHistorial;
        this.medicoCabecera = medicoCabecera;
        this.enfermedades = new ArrayList<>();
        this.visitas = 0;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Historial Médico: " + numHistorial);
        System.out.println("Médico de cabecera: " + medicoCabecera);
        System.out.println("Enfermedades: " + enfermedades);
    }

    @Override
    public double calcularBeneficios() {
        return (double) visitas / 5; // Por cada 5 visitas, 1 consulta gratuita
    }

    public void anadirDiagnostico(String enfermedad) {
        enfermedades.add(enfermedad);
    }

    public void cambiarMedico(String nuevoMedico) {
        this.medicoCabecera = nuevoMedico;
    }

    public void registrarVisita() {
        visitas++;
    }
}