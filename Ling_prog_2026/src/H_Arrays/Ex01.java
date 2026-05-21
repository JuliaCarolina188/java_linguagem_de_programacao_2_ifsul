package H_Arrays;

import D_Tratamento_de_erros.Operador;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Ex01 {

    public static void main(String[] args) {
        Operador opera = new Operador();
        int vetor[] = {30, 25, 50, 60, 85, 90, 65, 18};

        Arrays.sort(vetor);
        for (int c = 0; c < vetor.length; c++) {
            System.out.print(vetor[c] + ", ");
        }
        System.out.println();
        String strings[] = {"Julia", "Marco", "Duke", "Theo", "Fernado"};
        Arrays.sort(strings);
        
        for (String string : strings) {
            System.out.print(string + ", ");
        }
        
        int posicao = Arrays.binarySearch(strings, "Julia");
        System.out.println("\nPosicao da Julia: " + posicao);
        int posi = Arrays.binarySearch(strings, "Matheus");
        System.out.println("Posicao do Matheus: " + posi);
        
        System.out.print("Digite 5 numeros: ");
        ArrayList<Integer> vetint = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            System.out.print(">");
            vetint.add(opera.receberByte(1, 100));
        }
        System.out.println("Lista: " + vetint);
        Collections.sort(vetint);
        System.out.println("Lista ordenada: " + vetint);

    }
}
