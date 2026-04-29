package A_Introdução;
import java.util.Scanner;
public class Ex06 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite 3 numeros:\n>");
        byte maior;
        byte num1 = maior = teclado.nextByte();
        System.out.print(">");
        byte num2 = teclado.nextByte();
        if (num2 > maior) {
            maior = num2;
        }
        System.out.print(">");
        byte num3 = teclado.nextByte();
        if (num3 > maior) {
            maior = num3;
        }
        
        System.out.print("\nO maior numero foi o " + maior + "\n");
        
    }
    
}
