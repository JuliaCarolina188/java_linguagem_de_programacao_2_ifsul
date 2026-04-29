package G_Vetores.Introdução;

import D_Tratamento_de_erros.Operador;

public class Ex03 {
    public static void main(String[] args) {
        Operador opera = new Operador();
        
        float notas[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        float nota;
        byte aprovados = 0;
        byte reprovados = 0;
        byte recuperacao = 0;
        
        System.out.print("Digite as notas de 10 alunos\n");
        for(byte i = 0; i < 10; i++) {
            System.out.print(">");
            nota = opera.receberFloat(0, 10);
            
            if(nota < 5){
                reprovados += 1;
            } else if(nota <6){
                recuperacao += 1;
            } else {
                aprovados += 1;
            }
        }
        
        System.out.println("\n---RESULTADOS---\nAprovados: " + aprovados + "\nEm recuperacao: " + recuperacao + "\nReprovados: " + reprovados);
        
    }
}