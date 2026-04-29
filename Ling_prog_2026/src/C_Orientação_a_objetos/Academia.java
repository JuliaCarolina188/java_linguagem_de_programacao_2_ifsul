package C_Orientação_a_objetos;

public class Academia {
    public static void main(String[] args) {
        System.out.print("Media: " + recebeNota(3, 3, 3) + "\nSituacao: " + verNota(3, 3, 3) + "\n\n");
    }
    
    public static float recebeNota(float n1,float n2,float n3){
        return (n1+n2+n3)/3;
    }
    public static String verNota(float n1,float n2,float n3){
        float media = recebeNota(n1, n2, n3);
        if(media <= 4){
            return "reprovado";
        } else if( media < 6){
            return "reavalização";
        } else {
            return "aprovado";
        }
    }
}