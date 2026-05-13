package G_Vetores.Mais_exercícios;

import D_Tratamento_de_erros.Operador;
import java.util.ArrayList;

public class Ex03 {

    public static void main(String args[]) {
        Operador opera = new Operador();

        int vetor1[] = new int[10];
        ArrayList resultado = new ArrayList();

        System.out.println("Digite 10 numeros: ");

        for (byte i = 0; i < 10; i++) {
            System.out.print(">");
            vetor1[i] = opera.receberByte(-100, 100);
        }
        for (byte i = 9; i > -1; i--) {
            resultado.add(vetor1[i]);
        }
        
        System.out.print("Vetor invertido: ");
        for (int i = 0; i < resultado.size(); i++) {
            System.out.print(resultado.get(i) + ", ");
        }
    }
}
