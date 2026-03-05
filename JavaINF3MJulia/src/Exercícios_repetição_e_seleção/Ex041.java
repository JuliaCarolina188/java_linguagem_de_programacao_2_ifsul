package Exercícios_repetição_e_seleção;

import java.util.Scanner;

public class Ex041 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        byte cod;
        String nom;
        int ano;
        int idade;
        String cidade;
        String curso;
        
        while(true){
            System.out.print("Codigo: ");
            cod = teclado.nextByte();
            
            if(cod == 0){
                break;
            }
            
            System.out.print("Nome: ");
            nom = teclado.next();
            
            System.out.print("Ano de nascimento: ");
            ano = teclado.nextInt();
            idade = 2026 - ano;
            
            System.out.print("Cidade: ");
            cidade = teclado.next();
            
            System.out.print("Curso: ");
            curso = teclado.next();
            
            System.out.print(nom + ", de codigo " + cod + ". " + idade + " anos, que mora em " + cidade + " fazendo o curso de " + curso + "\n\n");
        }
    }
}