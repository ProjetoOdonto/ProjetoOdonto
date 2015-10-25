package Odontomax.Fornecedor;

import Classes.Fornecedor;
import Classes.Usuario;
import DAOpackage.DAOFornecedor;
import Odontomax.Paciente.CadastroPaciente_Consultar_Alterar;

public class CadastroFornecedores_Consultar extends javax.swing.JFrame {

    
    final private String usuario;
    final private String nome;
    final private String setor;
    final private int codigo;
    
   
    public CadastroFornecedores_Consultar(Usuario user) {
        initComponents();this.nome = user.getNome();
        this.usuario = user.getLogin();
        this.setor = user.getSetor();
        this.codigo = user.getCodigo();
        label_nomeusuario.setText(nome);
        label_setorusuario.setText(setor);
    }
    
    public Fornecedor montaFornecedor(){
        Fornecedor f = new Fornecedor();        
        f.setCodigo(Integer.parseInt((String) tabela_pesquisa_fornecedor.getValueAt(tabela_pesquisa_fornecedor.getSelectedRow(), 0)));
        return f;
    }
    
    public Usuario montaUsuario(){
            Usuario u = new Usuario();            
            u.setCodigo(codigo);
            u.setLogin(usuario);
            u.setNome(nome);
            u.setSetor(setor); 
            return u;         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_usuario1 = new javax.swing.JPanel();
        label_nomeusuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_setorusuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        painel_dados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_fornecedor = new javax.swing.JTextField();
        txt_cnpj = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_pesquisa_fornecedor = new javax.swing.JTable();
        btn_consultar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Fornecedores");
        getContentPane().setLayout(null);

        painel_usuario1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)), "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 153, 0))); // NOI18N
        painel_usuario1.setForeground(new java.awt.Color(255, 153, 0));
        painel_usuario1.setOpaque(false);

        label_nomeusuario.setForeground(new java.awt.Color(255, 255, 255));
        label_nomeusuario.setText("Nome");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuário:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Setor: ");

        label_setorusuario.setForeground(new java.awt.Color(255, 255, 255));
        label_setorusuario.setText("Setor");

        javax.swing.GroupLayout painel_usuario1Layout = new javax.swing.GroupLayout(painel_usuario1);
        painel_usuario1.setLayout(painel_usuario1Layout);
        painel_usuario1Layout.setHorizontalGroup(
            painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_usuario1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_setorusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(label_nomeusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painel_usuario1Layout.setVerticalGroup(
            painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_usuario1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(label_nomeusuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(label_setorusuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painel_usuario1);
        painel_usuario1.setBounds(10, 11, 330, 77);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Consultar Fornecedores");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 60, 251, 29);

        painel_dados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)), "Fornecedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 153, 0))); // NOI18N
        painel_dados.setForeground(new java.awt.Color(255, 153, 0));
        painel_dados.setOpaque(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Razão Social: ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CNPJ:");

        tabela_pesquisa_fornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código Fornecedor", "Razão Social", "CNPJ", "Func. do Cadastro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tabela_pesquisa_fornecedor.setOpaque(false);
        tabela_pesquisa_fornecedor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabela_pesquisa_fornecedor);

        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Excluir");

        javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
        painel_dados.setLayout(painel_dadosLayout);
        painel_dadosLayout.setHorizontalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_cnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(txt_fornecedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_consultar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addComponent(btn_alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        painel_dadosLayout.setVerticalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alterar)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painel_dados);
        painel_dados.setBounds(10, 96, 806, 380);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Odontomax/bg.jpg"))); // NOI18N
        jLabel4.setText("label_bg");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, -20, 870, 570);

        setSize(new java.awt.Dimension(842, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        // TODO add your handling code here:
        DAOFornecedor dao = new DAOFornecedor();
        CadastroFornecedores_Consultar_Alterar C;
        C = new CadastroFornecedores_Consultar_Alterar(dao.selecionar(montaFornecedor()),montaUsuario());
        C.setVisible(true);
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        // TODO add your handling code here:
        DAOFornecedor dao = new DAOFornecedor();
        tabela_pesquisa_fornecedor.setModel(dao.carregarLista(txt_fornecedor.getText(), txt_cnpj.getText()));
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_nomeusuario;
    private javax.swing.JLabel label_setorusuario;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JPanel painel_usuario1;
    private javax.swing.JTable tabela_pesquisa_fornecedor;
    private javax.swing.JTextField txt_cnpj;
    private javax.swing.JTextField txt_fornecedor;
    // End of variables declaration//GEN-END:variables
}
