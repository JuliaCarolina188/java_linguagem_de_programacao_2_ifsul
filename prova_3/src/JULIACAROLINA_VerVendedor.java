
import java.util.Scanner;

public class JULIACAROLINA_VerVendedor {
    Scanner input = new Scanner(System.in);

    private String nome;
    private double salario;
    private double totalEmVendas;
    private double quilometragem;
    private byte regiao;

    private double comissao;
    private double bonus;

    JULIACAROLINA_VerVendedor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setTotalEmVendas() {
        double vendas = 0;

        while (true) {
            try {
                System.out.print("Total em vendas: ");
                vendas = input.nextDouble();
                break;
            } catch (Exception e) {
                input.next();
                System.out.println("Erro: " + e);
            }
        }
        this.totalEmVendas = vendas;
    }

    public void setQuilometragem() {
        double quilometros = 0;

        while (true) {
            try {
                System.out.print("Quilometragem total: ");
                quilometros = input.nextDouble();
                if (quilometros < 0) {
                    System.out.println("Numero negativo.");
                }else{
                    break;
                }
            } catch (Exception e) {
                input.next();
                System.out.println("Erro: " + e);
            }
        }
        this.quilometragem = quilometros;
    }

    void setRegiao() {
        byte receberRegiao;

        while (true) {
            try {
                System.out.println("""
                        1 - RS
                        2 - SC
                        3 - PR
                        4 - SP
                        5 - RJ
                        6 - ES
                        """);
                System.out.print("Digite a região\n>");
                receberRegiao = input.nextByte();

                if (receberRegiao < 1 || receberRegiao > 6) {
                    System.out.println("Região fora do intervalo permitido");
                } else {
                    this.regiao = receberRegiao;
                    break;
                }

            } catch (Exception e) {
                input.next();
                System.out.println("Erro: " + e);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getTotalEmVendas() {
        return totalEmVendas;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public String getRegiao() {
        String regioes[] = {"Rio Grande do Sul", "Santa Catarina", "Paraná", "São Paulo", "Rio de Janeiro", "Espírito Santo"};
        return regioes[regiao - 1];
    }

    public double getComissao() {
        return this.comissao;
    }

    public double getBonus() {
        return this.bonus;
    }

    void CalcularComissao() {
        double comissaoValor = 0;
        switch (this.regiao) {
            case 1:
                comissaoValor = 0.15;
                break;
            case 2:
                comissaoValor = 0.20;
                break;
            case 3:
                comissaoValor = 0.10;
                break;
            case 4:
                comissaoValor = 0.9;
                break;
            case 5:
                comissaoValor = 0.11;
                break;
            case 6:
                comissaoValor = 0.12;
                break;
            default:
                System.out.println("Erro.");
        }
        this.comissao = comissaoValor;
    }

    void CalcularBonus() {
        if(this.quilometragem < 1000){
            bonus = 0.02;
        } else if (this.quilometragem <= 2000){
            bonus = 0.03;
        } else if (this.quilometragem <= 3000){
            bonus = 0.04;
        } else {
            bonus = 0.05;
        }
    }

    double CalcularSalarioFinal() {
        CalcularBonus();
        CalcularComissao();
        double adicional = comissao + bonus;
        return salario + (totalEmVendas * adicional);
    }

}
