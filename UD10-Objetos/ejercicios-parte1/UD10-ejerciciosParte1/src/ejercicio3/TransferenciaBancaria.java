package ejercicio3;

public class TransferenciaBancaria extends MetodoPago{
    private final double comision = 0.01;
    private double saldoCuenta;

    public TransferenciaBancaria(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    @Override
    public double procesarPago(double monto) {
        return saldoCuenta -= (monto*comision)+monto;
    }

    @Override
    void mostrarSaldo() {
        System.out.println(saldoCuenta);
    }
}
