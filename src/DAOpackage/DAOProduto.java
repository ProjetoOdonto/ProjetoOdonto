package DAOpackage;

import Classes.Conecta;
import Classes.Produto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DAOProduto {
    
    public void inserir(Produto p, int codigo){        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "INSERT INTO ODONTOMAX.produto "
                    + "(descricao, "
                    + "cod_barras, "
                    + "cod_tipoproduto,"
                    + "cod_fornecedor, "
                    + "unidade, "
                    + "embalagem,"
                    + "cod_usuario)"
                    + "VALUES ("
                    + "'" + p.getDescricao()+ "',"
                    + "'" + p.getCodigo_barras() + "',"
                    + "'" + p.getTipo()+ "',"
                    + "'" + p.getCod_fornec()+ "',"
                    + "'" + p.getUnidade()+ "',"
                    + "'" + p.getEmbalagem() + "',"
                    + "'" + codigo + "');";
            
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
    
    public DefaultTableModel carregarLista(String Descricao, long CodBarra) {
        DefaultTableModel pesquisa = new DefaultTableModel(new String [][]{}, new String []{"Código","Descrição", "Embalagem","Cód. Barras","Fornecedor","Func. do Cadastro"});
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "SELECT cod_produto, descricao, embalagem, cod_barras, ds_fornecedor, nome "
                    + "FROM ODONTOMAX.produto, ODONTOMAX.fornecedor, ODONTOMAX.usuario "
                    + "WHERE ODONTOMAX.produto.cod_usuario = ODONTOMAX.usuario.cod_usuario "
                    + "AND ODONTOMAX.produto.cod_fornecedor = ODONTOMAX.fornecedor.cod_fornecedor "
                    + "AND ODONTOMAX.produto.descricao LIKE '%"+Descricao+"%' "
                    + "AND ODONTOMAX.produto.cod_barras LIKE '%"+CodBarra+"%' "
                    + "ORDER BY ODONTOMAX.produto.cod_produto";
            
            ResultSet rs = stmt.executeQuery(sql);           
            while (rs.next()) {
                int codigo = rs.getInt("cod_produto");
                String descricao = rs.getString("descricao");
                String embalagem = rs.getString("embalagem");
                long cod_barra = rs.getLong("cod_barras");
                String fornecedor = rs.getString("ds_fornecedor");
                String nome = rs.getString("nome");
             
                pesquisa.addRow(new String []{""+codigo, descricao, embalagem, ""+cod_barra, fornecedor ,nome});             
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
    
    public DefaultTableModel carregarListaFornecedor(int codfornec, String Descricao) {
        DefaultTableModel pesquisa = new DefaultTableModel(new String [][]{}, new String []{"Código","Descrição", "Embalagem","Cód. Barras"});
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "SELECT cod_produto, descricao, embalagem, cod_barras "
                    + "FROM ODONTOMAX.produto, ODONTOMAX.fornecedor "
                    + "WHERE ODONTOMAX.produto.cod_fornecedor = ODONTOMAX.fornecedor.cod_fornecedor "
                    + "AND ODONTOMAX.produto.cod_fornecedor = '"+codfornec+"' "
                    + "AND ODONTOMAX.produto.descricao LIKE '%"+Descricao+"%' "
                    + "ORDER BY ODONTOMAX.produto.cod_produto";
            
            ResultSet rs = stmt.executeQuery(sql);           
            while (rs.next()) {
                int codigo = rs.getInt("cod_produto");
                String descricao = rs.getString("descricao");
                String embalagem = rs.getString("embalagem");
                long cod_barra = rs.getLong("cod_barras");
             
                pesquisa.addRow(new String []{""+codigo, descricao, embalagem, ""+cod_barra});             
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
