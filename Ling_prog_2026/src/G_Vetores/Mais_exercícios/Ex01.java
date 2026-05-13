package G_Vetores.Mais_exercícios;

import D_Tratamento_de_erros.Operador;

public class Ex01 {

    public static void main(String args[]) {
        Operador opera = new Operador();

        int vetor1[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int vetor2[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("Digite 10 numeros: ");

        for (byte i = 0; i < 10; i++) {
            System.out.print(">");
            vetor1[i] = opera.receberByte(-100, 100);
        }

        System.out.println("Digite mais 10 numeros: ");

        for (byte i = 0; i < 10; i++) {
            System.out.print(">");
            vetor2[i] = opera.receberByte(-100, 100);
        }

        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                if (vetor1[i] > vetor2[i]) {
                    maior = vetor1[i];
                    menor = vetor2[i];
                } else {
                    maior = vetor2[i];
                    menor = vetor1[i];
                }
            } else {
                if (vetor1[i] > maior) {
                    maior = vetor1[i];
                } else if (vetor1[i] < menor) {
                    menor = vetor1[i];
                }
                if (vetor2[i] > maior) {
                    maior = vetor2[i];
                } else if (vetor2[i] < menor) {
                    menor = vetor2[i];
                }
            }
        }

        System.out.print("\nMaior numero: " + maior + "\nMenor numero: " + menor + "\n\n");
    }
}
