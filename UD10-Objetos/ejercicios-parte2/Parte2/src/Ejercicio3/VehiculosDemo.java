package Ejercicio3;

import java.util.ArrayList;

public class VehiculosDemo {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        listaVehiculos.add(new Coche("Mazda", "Rtx25"));
        listaVehiculos.add(new Motocicleta("Yamaha", "nolose90"));

        for (Vehiculo vehiculo:listaVehiculos){
            if (vehiculo instanceof Coche){
                ((Coche)vehiculo).abrirMaletero();
            }else if (vehiculo instanceof Motocicleta){
                ((Motocicleta)vehiculo).hacerCaballito();
            }
        }
    }
}