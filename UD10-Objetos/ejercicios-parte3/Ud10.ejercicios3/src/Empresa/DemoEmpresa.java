package Empresa;

import java.util.ArrayList;

public class DemoEmpresa {
    public static void main(String[] args) {
        CocheEmpresa mazda = new CocheEmpresa("UV2345L","Mazda","RTX25");
        ArrayList <Cliente> listaClientes = new ArrayList<>();
        Despacho oficinaJefe = new Despacho("Molina", 12,6);
        ArrayList <Vendedor>listaVendedores = new ArrayList<>();
        CocheEmpresa cocheJefe = new CocheEmpresa("EL4590V","Chevrolet","2016");

        Secretario secretario = new Secretario("Alberto","Casablanca","45279013D","","987345109", 1800,"212");
        Empleado vendedor = new Vendedor("Carlos", "Valverde", "56389012B","", "124509673", 2000, mazda, "", "", listaClientes,0.1);
        Empleado jefeZona = new JefeDeZona("Juan", "Zuluaga", "55383012N","", "124504532", 2500,oficinaJefe,secretario,listaVendedores,cocheJefe);

        /*Incremento de salario para secretario*/
        System.out.println(secretario.incrementarSalario());

        /*Incremento de salario para el vendedor*/
        System.out.println(vendedor.incrementarSalario());

        /*Incremento de salario para jefe de zona*/
        System.out.println(jefeZona.incrementarSalario());

    }
}