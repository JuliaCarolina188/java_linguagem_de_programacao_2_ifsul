package B_Repetição_e_seleção;
import java.util.Scanner;
public class Ex043 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        byte n1;
        byte n2;
        byte n3;
        float media;
        float maiorMedia = 0;
        String nomeMaior = "";
        float menorMedia = 0;
        String nomeMenor = "";
        float somaTurma = 0;
        float cont = 0;
        float mediaTurma = 0;

        for(byte i = 1; i <= 10; i++){
            System.out.print("Digite o nome do aluno: \n>");
            nome = teclado.next();

            System.out.print("Digite suas 3 notas: \n>");
            n1 = teclado.nextByte();
            System.out.print(">");
            n2 = teclado.nextByte();
            System.out.print(">");
            n3 = teclado.nextByte();

            media = (n1 + n2 + n3) / 3f;

            System.out.print("A media do aluno foi: " + media);

            if (media < 4) {
                System.out.println(" - REPROVADO");
            } else if (media < 7) {
                System.out.println(" - RECUPERAÇÃO");
            } else {
                System.out.println(" - APROVADO");
            }

            if (i == 1){
                maiorMedia = media;
                menorMedia = media;
                mediaTurma = media;

                nomeMaior = nome;
                nomeMenor = nome;
            } else {
                if(media > maiorMedia){
                    maiorMedia = media;
                    nomeMaior = nome;
                } else if(media < menorMedia){
                    menorMedia = media;
                    nomeMenor = nome;
                }
            }
            somaTurma += media;
            cont++;
        }

        mediaTurma = somaTurma / cont;
        System.out.println("Maior média: " + maiorMedia +", do aluno " + nomeMaior + "\nMenor media: " + menorMedia + " do aluno " + nomeMenor + "\nMedia da turma: " + mediaTurma);
    }   
}

