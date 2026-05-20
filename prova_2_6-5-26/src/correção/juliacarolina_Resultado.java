package julia_carolina_prova12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class juliacarolina_Resultado {
    // NÃO ESQUECER DE COMEÇAR COM JC

    String jc_print(String frase) {
        System.out.print(frase);
        return "";
    }

    String jc_receber_nome() {
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

    int jc_receber_int(int min, int max, String frase) {
        Scanner input = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.print(frase);
                n = input.nextInt();
                if (n > max || n < min) {
                    System.out.print("Erro: fora do intervalo permitido (" + min + " - " + max + ")");
                    input.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Erro: " + e + "\n");
                input.nextLine();
            }
        }
        return n;
    }

    double jc_receber_double(double min, double max, String frase) {
        Scanner input = new Scanner(System.in);
        double n;
        while (true) {
            try {
                System.out.print(frase);
                n = input.nextDouble();
                if (n > max || n < min) {
                    System.out.print("Erro: fora do intervalo permitido (" + min + " - " + max + ")");
                    input.nextLine();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Erro: " + e + "\n");
                input.nextLine();
            }
        }
        return n;
    }

    String jc_IMC(double peso, double altura, int sexo) {
        double imc = peso / Math.pow(altura, 2);
        String resultado = "";

        if (sexo == 1) {
            if (imc < 20.7) {
                resultado = "Abaixo do peso";
            } else if (imc < 26.4) {
                resultado = "Peso normal";
            } else if (imc < 27.8) {
                resultado = "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                resultado = "Acima do peso ideal";
            } else {
                resultado = "Obesidade";
            }
        } else {
            if (imc < 19.1) {
                resultado = "Abaixo do peso";
            } else if (imc < 25.8) {
                resultado = "Peso normal";
            } else if (imc < 27.3) {
                resultado = "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                resultado = "Acima do peso ideal";
            } else {
                resultado = "Obesidade";
            }
        }
        return (String.format("%.1f", imc) + " - " + resultado);
    }

    String jc_idade(int dia, int mes, int ano) {
        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        LocalDate atual = LocalDate.now();

        Period periodo = Period.between(nascimento, atual);

        return periodo.getYears() + " anos, " + periodo.getMonths() + " meses, " + periodo.getDays() + " dias.\n";
    }

    int vencimento() {
        int vetor_vencimento[] = {1, 5, 10, 12, 15, 20, 25, 30};
        boolean ok;
        int vencimento = 0;
        
        while (!ok) {
            vencimento = jc_receber_int(1, 31, "Dia do vencimento>");
            for (int i = 0; i < 8; i++) {
                if (vetor_vencimento[i] == vencimento) {
                    jc_print("Numero do vencimento aceito. \n");
                    ok = true;
                    break;
                }
            }
            jc_print("Numero nao ceito. Insira um numero valido. \n");
        }
    }
}
