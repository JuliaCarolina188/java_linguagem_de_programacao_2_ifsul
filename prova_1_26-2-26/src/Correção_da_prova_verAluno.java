package D_Tratamento_de_erros;
import java.util.Scanner;

public class Correção_da_prova_verAluno {
    float media(float n1, float n2, float n3, float n4){
        return (n1 + n2 + n3 + n4)/4;
    }
    
    int receberN(int min, int max){
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        int n = 0;
        
        while(!ok){
            try{
                n = input.nextByte();
                if(n < min || n > max){
                    System.out.println("Numero fora do intervalo permitido (" + min + " -> " + max + ")");
                }else{
                    ok = true;
                }
            } catch (Exception e){
                System.out.print("Numero invalido\nDigite novamente>");
                input.next();
            }
        }
        return n;
    }
    
    String conceito(float media){
        if(media < 5){
            return "E";
        } else if(media < 6.5){
            return "D";
        } else if(media < 7.5){
            return "C";
        } else if(media <= 9){
            return "B";
        } else {
            return "A";
        }
    }
    
    String status(float media, int faltas){
        if (media < 5 || faltas > 10){
            return "REPROVADO";
        } else if (media < 7){
            return "RECUPERACAO";
        } else{
            return "APROVADO";
        }
    }
}
