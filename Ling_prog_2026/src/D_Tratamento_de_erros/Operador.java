package D_Tratamento_de_erros;

import java.util.ArrayList;
import java.util.Scanner;

public class Operador {
    public static void main(String[] args){
        Operador opera = new Operador();
        System.out.print(opera.tabVetor(2));
    }

    public float soma(float n1, float n2) {
        return n1 + n2;
    }

    public float sub(float n1, float n2) {
        return n1 - n2;
    }

    public float div(float n1, float n2) {
        return n1 / n2;
    }

    public float mult(float n1, float n2) {
        return n1 * n2;
    }

    public String tab(float n1) {
        String tab = "";
        for (int i = 1; i <= 10; i++) {
            tab += n1 + " x " + i + " = " + i * n1 + "\n";
        }
        return tab;
    }

    public ArrayList tabVetor(int n) {
        ArrayList<Integer> tabuada = new ArrayList<>();
        for(byte i = 1; i < 11; i++){
            tabuada.add(n * i);
        }
        return tabuada;
    }

    public float fat(float n1) {
        int fat = 1;
        for (float i = n1; i > 0; i--) {
            fat *= i;
        }
        return fat;
    }

    public float receberFloat(int min, int max) {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        float n = 0;

        while (!ok) {
            try {
                n = input.nextByte();
                if (n < min || n > max) {
                    System.out.println("Numero fora do intervalo permitido (" + min + " -> " + max + ")");
                } else {
                    ok = true;
                }
            } catch (Exception e) {
                System.out.print("Numero invalido\nDigite novamente>");
                input.next();
            }
        }
        return n;
    }

    public int receberByte(int min, int max) {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        int n = 0;

        while (!ok) {
            try {
                n = input.nextByte();
                if (n < min || n > max) {
                    System.out.println("Numero fora do intervalo permitido (" + min + " -> " + max + ")");
                } else {
                    ok = true;
                }
            } catch (Exception e) {
                System.out.print("Numero invalido\nDigite novamente>");
                input.next();
            }
        }
        return n;
    }
}
