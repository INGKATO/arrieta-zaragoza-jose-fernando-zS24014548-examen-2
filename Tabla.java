import java.util.Scanner;
public class Tabla{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int i = sc.nextInt();
        System.out.println("Tabla de multiplicar del " + i + ":");
        for (int j = 1; j <= 10; j++) {
            System.out.println(i + " x " + j + " = " + (i * j));
        }
    }
}