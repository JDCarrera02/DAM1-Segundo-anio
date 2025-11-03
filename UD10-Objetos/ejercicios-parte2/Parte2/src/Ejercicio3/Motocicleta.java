package Ejercicio3;

public class Motocicleta extends Vehiculo{
    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void arrancar() {
        System.out.println("La moto arranca");
    }

    public void hacerCaballito(){
        System.out.println("Hacer caballito");
    }
}