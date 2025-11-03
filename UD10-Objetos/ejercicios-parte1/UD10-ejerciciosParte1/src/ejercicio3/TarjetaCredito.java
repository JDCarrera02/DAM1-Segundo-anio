package ejercicio3;

public class TarjetaCredito extends MetodoPago{
    private final double comision = 0.03;
    private double credito;

    public TarjetaCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public double procesarPago(double monto) {
        return credito -= (monto*comision)+monto;
    }

    @Override
    void mostrarSaldo() {
        System.out.println(credito);
    }
}