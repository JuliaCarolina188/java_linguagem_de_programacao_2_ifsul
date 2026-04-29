package D_Tratamento_de_erros;

import java.util.Scanner;

public class Operacoes {

    public static void main(String[] args) {
        Operador opera = new Operador();

        Scanner input = new Scanner(System.in);
        float n1 = 0;
        float n2 = 0;
        int opc;

        do {
            System.out.println("---CALCULADORA---");

            System.out.print("Primeiro numero> ");
            n1 = opera.receberFloat(-10000, 10000);

            System.out.print("Segundo numero> ");
            n2 = opera.receberFloat(10000, 10000);

            System.out.print("Opcoes:\n1 - Soma\n2 - Subtracao\n3 - Divisao\n4 - Multipicacao\n5 - Tabuada\n6 - Fatorial\n9 - Fim\n> ");

            opc = opera.receberByte(10000, 10000);

            switch (opc) {
                case 1 -> {
                    try {
                        System.out.println(n1 + " + " + n2 + " = " + opera.soma(n1, n2));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        System.out.println(n1 + " - " + n2 + " = " + opera.sub(n1, n2));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        System.out.println(n1 + " / " + n2 + " = " + opera.div(n1, n2));
                    } catch (ArithmeticException e) {
                        System.err.println("Erro Divisão por Zero");
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 4 -> {
                    try {
                        System.out.println(n1 + " x " + n2 + " = " + opera.mult(n1, n2));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 5 -> {
                    try {
                        System.out.println(opera.tab(n1));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                    System.out.println("\n");
                    try {
                        System.out.println(opera.tab(n2));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 6 -> {
                    try {
                        System.out.println("!" + n1 + " = " + opera.fat(n1));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }

                    try {
                        System.out.println("!" + n1 + " = " + opera.fat(n2));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 9 -> {
                    System.out.println("Fim do processo;");
                    break;
                }
            }
        } while (opc != 9);
    }
}
