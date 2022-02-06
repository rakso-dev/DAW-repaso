package magana.oskar.daw.repaso.ejercicio5;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.print("Ingrese n: ");
        n = sc.nextInt();
        System.out.print("Ingrese m: ");
        m = sc.nextInt();
        System.out.printf("\nEl resultado de %d por %d es %d\n", n, m, Multiplicacion(n,m));

    }

    public static int Multiplicacion (int a, int b) {
        int res = 0;
        for(int i = 1; i <= b; i++)
            res += a;
        return res;
    }
}
