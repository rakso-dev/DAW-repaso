package magana.oskar.daw.repaso.ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado ("EMPLE4D01", "Jose", "Villegas", "Schlampestrasse 02",
                "123456", "Berlin", new PuestoTrabajo ("V0L478", "Volantero", 250));
        Empleado empleado2 = new Empleado("3MPLE4D02", "Luis", "Sanchez", "Maple Street 123",
                "456789", "Toronto", new PuestoTrabajo("ABTR562", "Personal de punto de venta", 500));
        Administrativo admin = new Administrativo("ERH90345", "Oskar", "Beltran Magana", "Calle Sirenas 01",
                "998877", "Fondo de Bikini", new PuestoTrabajo("RH0001", "Encargade de Recursos Humanos", 1000),
                2);
        Consultor con = new Consultor("C0N5ULT0R", "Sonia", "Hernandez", "Calle Lobezna 420",
                "993243", "Madrid", new PuestoTrabajo("CNS6789", "Consultor, i guess", 300),
                "girl idk");
        System.out.println(empleado1.getAtributos());
        System.out.println(empleado2.getAtributos());
        System.out.println(admin.getAtributos());
        System.out.println(con.getAtributos());
    }
}
