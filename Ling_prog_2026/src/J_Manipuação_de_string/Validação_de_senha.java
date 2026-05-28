package J_Manipuação_de_string;

import java.util.ArrayList;
import java.util.Scanner;

public class Validação_de_senha {

    public static void main(String[] args) {
        Metodos_validacao metodo = new Metodos_validacao();

        String email = metodo.ValidacaoEmail();
        
        String senha = metodo.ValidacaoSenha();
    }
}
