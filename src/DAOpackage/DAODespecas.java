package DAOpackage;

import Classes.Conecta;
import Classes.Despecas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DAODespecas {
    
    public void inserirDespecas(Despecas f){
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "INSERT INTO ODONTOMAX.despecas "
                  
                    + "(cod_fornecedor, "
                    + "valor,"
                    + "situacao, "
                    + "data_lancamento,"
                    + "data_emissao,"
                    + "data_vencimento)"
                    + "VALUES ("+f.getCodFornecedor() +","
                    
             
                     + f.getValor()+ ","
                    + "'" + f.getSituacao()+ "',"
                    + "'" + f.getDataLaçamento()+ "',"
                    + "'" + f.getDataEmissao()+ "',"
                    + "'" + f.getDataVencimento()+ "');";
            
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso !");
            stmt.close();
            con.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro!!");
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    
    
    
}
