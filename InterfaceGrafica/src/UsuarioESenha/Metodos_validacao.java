package UsuarioESenha;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos_validacao {
    private boolean validaArroba(String email) {
        String[] emailVetor = email.split("");
        byte arrobas = 0;

        for (int i = 0; i < emailVetor.length - 1; i++) {
            if ("@".equals(emailVetor[i])) {
                arrobas += 1;
            }
        }

        if (arrobas == 1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validaDominio(String email) {
        ArrayList<String> endereco = new ArrayList<>();
        String[] emailVetor = email.split("");
        
        for (int i = email.lastIndexOf('.') + 1; i < emailVetor.length; i++) {
            endereco.add(emailVetor[i]);
        }
        
        String dominio = String.join("", endereco);

        if ("com".equals(dominio) || "edu".equals(dominio) || "gov".equals(dominio) || "br".equals(dominio)) {
            return true;
        } else {
            return false;
        }
    }

    String ValidacaoSenha() {
        Scanner input = new Scanner(System.in);
        Metodos_validacao metodo = new Metodos_validacao();
        String senha = null;
        char senhaVetor[];
        boolean oitoDigitos;
        boolean senhaValida = false;
        boolean possuiMaiusculas;
        boolean possuiMinusculas;
        boolean possuiEspecial;
        boolean possuiNumeros = false;
        char maiusculas[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char minusculas[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char numeros[] = "1234567890".toCharArray();
        char[] especial = "@#$%&/*-!_-".toCharArray();

        while (!senhaValida) {
            oitoDigitos = false;
            possuiMaiusculas = false;
            possuiMinusculas = false;
            possuiEspecial = false;

            System.out.print("Digite uma senha\n>");
            senha = input.next();
            senhaVetor = senha.toCharArray();

            for (int i = 0; i < senhaVetor.length; i++) {
                for (int j = 0; j < maiusculas.length; j++) {
                    if (senhaVetor[i] == maiusculas[j]) {
                        possuiMaiusculas = true;
                    }
                    if (senhaVetor[i] == minusculas[j]) {
                        possuiMinusculas = true;
                    }
                }
            }

            for (int i = 0; i < senhaVetor.length; i++) {
                for (int j = 0; j < especial.length; j++) {
                    if (senhaVetor[i] == especial[j]) {
                        possuiEspecial = true;
                    }
                }
            }
            for (int i = 0; i < senhaVetor.length; i++) {
                for (int j = 0; j < numeros.length; j++) {
                    if (senhaVetor[i] == numeros[j]) {
                        possuiNumeros = true;
                    }
                }
            }

            if (senha.length() >= 8) {
                oitoDigitos = true;
            } else {
                System.out.println("   Senha não tem 8 digitos.");
            }

            if (!possuiMaiusculas) {
                System.out.println("   Senha não possui caracteres maiusculos.");
            }
            if (!possuiMinusculas) {
                System.out.println("   Senha não possui caracteres minusculos.");
            }
            if (!possuiEspecial) {
                System.out.println("   Senha não possui caracteres especiais ");
            }
            if (!possuiNumeros) {
                System.out.println("   Senha não possui numeros ");
            }

            if (oitoDigitos && possuiMaiusculas && possuiMinusculas && possuiEspecial && possuiNumeros) {
                senhaValida = true;
            }

        }
        return senha;
    }
    
    private boolean valida 
}
