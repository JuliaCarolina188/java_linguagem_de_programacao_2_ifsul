package view;

import Bean.Cadastro;
import connect.Banco;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Banco bd = new Banco();
        conn = bd.obtemConexao();
        conn.setAutoCommit(false);
        
        Cadastro cad = new Cadastro();
        
        cad.setNome("Maria Soares");
        cad.setTelefone("05135901111");
        cad.setEmail("mariasoares@gmail.com");
        cad.setCpf("783.089.235-92");
        cad.incluir(conn);

        // efetiva inclusoes
        conn.commit();
        JOptionPane.showMessageDialog(null, "Inclusão Concluida", "Mensagem do {Sistema}",JOptionPane.WARNING_MESSAGE);
    }
}
