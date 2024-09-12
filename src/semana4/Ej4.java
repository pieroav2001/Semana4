
package semana4;

import java.util.Scanner;


public class Ej4 {
       public static void main(String[] args) {
   int n;
   Scanner leer=new Scanner(System.in);
   System.out.println("Ingresar un Numero");
   n=leer.nextInt();
        switch (n) {
            case 1:System.out.println("ES UN PERIODO MENSUAL");break; 
            case 2:System.out.println("ES UN PERIODO BIMESTRAL");break;     
            case 3:System.out.println("ES UN PERIODO TRIMESTAL");break; 
              case 4:System.out.println("ES UN PERIODO CUATRIMESTRAL");break;   
              
              case 6:System.out.println("ES UN PERIODO SEMESTRAL");break; 
             
              case 12:System.out.println("ES UN PERIODO ANUAL");break; 
        }
        
           
}
       }
