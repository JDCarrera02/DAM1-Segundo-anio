package PracticaEvaluable;

import java.util.ArrayList;
import java.util.List;

public class JefeDepartamento extends Medico {
    private String oficina;
    private List<Medico> medicosSupervisados;

    public JefeDepartamento(String nombre, String apellidos, String dni, String direccion, String telefono, int edad,
                            String numColegiado, String especialidad, double salarioBase, String oficina) {
        super(nombre, apellidos, dni, direccion, telefono, edad, numColegiado, especialidad, salarioBase);
        this.oficina = oficina;
        this.medicosSupervisados = new ArrayList<>();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Oficina: " + oficina);
        System.out.println("Médicos Supervisados: " + medicosSupervisados.size());
    }

    @Override
    public double calcularBeneficios() {
        return medicosSupervisados.size() * 20; // Incentivo de 20€ por médico supervisado
    }

    public void agregarMedico(Medico medico) {
        medicosSupervisados.add(medico);
    }

    public void removerMedico(Medico medico) {
        medicosSupervisados.remove(medico);
    }

    public void actualizarDatos(String nuevaDireccion, String nuevoTelefono, String nuevaOficina) {
        super.actualizarDatos(nuevaDireccion, nuevoTelefono);
        this.oficina = nuevaOficina;
    }
}