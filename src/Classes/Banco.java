/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.List;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Banco {
    
    Connection con;
    
    Statement stmt;
    ResultSet rs;
    ResultSet rs2;
    private int codi;
    private String nom;

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public void conecta() {
        try {
            String serverName = "localhost";
            String mydatabase = "odontomax";
            String username = "root";
            String password = ""; //MUDAR SENHA
            String driverName = "com.mysql.jdbc.Driver"; 
            Class.forName(driverName);
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            con = DriverManager.getConnection(url, username, password);
            stmt = (Statement) con.createStatement();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado!");

        } catch (SQLException e) {
            System.out.println("Erro ao conectar o Banco de Dados");
        }
    }

    public boolean valida(int codigo, String login) {
        conecta();
        String sql;

        try {
//Cria comando SQl para inserir na tabela
            sql = "SELECT codigo, login FROM usuario WHERE login='" + login + "'";
            rs = stmt.executeQuery(sql);

            if (rs.first()) {

                return false;

            } else {

                return true;

            }

        } catch (SQLException e) {
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }

    }

   
    public void gravaExpressao(String infixa, String npr, String resultado, int codigo) {
        String sql;
        conecta();

//Captura os dados digitados

        try {
//Cria comando SQl para inserir na tabela
            sql = "INSERT INTO calcnpr(infixa, npr, resultado, codigo) VALUES ('" + infixa + "', '" + npr + "','" + resultado + "'," + codigo + ")";
//Executa o comando sql
//            JOptionPane.showMessageDialog(null, sql);
            stmt.executeUpdate(sql);
            //Exibe mensagem
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
        }
    }

    public String abreUsuarios() {
        String sql;
        conecta();
        try {
            sql = "SELECT MAX(codigo) FROM usuario";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
//            rs.previous();

            return rs.getString("MAX(codigo)");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o comando SQL:" + e.toString());
            return null;
        }

    }
    
    
    public void atualizaFuncionario(String nomeFun,String nasciFun,String endeFun,String compleFun,String bairroFun,String ufFun,String cidadeFun,String setorFun,String rgFun,String cpfFun,String cepFun,String numFun,String telFun,String celFun , String sexoFun,String motoboy, String placamoto, String cnh, String modelomoto,String situacao) {
        String sql;
        conecta();

        try {

              sql = "UPDATE funcionario SET nomeFun ='"+nomeFun+"', nasciFun ='"+nasciFun+"',"
                      + " endeFun ='"+endeFun+"', compleFun ='"+compleFun+"',"
                      + " bairroFun ='"+bairroFun+"', ufFun ='"+ufFun+"', cidadeFun ='"+cidadeFun+"' ,"
                      + " setorFun ='"+setorFun+"', rgFun ='"+rgFun+"' , cpfFun ='"+cpfFun+"' , cepFun ='"+cepFun+"',"
                      + " numFun ='"+numFun+"' , telFun ='"+telFun+"', celFun ='"+celFun+"', sexoFun ='"+sexoFun+"', motoboy ='"+motoboy+"' , placamoto ='"+placamoto+"', cnh ='"+cnh+"', modelomoto ='"+modelomoto+"', situacao ='"+situacao+"'  WHERE cpfFun = '"+cpfFun+"'"; 

            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cliente Atualizado com sucesso");



        } catch (SQLException e) {
            System.out.println( "Erro ao executar o comando SQL:" + e.toString());

        }

    }
    
    
    public void atualizaProduto(String tipoProduto,String  descricao, String ingredientes,String  comboMed,String  comboEst ,int  minimoestoque,String  produtoacbprima,int  qtdeestoque,float  valor, String produtovenda,String codigoproduto) {
        String sql;
        conecta();

        try {

              sql = "UPDATE produtos SET tipoproduto ='"+tipoProduto+"', descricao ='"+descricao+"', ingredientes ='"+ingredientes+"', unidmedida ='"+comboMed+"', estocavel ='"+comboEst+"', qtdeminima ="+minimoestoque+", acabadoprima ='"+produtoacbprima+"' , valor ="+valor+", qtdeestoque ="+qtdeestoque+" , produtovenda ='"+produtovenda+"' WHERE codigoproduto = '"+codigoproduto+"'"; 

            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cliente Atualizado com sucesso");



        } catch (SQLException e) {
            System.out.println( "Erro ao executar o comando SQL:" + e.toString());

        }

    }
    
    public void atualizaPedidoSaiuEntrega(String npedido ,String situacao, String horasaida,String motoboy) {
        String sql;
        conecta();

        try {

              sql = "UPDATE venda SET situacaoEntrega ='"+situacao+"', hrsaida ='"+horasaida+"' , motoboy ='"+motoboy+"' WHERE npedido = '"+npedido+"'"; 

            stmt.executeUpdate(sql);
  



        } catch (SQLException e) {
            System.out.println( "Erro ao executar o comando SQL:" + e.toString());

        }

    }
    
    public void atualizaPedidoEntregaOK(String npedido ,String situacao, String horaentrega,String motoboy) {
        String sql;
        conecta();

        try {

              sql = "UPDATE venda SET situacaoEntrega ='"+situacao+"' , horaentrega ='"+horaentrega+"' , motoboy ='"+motoboy+"' WHERE npedido = '"+npedido+"'"; 

            stmt.executeUpdate(sql);
           



        } catch (SQLException e) {
            System.out.println( "Erro ao executar o comando SQL:" + e.toString());

        }

    }
    
    public void atualizaPedidoNaoOK(String npedido ,String situacao,String motoboy) {
        String sql;
        conecta();

        try {

              sql = "UPDATE venda SET situacaoEntrega ='"+situacao+"' , motoboy ='"+motoboy+"' WHERE npedido = '"+npedido+"'"; 

            stmt.executeUpdate(sql);
           



        } catch (SQLException e) {
            System.out.println( "Erro ao executar o comando SQL:" + e.toString());

        }

    }
    
    
     public void atualizaPedidoCancelado(String npedido ,String situacao) {
        String sql;
        conecta();

        try {

              sql = "UPDATE venda SET situacaoEntrega ='"+situacao+"' WHERE npedido = '"+npedido+"'"; 

            stmt.executeUpdate(sql);
           



        } catch (SQLException e) {
            System.out.println( "Erro ao executar o comando SQL:" + e.toString());

        }

    }
      
    public void atualizaFornecedorCPF(String nomeFantasia,String  endeFor,String  cidadeFor,String  nomeContato,String  emailFor,String  bairroFor,String cnpjFor,String  cepFor,String  telFor, String celFor,String  estadualFor,String  numFor,String  tel2For, String siteFor,String  cpfFor,String  ufFor,String tipoproduto) {
        String sql;
        conecta();

        try {

              sql = "UPDATE fornecedor SET nomeFantasia ='"+nomeFantasia+"', endeFor ='"+endeFor+"', cidadeFor ='"+cidadeFor+"', nomeContato ='"+nomeContato+"', emailFor ='"+emailFor+"', bairroFor ='"+bairroFor+"', cepFor ='"+cepFor+"' , telFor ='"+telFor+"', celFor ='"+celFor+"' , estadualFor ='"+estadualFor+"' , numFor ='"+numFor+"', tel2For ='"+tel2For+"' , siteFor ='"+siteFor+"', cpfFor ='"+cpfFor+"', ufFor ='"+ufFor+"', tipoproduto ='"+tipoproduto+"'  WHERE cpfFor = '"+cpfFor+"'"; 

            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Fornecedor Atualizado com sucesso");



        } catch (SQLException e) {
            System.out.println( "Erro ao executar o comando SQL:" + e.toString());

        }

    }
    
    public void atualizaFornecedorCNPJ(String nomeFantasia,String  endeFor,String  cidadeFor,String  nomeContato,String  emailFor,String  bairroFor,String cnpjFor,String  cepFor,String  telFor, String celFor,String  estadualFor,String  numFor,String  tel2For, String siteFor,String  cpfFor,String  ufFor, String tipoproduto) {
        String sql;
        conecta();

        try {

              sql = "UPDATE fornecedor SET nomeFantasia ='"+nomeFantasia+"', endeFor ='"+endeFor+"', cidadeFor ='"+cidadeFor+"', nomeContato ='"+nomeContato+"', emailFor ='"+emailFor+"', bairroFor ='"+bairroFor+"', cepFor ='"+cepFor+"' , telFor ='"+telFor+"', celFor ='"+celFor+"' , estadualFor ='"+estadualFor+"' , numFor ='"+numFor+"', tel2For ='"+tel2For+"' , siteFor ='"+siteFor+"', cpfFor ='"+cpfFor+"', ufFor ='"+ufFor+"' , tipoproduto ='"+tipoproduto+"'  WHERE cnpjFor = '"+cnpjFor+"'"; 

            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Fornecedor Atualizado com sucesso");



        } catch (SQLException e) {
            System.out.println( "Erro ao executar o comando SQL:" + e.toString());

        }

    }
    
    
    
    public void atualizaCliente(String telefone,String nome,String cep,String cidade,String bairro,String uf,String numero,String endereco,String complemento) {
        String sql;
        conecta();

        try {

              sql = "UPDATE clientes SET nome ='"+nome+"', cep ='"+cep+"', cidade ='"+cidade+"', bairro ='"+bairro+"', uf ='"+uf+"', numero ='"+numero+"', endereco ='"+endereco+"' , complemento ='"+complemento+"'  WHERE telefone = '"+telefone+"'"; 

        
              stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cliente Atualizado com sucesso");



        } catch (SQLException e) {
            System.out.println( "Erro ao executar o comando SQL:" + e.toString());

        }

    }
    
    
    public void atualizaCompra(int npedido,String nomeFor,String cpfFor,String cnpjFor,String formaPagto,String condicaoPagto ,
            String tipoPedido,String observacao,String tipoProduto,Float valorTotal,Float valorDesc,
            Float valorNf,Float valorUnit,Float valorDescItens,Float valorNfItens,String nomeProduto,
            String unidMedida,String refProduto,int parcelas, int qtde) {
        String sql;
        conecta();

        try {

              sql = "UPDATE compras SET nomeFantasia ='"+nomeFor+"', cpfFor ='"+cpfFor+"', cnpjFor ='"+cnpjFor+"', formapagto ='"+formaPagto+"', condicaopagto ='"+condicaoPagto+"', parcelas ="+parcelas+", tipopedido ='"+tipoPedido+"' , valortotal ="+valorTotal+" , valordesc ="+valorDesc+" , valornf ="+valorNf+" , observacao ='"+observacao+"' , tipoproduto ='"+tipoProduto+"' , produto ='"+nomeProduto+"'  , refproduto ='"+refProduto+"' , qtde ="+qtde+" , valorunit ="+valorUnit+" , valordescitens ="+valorDescItens+" , valornfitens ="+valorNfItens+"  WHERE NPedido = '"+npedido+"'"; 

        
              stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Compra Atualizada com sucesso");



        } catch (SQLException e) {
            System.out.println( "Erro ao executar o comando SQL:" + e.toString());

        }

    }
    
     public void atualizaContaPagar(String notaFiscal,String descricao,String recebimento,String emissao,String vencimento,String valor,String juros,String multa,String fornecedor) {
        String sql;
        conecta();

        try {

              sql = "UPDATE contasPagar SET descricao ='"+descricao+"', dataRecebimento ='"+recebimento+"', dataEmissao ='"+emissao+"', dataVencimento ='"+vencimento+"', valor ='"+valor+"', juros ='"+juros+"', multa ='"+multa+"' , fornecedor ='"+fornecedor+"'  WHERE notaFiscal = '"+notaFiscal+"'"; 

        
              stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Conta Atualizado com sucesso");



        } catch (SQLException e) {
            System.out.println( "Erro ao executar o comando SQL:" + e.toString());

        }

    }

      public void atualizaContaReceber(String  descricaoReceber,String dtReceber,String emissaoReceber,String  vencimentoReceber,
                String  valorReceber,String jurosReceber,String multaReceber, String TelefoneClienteReceber,String  ClienteReceber,String  tipopagamento,String  parcelas) {
        String sql;
        conecta();

        try {

              sql = "UPDATE contasReceber SET descricao ='"+descricaoReceber+"', dtrecebimento ='"+dtReceber+"', dtemissao ='"+emissaoReceber+"', dtvencimento ='"+vencimentoReceber+"', valor ='"+valorReceber+"', juros ='"+jurosReceber+"', multa ='"+multaReceber+"' , Cliente ='"+ClienteReceber+"' , tipopagamento ='"+tipopagamento+"' , nparcela ='"+parcelas+"'  WHERE telefone = '"+TelefoneClienteReceber+"'"; 

        
              stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Conta Atualizado com sucesso");



        } catch (SQLException e) {
            System.out.println( "Erro ao executar o comando SQL:" + e.toString());

        }

    }
    public void atualizaFornecedor(String nomeFantasia,String endeFor,String cidadeFor,String nomeContato,String emailFor,String bairroFor,String cnpjFor,String cepFor,String telFor,String celFor,String estadualFor,String numFor,String tel2For,String siteFor) {
        String sql;
        conecta();

        try {

            sql = "UPDATE fornecedor SET" +
                      " nomeFantasia='"+nomeFantasia+"'," +
                      " endeFor='"+endeFor+"'," +
                      " cidadeFor='"+cidadeFor+"'," +
  
                      " nomeContato='"+nomeContato+"'," +
                      " emailFor='"+emailFor+"'," +
                      " bairroFor='"+bairroFor+"'," +
                      " cepFor='"+cepFor+"'," +
                      " telFor='"+telFor+"'," +
                     
                      " celFor='"+celFor+"'," +
                      " WHERE cnpjFor='"+cnpjFor+"'";

            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Usuário Atualizado com sucesso");



        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o comando SQL:" + e.toString());

        }

    }
    
    

    public boolean verificaSenha(int codigo, String senha) {
        String sql;
        conecta();

        try {
            sql = "SELECT senha FROM usuario WHERE codigo=" + codigo + ";";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("senha").equals(senha)) {
                return true;
            } else {
                return false;
            }


        } catch (SQLException e) {

            return false;
        }

    }
    
     public ResultSet buscaCliente(String telefone) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM clientes WHERE telefone='" + telefone + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("telefone") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
     
     public ResultSet buscaProdutos(String pedido3) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM itenspedido WHERE npedido='" + pedido3 + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("npedido") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
     
     public ResultSet buscaCompras(String npedido) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM compras WHERE npedido='" + npedido + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("npedido") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
     
     public ResultSet buscaCategoriaProduto(String categoria) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM categoriaProduto WHERE categoria='" + categoria + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("categoria") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
     
      public ResultSet buscaFuncionario(String cpf) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM funcionario WHERE cpfFun='" + cpf + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("cpfFun") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
      
       public ResultSet buscaProduto(String codigoproduto) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM produtos WHERE codigoproduto='" + codigoproduto + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("codigoproduto") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
       
       
        public ResultSet buscaVendaDemo(String npedido) {
        String sql;
        conecta();

        try {
            sql = "SELECT c.nome, v.total, v.data FROM clientes c INNER JOIN venda v ON c.telefone = v.telefone WHERE v.npedido='" + npedido + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("npedido") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
      
       
       public ResultSet buscaProdutoNome(String produto) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM produtos WHERE descricao='" + produto + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("descricao") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
       
       
           public ResultSet buscaUnidadeMedida(String produto) {
        String sql;
        conecta();

        try {
            sql = "SELECT unidmedida FROM produtos WHERE descricao='" + produto + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("unidmedida") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
       
       
       
      
    /* REALIZA A BUSCA DO FORNECEDOR POR MEIO DO CPF  */
    
    public ResultSet buscaFornecedorCPF(String cpf) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM fornecedor WHERE cpfFor='" + cpf + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("cpfFor") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }

      /* REALIZA A BUSCA DO FORNECEDOR POR MEIO DO CNPJ  */
    
    public ResultSet buscaFornecedorCNPJ(String cnpj) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM fornecedor WHERE cnpjFor='" + cnpj + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("cnpjFor") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
    
     public ResultSet buscaFornecedorCompras(String nome) {
        String sql;
    
        conecta();

        try {
            sql = "SELECT * FROM fornecedor WHERE nomeFantasia='" + nome + "';";
            
            
            System.out.println(sql);

            rs = stmt.executeQuery(sql);
 
            rs.first();
          
            if (rs.getString("nomeFantasia") != null) {

                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
     
     
     
    
    public ResultSet buscaContaPagar(String notaFiscal) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM ContasPagar WHERE notaFiscal='" + notaFiscal + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("notaFiscal") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
    
     public ResultSet buscaContaReceber(String telefone) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM contasreceber WHERE telefone='" + telefone + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("telefone") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
    
    public boolean excluiCliente(String telefone) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM clientes WHERE telefone= '" + telefone + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }
    
     public boolean excluiFornecedor(String cod) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM despecas WHERE COD_DESPECAS= '" + cod + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }
    
    public boolean excluiUsuario(String cpf) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM usuario WHERE cpfFun= '" + cpf + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }
    
     public boolean excluiCompra(String npedido) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM compras WHERE npedido= '" + npedido + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }
    
    public boolean desativaFuncionario(String cpf,String situacao) {
        String sql;
        conecta();
        
        try {
            sql = "UPDATE funcionario SET situacao ='"+situacao+"'  WHERE cpfFun = '"+cpf+"'";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }
    
     public boolean excluiProduto(String codigoproduto) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM produtos WHERE codigoproduto= '" + codigoproduto + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }
    
      public boolean excluiContaPagar(String notaFiscal) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM contaspagar WHERE notafiscal= '" + notaFiscal + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }

      public boolean excluiContaReceber(String telefone) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM contasreceber WHERE telefone= '" + telefone + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }
      
    public boolean excluiFornecedorCPF(String cpf) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM fornecedor WHERE cpfFor= '" + cpf + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }
    
     public boolean excluiFornecedorCNPJ(String cnpjFor) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM fornecedor WHERE cnpjFor= '" + cnpjFor + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }
     
       public boolean excluiCategoriaProduto(String categoria) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM categoriaProduto WHERE categoria= '" + categoria + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }

    public boolean login(String login, String senha) {
        String sql;
        conecta();


        try {

            sql = "UPDATE usuario SET logado='n'";
            System.out.println(sql);
            stmt.executeUpdate(sql);

            sql = "SELECT * FROM usuario WHERE login='" + login + "'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();



            if (rs.getString("senha").equals(senha)) {
                sql = "UPDATE usuario SET logado='s' WHERE login='" + login + "'";
                System.out.println(sql);
                stmt.executeUpdate(sql);

                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {

            return false;
        }

    }

    public boolean getPermissao(int i) {
        String sql;
        conecta();

        try {

            sql = "SELECT * FROM usuario WHERE logado='s'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();

            if ("1".equals(rs.getString("permissao").substring(i - 1, i))) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {

            return false;
        }

    }
    
    public void logado(){
        
        String sql;
        conecta();

        try {

            sql = "SELECT * FROM usuario WHERE logado='s'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();

           nom=rs.getString("nome");
           codi=Integer.parseInt(rs.getString("codigo"));

        } catch (SQLException e) {
           
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
        }
    }
    
    
    

    public String historico(int codigo) {
        String sql;
        conecta();
        String infixa;
        String npr;
        String resultado;
        String tudo = "";


        try {
            sql = "SELECT * FROM calcnpr WHERE codigo=" + codigo;
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            rs.previous();


            while (rs.next()) {

                infixa = rs.getString("infixa");
                npr = rs.getString("npr");
                resultado = rs.getString("resultado");
                tudo += "Infixa= " + infixa + "\n";
                tudo += "NPR= " + npr + "\n";
                tudo += "resultado= " + resultado + "\n";
                tudo += "----------------------\n";

            }

            return tudo;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o comando SQL:" + e.toString());
            return null;
        }

    }
    
    
    public void apagaHistorico(){
         String sql;
        conecta();
        
        try {
            sql = "DELETE FROM calcnpr where codigo=" + codi;
            System.out.println(sql);
             stmt.executeUpdate(sql);
            rs.first();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
          

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o comando SQL:" + e.toString());
           
        }

        
    }


    //

    public boolean gravarOdonto(String cod,String codprocede,String dsprocede,String detalhes,String valor) {
        conecta();
        String sql;


//Captura os dados digitados

        try {
              
          
            
                sql = "INSERT INTO procedimentoc(od_usuario, codprocede, ds_procedimento, detalhes, valor) VALUES ('"; // nome das variaveis do BD
                sql += cod + "', '" + codprocede + "','" + dsprocede + "' , '"+ detalhes +"' , '"+ valor +"')";
                
           
                sql = "INSERT INTO hprocede(codpaciente, ds_procedimento) VALUES ('"; // nome das variaveis do BD
                sql += cod + "', '" + dsprocede + "')";

                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;
 
            }
        
    

           catch (SQLException e) {
               
                if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
            
                JOptionPane.showMessageDialog(null,"Numero de telefone já registrado" );
            
            }
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }
    
    }
    
    
    
    public boolean gravarItensCompra(int pedido,int qtde,String produto,Float valorproduto,Float total) {
        conecta();
        String sql;


//Captura os dados digitados

        try {
              
          
            
                sql = "INSERT INTO itenspedido(npedido,qtde,produto,preco,total) VALUES ("; // nome das variaveis do BD
                sql += pedido + ", " + qtde + ",'" + produto + "' , "+ valorproduto +" , "+ total +")";
                
           

                stmt.executeUpdate(sql);

               
                return true;
 
            }
        
    

           catch (SQLException e) {
               
                if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
            
                JOptionPane.showMessageDialog(null,"Numero de telefone já registrado" );
            
            }
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }
    
    }
    
    
    public boolean gravarVenda(int pedido,String telefone,String formapagamento,String observacao,float total,float valorrecebido,float troco,String data,String hora,String tipopedido,String situacao,String dataformat) {
        conecta();
        String sql;


//Captura os dados digitados

        try {
              
          
            
                sql = "INSERT INTO venda(npedido,telefone,formaPagamento,observacao,valorrecebido,troco,total,data,hora,tipopedido,situacaoEntrega,dataformat) VALUES ("; // nome das variaveis do BD
                sql += pedido + ", '" + telefone + "','" + formapagamento + "' , '"+ observacao +"' , "+ valorrecebido +", "+ troco +", "+ total +",'" + data + "','" + hora + "','" + tipopedido + "','" + situacao + "','" + dataformat + "')";
                
           

                stmt.executeUpdate(sql);

               
                return true;
 
            }
        
    

           catch (SQLException e) {
               
                if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
            
                JOptionPane.showMessageDialog(null,"Numero de telefone já registrado" );
            
            }
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }
    
    }
    
    
  
    public boolean gravarCompras(String cod,String nome,String data,String hora,String tipoconsulta) {
     
        
        conecta();
        String sql;


//Captura os dados digitados

        try {
              
          
            
                sql = "INSERT INTO agendamentos(cod_paciente,nome_paciente ,data ,hora, tipoconsulta ) VALUES ('"; // nome das variaveis do BD
                sql += cod + "', '" + nome + "','" + data + "' , '"+ hora +"' , '"+ tipoconsulta +"')";
                
           

                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;
 
            }
        
    

           catch (SQLException e) {
               
                if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
            
                JOptionPane.showMessageDialog(null,"Numero de telefone já registrado" );
            
            }
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }
    
    }
    
    
    public boolean gravaFuncionario(String nomeFun,String nasciFun,String endeFun,String compleFun,String bairroFun ,String cidadeFun,String setorFun,String sexoFun,String rgFun,String cpfFun,String cepFun,String numFun,String telFun,String celFun, String ufFun,String motoboy, String placamoto, String cnh, String modelomoto,String situacao) {
        conecta();
        String sql;


//Captura os dados digitados

        try {
              
          
            
                sql = "INSERT INTO funcionario(nomeFun, rgFun, cpfFun, cepFun, numFun, telFun,celFun, nasciFun, endeFun,compleFun, bairroFun, setorFun, cidadeFun, sexoFun,ufFun,motoboy,placamoto,cnh,modelomoto,situacao) VALUES ('"; // nome das variaveis do BD
                sql += nomeFun + "', '" + rgFun + "','" + cpfFun + "' , '"+ cepFun +"' , '"+ numFun +"' , '"+ telFun +"' ,'" + celFun + "', '" + nasciFun + "','" + endeFun + "','" + compleFun + "','" + bairroFun + "','" + setorFun +"','" + cidadeFun +"','" + sexoFun +"','" + ufFun +"','" + motoboy +"','" + placamoto +"','" + cnh +"','" + modelomoto +"','" + situacao +"')";
                
                /*sql = "INSERT INTO usuario(login, senha, permissao) VALUES ('"; // nome das variaveis do BD
                sql += loginFun + "', '"+ senhaFun +"' , '"+ permissao +"')";*/

                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;
 
            }
        
    

           catch (SQLException e) {
               
               if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
            
                JOptionPane.showMessageDialog(null,"Funcionario já registrado" );
               }       
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
               
        }
    
    }
    
     
    public boolean gravaProduto(String tipoProduto,String  descricao, String ingredientes,String  comboMed,String  comboEst ,int  minimoestoque,String  produtoacbprima,int  qtdeestoque,float  valor, String produtovenda,String codigoproduto) {
        conecta();
        String sql;


//Captura os dados digitados

        try {
              
          
            
                sql = "INSERT INTO Produtos(tipoProduto, descricao, ingredientes, unidmedida, estocavel, qtdeminima,acabadoprima, qtdeestoque, valor,produtovenda,codigoproduto) VALUES ('"; // nome das variaveis do BD
                sql += tipoProduto + "', '" + descricao + "','" + ingredientes + "' , '"+ comboMed +"' , '"+ comboEst +"' , "+ minimoestoque +" ,'" + produtoacbprima + "', " + qtdeestoque + "," + valor + " ,'" + produtovenda + "','" + codigoproduto + "')";
                
                /*sql = "INSERT INTO usuario(login, senha, permissao) VALUES ('"; // nome das variaveis do BD
                sql += loginFun + "', '"+ senhaFun +"' , '"+ permissao +"')";*/

                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;
 
            }
        
    

           catch (SQLException e) {
               
               if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
            
                JOptionPane.showMessageDialog(null,"Funcionario já registrado" );
               }       
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
               
        }
    
    }
    

     public boolean gravaLogin(String loginFun,String senhaFun,String cpf, String permissao) {
        conecta();
        String sql;


//Captura os dados digitados

        try {
              
          
            
                sql = "INSERT INTO usuario(login, senha, permissao, cpfFun) VALUES ('"; // nome das variaveis do BD
                sql += loginFun + "', '" + senhaFun + "','" + permissao + "','" + cpf + "')";
                
                /*sql = "INSERT INTO usuario(login, senha, permissao) VALUES ('"; // nome das variaveis do BD
                sql += loginFun + "', '"+ senhaFun +"' , '"+ permissao +"')";*/

                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;
 
            }
        
    

           catch (SQLException e) {
                if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
            
                JOptionPane.showMessageDialog(null,"Funcionario já registrado" );
               }    
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }
    
    }
    
    public boolean gravaFornecedor(String nomeFantasia,String endeFor,String cidadeFor,String nomeContato,String emailFor,String bairroFor,String cnpjFor,String cepFor,String telFor,String celFor,String estadualFor,String numFor,String tel2For,String siteFor, String tipoPessoa, String cpfFor, String ufFor,String tipoproduto) {
     conecta();
        String sql;


//Captura os dados digitados

        
        try {


                sql = "INSERT INTO fornecedor(nomeFantasia, endeFor, cidadeFor, nomeContato, emailFor, bairroFor, cnpjFor, telFor,cepFor, celFor,estadualFor,numFor,tel2For,siteFor,tipopessoa, cpfFor, ufFor,tipoproduto) VALUES ('"; // nome das variaveis do BD
                sql += nomeFantasia + "', '" + endeFor + "','" + cidadeFor + "' , '" + nomeContato +"' , '"+ emailFor +"' , '"+ bairroFor +"' ,'" + cnpjFor + "', '" + telFor + "','" + cepFor + "','" + celFor + "','" +estadualFor+ "','" +numFor+ "','" +tel2For+ "','" +siteFor+ "','" +tipoPessoa+ "','" +cpfFor+ "','" +ufFor+ "','" +tipoproduto+ "' )";


          
                
                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;



        } catch (SQLException e) {
            if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
            
                JOptionPane.showMessageDialog(null,"CPF ou CNPJ já registrado" );
            
            }
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }

    }
    
    
     public boolean gravarCategoriaProduto(String categoria) {
        conecta();
        String sql;


//Captura os dados digitados

        try {
              
          
            
                sql = "INSERT INTO categoriaProduto(categoria) VALUES ('"; // nome das variaveis do BD
                sql += categoria +"')";
                
           

                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;
 
            }
        
    

           catch (SQLException e) {
               
                if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
            
                JOptionPane.showMessageDialog(null,"Categoria já registrada" );
            
            }
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }
    
    }
    
    
    public boolean gravaContaPagar(String notaFiscal,String descricao,String recebimento,String emissao,String vencimento,String valor,String juros,String multa, String fornecedor) {
     conecta();
        String sql;


//Captura os dados digitados

        try {




                sql = "INSERT INTO ContasPagar(notaFiscal, descricao, dataRecebimento, dataEmissao, dataVencimento, valor, juros, multa,fornecedor) VALUES ('"; // nome das variaveis do BD
                sql += notaFiscal + "', '" + descricao + "','" + recebimento + "' , '" + emissao +"' , '"+ vencimento +"' , '"+ valor +"' ,'" + juros + "', '" + multa + "', '" + fornecedor + "')";


                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;



        } catch (SQLException e) {
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }

    }
    
    
     
   public boolean gravaContaReceber(String descricaoReceber,String dtReceber,String emissaoReceber,String vencimentoReceber,String valorReceber,String jurosReceber,String multaReceber,String TelefoneClienteReceber,String ClienteReceber,String tipopagamento,String parcelas) {
     conecta();
        String sql;


//Captura os dados digitados

        try {




                sql = "INSERT INTO contasreceber(descricao, valor, juros, multa, tipopagamento, nparcela, dtrecebimento, dtemissao, dtvencimento,Cliente ,telefone) VALUES ('"; // nome das variaveis do BD
                sql += descricaoReceber + "', '" + valorReceber + "','" + jurosReceber + "' , '" + multaReceber +"' , '"+ tipopagamento +"' , '"+ parcelas +"' ,'" + dtReceber + "', '" + emissaoReceber + "', '" + vencimentoReceber + "' , '" + ClienteReceber + "' , '" + TelefoneClienteReceber + "')";


                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;



        } catch (SQLException e) {
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }

    }
    
    
  
    
    
    
    
    // PREENCHE A BUSCA DA JTABLE CLIENTE
    
    
      

}
