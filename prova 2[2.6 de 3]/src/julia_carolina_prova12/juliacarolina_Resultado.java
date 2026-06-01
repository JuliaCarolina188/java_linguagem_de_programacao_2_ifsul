package julia_carolina_prova12;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class juliacarolina_Resultado {
    // NÃO ESQUECER DE COMEÇAR COM JC

    static String jc_print(String frase){
        System.out.print(frase);
        return "";
    }
    static String jc_receber_nome() {
        Scanner input = new Scanner(System.in);
        String nome;
        while (true) {
            try {
                nome = input.next();
                break;
            } catch (Exception e) {
                System.out.print("Erro: " + e);
            }
        }
        return nome;
    }
    
    static int jc_receber_int(int min, int max, String frase) {
        Scanner input = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.print(frase);
                n = input.nextInt();
                if(n > max || n < min){
                    System.out.print("Erro: fora do intervalo permitido (" + min + " - " + max + ")");
                    input.next();
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.print("Erro: " + e + "\n");
                input.next();
            }
        }
        return n;
    }
    
    static double jc_receber_double(double min, double max, String frase) {
        Scanner input = new Scanner(System.in);
        double n;
        while (true) {
            try {
                System.out.print(frase);
                n = input.nextDouble();
                if(n > max || n < min){
                    System.out.print("Erro: fora do intervalo permitido (" + min + " - " + max + ")");
                    input.next();
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.print("Erro: " + e + "\n");
                input.next();
            }
        }
        return n;
    }
    
    static String jc_IMC(double peso, double altura, int sexo){
        double imc = peso / Math.pow(altura, 2);
        String resultado = "";
        
        if(sexo == 1){
            if(imc < 20.7){
                resultado = "Abaixo do peso";
            } else if (imc < 26.4){
                resultado = "Peso normal";
            }else if (imc < 27.8){
                resultado = "Marginalmente acima do peso";
            }else if (imc < 31.1){
                resultado = "Acima do peso ideal";
            }else if (imc > 31.1){
                resultado = "Obesidade";
            }
        }else{
            if(imc < 19.1){
                resultado = "Abaixo do peso";
            } else if (imc < 25.8){
                resultado = "Peso normal";
            }else if (imc < 27.3){
                resultado = "Marginalmente acima do peso";
            }else if (imc < 32.3){
                resultado = "Acima do peso ideal";
            }else if (imc > 32.3){
                resultado = "Obesidade";
            }
        }
        return (imc + " - " + resultado);
    }
    
}
