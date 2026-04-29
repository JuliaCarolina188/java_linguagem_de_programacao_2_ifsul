package B_Repetição_e_seleção;
import java.util.Scanner;
public class Ex042 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte num1 = 1;
        byte num2 = 2;
        byte maior;
        do {
            System.out.print("Digite dois numeros: \n>");
            num1 = teclado.nextByte();
            System.out.print(">");
            num2 = teclado.nextByte();
            
            if (num1 > num2){
                maior = num1;
            } else {
                maior = num2;
            }
            
            System.out.print("Maior: " + maior + "\n");
        } while (num1 != num2);
        System.out.print("\nProcesso finalizado\n");
    }
}

