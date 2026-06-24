
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JULIACAROLINA_PROVA3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime dataAgora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        System.out.println("--- Data do cadastro: " + dataAgora.format(formatter) + " ---");
        System.out.println("--- Informações referentes ao vendedor ---");

        System.out.print("Nome: ");
        String nome = input.nextLine();
        
        double salario = 0;
        try {
            System.out.print("Salário: ");
            salario = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }

        JULIACAROLINA_VerVendedor metodos = new JULIACAROLINA_VerVendedor(nome, salario);

        metodos.setTotalEmVendas();
        metodos.setQuilometragem();
        metodos.setRegiao();

        System.out.println("\n--- Informações ---");
        
        System.out.println(metodos.getNome() + ", que tem salário de R$ " + metodos.getSalario() + ", região comercial " + metodos.getRegiao());
        System.out.println("Percorreu " + metodos.getQuilometragem() + " KM, vendendo " + metodos.getTotalEmVendas());
        System.out.println("Recebeu um bônus de " + (metodos.getBonus()*100) + " e uma comissão de " + (metodos.getComissao()*100));
        System.out.println("Salário final de R$ " + metodos.CalcularSalarioFinal());
    }

}
