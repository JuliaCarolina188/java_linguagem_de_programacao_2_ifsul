package C_Orientação_a_objetos.Encapsulamento;

import java.util.Scanner;

public class ContaPrincipal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conta conta = new Conta();
        int opc = 0;
        String nome = "nao definido";
        int numero = 0;
        double n;
        while (true) {
            System.out.println("Bem vindo, " + nome + ", numero " + numero + "\n");
            System.out.print("""
                             Escolha o que deseja fazer:
                             0 - Adicionar nome e numero
                             1 - Abrir conta
                             2 - Ver saldo
                             3 - Sacar
                             4 - Deposiar
                             5 - Fechar conta
                             """);
            opc = conta.receberInt(0, 5);
            
            switch(opc){
                case 0:
                    System.out.print("Digite o nome desejado\n>");
                    nome = input.next();
                    System.out.print("Digite o numero identificador desejado");
                    numero = conta.receberInt(0, 100);
                    conta.Conta(nome, numero);
                    System.out.println("Nome: " + conta.getNome() + "\nNumero: " + conta.getNumero() + "\n");
                    
                    break;
                case 1:
                    conta.abrirConta();
                    break;
                case 2:
                    System.out.println("Saldo atual: " + conta.consultarSaldo());
                    break;
                case 3:
                    System.out.print("Digite o quanto você quer sacar\n>");
                    n = conta.receberDouble();
                    conta.sacar(n);
                    System.out.println("Saldo atual: " + conta.consultarSaldo());
                    break;
                case 4:
                    System.out.print("Digite o quanto você quer deposiar\n>");
                    n = conta.receberDouble();
                    conta.depositar(n);
                    System.out.println("Saldo atual: " + conta.consultarSaldo());
                    break;
                case 5:
                    conta.fecharConta();
                    System.out.println("Conta fechada.");
                    break;
            }
        }
    }
}
