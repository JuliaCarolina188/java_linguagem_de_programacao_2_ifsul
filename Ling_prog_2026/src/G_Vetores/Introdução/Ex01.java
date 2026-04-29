package G_Vetores.Introdução;

import D_Tratamento_de_erros.Operador;

public class Ex01 {
    public static void main (String args[]){
        int vetor[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Operador opera = new Operador();
        
        System.out.println("Digite 10 numeros: ");
        
        for(byte i = 0; i < 10; i++){
            System.out.print(">");
            vetor[i] = opera.receberByte(-100, 100);
        }
        
        System.out.print("\nVETOR CONSTRUIDO: ");
        
        for(byte i = 0; i < 10; i++){
            if(i == 9){
                System.out.print(vetor[i] + ". ");
            } else {
                System.out.print(vetor[i] + ", ");
            }
        }
    }
}
