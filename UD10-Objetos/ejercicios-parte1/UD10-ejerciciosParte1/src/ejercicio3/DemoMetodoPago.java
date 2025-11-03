package ejercicio3;

import java.util.Scanner;

public class DemoMetodoPago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MetodoPago pago1P = new PayPal(600);
        MetodoPago pago2Tc = new TarjetaCredito(1000);
        MetodoPago pago3Tb = new TransferenciaBancaria(400);

        System.out.println("Metodo de pago PayPal");

        System.out.println(pago1P.procesarPago(150));
        pago1P.mostrarSaldo();

        System.out.println("Metodo de pago Tarjeta de credito: ");

        System.out.println(pago2Tc.procesarPago(300));
        pago2Tc.mostrarSaldo();

        System.out.println("Metodo de pago transferencia bancaria");

        System.out.println(pago3Tb.procesarPago(90));
        pago3Tb.mostrarSaldo();

    }
}
