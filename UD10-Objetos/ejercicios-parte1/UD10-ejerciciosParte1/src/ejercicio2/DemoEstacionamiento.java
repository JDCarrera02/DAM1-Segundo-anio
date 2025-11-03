package ejercicio2;

public class DemoEstacionamiento {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Motocicleta moto1 = new Motocicleta();
        Camion camion1 = new Camion();

        auto1.describirVehiculo();
        moto1.describirVehiculo();
        camion1.describirVehiculo();
    }
}
