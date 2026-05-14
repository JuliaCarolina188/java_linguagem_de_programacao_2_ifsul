package H_Arrays;

import D_Tratamento_de_erros.Operador;
import java.util.ArrayList;
import java.util.Collections;

public class Ex03 {

    public static void main(String[] args) {
        ArrayList<Integer> vetor1 = new ArrayList<>();
        ArrayList<Integer> vetor2 = new ArrayList<>();
        ArrayList<Integer> resultado = new ArrayList<>();
        Operador opera = new Operador();

        System.out.println("Digite 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(">");
            vetor1.add(opera.receberByte(0, 100));
        }
        Collections.sort(vetor1);

        System.out.println("Digite mais 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(">");
            vetor2.add(opera.receberByte(0, 100));
        }
        Collections.sort(vetor2);

        System.out.println("Numeros nao repetidos: ");

        for (int i = 0; i < 5; i++) {
            if (!vetor1.contains(vetor2.get(i)) || !resultado.contains(vetor2.get(i))) {
                if (vetor2.get(i) % 2 == 0) {
                    resultado.add(vetor2.get(i));
                }
            }
            if (!vetor2.contains(vetor1.get(i)) || !resultado.contains(vetor1.get(i))) {
                if (vetor1.get(i) % 2 == 0) {
                    resultado.add(vetor1.get(i));
                }
            }
        }

        Collections.sort(resultado, Collections.reverseOrder());
        System.out.println(resultado);

    }
}
