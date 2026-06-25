package connect;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Banco bd = new Banco();
        conn = bd.obtemConexao();
        
        if (bd.banco_ok == true) {
            JOptionPane.showMessageDialog(null, "Conexão Efetuada com Sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Algo deu errado.");
        }
    }
}
