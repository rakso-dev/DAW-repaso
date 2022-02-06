package magana.oskar.daw.repaso.ejercicio2;

public class Administrativo extends Empleado {
    int antiguedad;

    public Administrativo (String id, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad,
                           PuestoTrabajo puestoDeTrabajo, int antiguedad) {
        super(id, nombre, apellidos, domicilio, codigoPostal, ciudad, puestoDeTrabajo);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String getAtributos() {
        return String.format("%s      %d anios", super.getAtributos(), this.antiguedad);
    }
}
