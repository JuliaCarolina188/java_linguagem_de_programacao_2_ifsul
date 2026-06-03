package C_Orientação_a_objetos.Encapsulamento;

import java.util.Scanner;

public class ControleRemoto {

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("   TEMPERATURA: " + ar.Mostraremperatura());

            System.out.print("Digite a temperatura> ");
            ar.MudarTemperatura(input.nextByte());

            try {
                System.out.print("Continuar?\n(true/false> ");
                continuar = input.nextBoolean();

            } catch (Exception E) {
                System.out.print("      Continuando por erro");

            }
        }
    }
}
