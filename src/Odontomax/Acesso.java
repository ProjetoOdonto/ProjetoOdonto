package Odontomax;

import Classes.Conecta;
import Classes.Usuario;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class Acesso extends javax.swing.JFrame {

    public Acesso() {
        initComponents();
    }
    
    public Usuario montaUsuario(String usuario, String setor, int permissao,int codigo, String nome){
            Usuario u = new Usuario();
            
            u.setCodigo(codigo);
            u.setLogin(usuario.toUpperCase());
            u.setNome(nome.toUpperCase());
            u.setPermissao(permissao);
            u.setSetor(setor);          
            
            return u;
            
        }
      
    public void login(){ 
        
               
        String usuario = "PADRAO";
        String senha = "PADRAO";
        int acesso;
        String setor = "";
        String nome = "";
        int permissao;
        int codigo;
        usuario.toUpperCase();
        senha.toUpperCase();
        
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            
            String sql = "SELECT login, senha, permissao, setor, nome, cod_usuario FROM ODONTOMAX.usuario "
                    + "WHERE login LIKE '"+txt_usuario.getText().toUpperCase()+"' AND "
                    + "senha LIKE '"+txt_senha.getText().toUpperCase()+"' "
                    + "GROUP BY login, senha, permissao, setor, nome";
            
            ResultSet rs = stmt.executeQuery(sql);      
            
                       
            while(rs.next()) {
                usuario = rs.getString("login");
                senha = rs.getString("senha");
                setor = rs.getString("setor");
                nome = rs.getString("nome");
                codigo = rs.getInt("cod_usuario");
                permissao = rs.getInt("permissao");
                
                
                if (txt_usuario.getText().toUpperCase().equals(usuario) && txt_senha.getText().toUpperCase().equals(senha)){
                    Principal p1 = new Principal(montaUsuario(usuario,setor,permissao,codigo,nome));
                    p1.setVisible(true);
                    
                }              
            }      
            rs.close();              
            stmt.close();
            con.close();    
            dispose();    
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }     
        
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        txt_usuario = new javax.swing.JTextField();
        btn_entrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        Painel.setBackground(new java.awt.Color(255, 255, 255));
        Painel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)), "Acesso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 153, 0))); // NOI18N
        Painel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Painel.setName(""); // NOI18N
        Painel.setOpaque(false);
        Painel.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário:");
        Painel.add(jLabel1);
        jLabel1.setBounds(22, 80, 40, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha: ");
        Painel.add(jLabel2);
        jLabel2.setBounds(30, 104, 37, 30);
        Painel.add(txt_senha);
        txt_senha.setBounds(70, 110, 239, 20);

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        Painel.add(txt_usuario);
        txt_usuario.setBounds(70, 80, 239, 20);

        btn_entrar.setBackground(new java.awt.Color(204, 204, 204));
        btn_entrar.setForeground(new java.awt.Color(255, 153, 51));
        btn_entrar.setText("Entrar");
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });
        btn_entrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_entrarKeyPressed(evt);
            }
        });
        Painel.add(btn_entrar);
        btn_entrar.setBounds(330, 80, 110, 50);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Sistema OdontoMax");
        Painel.add(jLabel3);
        jLabel3.setBounds(170, 20, 243, 44);

        getContentPane().add(Painel);
        Painel.setBounds(10, 170, 520, 210);

        jButton1.setForeground(new java.awt.Color(255, 153, 51));
        jButton1.setText("Esqueci a Senha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 400, 140, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Odontomax/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-60, 0, 600, 460);

        setSize(new java.awt.Dimension(551, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        // TODO add your handling code here:
        if (txt_usuario.getText().equals("")||txt_senha.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite o login e a senha");
        } else if (txt_senha.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite a senha");
        } else if (txt_usuario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite o login");
        } else {
            login();
        }
        
        
    }//GEN-LAST:event_btn_entrarActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void btn_entrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_entrarKeyPressed
        
    }//GEN-LAST:event_btn_entrarKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER){ 
         
           // TODO add your handling code here:
        if (txt_usuario.getText().equals("")||txt_senha.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite o login e a senha");
        } else if (txt_senha.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite a senha");
        } else if (txt_usuario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite o login");
        } else {
            login();
        }
        
         
         }
    }//GEN-LAST:event_formKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EsqueciSenha es = new EsqueciSenha();
        
        es.setVisible(true);  
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acesso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
