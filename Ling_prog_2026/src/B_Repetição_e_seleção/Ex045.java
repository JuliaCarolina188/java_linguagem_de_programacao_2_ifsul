package B_Repetição_e_seleção;
import java.util.Scanner;
public class Ex045 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte maior;
        byte menor;
        
        while(true){
            System.out.print("Digite 3 numeros: \n>");
            byte num1 = maior = menor = teclado.nextByte();
            System.out.print(">");
            byte num2 = teclado.nextByte();
            if (num2 > maior) {
                maior = num2;
            } else if(num2 < menor) {
                menor = num2;
            }
            System.out.print("");
            byte num3 = teclado.nextByte();
            if (num3 > maior) {
                maior = num3;
            } else if(num3 < menor) {
                menor = num3;
            }

            if(num1 == 0 || num2 == 0 || num3 == 0){
                System.out.print("\nProcesso finalizado\n");
                break;
            }
            
            System.out.print("Maior: " + maior + "\nMenor: " + menor + "\n");
        }
    }   
}

