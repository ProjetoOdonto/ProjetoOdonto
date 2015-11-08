package Odontomax;

import Classes.Banco;
import DAOpackage.DAOPaciente;
import DAOpackage.DAOProcedimento;
import Classes.BancoFuncoes;
import Classes.GerarPdf;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Odontograma extends javax.swing.JFrame {

BancoFuncoes bf = new BancoFuncoes();
Banco ba = new Banco();    
GerarPdf pdf = new GerarPdf();

  private String datahoje;

    public Odontograma() {
        initComponents();
        
        
        hprocedimentos.setModel(  
      new DefaultTableModel(  
      new Object[] []{ },  
      new String[] {"Procedimentos"}) {  
  
   public boolean isCellEditable(int row, int col) {  
           return false;  
   
   }});   
        
        
        
        dataHoje();
    }
    
    public void carregarListaProc(){
        DAOProcedimento dao = new DAOProcedimento();
        tabela_pesquisa_procedimento.setModel(dao.carregarLista(txt_procedimentos.getText()));
    } 
    
    public void carregarListaPaciente(){
        DAOPaciente dao = new DAOPaciente();
        tabela_pesquisa_paciente.setModel(dao.carregarLista(txt_nome.getText(),txt_cpf.getText()));
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        painel_usuario = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txDataHoje = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        hprocedimentos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_pesquisa_procedimento = new javax.swing.JTable();
        txt_procedimentos = new javax.swing.JTextField();
        btn_procurar_proc = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        btn_buscar_pac = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_pesquisa_paciente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Odontograma");
        getContentPane().setLayout(null);

        jPanel6.setLayout(null);

        painel_usuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));

        jLabel4.setText("Nome do Setor");

        jLabel1.setText("Usuário:");

        jLabel2.setText("Setor: ");

        jLabel3.setText("Nome do Usuário");

        jLabel22.setText("Data:  ");

        txDataHoje.setEnabled(false);

        javax.swing.GroupLayout painel_usuarioLayout = new javax.swing.GroupLayout(painel_usuario);
        painel_usuario.setLayout(painel_usuarioLayout);
        painel_usuarioLayout.setHorizontalGroup(
            painel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_usuarioLayout.createSequentialGroup()
                        .addComponent(txDataHoje, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painel_usuarioLayout.setVerticalGroup(
            painel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txDataHoje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(painel_usuario);
        painel_usuario.setBounds(10, 10, 274, 120);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Histórico de Procedimentos"));

        hprocedimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Procedimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(hprocedimentos);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(jPanel5);
        jPanel5.setBounds(10, 130, 270, 150);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Odontograma"));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Procedimentos"));

        tabela_pesquisa_procedimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Procedimento", "Valor", "Func. Cadastro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_pesquisa_procedimento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tabela_pesquisa_procedimento);

        btn_procurar_proc.setText("Procurar");
        btn_procurar_proc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procurar_procActionPerformed(evt);
            }
        });

        jLabel9.setText("Procedimento:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_procedimentos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_procurar_proc)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_procedimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_procurar_proc)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição do Procedimento"));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane3.setViewportView(txtArea);

        jLabel8.setText("Valor:");

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setText("Salvar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        jButton1.setText("Arcada Dentaria ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(btn_voltar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(btn_voltar)
                    .addComponent(jButton1))
                .addGap(149, 149, 149))
        );

        jPanel6.add(jPanel2);
        jPanel2.setBounds(10, 280, 878, 288);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecionar Paciente"));
        jPanel1.setLayout(null);

        jLabel5.setText("CPF:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 60, 60, 30);

        jLabel6.setText("Nome Paciente:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 20, 110, 30);
        jPanel1.add(txt_cpf);
        txt_cpf.setBounds(140, 60, 238, 30);

        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nome);
        txt_nome.setBounds(140, 20, 238, 30);

        btn_buscar_pac.setText("Buscar");
        btn_buscar_pac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_pacActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar_pac);
        btn_buscar_pac.setBounds(420, 20, 100, 49);

        tabela_pesquisa_paciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabela_pesquisa_paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_pesquisa_pacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_pesquisa_paciente);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 529, 90);

        jPanel6.add(jPanel1);
        jPanel1.setBounds(300, 10, 561, 230);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 904, 581);

        setBounds(0, 0, 910, 615);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_procurar_procActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procurar_procActionPerformed
        // TODO add your handling code here:
        carregarListaProc();
    }//GEN-LAST:event_btn_procurar_procActionPerformed

    private void btn_buscar_pacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_pacActionPerformed
        // TODO add your handling code here:
        carregarListaPaciente();
    }//GEN-LAST:event_btn_buscar_pacActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        
         String path = System.getProperty("user.dir") + "\\odontograma.pdf";
        pdf.abrirPdf(path);
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void tabela_pesquisa_pacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_pesquisa_pacienteMouseClicked
       
         if (evt.getClickCount() == 1) {  
         
            Object obj = (tabela_pesquisa_paciente.getValueAt(tabela_pesquisa_paciente.getSelectedRow(), 0));  //coluna 0  
            String cod = obj.toString();
             
            
            
         
              String msg1 = "Produtos recuperados com sucesso";
        String msg2 = "Erro ao Recuperar Produtos";
        String vsql = "SELECT ds_procedimento from hprocede where codpaciente = "+cod+"";


        bf.tabelaClientes(vsql, msg1, msg2, hprocedimentos);
             
             
         
         }
        
    }//GEN-LAST:event_tabela_pesquisa_pacienteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      ArcadaDentaria arcada = new ArcadaDentaria();  
      
  
      arcada.setVisible(true);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        
        Object obj = (tabela_pesquisa_paciente.getValueAt(tabela_pesquisa_paciente.getSelectedRow(), 0));  //coluna 0  
            String cod = obj.toString();
            
            Object nome1 = (tabela_pesquisa_paciente.getValueAt(tabela_pesquisa_paciente.getSelectedRow(), 1));  //coluna 0  
            String nome = nome1.toString();
             
        Object obj1 = (tabela_pesquisa_procedimento.getValueAt(tabela_pesquisa_procedimento.getSelectedRow(), 0));  //coluna 0  
            String codprocede = obj1.toString();
            
       Object obj2 = (tabela_pesquisa_procedimento.getValueAt(tabela_pesquisa_procedimento.getSelectedRow(), 1));  //coluna 0  
        String dsprocede = obj2.toString();
        
       String detalhes = txtArea.getText();
       
       String valor = txtValor.getText();
       
       

     
            ba.gravarOdonto(cod, codprocede, dsprocede, detalhes, valor);
            
            
             Object obj10 = (tabela_pesquisa_paciente.getValueAt(tabela_pesquisa_paciente.getSelectedRow(), 0));  //coluna 0  
            String cod5 = obj10.toString();
             
            
            
         
              String msg1 = "Produtos recuperados com sucesso";
        String msg2 = "Erro ao Recuperar Produtos";
        String vsql = "SELECT ds_procedimento from hprocede where codpaciente = "+cod5+"";


        bf.tabelaClientes(vsql, msg1, msg2, hprocedimentos);
            
            
              
                try {  
                pdf.main(new String[]{cod,nome,codprocede,dsprocede,detalhes,valor}); 
            } catch (Exception ex) {
                Logger.getLogger(Caixa.class.getName()).log(Level.SEVERE, null, ex);
            }
            
   
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public void dataHoje(){
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  
        String novaData = formatador.format(data);  
        txDataHoje.setDate(data);
        
        
   }
    
     public String getDatahoje() {
       if (txDataHoje.getDate()!=null){
          return datahoje = new SimpleDateFormat("dd/MM/yyyy").format(txDataHoje.getDate());
        }else{
          return null;
        }
    }
     public String getDataFormat() {
       if (txDataHoje.getDate()!=null){
          return datahoje = new SimpleDateFormat("yyyy/MM/dd").format(txDataHoje.getDate());
        }else{
          return null;
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Odontograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btn_buscar_pac;
    private javax.swing.JButton btn_procurar_proc;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JTable hprocedimentos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel painel_usuario;
    private javax.swing.JTable tabela_pesquisa_paciente;
    private javax.swing.JTable tabela_pesquisa_procedimento;
    private com.toedter.calendar.JDateChooser txDataHoje;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_procedimentos;
    // End of variables declaration//GEN-END:variables
}
