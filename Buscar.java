import java.util.Scanner;
public class Buscar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese número " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }
        System.out.print("Ingrese número a buscar: ");
        int numb = sc.nextInt();
        boolean existe = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == numb) { existe = true; break; }
        }
        if (existe) System.out.println("El número " + numb + " existe en el arreglo.");
        else System.out.println("El número " + numb + " NO existe en el arreglo.");
    }
}