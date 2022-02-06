package magana.oskar.daw.repaso.ejercicio2;

public class Consultor extends Empleado {
    String profesional;

    public Consultor(String id, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad,
                     PuestoTrabajo puestoDeTrabajo, String profesional) {
        super(id, nombre, apellidos, domicilio, codigoPostal, ciudad, puestoDeTrabajo);
        this.profesional = profesional;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    @Override
    public String getAtributos() {
        return String.format("%s     %s", super.getAtributos(), this.profesional);
    }
}
