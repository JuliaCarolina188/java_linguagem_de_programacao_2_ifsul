package D_Tratamento_de_erros;

import java.util.Scanner;

    public class Correção_da_prova_Main {
        public static void main(String args[]){
            int matricula;
            String nome;
            float n1;
            float n2;
            float n3;
            float n4;
            int faltas;
            float media;

            Correção_da_prova_verAluno veraluno = new Correção_da_prova_verAluno();
            Scanner input = new Scanner(System.in);

            do {
                System.out.println("---CADASTRO DE ALUNOS---");
                System.out.print("Digite o numero de matricula> ");
                matricula = veraluno.receberN(0, 100);

                if(matricula == 0){
                    break;
                }

                System.out.print("Digite o nome do aluno>");
                nome = input.next();

                System.out.print("Digite as 4 notas> ");
                n1 = veraluno.receberN(0, 10);
                System.out.print(">");
                n2 = veraluno.receberN(0, 10);
                System.out.print(">");
                n3 = veraluno.receberN(0, 10);
                System.out.print(">");
                n4 = veraluno.receberN(0, 10);

                System.out.print("E por fim, a quantidade de faltas> ");
                faltas = veraluno.receberN(0, 100);

                System.out.print("---RESULTADOS---\n");
                media = veraluno.media(n1, n2, n3, n4);
                System.out.print(nome + ", media e " + media + " - Conceito " + veraluno.conceito(media) + " - " + veraluno.status(media, faltas) + ", total de faltas " + faltas + "\n\n");
            }while(true);
        }
    }
