package DAOpackage;

import Classes.Conecta;
import Classes.PedidoCompra;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DAOPedido {
    
    public void inserirPedido(PedidoCompra p){        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "UPDATE ODONTOMAX.pedido "
                    + "SET "
                    + "cod_fornecedor = '" + p.getCod_fornec() + "', "
                    + "valor = '" + p.getValor() + "' "
                    + "WHERE cod_pedido = " + p.getPedido() + ";";            
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
    
    public void inserirNumPedido(int codigo){        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "INSERT INTO ODONTOMAX.pedido "
                    + "(cod_pedido) "
                    + "VALUES ("
                    + "'" + codigo + "');";            
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro!!");
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public PedidoCompra retornaPedido(){
        PedidoCompra p = new PedidoCompra();
        
        int codigo_pedido;
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();            
            String sql = "SELECT MAX(cod_pedido) FROM odontomax.pedido ";
            ResultSet rs = stmt.executeQuery(sql);  
            while (rs.next()) {
                p.setPedido(rs.getInt("MAX(cod_pedido)"));
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
    
    public void cancelarPedido(int codigo){
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "DELETE FROM ODONTOMAX.pedido "
                    + "WHERE cod_pedido = ('" + codigo + "');";            
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro!!");
            JOptionPane.showMessageDialog(null, e.toString());
        }
    } 
      public void cancelarItem(int codigo){
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "DELETE FROM ODONTOMAX.item "
                    + "WHERE cod_pedido = ('" + codigo + "');";            
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro!!");
            JOptionPane.showMessageDialog(null, e.toString());
        }
    } 
}

