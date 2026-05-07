package julia_carolina_prova12;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class juliacarolina_TelaCadastro {

    public static void main(String[] args) {
        juliacarolina_Resultado metodo = new juliacarolina_Resultado();

        String nome;
        int dia = 0;
        int mes;
        int ano;
        double peso;
        double altura;
        int genero;
        String genero_convertido;
        int vencimento = 0;
        String vetor_mes[] = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        GregorianCalendar calendario = new GregorianCalendar();
        int ano_atual = calendario.get(Calendar.YEAR);
        int mes_atual = (calendario.get(Calendar.MONTH) + 1);
        int dia_atual = calendario.get(Calendar.DAY_OF_MONTH);
        boolean ok = false;

        metodo.jc_print("Nome>");
        nome = metodo.jc_receber_nome();

        ano = metodo.jc_receber_int(ano_atual - 122, ano_atual, "Ano do nascimento>");
        if (ano == ano_atual) {
            while (true) {
                mes = metodo.jc_receber_int(1, 12, "Mes do nascimento>");
                if (mes <= mes_atual) {
                    break;
                } else {
                    metodo.jc_print("Este mes ainda nao chegou. Digite um mes valido.\n");
                }
            }
            if (mes == mes_atual) {
                while (true) {
                    dia = metodo.jc_receber_int(1, 31, "Dia do nascimento>");
                    if (dia <= dia_atual) {
                        break;
                    }
                    if (!ok) {
                        metodo.jc_print("Numero nao aceito. Insira um numero valido.\n");
                    }
                }

            }
        } else {
            mes = metodo.jc_receber_int(1, 12, "Mes do nascimento>");

            dia = metodo.jc_receber_int(1, 31, "Dia do nascimento>");
        }

        peso = metodo.jc_receber_double(1, 500, "Peso>");

        altura = metodo.jc_receber_double(0.5, 3, "Altura>");

        genero = metodo.jc_receber_int(1, 2, "Genero(1 - Masc/2 - Fem)>");
       
        vencimento = metodo.vencimento();
            
        if (genero == 1) {
            genero_convertido = "masculino";
        } else {
            genero_convertido = "feminino";
        }

        metodo.jc_print("\n\n\n---------- Data do cadastro: " + (dia_atual + "/" + calendario.get(Calendar.MONTH + 1) + "/" + ano_atual) + " ----------\n---------- Informacoes referentes ao cliente ----------");
        metodo.jc_print("\n" + nome + ", seu aniversario e em " + dia + " de " + vetor_mes[mes - 1] + ", nascido em " + ano + ". Voce tem " + metodo.jc_idade(dia, mes, ano));
        metodo.jc_print("Peso: " + peso + ", altura: " + altura + ", genero: " + genero_convertido);
        metodo.jc_print("\nImc: " + metodo.jc_IMC(peso, altura, genero));
        metodo.jc_print("\nDia do vencimento: " + vencimento + "\n\n");

    }

}
