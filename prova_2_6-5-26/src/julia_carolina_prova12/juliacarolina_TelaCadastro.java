package julia_carolina_prova12;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class juliacarolina_TelaCadastro {

    public static void main(String[] args) {
        juliacarolina_Resultado metodo = new juliacarolina_Resultado();

        String nome;
        int dia;
        int mes;
        int ano;
        double peso;
        double altura;
        int genero;
        String genero_convertido;
        int vencimento;
        String vetor_mes[] = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        GregorianCalendar calendario = new GregorianCalendar();
        int ano_atual = calendario.get(Calendar.YEAR);
        int mes_atual = calendario.get(Calendar.MONTH);
        int dia_atual = calendario.get(Calendar.DAY_OF_MONTH);

        metodo.jc_print("Nome>");
        nome = metodo.jc_receber_nome();

        dia = metodo.jc_receber_int(1, 31, "Dia do nascimento>");

        mes = metodo.jc_receber_int(1, 12, "Mes do nascimento>");

        ano = metodo.jc_receber_int(1900, 2026, "Ano do nascimento>");

        peso = metodo.jc_receber_double(1, 500, "Peso>");

        altura = metodo.jc_receber_double(0.5, 3, "Altura>");

        genero = metodo.jc_receber_int(1, 2, "Genero(1 - Masc/2 - Fem)>");

        vencimento = metodo.jc_receber_int(1, dia_atual, "Dia do vencimento>");

        if(genero == 1){
            genero_convertido = "masculino";
        }else{
            genero_convertido = "feminino";
        }
        
        if(vencimento < dia_atual){
            metodo.jc_print("\nSituacao: A VENCER\n");
        } else if (vencimento == dia_atual){
            metodo.jc_print("\nSituacao: VENCENDO HOJE\n");
        }else if (vencimento > dia_atual){
            metodo.jc_print("\nSituacao: VENCIDO\n");
        }
        
        metodo.jc_print("\n" + nome + ", seu aniversario e em " + vetor_mes[mes - 1] + ". Voce tem " + (ano_atual - ano) + " anos.");
        metodo.jc_print("\n" + nome + ", seu imc e " + metodo.jc_IMC(peso, altura, genero) + "\n");

        metodo.jc_print("\n---------- Data do cadastro: " + (dia + "/" + calendario.get(Calendar.MONTH) + "/" + ano_atual) + " ----------\n---------- Informacoes referentes ao cliente ----------");
        metodo.jc_print("\nNome: " + nome + "\nData de nascimento: dia - " + dia + ", mes - " + vetor_mes[mes - 1] + ", ano - " + ano);
        metodo.jc_print("\nPeso: " + peso + ", altura: " + altura + ", genero: " + genero_convertido);
        metodo.jc_print("\nDia do vencimento: " + vencimento + "\n\n");
    }

}
