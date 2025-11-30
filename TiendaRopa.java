import java.util.Scanner;
public class TiendaRopa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matriz = new String[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese nombre del artículo " + (i+1) + " (ej. Camisa): ");
            matriz[i][0] = sc.nextLine();
            System.out.print("Ingrese talla: ");
            matriz[i][1] = sc.nextLine();
            System.out.print("Ingrese color: ");
            matriz[i][2] = sc.nextLine();
        }
        System.out.println("\nTabla de artículos:");
        System.out.println("Artículo\tTalla\tColor");
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][0] + "\t" + matriz[i][1] + "\t" + matriz[i][2]);
        }
    }
}