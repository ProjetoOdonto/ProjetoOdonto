package Odontomax.Compras;

import Classes.PedidoCompra;
import Classes.PedidoItem;
import DAOpackage.DAOFornecedor;
import DAOpackage.DAOItem;
import DAOpackage.DAOPedido;
import DAOpackage.DAOProduto;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class Compras_NovoRegistro extends javax.swing.JFrame {

    public Compras_NovoRegistro() {
        initComponents();
    }
    
    public PedidoCompra montaPedido(){
        PedidoCompra p = new PedidoCompra();
        p.setPedido(Integer.parseInt(txt_pedido.getText()));
        p.setCod_fornec(Integer.parseInt((String) tabela_pesquisa_fornecedor.getValueAt(tabela_pesquisa_fornecedor.getSelectedRow(), 0)));
        p.setValor(vlrtotal);
        return p;
    }
    
    public PedidoItem montaItem(){
        PedidoItem p = new PedidoItem();        
        p.setCodigo_produto(Integer.parseInt((String)tabela_pesquisa_produto2.getValueAt(tabela_pesquisa_produto2.getSelectedRow(), 0)));
        p.setPedido(Integer.parseInt(txt_pedido.getText()));
        p.setQuantidade(Integer.parseInt(txt_quantidade.getText()));
        return p;
    }
        
    private String getDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public int getCodigo(PedidoCompra p){
        return p.getPedido()+1;
    }
    
    public void ativar(){        
        txt_fornecedor.setEnabled(true);
        txt_cnpj.setEnabled(true);
        btn_consultar.setEnabled(true);
        btn_selecionar_fornec.setEnabled(true);
        tabela_pesquisa_fornecedor.setEnabled(true);        
    }
    
    public void ativarProduto(){
        txt_fornecedor.setEnabled(false);
        txt_cnpj.setEnabled(false);
        
        label_descricao.setEnabled(true);
        tabela_pesquisa_produto2.setEnabled(true);
        btn_alterar_fornec.setEnabled(true);
        btn_adicionar.setEnabled(true);
        txt_descricao3.setEnabled(true);
        btn_consultar_produto.setEnabled(true);
        
        btn_selecionar_fornec.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_usuario1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_voltar1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_novo2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_pedido = new javax.swing.JTextField();
        txt_valor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_historico = new javax.swing.JTextField();
        txt_datalanc = new javax.swing.JTextField();
        txt_datavcto = new javax.swing.JTextField();
        txt_situacao = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_compra_produto = new javax.swing.JTable();
        painel_dados = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_fornecedor = new javax.swing.JTextField();
        txt_cnpj = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_pesquisa_fornecedor = new javax.swing.JTable();
        btn_consultar = new javax.swing.JButton();
        btn_selecionar_fornec = new javax.swing.JButton();
        btn_alterar_fornec = new javax.swing.JButton();
        painel_dados4 = new javax.swing.JPanel();
        label_descricao = new javax.swing.JLabel();
        txt_descricao3 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabela_pesquisa_produto2 = new javax.swing.JTable();
        btn_consultar_produto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_quantidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_precout = new javax.swing.JTextField();
        btn_adicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Pedido de Compra");
        setResizable(false);

        painel_usuario1.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));

        jLabel5.setText("Nome do Setor");

        jLabel6.setText("Usuário:");

        jLabel7.setText("Setor: ");

        jLabel8.setText("Nome do Usuário");

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
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painel_usuario1Layout.setVerticalGroup(
            painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_usuario1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_usuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_voltar1.setText("Voltar");
        btn_voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltar1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("Novo Pedido de Compra");

        btn_cancelar.setText("Cancelar Registro");
        btn_cancelar.setEnabled(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.setEnabled(false);
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_novo2.setText("Novo Registro");
        btn_novo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novo2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        jLabel1.setText("Número Pedido:");

        jLabel2.setText("Valor:");

        txt_pedido.setEditable(false);
        txt_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pedidoActionPerformed(evt);
            }
        });

        txt_valor.setEditable(false);
        txt_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorActionPerformed(evt);
            }
        });

        jLabel9.setText("Data Lançamento:");

        jLabel10.setText("Data Vencimento:");

        jLabel12.setText("Situação:");

        jLabel13.setText("Histórico:");

        txt_datalanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_datalancActionPerformed(evt);
            }
        });

        txt_situacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "Pago", "Vencido", "Não Pago", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_datavcto, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(txt_datalanc)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pedido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_valor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_historico)
                            .addComponent(txt_situacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_historico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_datavcto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_datalanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        tabela_compra_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Produto", "Descrição", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_compra_produto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_dados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)), "Fornecedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 153, 0))); // NOI18N
        painel_dados.setForeground(new java.awt.Color(255, 153, 0));
        painel_dados.setOpaque(false);

        jLabel3.setText("Razão Social: ");

        jLabel4.setText("CNPJ:");

        txt_fornecedor.setEnabled(false);

        txt_cnpj.setEnabled(false);
        txt_cnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cnpjActionPerformed(evt);
            }
        });

        tabela_pesquisa_fornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Fornecedor", "Razão Social", "CNPJ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_pesquisa_fornecedor.setEnabled(false);
        tabela_pesquisa_fornecedor.setOpaque(false);
        tabela_pesquisa_fornecedor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tabela_pesquisa_fornecedor);

        btn_consultar.setText("Consultar");
        btn_consultar.setEnabled(false);
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_selecionar_fornec.setText("Selecionar");
        btn_selecionar_fornec.setEnabled(false);
        btn_selecionar_fornec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionar_fornecActionPerformed(evt);
            }
        });

        btn_alterar_fornec.setText("Alterar");
        btn_alterar_fornec.setEnabled(false);
        btn_alterar_fornec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterar_fornecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
        painel_dados.setLayout(painel_dadosLayout);
        painel_dadosLayout.setHorizontalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_selecionar_fornec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_alterar_fornec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_consultar))
                .addContainerGap())
        );
        painel_dadosLayout.setVerticalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_alterar_fornec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_selecionar_fornec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        painel_dados4.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Produtos"));

        label_descricao.setText("Descrição:");
        label_descricao.setEnabled(false);

        txt_descricao3.setEnabled(false);

        tabela_pesquisa_produto2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Produto", "Descrição", "Código de Barras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_pesquisa_produto2.setEnabled(false);
        tabela_pesquisa_produto2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(tabela_pesquisa_produto2);

        btn_consultar_produto.setText("Consultar");
        btn_consultar_produto.setEnabled(false);
        btn_consultar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultar_produtoActionPerformed(evt);
            }
        });

        jLabel11.setText("Quantidade:");

        jLabel14.setText("Preco Unitario:");

        btn_adicionar.setText("Adicionar");
        btn_adicionar.setEnabled(false);
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_dados4Layout = new javax.swing.GroupLayout(painel_dados4);
        painel_dados4.setLayout(painel_dados4Layout);
        painel_dados4Layout.setHorizontalGroup(
            painel_dados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados4Layout.createSequentialGroup()
                .addGroup(painel_dados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dados4Layout.createSequentialGroup()
                        .addGroup(painel_dados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(painel_dados4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(label_descricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_descricao3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_consultar_produto))
                            .addGroup(painel_dados4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(painel_dados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_dados4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(painel_dados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_quantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_dados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(txt_precout, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(painel_dados4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_dados4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_adicionar)))
                .addContainerGap())
        );
        painel_dados4Layout.setVerticalGroup(
            painel_dados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_dados4Layout.createSequentialGroup()
                .addGroup(painel_dados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painel_dados4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painel_dados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_descricao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_descricao)))
                    .addComponent(btn_consultar_produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(painel_dados4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painel_dados4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_precout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_adicionar)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painel_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_voltar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(btn_novo2))
                            .addComponent(painel_dados4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painel_dados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(btn_voltar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(painel_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_novo2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painel_dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painel_dados4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        setSize(new java.awt.Dimension(914, 711));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltar1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_voltar1ActionPerformed

    private void btn_novo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novo2ActionPerformed
        // TODO add your handling code here:   
        DAOPedido dao = new DAOPedido();        
        txt_pedido.setText(String.valueOf(getCodigo(dao.retornaPedido())));     
        
        dao.inserirNumPedido(getCodigo(dao.retornaPedido()));
        
        ativar();
        btn_salvar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        
        btn_novo2.setEnabled(false);
    }//GEN-LAST:event_btn_novo2ActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        // TODO add your handling code here:
        DAOFornecedor dao = new DAOFornecedor();
        tabela_pesquisa_fornecedor.setModel(dao.carregarListaAlt(txt_fornecedor.getText(), txt_cnpj.getText()));
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_consultar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultar_produtoActionPerformed
        // TODO add your handling code here:
        DAOProduto dao = new DAOProduto();
        tabela_pesquisa_produto2.setModel(dao.carregarListaFornecedor(Integer.parseInt((String) tabela_pesquisa_fornecedor.getValueAt(tabela_pesquisa_fornecedor.getSelectedRow(), 0)),txt_descricao3.getText()));
    }//GEN-LAST:event_btn_consultar_produtoActionPerformed

    private void btn_selecionar_fornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionar_fornecActionPerformed
        // TODO add your handling code here:
        ativarProduto();
        
        tabela_pesquisa_fornecedor.setEnabled(false);
        DAOProduto dao = new DAOProduto();
        tabela_pesquisa_produto2.setModel(dao.carregarListaFornecedor(Integer.parseInt((String) tabela_pesquisa_fornecedor.getValueAt(tabela_pesquisa_fornecedor.getSelectedRow(), 0)),txt_descricao3.getText()));
    }//GEN-LAST:event_btn_selecionar_fornecActionPerformed

    private void btn_alterar_fornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterar_fornecActionPerformed
        // TODO add your handling code here:
        label_descricao.setEnabled(false);
        txt_descricao3.setEnabled(false);
        btn_consultar_produto.setEnabled(false);
        tabela_pesquisa_produto2.setEnabled(false);
        btn_selecionar_fornec.setEnabled(true);
        
        tabela_pesquisa_fornecedor.setEnabled(true);
    }//GEN-LAST:event_btn_alterar_fornecActionPerformed

    private void txt_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorActionPerformed
    DefaultTableModel add = new DefaultTableModel(new String [][]{}, new String []{"Código","Descrição","Quantidade"});
        
    double vlrtotal = 0.0;
    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        // TODO add your handling code here:
        DAOItem dao = new DAOItem();
        dao.inserirPedido(montaItem());
        tabela_compra_produto.setModel(dao.carregarLista(Integer.parseInt(txt_pedido.getText())));
        
        vlrtotal = vlrtotal + Double.parseDouble(txt_quantidade.getText())*Double.parseDouble(txt_precout.getText());
        txt_valor.setText(Double.toString(vlrtotal));
        txt_datalanc.setText(getDateTime());
        /** int codprod = Integer.parseInt((String) tabela_pesquisa_produto2.getValueAt(tabela_pesquisa_produto2.getSelectedRow(), 0));
        String descricao = ((String) tabela_pesquisa_produto2.getValueAt(tabela_pesquisa_produto2.getSelectedRow(), 1));
        int quantidade = Integer.parseInt(txt_quantidade.getText());add.addRow(new String []{""+codprod, descricao, ""+quantidade});
        tabela_compra_produto.setModel(add);      **/
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // TODO add your handling code here:
        DAOPedido dao = new DAOPedido();
        dao.inserirPedido(montaPedido());
        
             Compras_NovoRegistro novo = new Compras_NovoRegistro();
          
         dispose();  
       novo.setVisible(true);
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void txt_cnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cnpjActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        DAOPedido dao = new DAOPedido();
       
        
        
        btn_cancelar.setEnabled(false);
        btn_novo2.setEnabled(true);
      vlrtotal = 0.0;             
        dao.cancelarItem(Integer.parseInt(txt_pedido.getText()));
               dao.cancelarPedido(Integer.parseInt(txt_pedido.getText()));
               
              

             
          Compras_NovoRegistro novo = new Compras_NovoRegistro();
          
         dispose();  
       novo.setVisible(true);
        
             
     
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pedidoActionPerformed
      
    }//GEN-LAST:event_txt_pedidoActionPerformed

    private void txt_datalancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_datalancActionPerformed
   
    }//GEN-LAST:event_txt_datalancActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras_NovoRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_alterar_fornec;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_consultar_produto;
    private javax.swing.JButton btn_novo2;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_selecionar_fornec;
    private javax.swing.JButton btn_voltar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel label_descricao;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JPanel painel_dados4;
    private javax.swing.JPanel painel_usuario1;
    private javax.swing.JTable tabela_compra_produto;
    private javax.swing.JTable tabela_pesquisa_fornecedor;
    private javax.swing.JTable tabela_pesquisa_produto2;
    private javax.swing.JTextField txt_cnpj;
    private javax.swing.JTextField txt_datalanc;
    private javax.swing.JTextField txt_datavcto;
    private javax.swing.JTextField txt_descricao3;
    private javax.swing.JTextField txt_fornecedor;
    private javax.swing.JTextField txt_historico;
    private javax.swing.JTextField txt_pedido;
    private javax.swing.JTextField txt_precout;
    private javax.swing.JTextField txt_quantidade;
    private javax.swing.JComboBox txt_situacao;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
