package C_Orientação_a_objetos.Encapsulamento;

import java.util.Scanner;

public class Conta {

    String nome;
    int numero;
    double saldo = 0;
    double limite;
    boolean contaAberta = false;

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void Conta(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    void abrirConta() {
        if (!contaAberta) {
            this.contaAberta = true;
            System.out.print("Conta aberta.");

        } else {
            System.out.print("\tConta ja aberta.");
        }
    }

    void fecharConta() {
        if (contaAberta) {
            this.contaAberta = false;
            System.out.println("\tConta fechada.");

        } else {
            System.out.println("\tConta ja fechada.");
        }
    }

    void sacar(double quantia) {
        if (contaAberta) {
            if (quantia <= saldo) {
                this.saldo -= quantia;
                System.out.println("Valor sacado com sucesso.");
            } else {
                System.out.println("\tSaldo insuficiente.");
            }
        } else {
            System.out.println("\tImpossivel sacar. Conta fechada.");
        }
    }

    void depositar(double quantia) {
        if (contaAberta) {
            this.saldo += quantia;
            System.out.print("Valor sacado com sucesso.");
        } else {
            System.out.println("\tImpossivel depositar. Conta fechada.");
        }
    }

    double consultarSaldo() {
        if (contaAberta) {
            return this.saldo;
        } else {
            System.out.println("\tImpossivel consultar o saldo. Conta fechada.");
        }
        return 0;
    }

    public double receberDouble() {
        Scanner input = new Scanner(System.in);
        double n = 0;

        while (true) {
            try {
                n = input.nextDouble();
                break;
            } catch (Exception e) {
                System.out.print("Erro no recebimeno: " + e);
                input.nextLine();
            }
        }
        return n;
    }

    public int receberInt(int minimo, int maximo) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        while (true) {
            try {
                System.out.print("\n>");
                n = input.nextInt();
                if (n < minimo || n > maximo) {
                    System.out.println("\tNumero maio que o intervalo esperado (" + minimo + "/" + maximo + "). Digite novamente");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.print("Erro no recebimeno: " + e);
                input.nextLine();
            }
        }
        return n;
    }
}
