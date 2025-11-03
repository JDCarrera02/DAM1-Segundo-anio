package ejercicio4;

import java.util.Scanner;

public class DemoCuentaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CuentaBancaria cuenta1 = new CuentaBancaria("123456789", "Cristian", 1500);

        System.out.println(cuenta1.mostrarSaldo());

        System.out.print("Digite la cantidad a depositar en la cuenta: ");
        double monto = sc.nextDouble();
        cuenta1.depositar(monto);
        System.out.println();
        System.out.print("Digite la cantidad a retirar: ");
        double retiro = sc.nextDouble();
        cuenta1.retirar(retiro);
        System.out.println(cuenta1.mostrarSaldo());
        sc.close();
    }
}