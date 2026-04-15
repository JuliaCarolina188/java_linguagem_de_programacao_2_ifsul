package Exercícios_repetição_e_seleção;

import java.util.Scanner;

public class Ex031 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero: \n>");
        int num = teclado.nextInt();
        
        System.out.print("Escolha uma opcao: \n1 - Tabuada\n2 - Fatorial\n3 - Sair\n>");
        byte opc = teclado.nextByte();
        
        switch(opc) {
            case 1 -> {
                int res;
                for(int i = 1; i <= 10; i++) {
                    res = i * num;
                    System.out.println(i + " x 2 = " + res);
                }
            }
            case 2 -> {
                int res = 1;
                for(int i = num; i > 0; i--){
                    res *= i;
                    System.out.println(res);
                }
                System.out.print("Resposta final: " + res + "\n");
            }
            default -> {
                System.out.print("Processo finalizado\n");
            }
        }
      
    }
}

