package ejercicio4;
import java.util.Scanner;

/**
 * @author sverdecadilla
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Teclea el primer valor:");
        int a = (int) sc.nextFloat();
        System.out.println("Teclea el segundo valor:");
        int b = (int) sc.nextFloat();
        System.out.println(" La suma es "+(a+b)+"\n La resta es "+(a-b)+"\n La multiplicacion es "+(a*b)+"\n La division es "+(a/b));
        
    }
    
}
