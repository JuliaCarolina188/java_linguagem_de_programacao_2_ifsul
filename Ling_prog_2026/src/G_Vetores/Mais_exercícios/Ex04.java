package G_Vetores.Mais_exercícios;

import D_Tratamento_de_erros.Operador;
import java.util.ArrayList;

public class Ex04 {

    public static void main(String args[]) {
        Operador opera = new Operador();

        ArrayList<Integer> vetor = new ArrayList<Integer>();
        ArrayList<Integer> vetorreserva = new ArrayList<Integer>();
        ArrayList<Integer> vetorcrescente = new ArrayList<Integer>();
        ArrayList<Integer> devetorcrescente = new ArrayList<Integer>();

        int menor = 0;
        int maior = 0;

        System.out.println("Digite 10 numeros: ");

        for (byte i = 0; i < 10; i++) {
            System.out.print(">");
            vetor.add(opera.receberByte(0, 100));
        }
        vetorreserva.addAll(vetor);
        while (!vetor.isEmpty()) {
            menor = 0;
            for (byte j = 0; j < vetor.size(); j++) {
                if (j == 0) {
                    menor = vetor.get(j);
                } else {
                    if (vetor.get(j) < menor) {
                        menor = vetor.get(j);
                    }
                }
            }
            vetorcrescente.add(menor);
            vetor.remove(Integer.valueOf(menor));
        }
        while (!vetorreserva.isEmpty()) {
            maior = 0;
            for (byte j = 0; j < vetorreserva.size(); j++) {
                if (j == 0) {
                    maior = vetorreserva.get(j);
                } else {
                    if (vetorreserva.get(j) > maior) {
                        maior = vetorreserva.get(j);
                    }
                }
            }
            devetorcrescente.add(maior);
            vetorreserva.remove(Integer.valueOf(maior));
        }
        System.out.print("Resultado crescente: ");
        for (byte j = 0; j < 10; j++) {
            System.out.print(vetorcrescente.get(j) + ", ");
        }
        System.out.print("\nResultado decrescente: ");
        for (byte j = 0; j < 10; j++) {
            System.out.print(devetorcrescente.get(j) + ", ");
        }
    }
}
