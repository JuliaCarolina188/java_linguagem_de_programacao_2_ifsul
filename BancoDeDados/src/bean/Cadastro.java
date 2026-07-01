package Bean;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cadastro {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String nome;
    private String telefone;
    private String email;
    private String cpf;

    public void incluir(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO contatos(nome, telefone, email, cpf) VALUES ( ?, ?,?,?)";
        
        PreparedStatement stm = null;
        
        stm = conn.prepareStatement(sqlInsert);
        stm.setString(1, getNome());
        stm.setString(2, getTelefone());
        stm.setString(3, getEmail());
        stm.setString(4, getCpf());

        stm.execute();
    }
}
