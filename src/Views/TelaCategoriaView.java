package Views;

import Controllers.CategoriaController;
import Models.CategoriaModel;
import Views.Enums.ModoOperacaoEnum;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;

public class TelaCategoriaView extends javax.swing.JInternalFrame {

    private ModoOperacaoEnum modo;

    public TelaCategoriaView(ModoOperacaoEnum modo) {
        initComponents();
        definirModo(modo);
        limparCampos();
        limparMensagensErro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Id = new javax.swing.JPanel();
        lbl_Id = new javax.swing.JLabel();
        txtf_Id = new javax.swing.JTextField();
        pnl_DadosCategorias = new javax.swing.JPanel();
        lbl_Nome = new javax.swing.JLabel();
        txtf_Nome = new javax.swing.JTextField();
        lblw_Nome = new javax.swing.JLabel();
        btn_Adicionar = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        pnl_Pesquisa = new javax.swing.JPanel();
        lbl_Pesquisa = new javax.swing.JLabel();
        spn_Pesquisa = new javax.swing.JSpinner();
        btn_Pesquisar = new javax.swing.JButton();
        lblw_Pesquisa = new javax.swing.JLabel();
        pnl_Categorias = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Categorias = new javax.swing.JTable();
        btn_Confirmar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Titulo");

        lbl_Id.setText("ID");

        txtf_Id.setEditable(false);

        javax.swing.GroupLayout pnl_IdLayout = new javax.swing.GroupLayout(pnl_Id);
        pnl_Id.setLayout(pnl_IdLayout);
        pnl_IdLayout.setHorizontalGroup(
            pnl_IdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_IdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(462, Short.MAX_VALUE))
        );
        pnl_IdLayout.setVerticalGroup(
            pnl_IdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_IdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_IdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Id)
                    .addComponent(txtf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_DadosCategorias.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Categorias"));

        lbl_Nome.setText("Nome");

        txtf_Nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtf_NomeFocusGained(evt);
            }
        });
        txtf_Nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtf_NomeKeyPressed(evt);
            }
        });

        lblw_Nome.setForeground(new java.awt.Color(255, 0, 0));
        lblw_Nome.setText("* Nome não pode ser nulo");

        btn_Adicionar.setText("Adicionar");
        btn_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionarActionPerformed(evt);
            }
        });

        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_DadosCategoriasLayout = new javax.swing.GroupLayout(pnl_DadosCategorias);
        pnl_DadosCategorias.setLayout(pnl_DadosCategoriasLayout);
        pnl_DadosCategoriasLayout.setHorizontalGroup(
            pnl_DadosCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DadosCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_DadosCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Nome)
                    .addComponent(txtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblw_Nome))
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DadosCategoriasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Limpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Adicionar)
                .addContainerGap())
        );
        pnl_DadosCategoriasLayout.setVerticalGroup(
            pnl_DadosCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DadosCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblw_Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(pnl_DadosCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Adicionar)
                    .addComponent(btn_Limpar))
                .addContainerGap())
        );

        lbl_Pesquisa.setText("Pesquisar");

        spn_Pesquisa.setModel(new javax.swing.SpinnerNumberModel());

        btn_Pesquisar.setText("Pesquisar");
        btn_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesquisarActionPerformed(evt);
            }
        });

        lblw_Pesquisa.setForeground(new java.awt.Color(255, 0, 0));
        lblw_Pesquisa.setText("* Registro não encontrado.");

        javax.swing.GroupLayout pnl_PesquisaLayout = new javax.swing.GroupLayout(pnl_Pesquisa);
        pnl_Pesquisa.setLayout(pnl_PesquisaLayout);
        pnl_PesquisaLayout.setHorizontalGroup(
            pnl_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Pesquisa)
                    .addGroup(pnl_PesquisaLayout.createSequentialGroup()
                        .addComponent(spn_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Pesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblw_Pesquisa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_PesquisaLayout.setVerticalGroup(
            pnl_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PesquisaLayout.createSequentialGroup()
                .addComponent(lbl_Pesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spn_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Pesquisar)
                    .addComponent(lblw_Pesquisa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_Categorias.setBorder(javax.swing.BorderFactory.createTitledBorder("Categorias"));

        tb_Categorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ));
        jScrollPane2.setViewportView(tb_Categorias);

        javax.swing.GroupLayout pnl_CategoriasLayout = new javax.swing.GroupLayout(pnl_Categorias);
        pnl_Categorias.setLayout(pnl_CategoriasLayout);
        pnl_CategoriasLayout.setHorizontalGroup(
            pnl_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_CategoriasLayout.setVerticalGroup(
            pnl_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CategoriasLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btn_Confirmar.setText("Confirmar");
        btn_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmarActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_Id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_DadosCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Pesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Categorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Confirmar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_DadosCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Confirmar)
                    .addComponent(btn_Cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisarActionPerformed
        lblw_Pesquisa.setVisible(Boolean.FALSE);

        int idPesquisa = Integer.parseInt(spn_Pesquisa.getValue().toString());
        CategoriaModel categoriaEncontrada = filtrarCategoria(idPesquisa);

        if (categoriaEncontrada != null) {
            configurarCampos(categoriaEncontrada);
        } else {
            lblw_Pesquisa.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_btn_PesquisarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmarActionPerformed

        switch (this.modo) {
            case CADASTRAR:
                cadastrarCategoria();
                break;
            case EDITAR:
                editarCategoria();
                break;
            case DELETAR:
                deletarCategoria();
                break;
        }
    }//GEN-LAST:event_btn_ConfirmarActionPerformed

    private void btn_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdicionarActionPerformed
        adicionarElementos();
    }//GEN-LAST:event_btn_AdicionarActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void txtf_NomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtf_NomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //Clique na tecla enter
            adicionarElementos();
        }
    }//GEN-LAST:event_txtf_NomeKeyPressed

    private void txtf_NomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtf_NomeFocusGained
        lblw_Nome.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_txtf_NomeFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Adicionar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Confirmar;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_Pesquisar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_Nome;
    private javax.swing.JLabel lbl_Pesquisa;
    private javax.swing.JLabel lblw_Nome;
    private javax.swing.JLabel lblw_Pesquisa;
    private javax.swing.JPanel pnl_Categorias;
    private javax.swing.JPanel pnl_DadosCategorias;
    private javax.swing.JPanel pnl_Id;
    private javax.swing.JPanel pnl_Pesquisa;
    private javax.swing.JSpinner spn_Pesquisa;
    private javax.swing.JTable tb_Categorias;
    private javax.swing.JTextField txtf_Id;
    private javax.swing.JTextField txtf_Nome;
    // End of variables declaration//GEN-END:variables

    private CategoriaModel filtrarCategoria(int idPesquisa) {
        CategoriaController categoriaController = new CategoriaController();
        CategoriaModel categoriaObtida = categoriaController.buscarCategoriaPorIdController(idPesquisa);
        return categoriaObtida;
    }

    private void configurarCampos(CategoriaModel categoriaEncontrada) {
        pnl_Id.setVisible(Boolean.TRUE);
        pnl_DadosCategorias.setVisible(Boolean.TRUE);
        btn_Adicionar.setVisible(Boolean.FALSE);
        btn_Limpar.setVisible(Boolean.FALSE);
        btn_Confirmar.setVisible(Boolean.TRUE);

        txtf_Id.setText(String.valueOf(categoriaEncontrada.getId()));
        txtf_Nome.setText(categoriaEncontrada.getNome());

        if (this.modo == ModoOperacaoEnum.DELETAR) {
            for (Component c : pnl_DadosCategorias.getComponents()) {
                c.setEnabled(Boolean.FALSE);
            }
        }
    }

    private void definirModo(ModoOperacaoEnum modo) {
        this.modo = modo;

        switch (modo) {
            case CADASTRAR:
                configurarTelaCadastro();
                break;
            case VER:
                configurarTelaLeitura();
                break;
            case EDITAR:
                configurarTelaEdicao();
                break;
            case DELETAR:
                configurarTelaExclusao();
                break;
        }
    }

    private void limparCampos() {
        txtf_Nome.setText("");
    }

    private void limparMensagensErro() {
        lblw_Nome.setVisible(Boolean.FALSE);
        lblw_Pesquisa.setVisible(Boolean.FALSE);
    }

    private void configurarTelaCadastro() {
        setTitle("Cadastrando Categoria");

        pnl_Id.setVisible(Boolean.FALSE);
        pnl_Pesquisa.setVisible(Boolean.FALSE);

        setSize(600, 545);
        setMinimumSize(new java.awt.Dimension(600, 545));
        setPreferredSize(new java.awt.Dimension(600, 545));

        btn_Confirmar.setText("Cadastrar");
    }

    private void configurarTelaLeitura() {
        setTitle("Listando Categorias");

        pnl_DadosCategorias.setVisible(Boolean.FALSE);
        pnl_Id.setVisible(Boolean.FALSE);
        pnl_Pesquisa.setVisible(Boolean.FALSE);

        setSize(600, 545);
        setMinimumSize(new java.awt.Dimension(600, 545));
        setPreferredSize(new java.awt.Dimension(600, 545));

        btn_Confirmar.setVisible(Boolean.FALSE);
        btn_Cancelar.setVisible(Boolean.FALSE);

        configurarTabela();
    }

    private void configurarTabela() {
        CategoriaController categoriaController = new CategoriaController();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nome");

        ArrayList<CategoriaModel> categoriasListadas = categoriaController.listarCategoriasController();

        for (CategoriaModel cm : categoriasListadas) {
            modelo.addRow(new Object[]{
                cm.getId(),
                cm.getNome()
            });
        }

        tb_Categorias.setModel(modelo);
    }

    private void configurarTelaEdicao() {
        setTitle("Editando Categorias");

        pnl_DadosCategorias.setVisible(Boolean.FALSE);
        pnl_Categorias.setVisible(Boolean.FALSE);

        setSize(600, 545);
        setMinimumSize(new java.awt.Dimension(600, 545));
        setPreferredSize(new java.awt.Dimension(600, 545));

        btn_Confirmar.setText("Editar");
        btn_Confirmar.setVisible(Boolean.FALSE);
    }

    private void configurarTelaExclusao() {
        setTitle("Deletando Categorias");

        pnl_DadosCategorias.setVisible(Boolean.FALSE);
        pnl_Categorias.setVisible(Boolean.FALSE);

        setSize(600, 545);
        setMinimumSize(new java.awt.Dimension(600, 545));
        setPreferredSize(new java.awt.Dimension(600, 545));

        btn_Confirmar.setText("Deletar");
        btn_Confirmar.setVisible(Boolean.FALSE);
    }

    private void cadastrarCategoria() {
        DefaultTableModel modelo = (DefaultTableModel) tb_Categorias.getModel();
        CategoriaController categoriaController = new CategoriaController();

        for (int i = 0; i < tb_Categorias.getRowCount(); i++) {
            String nome = modelo.getValueAt(i, 0).toString();
            categoriaController.cadastrarCategoriaController(nome);
        }
        for (JInternalFrame frame : getDesktopPane().getAllFrames()) {
            if (frame instanceof TelaCategoriaView) {
                TelaCategoriaView tela = (TelaCategoriaView) frame;
                if (tela.modo == ModoOperacaoEnum.VER) {
                    tela.configurarTabela();
                }
            }
        }
        dispose();
    }

    private void editarCategoria() {
        CategoriaController categoriaController = new CategoriaController();

        int id = Integer.parseInt(txtf_Id.getText().toString());
        String nome = txtf_Nome.getText().toString();

        categoriaController.alterarCategoriaController(id, nome);

        for (JInternalFrame frame : getDesktopPane().getAllFrames()) {
            if (frame instanceof TelaCategoriaView) {
                TelaCategoriaView tela = (TelaCategoriaView) frame;
                if (tela.modo == ModoOperacaoEnum.VER) {
                    tela.configurarTabela();
                }
            }
        }
    }

    private void deletarCategoria() {
        CategoriaController categoriaController = new CategoriaController();

        int id = Integer.parseInt(txtf_Id.getText().toString());

        categoriaController.excluirCategoriaController(id);

        for (JInternalFrame frame : getDesktopPane().getAllFrames()) {
            if (frame instanceof TelaCategoriaView) {
                TelaCategoriaView tela = (TelaCategoriaView) frame;
                if (tela.modo == ModoOperacaoEnum.VER) {
                    tela.configurarTabela();
                }
            }
        }
    }

    private boolean verificarCampos() {
        boolean camposCorretos = true;

        String nome = txtf_Nome.getText();

        if (nome == null || nome.isEmpty()) {
            lblw_Nome.setText("*Nome não pode estar vazio.");
            lblw_Nome.setVisible(Boolean.TRUE);
            camposCorretos = false;
        }

        return camposCorretos;
    }

    private void adicionarElementos() {
        DefaultTableModel dtmCategorias = (DefaultTableModel) tb_Categorias.getModel();
        limparMensagensErro();

        if (verificarCampos()) {
            Object[] dados = {
                txtf_Nome.getText()
            };

            dtmCategorias.addRow(dados);

            limparCampos();
            limparMensagensErro();
        }
    }
}
