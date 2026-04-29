package G_Vetores.Introdução;
import D_Tratamento_de_erros.Operador;
public class Ex05 {
    public static void main(String[] args){
        System.out.println("O jogo vai continuar ate que voce descubra um dos numeros na lista secreta.");
        byte lista[] = {4, 92, 10, 47, 34, 78};
        Operador opera = new Operador();
        float n;
        boolean ok = false;
        
        System.out.print(">>>>");
        float a = opera.receberFloat(1, 100);
        
        while(!ok){
            System.out.print(">");
            n = opera.receberFloat(0, 100);
            
            for(byte i = 0; i < 5; i++){
                if(lista[i] == n){
                    ok = true;
                    break;
                }
            }
            if(ok){
                System.out.print("Numero encontrado!");
            } else {
                System.out.println("Errou");
            }
        }
        System.out.print("Fim do processo!\n");
    }
}
