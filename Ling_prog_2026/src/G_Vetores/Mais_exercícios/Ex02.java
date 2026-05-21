package G_Vetores.Mais_exercícios;

import D_Tratamento_de_erros.Operador;

public class Ex02 {

    public static void main(String args[]) {
        Operador opera = new Operador();

        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int resultado[] = new int[10];

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

        for (int i = 0; i < 10; i++) {
            if (vetor1[i] > vetor2[i]) {
                resultado[i] = vetor1[i];
            } else {
                resultado[i] = vetor2[i];
            }
        }
        
        System.out.print("Vetor com os maiores valores: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(resultado[i] + ", ");
        }
    }
}
