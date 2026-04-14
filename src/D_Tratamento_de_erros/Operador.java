package D_Tratamento_de_erros;

import java.util.Scanner;

public class Operador{
    public float soma(float n1, float n2){
        return n1 + n2;
    }
    public float sub(float n1, float n2){
        return n1 - n2;
    }
    public float div(float n1, float n2){
        return n1 / n2;
    }
    public float mult(float n1, float n2){
        return n1 * n2;
    }
    public String tab(float n1){
        String tab = "";
        for(int i = 1; i <= 10; i++){
            tab += n1 + " x " + i + " = " + i * n1 + "\n";
        }
        return tab;
    }
    public float fat(float n1){
        int fat = 1;
        for(float i = n1; i > 0; i--){
            fat *= i;
        }
        return fat;
    }
    
    public float receberFloat(){
        Scanner input = new Scanner(System.in);
        float n = 0;
        boolean numerook = false;
        
        try{
            n = input.nextFloat();
        } catch (Exception e){
            System.out.println("Erro no recebimento.");
            input.nextLine();
            do {
                System.out.print("Digite novamente> ");
                try{
                    n = input.nextFloat();
                    numerook = true;
                } catch (Exception f){
                    System.out.println("Erro no recebimento.");
                    input.nextLine();
                }
            } while(numerook == false);
        }
        return n;
    }
    public byte receberByte(){
        Scanner input = new Scanner(System.in);
        byte n = 0;
        boolean numerook = false;
        
        try{
            n = input.nextByte();
        } catch (Exception e){
            System.out.println("Erro no recebimento.");
            input.nextLine();
            do {
                System.out.print("Digite novamente> ");
                try{
                    n = input.nextByte();
                    numerook = true;
                } catch (Exception f){
                    System.out.println("Erro no recebimento.");
                    input.nextLine();
                }
            } while(numerook == false);
        }
        return n;
    }
}