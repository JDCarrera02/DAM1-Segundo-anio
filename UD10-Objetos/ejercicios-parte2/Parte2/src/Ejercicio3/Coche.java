package Ejercicio3;

public class Coche extends Vehiculo{
    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void arrancar() {
        System.out.println("El coche arranca");
    }

    public void abrirMaletero(){
        System.out.println("Abrir maletero");
    }
}