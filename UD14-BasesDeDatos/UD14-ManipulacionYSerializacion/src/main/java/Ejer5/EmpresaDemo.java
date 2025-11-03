package Ejer5;

public class EmpresaDemo {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(1, "Sebastian", 1500, 4.5);

        gerente.serializarGerenteJson(gerente);

        gerente.serializarGerenteXml(gerente);
    }
}