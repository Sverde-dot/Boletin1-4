/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
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
        int suma= (int) (a+b) ;
        int resta= (int) (a-b) ;
        int multi= (int) (a*b) ;
        int divi= (int) (a/b) ;
        System.out.println(" La suma es "+suma+"\n La resta es "+resta+"\n La multiplicacion es "+multi+"\n La division es "+divi);
        
    }
    
}
