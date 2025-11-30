import java.util.Scanner;
public class Atletas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantos atletas desea registrar? ");
        int a = sc.nextInt();
        String[] nombre = new String[a];
        String[] apellido = new String[a];
        String[] especialidad = new String[a];
        double[] tiempo = new double[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Nombre del atleta " + (i+1) + ": "); nombre[i] = sc.nextLine();
            System.out.print("Apellido: "); apellido[i] = sc.nextLine();
            System.out.print("Especialidad (ej. 100m): "); especialidad[i] = sc.nextLine();
            System.out.print("Tiempo registrado (segundos): "); tiempo[i] = sc.nextDouble();
        }
        int idxMejor = 0;
        for (int i = 1; i < a; i++) if (tiempo[i] < tiempo[idxMejor]) idxMejor = i;
        System.out.println("\nRegistro de atletas:"); 
        System.out.println("Nombre\tApellido\tEspecialidad\tTiempo (s)"); 
        for (int i = 0; i < a; i++) {
            String fila = nombre[i] + "\t" + apellido[i] + "\t" + especialidad[i] + "\t" + tiempo[i];
            if (i == idxMejor) fila += " <-- Mejor tiempo";
            System.out.println(fila);
        }
        System.out.println("\nMejor tiempo: " + nombre[idxMejor] + " " + apellido[idxMejor] + " con " + tiempo[idxMejor] + "s");
    }
}