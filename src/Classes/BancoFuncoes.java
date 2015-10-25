package Classes;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.table.TableColumn;


public class BancoFuncoes {

    String somaRecebidos, somaAReceber;
    
    BancoFuncoes banco;
    
    conectaBanco cb = new conectaBanco();

    public void setSomaRecebidos(String d){
        somaRecebidos = d;
    }
    public String getSomaRecebidos(){
        return somaRecebidos;
    }

    public void setSomaAReceber(String n){
        somaAReceber = n;
    }
    public String getSomaAReceber(){
        return somaAReceber;
    }

//-------------------------------------------------Função Universal---------------------------------------------

    public BancoFuncoes
           carregaDadoUnico(String vsql, String msg1, String msg2, final JComboBox caixaTexto, String campoSql){

            Connection connection = null;

       try {
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

            Statement s = (Statement) connection.createStatement();

              ResultSet rs = s.executeQuery(vsql);

                   caixaTexto.removeAllItems();

                   caixaTexto.addItem("");

                while (rs.next()){
                    caixaTexto.addItem(rs.getString(campoSql));
                   }

            System.out.println("Conectado ao banco com sucesso");

             s.close();
             connection.close();

             System.out.println(msg1);
             System.out.println(vsql);
             return banco;

       }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println("SQLException: " + ex.getMessage());
          System.out.println("SQLState: " + ex.getSQLState());
          System.out.println("Error: " + ex.getErrorCode());
          System.out.println(vsql);
          return null;
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println(vsql);
          System.out.println("Dados não filtrados" + e);
          return null;
        }

   }
           
            public BancoFuncoes
           tabelaClientes(String sql, String msg1, String msg2, final JTable gridCliente){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridCliente.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String telefone = rs.getString("telefone");
                        String nome = rs.getString("nome");
                        String uf = rs.getString("uf");
                        String cidade = rs.getString("cidade");
                        String bairro = rs.getString("bairro");
                        String logradouro = rs.getString("endereco");
                        String numero = rs.getString("numero");
                        String cep = rs.getString("cep");
                        String complemento = rs.getString("complemento");
                        dtm.addRow(new Object[]{telefone, nome, uf, cidade, bairro, logradouro, numero, cep, complemento});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
             public BancoFuncoes
           tabelaCaixa(String sql, String msg1, String msg2, final JTable gridCaixa){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridCaixa.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String Descricao = rs.getString("Produto");
                        String Qtde = rs.getString("qtde");
                        String Preco = rs.getString("preco");
                        String Total = rs.getString("total");
               
                        dtm.addRow(new Object[]{Descricao, Qtde, Preco, Total});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
           
             public BancoFuncoes
           tabelaPedidosEntrega(String sql, String msg1, String msg2, final JTable gridCaixa){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridCaixa.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String npedido = rs.getString("npedido");
                        String nome = rs.getString("nome");
                        String telefone = rs.getString("telefone");
                        String formapagamento = rs.getString("formapagamento");
                        String total = rs.getString("total");
                        String motoboy = rs.getString("motoboy");
                        String situacaoentrega = rs.getString("situacaoentrega");
                        String hora = rs.getString("hora");
                        String horasaida = rs.getString("hrsaida");
                         String horaentrega = rs.getString("horaentrega");
                  
               
                        dtm.addRow(new Object[]{npedido, nome, telefone, formapagamento,total ,motoboy ,situacaoentrega ,hora ,horasaida ,horaentrega});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
           
                 public BancoFuncoes
           tabelaPedidosAberto(String sql, String msg1, String msg2, final JTable gridCaixa){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridCaixa.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String npedido = rs.getString("npedido");
                        String itens = rs.getString("produto");
                        String qtde = rs.getString("qtde");
                        String hora = rs.getString("hora");
             
                  
               
                        dtm.addRow(new Object[]{npedido, itens, qtde, hora});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
           
            public BancoFuncoes
           tabelaPedidosBalcao(String sql, String msg1, String msg2, final JTable gridCaixa){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridCaixa.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String npedido = rs.getString("npedido");
                        String nome = "";
                        String telefone ="";
                        String formapagamento = rs.getString("formapagamento");
                        String total = rs.getString("total");
                        String motoboy = "";
                        String situacaoentrega = rs.getString("situacaoentrega");
                        String hora = rs.getString("hora");
                        String horasaida = "";
                         String horaentrega = rs.getString("horaentrega");
                  
               
                        dtm.addRow(new Object[]{npedido, nome, telefone, formapagamento,total ,motoboy ,situacaoentrega ,hora ,horasaida ,horaentrega});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
           
           
              public BancoFuncoes
           tabelaCompras(String sql, String msg1, String msg2, final JTable gridCompras){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridCompras.getModel();
                 
          int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String N_Pedido = rs.getString("npedido");
                        String CPF = rs.getString("cpfFor");
                        String CNPJ = rs.getString("cnpjFor");
                        String Fornecedor = rs.getString("nomeFantasia");
                        String Tipo_Produto = rs.getString("tipoproduto");
                        String Produto = rs.getString("produto");
                        String Qtde = rs.getString("qtde");
         
                        dtm.addRow(new Object[]{N_Pedido, CPF, CNPJ, Fornecedor, Tipo_Produto, Produto, Qtde});
                        
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
           
                 public BancoFuncoes
           tabelaFuncionario(String sql, String msg1, String msg2, final JTable gridFuncionario){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridFuncionario.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String Nome = rs.getString("nomeFun");
                        String Sexo = rs.getString("sexoFun");
                        String CPF = rs.getString("cpfFun");
                        String RG = rs.getString("rgFun");
                        String Situacao = rs.getString("situacao");
                        String Telefone = rs.getString("telFun");
                        String Ceular = rs.getString("celFun");
                        String Setor = rs.getString("setorFun");
                        String Motoboy = rs.getString("motoboy");
                        dtm.addRow(new Object[]{Nome ,Sexo ,CPF,RG ,Telefone ,Ceular , Setor, Motoboy, Situacao});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
           
              public BancoFuncoes
           tabelaUsuario(String sql, String msg1, String msg2, final JTable gridUsuarios){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridUsuarios.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String Nome = rs.getString("f.nomeFun");
                        String CPF = rs.getString("u.cpfFun");
                        String Login = rs.getString("u.login");
                        String Permissao = rs.getString("u.permissao");
                        String Permissao2="";
                        
                        if(Permissao.equals("0")){
                            
                            Permissao2 += "Caixa";
                            
                        }
                        else if (Permissao.equals("1")){
             
                            Permissao2 += "Adm";
                        }
                        
                        dtm.addRow(new Object[]{Nome ,CPF ,Login,Permissao2});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
       public BancoFuncoes
           tabelaCategoria(String sql, String msg1, String msg2, final JTable gridCategoriaProduto){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridCategoriaProduto.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String categoria = rs.getString("categoria");
                     
             
                        dtm.addRow(new Object[]{categoria});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
  
       
           
           
           public BancoFuncoes
           tabelaAgendamentos(String sql, String msg1, String msg2, final JTable gridProdutos){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridProdutos.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String cod = rs.getString("cod_paciente");
                       String nome = rs.getString("nome_paciente");
            
                       
                               
                     
             
                        dtm.addRow(new Object[]{cod, nome});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
        
           
           
           
            public BancoFuncoes
           tabelaContasPagar(String sql, String msg1, String msg2, final JTable girdContaPagar){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)girdContaPagar.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String Nota_Fiscal = rs.getString("notaFiscal");
                        String Descricao = rs.getString("descricao");
                        String Dt_Recebimento = rs.getString("dataRecebimento");
                        String Dt_Emissao = rs.getString("dataEmissao");
                        String Dt_Vencimento = rs.getString("dataVencimento");
                        String Valor = rs.getString("valor");
                        String Juros = rs.getString("juros");
                        String Multa = rs.getString("multa");
                        String Fornecedor = rs.getString("fornecedor");
                        dtm.addRow(new Object[]{Nota_Fiscal, Descricao, Dt_Recebimento, Dt_Emissao, Dt_Vencimento, Valor, Juros, Multa, Fornecedor});
                   }


         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
           
           
            public BancoFuncoes
           tabelaContasReceber(String sql, String msg1, String msg2, final JTable gridContaReceber){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridContaReceber.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String Telefone = rs.getString("telefone");
                        String Cliente = rs.getString("Cliente");
                        String Descricao = rs.getString("descricao");
                        String Dt_Recebimento = rs.getString("dtrecebimento");
                        String Dt_Vencimento = rs.getString("dtvencimento");
                        String Valor = rs.getString("valor");
                        String Tipo_Pagamento = rs.getString("tipopagamento");
                     
                        dtm.addRow(new Object[]{Telefone, Cliente, Descricao, Dt_Recebimento, Dt_Vencimento, Valor, Tipo_Pagamento});
                   }


         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
           
            public BancoFuncoes
           tabelaVendas(String sql, String msg1, String msg2, final JTable gridContaReceber){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridContaReceber.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String npedido = rs.getString("npedido");
                       String tipopedido = rs.getString("tipopedido"); 
                       String data = rs.getString("data");
                        String total = rs.getString("total");
             
                     
                        dtm.addRow(new Object[]{npedido,tipopedido, data, total});
                   }


         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
           
             public BancoFuncoes
           tabelaDemonstrativo(String sql, String msg1, String msg2, final JTable gridDemo){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridDemo.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                      String npedido = rs.getString("npedido");
                      String nome = rs.getString("nome");
                       String produto = rs.getString("produto");
                        String qtde = rs.getString("qtde");
                        String preco = rs.getString("preco");
                        String total = rs.getString("total");
                        String data = rs.getString("data");
                     
                        dtm.addRow(new Object[]{npedido,nome,produto, qtde, preco, total,data});
                   }


         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
            public BancoFuncoes
           tabelaDemonstrativoPagamento(String sql, String msg1, String msg2, final JTable gridPagamento){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridPagamento.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                      String npedido = rs.getString("npedido");
                       String tipopagamento = rs.getString("formapagamento");
                        String total = rs.getString("total");
       
                        
                     
                        dtm.addRow(new Object[]{npedido,tipopagamento,total});
                   }


         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
           
           
            public BancoFuncoes
           salvar(String sql, String msg1, String msg2){

          com.mysql.jdbc.Connection connection = null;

   try {
        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        com.mysql.jdbc.Statement s = (com.mysql.jdbc.Statement) connection.createStatement();

        s.execute(sql);

        System.out.println("Conectado ao banco com sucesso");

         s.close();
         connection.close();

//         JOptionPane.showMessageDialog(null, msg1);
         System.out.println(sql);

         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }
  }
             
  
}          