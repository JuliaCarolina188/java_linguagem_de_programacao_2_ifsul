package G_Vetores.Mais_exercícios;

import java.util.Arrays;
import java.util.Scanner;

public class ExPROVA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome>");
        String nome = input.next();

        System.out.print("Nascimento(ano-mes-dia)> ");
        String nascimento = input.next();

        System.out.print("Matricula> ");
        int matricula = input.nextInt();

        String respostas[] = new String[10];
        String gabarito[] = {"a", "d", "e", "c", "b", "c", "a", "b", "c", "d"};
        for (byte i = 0; i < 10; i++) {
            System.out.print("Questao " + (i + 1) + ">");
            respostas[i] = input.next();
        }
        int nota = 0;
        for (byte i = 0; i < 10; i++) {
            if (!gabarito[i].equals(respostas[i])) {
                nota++;
            }
        }
        String conceito;
        if(nota < 5){
            conceito = "E";
        } else if(nota < 6.4){
            conceito = "D";
        }else if(nota < 7.4){
            conceito = "C";
        }else if(nota < 9){
            conceito = "B";
        }else{
            conceito = "A";
        }
        System.out.print(conceito);
        
    }
        
}
