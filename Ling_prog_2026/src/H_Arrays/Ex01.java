package H_Arrays;

import java.util.Arrays;

public class Ex01 {

    public static void main(String[] args) {
        int vetor[] = {30, 25, 50, 60, 85, 90, 65, 18};

        Arrays.sort(vetor);
        for (int c = 0; c < vetor.length; c++) {
            System.out.print(vetor[c] + " \n");
        }
        
        String strings[] = {"Julia", "Marco", "Duke", "Theo", "Fernado"};
        Arrays.sort(strings);
        
        for (int c = 0; c < strings.length; c++) {
            System.out.print(strings[c] + " \n");
        }
    }
}
