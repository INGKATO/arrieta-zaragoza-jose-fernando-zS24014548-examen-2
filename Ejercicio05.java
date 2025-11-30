public class Ejercicio05{
    public static void main(String[] args) {
        int fila = 6;
        for (int i = 1; i <= fila; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}