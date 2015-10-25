package DAOpackage;

import Classes.Conecta;
import Classes.Fornecedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DAOFornecedor {
    
    public void inserir(Fornecedor f, int codigo){
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "INSERT INTO ODONTOMAX.fornecedor "
                    + "(ds_fornecedor, "
                    + "cnpj, "
                    + "lugadouro,"
                    + "cep, "
                    + "bairro, "
                    + "cidade,"
                    + "estado,"
                    + "email,"
                    + "telefone,"
                    + "cod_usuario)"
                    + "VALUES ("
                    + "'" + f.getFornecedor()+ "',"
                    + "'" + f.getCnpj() + "',"
                    + "'" + f.getLugadouro() + "',"
                    + "'" + f.getCep() + "',"
                    + "'" + f.getBairro()+ "',"
                    + "'" + f.getCidade()+ "',"
                    + "'" + f.getSigla_estado()+ "',"
                    + "'" + f.getEmail() + "',"
                    + "'" + f.getTelefone() +"',"
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
    
    public DefaultTableModel carregarListaAlt(String Fornecedor, String Cnpj) {
        DefaultTableModel pesquisa = new DefaultTableModel(new String [][]{}, new String []{"Código ","Fornecedor", "CNPJ"});
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "SELECT cod_fornecedor, ds_fornecedor, cnpj, nome "
                    + "FROM ODONTOMAX.fornecedor, ODONTOMAX.usuario "
                    + "WHERE ODONTOMAX.fornecedor.cod_usuario = ODONTOMAX.usuario.cod_usuario "
                    + "AND ds_fornecedor LIKE '%"+Fornecedor+"%'"
                    + "AND cnpj LIKE '%"+Cnpj+"%'"
                    + "ORDER BY cod_fornecedor";
            
            ResultSet rs = stmt.executeQuery(sql);           
            while (rs.next()) {
                int codigo = rs.getInt("cod_fornecedor");
                String fornecedor = rs.getString("ds_fornecedor");
                String cnpj = rs.getString("cnpj");
             
                pesquisa.addRow(new String []{""+codigo, fornecedor, cnpj});             
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
    
    public DefaultTableModel carregarLista(String Fornecedor, String Cnpj) {
        DefaultTableModel pesquisa = new DefaultTableModel(new String [][]{}, new String []{"Código ","Fornecedor", "CNPJ","Func. do Cadastro"});
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "SELECT cod_fornecedor, ds_fornecedor, cnpj, nome "
                    + "FROM ODONTOMAX.fornecedor, ODONTOMAX.usuario "
                    + "WHERE ODONTOMAX.fornecedor.cod_usuario = ODONTOMAX.usuario.cod_usuario "
                    + "AND ds_fornecedor LIKE '%"+Fornecedor+"%'"
                    + "AND cnpj LIKE '%"+Cnpj+"%'"
                    + "ORDER BY cod_fornecedor";
            
            ResultSet rs = stmt.executeQuery(sql);           
            while (rs.next()) {
                int codigo = rs.getInt("cod_fornecedor");
                String fornecedor = rs.getString("ds_fornecedor");
                String cnpj = rs.getString("cnpj");
                String nome = rs.getString("nome");
             
                pesquisa.addRow(new String []{""+codigo, fornecedor, cnpj, nome});             
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
    
    public void alterar(Fornecedor f){
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "UPDATE ODONTOMAX.fornecedor "
                    + "SET ds_fornecedor = '" + f.getFornecedor()+ "',"
                    + "cnpj = '" + f.getCnpj()+ "',"
                    + "lugadouro = '" + f.getLugadouro()+ "',"
                    + "cep = '" + f.getCep()+ "',"
                    + "bairro = '" + f.getBairro()+ "',"
                    + "cidade = '" + f.getCidade() + "',"
                    + "estado = '" + f.getSigla_estado() + "',"
                    + "email = '" + f.getEmail() + "',"
                    + "telefone = '" + f.getTelefone() + "'"
                    + "WHERE cod_fornecedor = "+f.getCodigo()+";";
            
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
    
    public void excluir(Fornecedor f){
        
        int cod = f.getCodigo();
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "DELETE FROM odontomax.fornecedor WHERE cod_fornecedor ="+cod;
            
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
    
    public Fornecedor selecionar(Fornecedor f){
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();            
            String sql = "SELECT * FROM odontomax.fornecedor WHERE cod_fornecedor ="+f.getCodigo();
            ResultSet rs = stmt.executeQuery(sql);           
            while (rs.next()) {
                f.setFornecedor(rs.getString("ds_fornecedor"));
                f.setCnpj(rs.getString("cnpj"));
                f.setLugadouro(rs.getString("lugadouro"));
                f.setCep(rs.getString("cep"));
                f.setBairro(rs.getString("bairro"));
                f.setCidade(rs.getString("cidade"));
                f.setSigla_estado(rs.getString("estado"));
                f.setEmail(rs.getString("email"));
                f.setTelefone(rs.getString("telefone"));
            }            
            rs.close();                        
            stmt.close();
            con.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro!!");
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return f;
    }
    
}
