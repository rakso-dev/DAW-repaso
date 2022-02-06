package magana.oskar.daw.repaso.ejercicio6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n, m;
        System.out.println("Ingrese la base");
        n = sc.nextDouble();
        System.out.println("Ingrese el exponente");
        m = sc.nextDouble();

        System.out.println("El resultado es: " + Potencia(n,m));
    }

    static double Potencia (double base, double exponente) {
        int i = 1, res = 1;
        while(i <= exponente ) {
            res *= base;
            i++;
        }

        return res;
    }
}
