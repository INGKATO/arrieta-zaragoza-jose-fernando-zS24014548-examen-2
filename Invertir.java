import java.util.Scanner;
public class Invertir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese número " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }
        System.out.println("Números en orden inverso:");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}