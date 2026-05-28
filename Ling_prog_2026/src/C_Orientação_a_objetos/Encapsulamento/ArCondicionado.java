package C_Orientação_a_objetos.Encapsulamento;

import java.util.Scanner;

public class ArCondicionado {

    public int temperatura;

    public int MudarTemperatura() {
        ArCondicionado ar = new ArCondicionado();
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        int temperatura = 0;

        while (!ok) {
            try {
                System.out.print("Digite a temperatura\n>");
                temperatura = input.nextInt();
                if (temperatura > 35 || temperatura < 15) {
                    System.out.print("Valor fora do intervalo esperado.");
                } else {
                    ok = true;
                }
            } catch (Exception e) {
                System.out.print("Erro: " + e + "\n");
                input.nextLine();

            }
        }

        return temperatura;
    }
}
