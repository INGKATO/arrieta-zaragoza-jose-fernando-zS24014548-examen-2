import java.util.Scanner; 
 public class Cajero{
  public static void main(String [] args){
   Scanner sc= new Scanner(System.in); 
  double adeudo=1000.00; 
    String continuar;
     do{
        System.out.println("Bienvenido al cajero"); 
        System.out.println("Menu del servicio de energia electrica" + "\n1.Consulta" + "\n2.Pago del mes" + "\n3.Pago de adeudo" + "\n4.Salir");
        int o=sc.nextInt();
        switch(o){
        case 1:
        System.out.println("1.Consulta: tu adeudo es de $" + adeudo); 
        break; 
        case 2:
        System.out.println("2.Pago del mes: tu adeudo es de $" + adeudo + "\nTu pago ha sido procesado"); 
        break; 
        case 3:
        System.out.println("3.Pago de adeudo: tu adeudo es de $" + adeudo  ); 
        break;
        case 4:
        System.out.println("4.Salir: Gracias por tu visita");
        break;  
        default: 
        System.out.println("Opcion invalida.Elige un numero del 1 al 4");
        break;
        }  
        System.out.println("desea continuar con otra operacion? (si/no)"); 
        continuar=sc.nextLine();
   if(!continuar.equals("S") || continuar.equals("s")){
    System.out.println("Gracias por utilizar este cajero."); 
      break;
      
       }
      } while(true);
       
   }
} 