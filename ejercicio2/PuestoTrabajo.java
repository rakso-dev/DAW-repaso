package magana.oskar.daw.repaso.ejercicio2;

public class PuestoTrabajo {
    String codigo;
    String descripcion;
    double salarioNeto;

    public PuestoTrabajo (String codigo, String descripcion, double salarioNeto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.salarioNeto = salarioNeto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }
}
