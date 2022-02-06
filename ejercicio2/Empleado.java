package magana.oskar.daw.repaso.ejercicio2;

public class Empleado {
    String id;
    String nombre;
    String apellidos;
    String domicilio;
    String codigoPostal;
    String ciudad;
    PuestoTrabajo puestoDeTrabajo;

    public Empleado (String id, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad,
                     PuestoTrabajo puestoDeTrabajo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.puestoDeTrabajo = puestoDeTrabajo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAtributos() {
        return String.format("%s     %s, %s     %s     codigo postal: %s, %s     %s     $%f", this.id, this.apellidos, this.nombre, this.domicilio, this.codigoPostal, this.ciudad, this.puestoDeTrabajo.getDescripcion(), this.puestoDeTrabajo.getSalarioNeto());
    }
}
