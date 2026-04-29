package G_Vetores.Mais_exercícios;

import D_Tratamento_de_erros.Operador;

public class Ex01 {

    public static void main(String[] args) {
        Operador opera = new Operador();

        int n1;
        int n2;
        int opc;

        while (true) {
            System.out.print("---CALCULADORA---\nDigite um numero> ");
            n1 = opera.receberByte(-1000, 1000);
            System.out.print("Digite mais um> ");
            n2 = opera.receberByte(-1000, 1000);

            System.out.print("Agora escolha uma opcao: \n1-Adicao \n2-Subtracao \n3-Multiplicacao \n4-Divisao \n5-Fatorial \n6-Tabuada \n7-Raiz Quadrada\n8-Potencia \n9-Seno \n10-Coseno \n11-Tangente \n12-Area do Circulo \n0-Fim\n>>>");
            opc = opera.receberByte(0, 12);
            switch (opc) {
                case 0 -> {
                    System.out.println("Fim do processo.");
                    break;
                }
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
                        System.out.println(n1 + " x " + n2 + " = " + opera.mult(n1, n2));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 4 -> {
                    try {
                        System.out.println(n1 + " / " + n2 + " = " + opera.div(n1, n2));
                    } catch (ArithmeticException e) {
                        System.err.println("Erro Divisão por Zero");
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 5 -> {
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
                case 6 -> {
                    try {
                        System.out.println(opera.tabVetor(n1));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }

                    try {
                        System.out.println(opera.tabVetor(n2));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 7 -> {
                    try {
                        System.out.println("Raiz quadrada de " + n1 + " = " + Math.sqrt(n1));
                        System.out.println("Raiz quadrada de " + n2 + " = " + Math.sqrt(n2));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 8 -> {
                    try {
                        System.out.println(n1 + " elevado ao quadrado = " + Math.pow(n1, 2));
                        System.out.println(n2 + " elevado ao quadrado = " + Math.pow(n2, 2));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 9 -> {
                    try {
                        System.out.println("Seno de " + n1 + " = " + Math.sin(n1));
                        System.out.println("Seno de " + n2 + " = " + Math.sin(n2));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 10 -> {
                    try {
                        System.out.println("Cosseno de " + n1 + " = " + Math.cos(n1));
                        System.out.println("Cosseno de " + n2 + " = " + Math.cos(n2));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 11 -> {
                    try {
                        System.out.println("Tangente de " + n1 + " = " + Math.tan(n1));
                        System.out.println("Tangente de " + n2 + " = " + Math.tan(n2));
                    } catch (Exception e) {
                        System.err.println("Erro> " + e.getMessage());
                    }
                }
                case 12 -> {
                    System.out.println("Area do círculo com o raio " + n1 + ": " + (Math.PI * Math.pow(n1, 2)));
                    System.out.println("Area do círculo com o raio " + n2 + ": " + (Math.PI * Math.pow(n2, 2)));
                }
            }
            if (opc == 0) {
                break;
            }
            System.out.println("");
        }
    }
}
