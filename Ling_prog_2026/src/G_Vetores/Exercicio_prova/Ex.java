package G_Vetores.Introdução.Exercicio_prova;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex {

    public static void main(String args[]) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        String continuar;
        String nome;
        String nascimento;
        String conceito;
        int menorSeis = 0;
        int totalAlunos = 0;
        int totalNotas = 0;
        int idade;
        float media;
        String[] respostas = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
        String[] gabarito = {"a", "d", "e", "c", "b", "c", "a", "b", "c", "d"};
        int nota = 0;

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        do {
            System.out.print("Matrícula> ");
            scanner.next();
            scanner.nextLine();

            System.out.print("Nome> ");
            nome = scanner.nextLine();

            while (true) {
                try {
                    System.out.print("Nascimento (dd/mm/aaaa)> ");
                    nascimento = scanner.nextLine();
                    LocalDate dataNascimento = LocalDate.parse(nascimento, formatador);
                    idade = Period.between(dataNascimento, LocalDate.now()).getYears();
                    break;
                } catch (Exception e) {
                    System.out.println("Erro no recebimento da data.");
                }
            }

            for (byte i = 0; i < 10; i++) {
                respostas[i] = resposta(i);
            }

            for (byte i = 0; i < 10; i++) {
                if (respostas[i].equals(gabarito[i])) {
                    nota++;
                }
            }

            if (nota < 5) {
                conceito = "E";
            } else if (nota < 6.4) {
                conceito = "D";
            } else if (nota < 7.4) {
                conceito = "C";
            } else if (nota < 9) {
                conceito = "B";
            } else {
                conceito = "A";
            }

            if (nota < 6) {
                menorSeis++;
            }

            totalAlunos++;
            totalNotas += nota;
            media = (float) totalNotas / totalAlunos;

            System.out.println("Media da turma: " + media + "\nAlunos com menos que 6: " + menorSeis);
            System.out.println(nome + " (" + idade + " anos), sua nota é " + nota + ", conceito " + conceito);

            continuar = continuar();

            nota = 0;
        } while ("s".equals(continuar));

        scanner.close();

    }

    public static String continuar() {
        Scanner scanner = new Scanner(System.in);
        String res = "";

        while (true) {
            System.out.print("Continuar?(s/n)> ");
            try {
                res = scanner.next();

                if (res.equals("s") || res.equals("n")) {
                    break;
                } else {
                    System.out.println("Recebimento diferente de s/n");
                }
            } catch (Exception e) {
                System.out.println("Erro no recebimento");
            }
        }
        return res;
    }

    public static String resposta(int i) {
        Scanner scanner = new Scanner(System.in);
        String res = "";

        while (true) {
            System.out.print("Resposta " + (i + 1) + "> ");
            try {
                res = scanner.next();

                if (res.equals("a") || res.equals("b") || res.equals("c") || res.equals("d") || res.equals("e")) {
                    break;
                } else {
                    System.out.println("Recebimento diferente de a/b/c/d/e");
                }
            } catch (Exception e) {
                System.out.println("Erro no recebimento");
            }
        }
        return res;
    }
}
