import java.util.Scanner;
public class juliacarolina_prova1 {
    public static void main(String args[]){
    //26-2-26
        byte matricula;
        String nome;
        float n1;
        float n2;
        float n3;
        float n4;
        byte faltas;
        float media;
        
        verAluno_juliacarolina veraluno = new verAluno_juliacarolina();
        Scanner input = new Scanner(System.in);
        
        
        do {
            System.out.print("---CADASTRO DE ALUNOS---\n");
            System.out.print("Digite o numero de matricula> ");
            matricula = input.nextByte();
            
            if(matricula == 0){
                break;
            }
            
            System.out.print("Digite o nome do aluno>");
            nome = input.next();
            
            System.out.print("Digite as 4 notas> ");
            n1 = input.nextFloat();
            System.out.print(">");
            n2 = input.nextFloat();
            System.out.print(">");
            n3 = input.nextFloat();
            System.out.print(">");
            n4 = input.nextFloat();
            
            System.out.print("E por fim, a quantidade de faltas> ");
            faltas = input.nextByte();
            
            System.out.print("---RESULTADOS---\n");
            media = veraluno.media(n1, n2, n3, n4);
            System.out.print(nome + ", media e " + media + " - Conceito " + veraluno.conceito(media) + " - " + veraluno.status(media, faltas) + ", total de faltas " + faltas + "\n\n");
        }while(true);
    }
}
