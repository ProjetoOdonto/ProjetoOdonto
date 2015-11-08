package Odontomax;

import Odontomax.Estoque.Estoque;
import Odontomax.Produtos.CadastroProdutos;
import Odontomax.ContasReceber.ContasReceber;
import Odontomax.ContasPagar.ContasPagar;
import Odontomax.Procedimentos.Procedimentos;
import Odontomax.Compras.Compras;
import Odontomax.Fornecedor.CadastroFornecedores;
import Odontomax.Paciente.CadastroPaciente;
import Classes.Usuario;
import Odontomax.Paciente.CadastroPaciente_NovoRegistro;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {
    final private String usuario;
    final private String nome;
    final private int permissao;
    final private String setor;
    final private int codigo;
    
    public Principal(Usuario user) {
        initComponents();
        this.nome = user.getNome();
        this.usuario = user.getLogin();
        this.setor = user.getSetor();
        this.permissao = user.getPermissao();
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

        painel_usuario = new javax.swing.JPanel();
        label_nomeusuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_setorusuario = new javax.swing.JLabel();
        painel_rotinas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_rotinas = new javax.swing.JList();
        btn_sair = new javax.swing.JButton();
        btn_selecionar = new javax.swing.JButton();
        btn_trocarusuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema OdontoMax");
        setResizable(false);
        getContentPane().setLayout(null);

        painel_usuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));

        label_nomeusuario.setText("Nome do Setor");

        jLabel1.setText("Usuário:");

        jLabel2.setText("Setor: ");

        label_setorusuario.setText("Nome do Usuário");

        javax.swing.GroupLayout painel_usuarioLayout = new javax.swing.GroupLayout(painel_usuario);
        painel_usuario.setLayout(painel_usuarioLayout);
        painel_usuarioLayout.setHorizontalGroup(
            painel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_setorusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_nomeusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        painel_usuarioLayout.setVerticalGroup(
            painel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nomeusuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_setorusuario)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(painel_usuario);
        painel_usuario.setBounds(10, 11, 240, 90);

        painel_rotinas.setBorder(javax.swing.BorderFactory.createTitledBorder("Rotinas"));

        lista_rotinas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Registro de Pacientes", "Agendamento", "Faturamento", "Emitir Fatura Serviço", "Orçamento", "Odontograma", "Relatório Médico", "Compras", "Contas a Pagar", "Contas a Receber", "Estoque", "Cadastro de Fornecedores", "Cadastro de Produtos", "Caixa", "Procedimentos" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lista_rotinas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista_rotinas.setToolTipText("Seleciona a rotina desejada");
        jScrollPane1.setViewportView(lista_rotinas);

        javax.swing.GroupLayout painel_rotinasLayout = new javax.swing.GroupLayout(painel_rotinas);
        painel_rotinas.setLayout(painel_rotinasLayout);
        painel_rotinasLayout.setHorizontalGroup(
            painel_rotinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_rotinasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        painel_rotinasLayout.setVerticalGroup(
            painel_rotinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        getContentPane().add(painel_rotinas);
        painel_rotinas.setBounds(10, 132, 240, 390);

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair);
        btn_sair.setBounds(893, 536, 70, 49);

        btn_selecionar.setText("Selecionar");
        btn_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_selecionar);
        btn_selecionar.setBounds(10, 537, 140, 47);

        btn_trocarusuario.setText("Trocar Usuário");
        btn_trocarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trocarusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_trocarusuario);
        btn_trocarusuario.setBounds(784, 536, 103, 49);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Odontomax/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 660, 600);

        setSize(new java.awt.Dimension(672, 635));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarActionPerformed
        // TODO add your handling code here:
        
       
        if (lista_rotinas.getSelectedIndex()==0 && permissao == 1){
            CadastroPaciente_NovoRegistro user = new CadastroPaciente_NovoRegistro(nome,setor,usuario);            
            user.setVisible(true);           
        } 
        if (lista_rotinas.getSelectedIndex()==0 && permissao > 2 ){
            JOptionPane.showMessageDialog(null,"Usuário sem permissão de acesso");
        }
        if (lista_rotinas.getSelectedIndex()==1 && permissao == 2 && permissao == 1){
            Agendamento user = new Agendamento();            
            user.setVisible(true);
        }
        if (lista_rotinas.getSelectedIndex()==2){
            Faturamento user = new Faturamento();
            user.setVisible(true);
        }
        if (lista_rotinas.getSelectedIndex()==3){
            EmissaoFatura user = new EmissaoFatura();            
            user.setVisible(true);
        }
        if (lista_rotinas.getSelectedIndex()==4){
            Orçamento user = new Orçamento();
            user.setVisible(true);
        }
        if (lista_rotinas.getSelectedIndex()==5){
            Odontograma user = new Odontograma();
            user.setVisible(true);
        }
        if (lista_rotinas.getSelectedIndex()==6){
            RelatorioMedico user = new RelatorioMedico();
            user.setVisible(true);
        }
        if (lista_rotinas.getSelectedIndex()==7){
            Compras user = new Compras(montaUsuario());
            user.setVisible(true);
        }
        if (lista_rotinas.getSelectedIndex()==8){
            ContasPagar user = new ContasPagar();
            user.setVisible(true);
        }
        if (lista_rotinas.getSelectedIndex()==9){
            ContasReceber user = new ContasReceber(); 
            user.setVisible(true);
        }
        if (lista_rotinas.getSelectedIndex()==10){
            Estoque user = new Estoque(); 
            user.setVisible(true);
        }
        if (lista_rotinas.getSelectedIndex()==11){
            CadastroFornecedores user = new CadastroFornecedores(montaUsuario());
            user.setVisible(true);
        }
        if (lista_rotinas.getSelectedIndex()==12){
            CadastroProdutos user = new CadastroProdutos(montaUsuario()); 
            user.setVisible(true);
        }
        
        if (lista_rotinas.getSelectedIndex()==13){
            Caixa user = new Caixa(); 
            user.setVisible(true);
        }
        
        if (lista_rotinas.getSelectedIndex()==14){
            Procedimentos user = new Procedimentos(montaUsuario()); 
            user.setVisible(true);
        }
        
    }//GEN-LAST:event_btn_selecionarActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_trocarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trocarusuarioActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_trocarusuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_selecionar;
    private javax.swing.JButton btn_trocarusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_nomeusuario;
    private javax.swing.JLabel label_setorusuario;
    private javax.swing.JList lista_rotinas;
    private javax.swing.JPanel painel_rotinas;
    private javax.swing.JPanel painel_usuario;
    // End of variables declaration//GEN-END:variables
}
