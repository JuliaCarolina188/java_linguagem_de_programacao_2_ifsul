package Introdução;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---------USANDO IF---------");
        System.out.print("Digite 2 numeros: \n>");
        float num1 = teclado.nextFloat();
        System.out.print(">");
        float num2 = teclado.nextFloat();
        
        System.out.print("\n1 - Adicao\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\nEscolha uma opcao: ");
        byte opc = teclado.nextByte();
        float res;
        
        if(opc == 1){
            res = num1+num2; 
            System.out.print(num1 + " + " + num2 + " = " + res + "\n\n");
        } else if(opc == 2) {
            res = num1-num2; 
            System.out.print(num1 + " - " + num2 + " = " + res + "\n\n");
        } else if(opc == 3){
            res = num1*num2; 
            System.out.print(num1 + " x " + num2 + " = " + res + "\n\n");
        } else if(opc ==  4){
            res = num1/num2; 
            System.out.print(num1 + " / " + num2 + " = " + res + "\n\n");
        } else {
            System.out.print("Opção inválida\n\\n\"");
        }
        
        System.out.println("---------USANDO SWITCH---------");
        System.out.print("Digite 2 numeros: \n>");
        num1 = teclado.nextFloat();
        System.out.print(">");
        num2 = teclado.nextFloat();
        
        System.out.print("\n1 - Adicao\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\nEscolha uma opcao: ");
        opc = teclado.nextByte();
        
        switch(opc){
            case 1 -> {
                res = num1+num2; 
                System.out.print(num1 + " + " + num2 + " = " + res + "\n\n");
            }
            case 2 -> {
                res = num1-num2; 
                System.out.print(num1 + " - " + num2 + " = " + res + "\n\n");
            }
            case 3 -> {
                res = num1*num2; 
                System.out.print(num1 + " x " + num2 + " = " + res + "\n\n");
            }
            case 4 -> {
                res = num1/num2; 
                System.out.print(num1 + " / " + num2 + " = " + res + "\n\n");
            }
            default -> System.out.print("Opção inválida\n\\n\"");
                
        }
        
    }
    
}
