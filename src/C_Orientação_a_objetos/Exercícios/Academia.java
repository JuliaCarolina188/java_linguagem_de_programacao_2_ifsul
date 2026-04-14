import java.util.Scanner;
public class Academia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Paciente paci = new Paciente();

        System.out.print("Nome> ");
        paci.nome = input.nextLine();
        System.out.print("Peso(kg)> ");
        paci.peso = input.nextFloat();
        System.out.print("Altura(m)> ");
        paci.altura = input.nextFloat();
        System.out.print("Sexo(f/m)> ");
        paci.sexo = input.next();

        System.out.println("Nome: " + paci.nome);
        System.out.printf("IMC: ", paci.Imc());
        System.out.println("Condição: " + paci.Condicao());
    }
}