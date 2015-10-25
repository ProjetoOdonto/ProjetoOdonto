package Odontomax.Procedimentos;

import Classes.Procedimento;
import Classes.Usuario;
import DAOpackage.DAOProcedimento;
import javax.swing.JOptionPane;

public class Procedimentos_Consultar_Alterar extends javax.swing.JFrame {

    final private String usuario;
    final private String nome;
    final private String setor;
    final private int codigo;
    final private int codproc;
    
    public Procedimentos_Consultar_Alterar(Usuario user, Procedimento p) {
        initComponents();
        this.nome = user.getNome();
        this.usuario = user.getLogin();
        this.setor = user.getSetor();
        this.codigo = user.getCodigo();
        this.codproc = p.getCodigo();
        label_nomeusuario.setText(nome);
        label_setorusuario.setText(setor);
        txt_procedimento.setText(p.getProcedimento());
        txt_valor.setText(Double.toString(p.getValor()));
    }
    
    public Procedimento montaProcedimento(){
        Procedimento p = new Procedimento();
        p.setCodigo(codproc);
        p.setProcedimento(txt_procedimento.getText());
        p.setValor(Double.parseDouble(txt_valor.getText()));
        
        return p;
    }
    
    public void ativar(){
        txt_procedimento.setEnabled(true);
        txt_valor.setEnabled(true);
        btn_atualizar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        btn_alterar.setEnabled(false);
    }
    
    public void Desativar(){
        txt_procedimento.setText("");
        txt_valor.setText("");
        txt_procedimento.setEnabled(false);
        txt_valor.setEnabled(false);
        btn_atualizar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_alterar.setEnabled(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_usuario1 = new javax.swing.JPanel();
        label_nomeusuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_setorusuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_procedimento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        btn_atualizar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Procedimento");
        getContentPane().setLayout(null);

        painel_usuario1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)), "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 153, 0))); // NOI18N
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
                    .addComponent(label_setorusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
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
        painel_usuario1.setBounds(20, 10, 300, 100);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)), "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descrição Procedimento:");

        txt_procedimento.setEnabled(false);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Valor:");

        txt_valor.setEnabled(false);

        btn_cancelar.setText("Cancelar");
        btn_cancelar.setEnabled(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_atualizar.setText("Atualizar");
        btn_atualizar.setEnabled(false);
        btn_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_atualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(btn_cancelar))
                    .addComponent(txt_procedimento)
                    .addComponent(txt_valor))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_procedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 230, 420, 190);

        btn_voltar.setText("Voltar");
        btn_voltar.setFocusPainted(false);
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_voltar);
        btn_voltar.setBounds(370, 20, 60, 30);

        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_alterar);
        btn_alterar.setBounds(30, 163, 110, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Odontomax/bg.jpg"))); // NOI18N
        bg.setText("jLabel1");
        getContentPane().add(bg);
        bg.setBounds(0, 0, 530, 530);

        setSize(new java.awt.Dimension(516, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        Desativar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarActionPerformed
        // TODO add your handling code here:
        if (txt_procedimento.getText().equals("") || txt_valor.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"Digite o nome procedimento");
        } else if (txt_procedimento.getText().equals("") && txt_valor.getText().equals("") ) {
            JOptionPane.showMessageDialog(null,"Digite o nome procedimento e o valor");
        } else {
            DAOProcedimento dao = new DAOProcedimento();
            dao.alterar(montaProcedimento());
            dispose();
        }
    }//GEN-LAST:event_btn_atualizarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        // TODO add your handling code here:
        ativar();
    }//GEN-LAST:event_btn_alterarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_atualizar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_nomeusuario;
    private javax.swing.JLabel label_setorusuario;
    private javax.swing.JPanel painel_usuario1;
    private javax.swing.JTextField txt_procedimento;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
