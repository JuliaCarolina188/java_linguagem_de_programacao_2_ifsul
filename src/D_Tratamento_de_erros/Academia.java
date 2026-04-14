package D_Tratamento_de_erros;

import java.util.Scanner;

public class Academia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Paciente paci = new Paciente();
        Operador opera = new Operador();

        System.out.print("Nome> ");
        paci.nome = input.nextLine();
        
        System.out.print("Peso(kg)> ");
        paci.peso = opera.receberFloat();
        
        System.out.print("Altura(m)> ");
        paci.altura = opera.receberFloat();
        
        System.out.print("Sexo(f/m)> ");
        paci.sexo = input.next();

        System.out.println("\n\n---SOBRE O IMC---\nNome: " + paci.nome);
        System.out.println("IMC: " + paci.Imc());
        System.out.println("Condicao: " + paci.Condicao());
    }
}
