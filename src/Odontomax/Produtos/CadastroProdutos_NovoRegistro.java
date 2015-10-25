package Odontomax.Produtos;

import Classes.Produto;
import Classes.Usuario;
import DAOpackage.DAOFornecedor;
import DAOpackage.DAOProduto;

public class CadastroProdutos_NovoRegistro extends javax.swing.JFrame {

    final private String usuario;
    final private String nome;
    final private String setor;
    final private int codigo;
    
    public CadastroProdutos_NovoRegistro(Usuario user) {
        initComponents();
        this.nome = user.getNome();
        this.usuario = user.getLogin();
        this.setor = user.getSetor();
        this.codigo = user.getCodigo();
        label_nomeusuario.setText(nome);
        label_setorusuario.setText(setor);
    }
    
    @SuppressWarnings("unchecked")
    int cod_fornec;
    int cod_tipo;
    public void selecFornec(){
        cod_fornec = (Integer.parseInt((String) tabela_pesquisa_fornecedor.getValueAt(tabela_pesquisa_fornecedor.getSelectedRow(), 0)));
        cod_tipo = (box_tipoproduto.getSelectedIndex());
    }
    
    public Produto montaProduto(){
        Produto p = new Produto();
        
        p.setDescricao(txt_descricao.getText());
        p.setCodigo_barras((Long.parseLong(txt_codbarras.getText())));
        p.setTipo(cod_tipo);
        p.setCod_fornec(cod_fornec);
        p.setEmbalagem(txt_embalagem.getText());
        p.setUnidade(txt_unidade.getText());
        
        return p;        
    }
    
    public void Novo(){
        btn_salvar.setEnabled(true);

        txt_descricao.setEnabled(true);
        txt_codbarras.setEnabled(true);
        txt_embalagem.setEnabled(true);
        box_tipoproduto.setEnabled(true);

        btn_novo.setEnabled(false);
        btn_cancelar.setEnabled(true);
    }
    
    public void Cancelar(){
        btn_salvar.setEnabled(false);

        txt_descricao.setEnabled(false);
        txt_descricao.setText("");
        txt_codbarras.setEnabled(false);
        txt_codbarras.setText("");
        txt_embalagem.setEnabled(false);
        txt_embalagem.setText("");
        box_tipoproduto.setEnabled(false);
        box_tipoproduto.setSelectedIndex(0);
        txt_unidade.setText("");
        txt_unidade.setEditable(false);
        
        tabela_pesquisa_fornecedor.setEnabled(false);

        btn_novo.setEnabled(true);
        btn_cancelar.setEnabled(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_paciente = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        painel_usuario1 = new javax.swing.JPanel();
        label_nomeusuario = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        label_setorusuario = new javax.swing.JLabel();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        painel_dados3 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txt_descricao = new javax.swing.JTextField();
        txt_codbarras = new javax.swing.JTextField();
        txt_embalagem = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        box_tipoproduto = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txt_cnpj = new javax.swing.JTextField();
        txt_fornecedor = new javax.swing.JTextField();
        btn_alterar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela_pesquisa_fornecedor = new javax.swing.JTable();
        btn_selecionar = new javax.swing.JButton();
        btn_cancel_fornec = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_unidade = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        label_bg = new javax.swing.JLabel();

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecionar Paciente"));

        jLabel42.setText("Código Paciente:");

        jLabel43.setText("Nome Paciente:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");

        tabela_paciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_paciente);

        jButton2.setText("Selecionar");

        jButton6.setText("Limpar");

        jButton7.setText("Cancelar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Produto");
        getContentPane().setLayout(null);

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_voltar);
        btn_voltar.setBounds(591, 63, 70, 30);

        painel_usuario1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)), "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 153, 0))); // NOI18N
        painel_usuario1.setForeground(new java.awt.Color(255, 255, 255));
        painel_usuario1.setOpaque(false);

        label_nomeusuario.setForeground(new java.awt.Color(255, 255, 255));
        label_nomeusuario.setText("Nome");

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Usuário:");

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Setor: ");

        label_setorusuario.setForeground(new java.awt.Color(255, 255, 255));
        label_setorusuario.setText("Setor");

        javax.swing.GroupLayout painel_usuario1Layout = new javax.swing.GroupLayout(painel_usuario1);
        painel_usuario1.setLayout(painel_usuario1Layout);
        painel_usuario1Layout.setHorizontalGroup(
            painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_usuario1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_setorusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_nomeusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painel_usuario1Layout.setVerticalGroup(
            painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_usuario1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(label_nomeusuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(label_setorusuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painel_usuario1);
        painel_usuario1.setBounds(10, 18, 290, 77);

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_novo);
        btn_novo.setBounds(318, 46, 110, 51);

        btn_salvar.setText("Salvar");
        btn_salvar.setEnabled(false);
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salvar);
        btn_salvar.setBounds(20, 510, 121, 51);

        painel_dados3.setBackground(new java.awt.Color(255, 153, 0));
        painel_dados3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)), "Informações do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 153, 0))); // NOI18N
        painel_dados3.setForeground(new java.awt.Color(255, 255, 255));
        painel_dados3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painel_dados3.setName("Dados"); // NOI18N
        painel_dados3.setOpaque(false);

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Descrição do Produto:");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Código de Barras:");

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Embalagem:");

        txt_descricao.setEnabled(false);

        txt_codbarras.setEnabled(false);

        txt_embalagem.setEnabled(false);

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Tipo:");

        box_tipoproduto.setForeground(new java.awt.Color(255, 255, 255));
        box_tipoproduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONAR", "Medicamento", "Consumo", "Cirurgico" }));
        box_tipoproduto.setEnabled(false);

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)), "Informações do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel5.setOpaque(false);

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("CNPJ:");

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Razão Social:");

        txt_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fornecedorActionPerformed(evt);
            }
        });

        btn_alterar.setText("Buscar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

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
        jScrollPane3.setViewportView(tabela_pesquisa_fornecedor);

        btn_selecionar.setText("Selecionar");
        btn_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarActionPerformed(evt);
            }
        });

        btn_cancel_fornec.setText("Cancelar");
        btn_cancel_fornec.setEnabled(false);
        btn_cancel_fornec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel_fornecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cancel_fornec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_selecionar)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(txt_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_selecionar)
                    .addComponent(btn_cancel_fornec))
                .addGap(13, 13, 13))
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Unidade:");

        javax.swing.GroupLayout painel_dados3Layout = new javax.swing.GroupLayout(painel_dados3);
        painel_dados3.setLayout(painel_dados3Layout);
        painel_dados3Layout.setHorizontalGroup(
            painel_dados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados3Layout.createSequentialGroup()
                .addGroup(painel_dados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dados3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painel_dados3Layout.createSequentialGroup()
                        .addGroup(painel_dados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_dados3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(painel_dados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel52))
                                .addGap(18, 18, 18)
                                .addGroup(painel_dados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_codbarras)
                                    .addComponent(txt_descricao)
                                    .addComponent(box_tipoproduto, 0, 234, Short.MAX_VALUE)
                                    .addGroup(painel_dados3Layout.createSequentialGroup()
                                        .addComponent(txt_embalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_unidade))))
                            .addGroup(painel_dados3Layout.createSequentialGroup()
                                .addGap(458, 458, 458)
                                .addComponent(jLabel41)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painel_dados3Layout.setVerticalGroup(
            painel_dados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_dados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txt_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codbarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txt_embalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_unidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(box_tipoproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel41))
        );

        getContentPane().add(painel_dados3);
        painel_dados3.setBounds(10, 103, 650, 400);

        btn_cancelar.setText("Cancelar");
        btn_cancelar.setEnabled(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar);
        btn_cancelar.setBounds(540, 510, 110, 51);

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 153, 0));
        jLabel53.setText("Cadastrar Produto");
        getContentPane().add(jLabel53);
        jLabel53.setBounds(470, 20, 193, 29);

        label_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Odontomax/bg.jpg"))); // NOI18N
        label_bg.setText("jLabel1");
        getContentPane().add(label_bg);
        label_bg.setBounds(-10, 0, 890, 610);

        setSize(new java.awt.Dimension(715, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        // TODO add your handling code here:
        Novo();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txt_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fornecedorActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        Cancelar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // TODO add your handling code here:
        DAOProduto dao = new DAOProduto();        
        dao.inserir(montaProduto(), codigo);   
        Cancelar();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        // TODO add your handling code here:
        DAOFornecedor dao = new DAOFornecedor();
        tabela_pesquisa_fornecedor.setModel(dao.carregarLista(txt_fornecedor.getText(), txt_cnpj.getText()));
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarActionPerformed
        // TODO add your handling code here:
        selecFornec();
        btn_cancel_fornec.setEnabled(true);
        btn_selecionar.setEnabled(false);
        tabela_pesquisa_fornecedor.setEnabled(false);
    }//GEN-LAST:event_btn_selecionarActionPerformed

    private void btn_cancel_fornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel_fornecActionPerformed
        // TODO add your handling code here:
        btn_selecionar.setEnabled(true);
        tabela_pesquisa_fornecedor.setEnabled(true);
        btn_cancel_fornec.setEnabled(false);
    }//GEN-LAST:event_btn_cancel_fornecActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box_tipoproduto;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cancel_fornec;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_selecionar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel label_bg;
    private javax.swing.JLabel label_nomeusuario;
    private javax.swing.JLabel label_setorusuario;
    private javax.swing.JPanel painel_dados3;
    private javax.swing.JPanel painel_usuario1;
    private javax.swing.JTable tabela_paciente;
    private javax.swing.JTable tabela_pesquisa_fornecedor;
    private javax.swing.JTextField txt_cnpj;
    private javax.swing.JTextField txt_codbarras;
    private javax.swing.JTextField txt_descricao;
    private javax.swing.JTextField txt_embalagem;
    private javax.swing.JTextField txt_fornecedor;
    private javax.swing.JTextField txt_unidade;
    // End of variables declaration//GEN-END:variables
}
