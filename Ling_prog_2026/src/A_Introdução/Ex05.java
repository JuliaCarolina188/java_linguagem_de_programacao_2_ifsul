/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A_Introdução;

/**
 *
 * @author 20241SG.INF_I0053
 */
import java.util.Scanner;
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        float a = teclado.nextFloat();
        System.out.print("Digite outro número: ");
        float b = teclado.nextFloat();
        
        float res = a + b;
        System.out.println(a + " + " + b + " = " + res);
        
        res = a - b;
        System.out.println(a + " - " + b + " = " + res);
        
        res = a * b;
        System.out.println(a + " x " + b + " = " + res);
        
        res = a / b;
        System.out.println(a + " / " + b + " = " + res);
    }
    
}
