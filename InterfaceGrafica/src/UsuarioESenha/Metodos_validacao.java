package UsuarioESenha;

import java.util.ArrayList;

public class Metodos_validacao {

    private boolean validaArroba(String email) {
        String[] emailVetor = email.split("");
        boolean arrobas = false;

        for (int i = 0; i < emailVetor.length - 1; i++) {
            if ("@".equals(emailVetor[i])) {
                arrobas = true;
            }
        }

        return arrobas;
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
    
    boolean validaTudoEmail(String email){
        boolean emailCerto = false;
        
        if(validaArroba(email) && validaDominio(email)){
            emailCerto = true;
        }
        
        return emailCerto;
    }
    
    String mostraErroEmail(String email){
        String erros = "";
        
        if(!validaArroba(email)){
            erros += "Email não possui sinal de @\n";
        }
        if(!validaDominio(email)){
            erros += "Dominio inválido";
        }
        
        return erros;
    }

    boolean validaTudoSenha(String senha) {
        Metodos_validacao metodos = new Metodos_validacao();
        boolean senhaValida = false;

        if (metodos.validaSenhaMaiuscula(senha) && metodos.validaSenhaMinuscula(senha) && metodos.validaSenhaCaractereEspecial(senha) && metodos.validaSenhaNumero(senha) && metodos.validaTamanhoMinimo(senha)) {
            senhaValida = true;
        }

        return senhaValida;
    }

    String mostraErros(String senha) {
        Metodos_validacao metodos = new Metodos_validacao();
        String mensagemErro = "";
        
        if (!metodos.validaSenhaMaiuscula(senha)) {
            mensagemErro += "Senha não possui letras maiusculas\n";
        }
        if (!metodos.validaSenhaMinuscula(senha)) {
            mensagemErro += "Senha não possui letras minusculas\n";
        }
        if (!metodos.validaSenhaCaractereEspecial(senha)) {
            mensagemErro += "Senha não possui caracteres especiais\n";
        }
        if (!metodos.validaSenhaNumero(senha)) {
            mensagemErro += "Senha não possui numeros\n";
        }
        if (!metodos.validaTamanhoMinimo(senha)) {
            mensagemErro += "Senha não possui pelo menos 8 caracteres\n";
        }

        return mensagemErro;
    }

    private boolean validaSenhaMaiuscula(String senha) {
        char maiusculas[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char senhaVetor[];
        senhaVetor = senha.toCharArray();
        boolean possuiMaiusculas = false;

        for (int i = 0; i < senhaVetor.length; i++) {
            for (int j = 0; j < maiusculas.length; j++) {
                if (senhaVetor[i] == maiusculas[j]) {
                    possuiMaiusculas = true;
                }
            }
        }

        return possuiMaiusculas;
    }

    private boolean validaSenhaMinuscula(String senha) {
        char minusculas[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char senhaVetor[];
        senhaVetor = senha.toCharArray();
        boolean possuiMinusculas = false;

        for (int i = 0; i < senhaVetor.length; i++) {
            for (int j = 0; j < minusculas.length; j++) {
                if (senhaVetor[i] == minusculas[j]) {
                    possuiMinusculas = true;
                }
            }
        }

        return possuiMinusculas;
    }

    private boolean validaSenhaNumero(String senha) {
        char numeros[] = "1234567890".toCharArray();
        char[] senhaVetor = senha.toCharArray();
        boolean possuiNumeros = false;

        for (int i = 0; i < senhaVetor.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (senhaVetor[i] == numeros[j]) {
                    possuiNumeros = true;
                }
            }
        }

        return possuiNumeros;
    }

    private boolean validaSenhaCaractereEspecial(String senha) {
        boolean possuiEspecial = false;
        char[] senhaVetor = senha.toCharArray();

        char[] especial = "@#$%&/*-!_-".toCharArray();

        for (int i = 0; i < senhaVetor.length; i++) {
            for (int j = 0; j < especial.length; j++) {
                if (senhaVetor[i] == especial[j]) {
                    possuiEspecial = true;
                }
            }
        }

        return possuiEspecial;
    }

    private boolean validaTamanhoMinimo(String senha) {
        boolean minimo = false;
        if (senha.length() >= 8) {
            minimo = true;
        }
        return minimo;
    }
}
