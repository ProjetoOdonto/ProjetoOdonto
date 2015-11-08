/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOpackage;

import Classes.Conecta;
import Classes.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andre
 */
public class DaoAgendamento {
    
     public void inserir(Paciente p){
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "INSERT INTO ODONTOMAX.paciente "
                    + "(nome_paciente, "
                    + "data_nascimento, "
                    + "rg_paciente,"
                    + "cpf_paciente, "
                    + "celular_paciente, "
                    + "telefone_paciente,"
                    + "email_paciente, "
                    + "lugadouro_paciente,"
                    + "cep_paciente,"
                    + "estado_paciente, "
                    + "cidade_paciente, "
                    + "sexo_paciente,"
                    + "bairro_paciente)"
                    + "VALUES ("
                    + "'" + p.getNome() + "',"
                    + "'" + p.getDt_nascimento() + "',"
                    + "'" + p.getRg() + "',"
                    + "'" + p.getCpf() + "',"
                    + "'" + p.getCelular() + "',"
                    + "'" + p.getTelefone() + "',"
                    + "'" + p.getEmail() + "',"
                    + "'" + p.getLugadouro() + "',"
                    + "'" + p.getCep() + "'," 
                    + "'" + p.getSigla_estado() + "',"
                    + "'" + p.getNome_cidade() + "',"
                    + "'" + p.getSexo() + "',"
                    + "'" + p.getBairro() +"')";
            
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
    
    public void alterar(Paciente p){
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "UPDATE ODONTOMAX.paciente "
                    + "SET nome_paciente = '" + p.getNome() + "',"
                    + "data_nascimento = '" + p.getDt_nascimento() + "',"
                    + "rg_paciente = '" + p.getRg() + "',"
                    + "cpf_paciente = '" + p.getCpf() + "',"
                    + "celular_paciente = '" + p.getCelular() + "',"
                    + "telefone_paciente = '" + p.getTelefone() + "',"
                    + "email_paciente = '" + p.getEmail() + "',"
                    + "lugadouro_paciente = '" + p.getLugadouro() + "',"
                    + "cep_paciente = '" + p.getCep() + "'," 
                    + "estado_paciente = '" + p.getSigla_estado() + "',"
                    + "cidade_paciente = '" + p.getNome_cidade() + "',"
                    + "sexo_paciente = '" + p.getSexo() + "',"
                    + "bairro_paciente = '" + p.getBairro() +"'"
                    + "WHERE cod_paciente = "+p.getCodigo()+";";
            
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
    
    public void excluir(Paciente p){
        
        int cod = p.getCodigo();
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "DELETE FROM odontomax.paciente WHERE cod_paciente ="+cod;
            
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
    
    public Paciente selecionar(Paciente p){
        int cod = p.getCodigo();
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();            
            String sql = "SELECT DATE_FORMAT(data_nascimento, '%d/%m/%Y') AS DATA,paciente.* FROM odontomax.paciente WHERE cod_paciente ="+cod;
            ResultSet rs = stmt.executeQuery(sql);           
            while (rs.next()) {
                p.setNome(rs.getString("nome_paciente"));
                p.setDt_nascimento(rs.getString("DATA"));
                p.setRg(rs.getString("rg_paciente"));
                p.setCpf(rs.getString("cpf_paciente"));
                p.setCelular(rs.getString("celular_paciente"));
                p.setTelefone(rs.getString("telefone_paciente"));
                p.setEmail(rs.getString("email_paciente"));
                p.setLugadouro(rs.getString("lugadouro_paciente"));
                p.setCep(rs.getString("cep_paciente"));
                p.setSigla_estado(rs.getString("estado_paciente"));
                p.setNome_cidade(rs.getString("cidade_paciente"));
                p.setSexo(rs.getString("sexo_paciente"));
                p.setBairro(rs.getString("bairro_paciente"));
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
    
    public DefaultTableModel carregarLista(String Nome) {
        DefaultTableModel pesquisa = new DefaultTableModel(new String [][]{}, new String []{"Código","nome", "data","hora","tipconsulta"});
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "SELECT *"
                    + "FROM ODONTOMAX.agendamentos "
                    + "WHERE data = '"+Nome+"'"
                ;
            
            ResultSet rs = stmt.executeQuery(sql);           
            while (rs.next()) {
                int codigo = rs.getInt("cod_paciente");
                String nome = rs.getString("nome_paciente");
                String data = rs.getString("data");
                String hora = rs.getString("hora");
                String tipoconsulta = rs.getString("tipoconsulta");
             
                pesquisa.addRow(new String []{""+codigo, nome,data,hora,tipoconsulta});             
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
