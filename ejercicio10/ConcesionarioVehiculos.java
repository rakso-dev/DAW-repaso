package magana.oskar.daw.repaso.ejercicio10;
import java.util.ArrayList;

public class ConcesionarioVehiculos {
    String id;
    String nombre;
    String domicilio;
    String paginaWeb;
    ArrayList<Cliente> clientes;
    ArrayList<Vehiculo> vehiculos;

    public ConcesionarioVehiculos (String id, String nombre, String domicilio, String paginaWeb) {
        this.id = id;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.paginaWeb = paginaWeb;
        this.clientes = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDomicilio() { return domicilio; }

    public void setDomicilio(String domicilio) { this.domicilio = domicilio; }

    public String getPaginaWeb() { return paginaWeb; }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public void registrarCliente (Cliente c) { this.clientes.add(c); }

    public void imprimirCliente () {
        for(Cliente c: clientes) System.out.println(c.mostrarCliente());
    }

    public void registrarVehiculo (Vehiculo v) {
        this.vehiculos.add(v);
    }

    public void imprimirVehiculos () {
        for(Vehiculo v: vehiculos) System.out.println(v.mostrarVehiculo());
    }

    public void imprimirVehiculos (String marca) {
        for(Vehiculo v: vehiculos) if(v.marca.equals(marca)) System.out.println(v.mostrarVehiculo());
    }
}
