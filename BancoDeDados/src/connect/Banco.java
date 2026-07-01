package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static java.lang.System.exit;
import javax.swing.JOptionPane;

public class Banco {

    public boolean banco_ok = true;

    public Connection obtemConexao() {
        String base = "ling_programacao";
        String usuario = "root";
        String senha = "";

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + base, usuario, senha);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas com a Conexão do Banco de Dados" + e);
            banco_ok = false;
            exit(0);
            return null;
        }
    }
}
