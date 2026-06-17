package I_InterfaceGrafica;

import javax.swing.JOptionPane;

public class testes {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(
            null,
            "Oi marco", 
            "Início", 
            JOptionPane.YES_NO_CANCEL_OPTION);
        
        int opcao = JOptionPane.showConfirmDialog (
            null, 
            "Tipos de Confirma", 
            "YES_NO_OPTIN",
            JOptionPane.YES_NO_OPTION);
        
        JOptionPane.showMessageDialog(null, "Testando Icones: "+ "Informação","Informação",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Testando Icones: "+ "Erro","Informação",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Testando Icones: "+ "Pergunta","Informação",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Testando Icones: "+ "Aviso","Informação",JOptionPane.WARNING_MESSAGE);

    }    
}
