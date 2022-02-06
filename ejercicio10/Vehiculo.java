package magana.oskar.daw.repaso.ejercicio10;

public class Vehiculo {
    String matricula;
    String marca;
    String modelo;
    String color;
    double precio;

    public Vehiculo () {}

    public Vehiculo (String matricula, String marca, String modelo, String color, double precio) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public String getMatricula() { return matricula; }

    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public double getPrecio() { return precio; }

    public void setPrecio(double precio) { this.precio = precio; }

    public String mostrarVehiculo () {
        return String.format("%s     %s     %s     %s     $%.2f", this.matricula, this.marca, this.modelo, this.color, this.precio);
    }
}
