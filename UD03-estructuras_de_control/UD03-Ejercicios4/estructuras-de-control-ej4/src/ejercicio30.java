/*
 * Crea un programa que "dibuje" un triángulo creciente, alineado a la derecha,
   con la altura que indique el usuario.
 */
import java.util.Scanner;
public class ejercicio30 {
  @SuppressWarnings("ConvertToTryWithResources")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite la altura del triangulo");
    int altura,i,j;
    altura = sc.nextInt();
    for (i = 0; i < altura; i++) {
      for (j = 0; j <= i; j++) {
        System.out.print("*");
      }  
      System.out.print("\n");
    }  
    sc.close();      
  }  
}
// j = alto-i; j>0; j--
