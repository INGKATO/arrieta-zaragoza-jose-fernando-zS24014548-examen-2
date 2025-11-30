import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] pais = new String[4];
        double[][] temp = new double[4][3];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese nombre del país " + (i+1) + ": ");
            pais[i] = sc.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese temperatura media del mes " + (j+1) + " para " + pais[i] + ": ");
                temp[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Paises y temperaturas ingresadas:");
        for (int i = 0; i < 4; i++) {
            System.out.print(pais[i] + ": ");
            for (int j = 0; j < 3; j++)
             System.out.print(temp[i][j] + " ");
            System.out.println();
        }
        double[] medias = new double[4];
        for (int i = 0; i < 4; i++) {
            double s = 0;
            for (int j = 0; j < 3; j++) s += temp[i][j];
            medias[i] = s / 3.0;
        }
        int idxMax = 0;
        for (int i = 1; i < 4; i++) if (medias[i] > medias[idxMax]) idxMax = i;
        System.out.println("Temperatura media trimestral por país:");
        for (int i = 0; i < 4; i++) {
            System.out.println(pais[i] + ": " + String.format("%.2f", medias[i]));
        }
        System.out.println("País con mayor temperatura media trimestral: " + pais[idxMax] + " (" + String.format("%.2f", medias[idxMax]) + ")");
    }
}