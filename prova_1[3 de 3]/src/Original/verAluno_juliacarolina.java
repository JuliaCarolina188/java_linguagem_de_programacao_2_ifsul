public class verAluno_juliacarolina {
    float media(float n1, float n2, float n3, float n4){
        return (n1 + n2 + n3 + n4)/4;
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
