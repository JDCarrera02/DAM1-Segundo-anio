package ejercicio3;

public abstract class MetodoPago {

    public MetodoPago() {
    }

    abstract double procesarPago(double monto);

    abstract void mostrarSaldo();
}
