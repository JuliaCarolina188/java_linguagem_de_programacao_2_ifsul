package J_Manipuação_de_string;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos_validacao {

    protected String ValidacaoEmail() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> endereco = new ArrayList<>();
        boolean emailValido = false;
        boolean possuiArroba = false;
        String email = null;
        String[] emailVetor;
        String dominio;

        while (!emailValido) {
            System.out.print("Digite seu email\n>");
            email = input.next();
            emailVetor = email.split("");
            if (!email.contains(".")) {
                System.out.print("Problema da validacao do email. ");
            } else {
                for (int i = email.lastIndexOf('.') + 1; i < emailVetor.length; i++) {
                    endereco.add(emailVetor[i]);
                }
                for (int i = 0; i < emailVetor.length - 1; i++) {
                    if ("@".equals(emailVetor[i])) {
                        possuiArroba = true;
                    }
                }

                dominio = String.join("", endereco);

                if (("com".equals(dominio) || "edu".equals(dominio) || "gov".equals(dominio) || "br".equals(dominio)) && possuiArroba) {
                    emailValido = true;
                } else {
                    System.out.println("Problema com a insercao do email.");
                    endereco.clear();
                }
            }
        }
        return email;
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
}
