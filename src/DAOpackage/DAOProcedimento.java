package DAOpackage;

import Classes.Conecta;
import Classes.Procedimento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DAOProcedimento {    
    public DefaultTableModel carregarLista(String Procedimento) {
        DefaultTableModel pesquisa = new DefaultTableModel(new String [][]{}, new String []{"Código Procedimento","Procedimento", "Valor","Func. do Cadastro"});
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();            
            String sql = "SELECT cod_procedimento, ds_procedimento, valor, nome "
                    + "FROM ODONTOMAX.procedimento, ODONTOMAX.usuario "
                    + "WHERE ds_procedimento LIKE '%"+Procedimento+"%' "
                    + "and odontomax.usuario.cod_usuario = odontomax.procedimento.cod_usuario "
                    + "ORDER BY cod_procedimento";            
            ResultSet rs = stmt.executeQuery(sql);           
            while (rs.next()) {
                int codigo = rs.getInt("cod_procedimento");
                String procedimento = rs.getString("ds_procedimento");
                double valor = rs.getDouble("valor");
                String funcionario = rs.getString("nome");
             
                pesquisa.addRow(new String []{""+codigo, procedimento, ""+valor, funcionario});
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return pesquisa;
    }  
    
    public void inserir(Procedimento p, int codigousur){
        
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "INSERT INTO ODONTOMAX.procedimento "
                    + "(ds_procedimento, "
                    + "valor,"
                    + "cod_usuario) "
                    + "VALUES ("
                    + "'" + p.getProcedimento() +"',"
                    + "'" + p.getValor() +"',"
                    + "'" + codigousur + "');";
            
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
    
    public Procedimento selecionar(Procedimento p){
        int cod = p.getCodigo();
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();            
            String sql = "SELECT * FROM odontomax.procedimento WHERE cod_procedimento ="+cod;
            ResultSet rs = stmt.executeQuery(sql);           
            while (rs.next()) {
                p.setProcedimento(rs.getString("ds_procedimento"));
                p.setValor(rs.getDouble("valor"));
            }            
            rs.close();                        
            stmt.close();
            con.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro!!");
            JOptionPane.showMessageDialog(null, e.toString());
        }        
        return p;
    }
    
    public void alterar(Procedimento p){
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "UPDATE ODONTOMAX.procedimento "
                    + "SET ds_procedimento ='"+ p.getProcedimento() + "', "
                    + "valor = " + p.getValor() + ""
                    + "WHERE cod_procedimento ="+p.getCodigo()+";";
            
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso !");
            stmt.close();
            con.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro!!");
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void excluir(Procedimento p){
        
        int cod = p.getCodigo();
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "DELETE FROM odontomax.procedimento WHERE cod_procedimento ="+cod;
            
            stmt.executeUpdate(sql);            
            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
            
            stmt.close();
            con.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro!!");
            JOptionPane.showMessageDialog(null, e.toString());
        }
    
    }
}


