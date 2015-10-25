package DAOpackage;

import Classes.Conecta;
import Classes.PedidoCompra;
import Classes.PedidoItem;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DAOItem {
    
    public void inserirPedido(PedidoItem p){        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "INSERT INTO ODONTOMAX.item "
                    + "VALUES ("
                    + "'" + p.getPedido() + "',"
                    + "'" + p.getCodigo_produto() + "',"
                    + "'" + p.getQuantidade() + "');";            
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
    
    public DefaultTableModel carregarLista(int pedido) {
        DefaultTableModel pesquisa = new DefaultTableModel(new String [][]{}, new String []{"Código","Descrição", "Quantidade"});
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "SELECT odontomax.item.cod_produto, descricao, quantidade "
                    + "FROM odontomax.item, odontomax.produto "
                    + "WHERE odontomax.item.cod_produto = odontomax.produto.cod_produto "
                    + "and odontomax.item.cod_pedido = '" + pedido + "' ";
            
            ResultSet rs = stmt.executeQuery(sql);           
            while (rs.next()) {
                int codigo = rs.getInt("cod_produto");
                String descricao = rs.getString("descricao");
                int quantidade = rs.getInt("quantidade");
             
                pesquisa.addRow(new String []{""+codigo, descricao, ""+quantidade});             
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
    
}
