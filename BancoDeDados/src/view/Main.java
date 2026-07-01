package view;

import Bean.Cadastro;
import connect.Banco;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection conn;
        Banco bd = new Banco();
        conn = bd.obtemConexao();
        conn.setAutoCommit(false);

        Cadastro cad = new Cadastro();

        cad.setNome(JOptionPane.showInputDialog("Digite o Nome:"));
        cad.setTelefone(JOptionPane.showInputDialog("Digite o Telefone:"));
        cad.setEmail(JOptionPane.showInputDialog("Digite o Email:"));
        cad.setCpf(JOptionPane.showInputDialog("Digite o CPF:"));
        
        cad.incluir(conn);

        // efetiva inclusoes
        conn.commit();
        JOptionPane.showMessageDialog(null, "Inclusão Concluida", "Mensagem do {Sistema}", JOptionPane.WARNING_MESSAGE);
    }
}
