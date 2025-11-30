import java.util.Scanner;
public class VentasSemana{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ventas = new double[7];
        double total = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese la venta del día " + (i+1) + ": $");
            ventas[i] = sc.nextDouble();
            total += ventas[i];
        }
        int Mayor = 0;
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > ventas[Mayor]) Mayor = i;
        }
        System.out.println("Venta total acumulada de la semana $" + String.format("%.2f", total));
        System.out.println("Día con mayor venta: Día " + (Mayor+1) + " con $" + String.format("%.2f", ventas[Mayor]));
    }
}