package G_Vetores.Introdução;

import D_Tratamento_de_erros.Operador;

public class Ex04 {
    public static void main(String[] args) {
        Operador opera = new Operador();
        
        float notas[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        float nota;
        byte aprovados = 0;
        byte reprovados = 0;
        byte recuperacao = 0;
        float maior = 0;
        float menor = 0;
        float soma = 0;
        
        
        System.out.print("Digite as notas de 10 alunos\n");
        for(byte i = 0; i < 10; i++) {
            System.out.print(">");
            nota = opera.receberFloat(0, 10);
            if(nota < 0 || nota > 10){
                System.out.println("Numero fora do intervalo esperado");
                while(nota < 0 || nota > 10){
                    nota = opera.receberFloat(0, 10);
                }
            }
            
            if(nota < 5){
                reprovados += 1;
            } else if(nota <6){
                recuperacao += 1;
            } else {
                aprovados += 1;
            }
            
            if (i == 0){
                maior = nota;
                menor = nota;
            } else {
                if(nota > maior){
                    maior = nota;
                }
                if(nota < menor){
                    menor = nota;
                }
            }
            
            soma += nota;
        }
        
        System.out.println("\n---RESULTADOS---\nAprovados: " + aprovados + "\nEm recuperacao: " + recuperacao + "\nReprovados: " + reprovados + "\n\nMaior nota: " + maior + "\nMenor nota: " + menor);
        
    }
}