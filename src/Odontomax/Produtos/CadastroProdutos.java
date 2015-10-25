package Odontomax.Produtos;

import Classes.Usuario;

public class CadastroProdutos extends javax.swing.JFrame {
    
    final private String usuario;
    final private String nome;
    final private String setor;
    final private int codigo;
    
    
    public CadastroProdutos(Usuario user) {
        initComponents();this.nome = user.getNome();
        this.usuario = user.getLogin();
        this.setor = user.getSetor();
        this.codigo = user.getCodigo();
        label_nomeusuario.setText(nome);
        label_setorusuario.setText(setor);
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
        btn_voltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_novoregistro = new javax.swing.JButton();
        btn_manutencao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setResizable(false);

        painel_usuario1.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));

        label_nomeusuario.setText("Nome do Setor");

        jLabel6.setText("Usuário:");

        jLabel7.setText("Setor: ");

        label_setorusuario.setText("Nome do Usuário");

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
                    .addComponent(label_setorusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
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
                .addContainerGap(35, Short.MAX_VALUE))
        );

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Produtos"));

        btn_novoregistro.setText("Novo Registro");
        btn_novoregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoregistroActionPerformed(evt);
            }
        });

        btn_manutencao.setText("Consultar Registros");
        btn_manutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manutencaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_novoregistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_manutencao, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_novoregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_manutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painel_usuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_voltar))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(532, 436));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_novoregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoregistroActionPerformed
        // TODO add your handling code here:
        CadastroProdutos_NovoRegistro C = new CadastroProdutos_NovoRegistro(montaUsuario());
        C.setVisible(true);
    }//GEN-LAST:event_btn_novoregistroActionPerformed

    private void btn_manutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manutencaoActionPerformed
        // TODO add your handling code here:
        CadastroProduto_Consultar C = new CadastroProduto_Consultar();
        C.setVisible(true);
    }//GEN-LAST:event_btn_manutencaoActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_manutencao;
    private javax.swing.JButton btn_novoregistro;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_nomeusuario;
    private javax.swing.JLabel label_setorusuario;
    private javax.swing.JPanel painel_usuario1;
    // End of variables declaration//GEN-END:variables
}
