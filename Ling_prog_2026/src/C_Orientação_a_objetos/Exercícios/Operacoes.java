import java.util.Scanner;
public class Operacoes {
    public static void main(String[] args) {
        Operador opera = new Operador();

        Scanner input = new Scanner(System.in);
        float n1;
        float n2;
        int opc;

        do {
            System.out.print("Primeiro numero> ");
            n1 = input.nextFloat();
            System.out.print("Segundo numero> ");
            n2 = input.nextFloat();
            System.out.print("Opcoes:\n1 - Soma\n2 - Subtracao\n3 - Divisao\n4 - Multipicacao\n5 - Tabuada\n6 - Fatorial\n9 - Fim\n> ");
            opc = input.nextInt();

            switch(opc){
                case 1 -> {
                    System.out.println(n1 + " + " + n2 + " = " + opera.soma(n1, n2));
                }
                case 2 -> {
                    System.out.println(n1 + " - " + n2 + " = " + opera.sub(n1, n2));
                }
                case 3 -> {
                    System.out.println(n1 + " / " + n2 + " = " + opera.div(n1, n2));
                }
                case 4 -> {
                    System.out.println(n1 + " x " + n2 + " = " + opera.mult(n1, n2));
                }
                case 5 -> {
                    System.out.println(opera.tab(n1));
                    System.out.println("\n");
                    System.out.println(opera.tab(n2));
                }
                case 6 -> {
                    System.out.println("!" + n1 + " = " + opera.fat(n1));
                    System.out.println("!" + n2 + " = " + opera.fat(n2));
                }
                case 9 -> {
                    System.out.println("Fim do processo;");
                    break;
                }
            }
        } while(opc != 9);
    }
}
