package PracticaEvaluable;

public class HospitalDemo {
    public static void main(String[] args) {
        // Crear instancias
        Paciente p1 = new Paciente("Juan", "Pérez", "12345678A", "Calle 1", "987654321", 30, "H123", "Dr. Gómez");
        Medico m1 = new Medico("Carlos", "Rodríguez", "23456789B", "Calle 2", "876543210", 45, "M567", "Cardiología", 3000);
        JefeDepartamento j1 = new JefeDepartamento("Marta", "López", "34567890C", "Calle 3", "765432109", 50, "M890", "Pediatría", 4000, "Oficina 1");
        // Operaciones con Paciente
        p1.anadirDiagnostico("Gripe");
        p1.registrarVisita();
        p1.registrarVisita();
        p1.registrarVisita();
        p1.imprimir();
        System.out.println("Beneficios (Consultas Gratuitas): " + p1.calcularBeneficios());
        // Operaciones con Médico
        m1.anadirPaciente(p1);
        m1.imprimir();
        System.out.println("Beneficios (Incentivos): " + m1.calcularBeneficios());
        // Operaciones con Jefe de Departamento
        j1.agregarMedico(m1);
        j1.imprimir();
        System.out.println("Beneficios (Incentivos por médicos): " + j1.calcularBeneficios());
    }
}