package J_Manipuação_de_string;

import java.util.Scanner;

public class Validação_de_senha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senha;
        char senhaVetor[];
        boolean oitoDigitos;
        boolean senhaValida = false;
        boolean possuiMaiusculas;
        boolean possuiMinusculas;
        boolean possuiEspecial;
        boolean possuiNumeros;
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
            
            if (senha.length() == 8) {
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
            
            if(oitoDigitos && possuiMaiusculas && possuiMinusculas && possuiEspecial && possuiNumeros){
                senhaValida = true;
            }
        }
    }
}
