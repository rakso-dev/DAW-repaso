package magana.oskar.daw.repaso.ejercicio10;

public class Main10 {
    public static void main(String[] args) {
        ConcesionarioVehiculos cv = new ConcesionarioVehiculos("CV-28-15468F", "DAW Cars",
                "Calle Wallaby 42 Sidney", "www.dawcars.com");

        Cliente [] customer = new Cliente [5];
        customer [0] = new Cliente(1, "Zule", "Luis");
        customer [1] = new Cliente(2, "Jorge", "Canseco");
        customer [2] = new Cliente(3, "Vicente", "Corona");
        customer [3] = new Cliente(4, "Diego", "Rivera");
        customer [4] = new Cliente(5, "Grissell", "Lopez");

        Vehiculo [] car = new Vehiculo [5];
        car [0] = new Vehiculo("AU-890-1234", "VW", "Vento", "rojo", 123453);
        car [1] = new Vehiculo("AU-234-3451", "Nisan", "Jetta", "plata", 2442345);
        car [2] = new Vehiculo("AU-567-1243", "BMW", "X6", "Azul", 492851);
        car [3] = new Vehiculo("AU-123-2348", "VW", "Noc", "negro", 124365);
        car [4] = new Vehiculo("AU-142-3735", "VW", "netanoc", "blanco", 124562);

        for(int i = 0; i < 5; i++){
            cv.registrarCliente(customer[i]);
            cv.registrarVehiculo(car[i]);
        }

        cv.imprimirCliente();
        cv.imprimirVehiculos("VW");
    }
}
