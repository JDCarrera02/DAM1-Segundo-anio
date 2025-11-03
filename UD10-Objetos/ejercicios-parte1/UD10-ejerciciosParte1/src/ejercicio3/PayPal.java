package ejercicio3;

public class PayPal extends MetodoPago{
    private final double comision = 0.05;
    private double saldo;

    public PayPal(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double procesarPago(double monto) {
        ;return saldo -= (monto*comision)+monto;
    }

    @Override
    void mostrarSaldo() {
        System.out.println(saldo);
    }
}
