package C_Orientação_a_objetos.Encapsulamento;
public class VerPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Ju");
        pessoa.setIdade(17);
        
        System.out.println("Nome: " + pessoa.getNome() + ". Idade: " + pessoa.getIdade());
    }
}
