package magana.oskar.daw.repaso.ejercicio10;

public class Cliente {
    int id;
    String nombre;
    String apellidos;

    public Cliente () {}

    public Cliente (int id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }

    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String mostrarCliente () {
        return String.format("%d       %s %s", id, nombre, apellidos);
    }
}
