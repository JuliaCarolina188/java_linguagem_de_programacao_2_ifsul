/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_Introdução;
import java.util.Scanner;
/**
 *
 * @author 20241SG.INF_I0053
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.next();
        
        System.out.print("Digite seu sua idade: ");
        byte idade = teclado.nextByte();
        
        System.out.println("\nOla, " + nome + "! Voce tem " + idade + " anos.");
        
    }
}
