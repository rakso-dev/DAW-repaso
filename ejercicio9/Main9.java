package magana.oskar.daw.repaso.ejercicio9;

public class Main9 {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 4, 5 , 6, 7 , 8, 9, 10, 11, 12, 15, 16, 17, 18};
        int busca = 7;
        int res = binSearch(numeros, 0, numeros.length, busca);
        if(res == -1)
            System.out.println(busca + " no existe en el arreglo");
        else
            System.out.println(busca + " se encuentra en la posicion " + res);
    }

    public static int binSearch(int [] arr, int izquierda, int derecha, int objetivo) {
        if(derecha < izquierda)
            return -1;
        int mid = izquierda + (derecha - izquierda) / 2;
        if(arr[mid] == objetivo) {
            System.out.printf("%d = %d\n", objetivo, arr[mid]);
            return mid;
        }
        if(arr[mid] < objetivo) {
            System.out.printf("%d > %d\n", objetivo, arr[mid]);
            return binSearch(arr, mid+1, derecha, objetivo);
        }
        System.out.printf("%d < %d\n", objetivo, arr[mid]);
        return binSearch(arr, izquierda, mid-1, objetivo);
    }
}
