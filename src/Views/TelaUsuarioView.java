package Views;

import Controllers.UsuarioController;
import Models.Enums.PerfilEnum;
import Models.UsuarioModel;
import Views.Enums.ModoOperacaoEnum;
import static Views.Enums.ModoOperacaoEnum.CADASTRAR;
import static Views.Enums.ModoOperacaoEnum.DELETAR;
import static Views.Enums.ModoOperacaoEnum.EDITAR;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;

public class TelaUsuarioView extends javax.swing.JInternalFrame {

    private ModoOperacaoEnum modo;

    public TelaUsuarioView(ModoOperacaoEnum modo) {
        initComponents();
        definirModo(modo);
        limparCampos();
        limparMensagensErro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_Confirmar = new javax.swing.JButton();
        pnl_Id = new javax.swing.JPanel();
        lbl_Id = new javax.swing.JLabel();
        txtf_Id = new javax.swing.JTextField();
        pnl_Pesquisa = new javax.swing.JPanel();
        lbl_Pesquisa = new javax.swing.JLabel();
        spn_Pesquisa = new javax.swing.JSpinner();
        btn_Pesquisar = new javax.swing.JButton();
        lblw_Pesquisa = new javax.swing.JLabel();
        btn_Confirmar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        pnl_DadosUsuarios = new javax.swing.JPanel();
        lbl_Nome = new javax.swing.JLabel();
        txtf_Nome = new javax.swing.JTextField();
        lblw_Nome = new javax.swing.JLabel();
        lbl_Senha = new javax.swing.JLabel();
        ptxtf_Senha = new javax.swing.JPasswordField();
        lbl_Perfil = new javax.swing.JLabel();
        cb_Perfil = new javax.swing.JComboBox<>();
        lblw_Senha = new javax.swing.JLabel();
        pnl_Usuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Usuarios = new javax.swing.JTable();

        jb_Confirmar.setText("Confirmar");
        jb_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ConfirmarActionPerformed(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        pnl_DadosUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Usuários"));

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

        lbl_Senha.setText("Senha");

        ptxtf_Senha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ptxtf_SenhaFocusGained(evt);
            }
        });
        ptxtf_Senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ptxtf_SenhaKeyPressed(evt);
            }
        });

        lbl_Perfil.setText("Perfil");

        cb_Perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NORMAL", "ADMIN" }));

        lblw_Senha.setForeground(new java.awt.Color(255, 0, 0));
        lblw_Senha.setText("* Senha não pode ser nula");

        javax.swing.GroupLayout pnl_DadosUsuariosLayout = new javax.swing.GroupLayout(pnl_DadosUsuarios);
        pnl_DadosUsuarios.setLayout(pnl_DadosUsuariosLayout);
        pnl_DadosUsuariosLayout.setHorizontalGroup(
            pnl_DadosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DadosUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_DadosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_DadosUsuariosLayout.createSequentialGroup()
                        .addGroup(pnl_DadosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_Nome)
                            .addComponent(txtf_Nome)
                            .addComponent(lblw_Nome)
                            .addComponent(lbl_Senha)
                            .addComponent(ptxtf_Senha, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_DadosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Perfil)
                            .addComponent(cb_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(pnl_DadosUsuariosLayout.createSequentialGroup()
                        .addComponent(lblw_Senha)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnl_DadosUsuariosLayout.setVerticalGroup(
            pnl_DadosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DadosUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_DadosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nome)
                    .addComponent(lbl_Perfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_DadosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblw_Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptxtf_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblw_Senha)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnl_Usuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários"));

        tb_Usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Perfil"
            }
        ));
        jScrollPane1.setViewportView(tb_Usuarios);

        javax.swing.GroupLayout pnl_UsuariosLayout = new javax.swing.GroupLayout(pnl_Usuarios);
        pnl_Usuarios.setLayout(pnl_UsuariosLayout);
        pnl_UsuariosLayout.setHorizontalGroup(
            pnl_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_UsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_UsuariosLayout.setVerticalGroup(
            pnl_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_UsuariosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_Id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Confirmar))
                    .addComponent(pnl_DadosUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_Pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_DadosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        UsuarioModel usuarioEncontrado = filtrarUsuario(idPesquisa);

        if (usuarioEncontrado != null) {
            configurarCampos(usuarioEncontrado);
        } else {
            lblw_Pesquisa.setVisible(Boolean.TRUE);
        }
    }//GEN-LAST:event_btn_PesquisarActionPerformed

    private void jb_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ConfirmarActionPerformed
        switch (this.modo) {
            case CADASTRAR:
                cadastrarUsuario();
                break;
            case EDITAR:
                editarUsuario();
                break;
            case DELETAR:
                deletarUsuario();
                break;
        }
    }//GEN-LAST:event_jb_ConfirmarActionPerformed

    private void btn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmarActionPerformed
        confirmarAcao();
    }//GEN-LAST:event_btn_ConfirmarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void txtf_NomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtf_NomeFocusGained
        lblw_Nome.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_txtf_NomeFocusGained

    private void ptxtf_SenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ptxtf_SenhaFocusGained
        lblw_Senha.setVisible(Boolean.FALSE);
    }//GEN-LAST:event_ptxtf_SenhaFocusGained

    private void txtf_NomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtf_NomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //Clique na tecla enter
            confirmarAcao();
        }
    }//GEN-LAST:event_txtf_NomeKeyPressed

    private void ptxtf_SenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ptxtf_SenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //Clique na tecla enter
            confirmarAcao();
        }
    }//GEN-LAST:event_ptxtf_SenhaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Confirmar;
    private javax.swing.JButton btn_Pesquisar;
    private javax.swing.JComboBox<String> cb_Perfil;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Confirmar;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_Nome;
    private javax.swing.JLabel lbl_Perfil;
    private javax.swing.JLabel lbl_Pesquisa;
    private javax.swing.JLabel lbl_Senha;
    private javax.swing.JLabel lblw_Nome;
    private javax.swing.JLabel lblw_Pesquisa;
    private javax.swing.JLabel lblw_Senha;
    private javax.swing.JPanel pnl_DadosUsuarios;
    private javax.swing.JPanel pnl_Id;
    private javax.swing.JPanel pnl_Pesquisa;
    private javax.swing.JPanel pnl_Usuarios;
    private javax.swing.JPasswordField ptxtf_Senha;
    private javax.swing.JSpinner spn_Pesquisa;
    private javax.swing.JTable tb_Usuarios;
    private javax.swing.JTextField txtf_Id;
    private javax.swing.JTextField txtf_Nome;
    // End of variables declaration//GEN-END:variables

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

    private void configurarTelaCadastro() {
        setTitle("Cadastrando Usuário");

        pnl_Id.setVisible(Boolean.FALSE);
        pnl_Pesquisa.setVisible(Boolean.FALSE);
        pnl_Usuarios.setVisible(Boolean.FALSE);

        setSize(600, 545);
        setMinimumSize(new java.awt.Dimension(600, 545));
        setPreferredSize(new java.awt.Dimension(600, 545));

        jb_Confirmar.setText("Cadastrar");
    }

    private void configurarTelaLeitura() {
        setTitle("Listando Usuários");

        pnl_DadosUsuarios.setVisible(Boolean.FALSE);
        pnl_Id.setVisible(Boolean.FALSE);
        pnl_Pesquisa.setVisible(Boolean.FALSE);

        setSize(600, 545);
        setMinimumSize(new java.awt.Dimension(600, 545));
        setPreferredSize(new java.awt.Dimension(600, 545));

        btn_Confirmar.setVisible(Boolean.FALSE);
        btn_Cancelar.setVisible(Boolean.FALSE);

        configurarTabela();
    }

    private void configurarTelaEdicao() {
        setTitle("Editando Usuário");

        pnl_DadosUsuarios.setVisible(Boolean.FALSE);
        pnl_Usuarios.setVisible(Boolean.FALSE);

        setSize(600, 545);
        setMinimumSize(new java.awt.Dimension(600, 545));
        setPreferredSize(new java.awt.Dimension(600, 545));

        jb_Confirmar.setText("Editar");
        jb_Confirmar.setVisible(Boolean.FALSE);
    }

    private void configurarTelaExclusao() {
        setTitle("Deletando Usuário");

        pnl_DadosUsuarios.setVisible(Boolean.FALSE);
        pnl_Usuarios.setVisible(Boolean.FALSE);

        setSize(600, 545);
        setMinimumSize(new java.awt.Dimension(600, 545));
        setPreferredSize(new java.awt.Dimension(600, 545));

        jb_Confirmar.setText("Deletar");
        jb_Confirmar.setVisible(Boolean.FALSE);
    }

    private void configurarTabela() {
        UsuarioController usuarioController = new UsuarioController();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nome");
        modelo.addColumn("Perfil");

        ArrayList<UsuarioModel> usuariosListados = usuarioController.listarUsuariosController();

        for (UsuarioModel um : usuariosListados) {
            modelo.addRow(new Object[]{
                um.getId(),
                um.getNome(),
                um.getPerfil()
            });
        }

        tb_Usuarios.setModel(modelo);
    }

    private void limparCampos() {
        txtf_Nome.setText("");
        ptxtf_Senha.setText("");
    }

    private void limparMensagensErro() {
        lblw_Nome.setVisible(Boolean.FALSE);
        lblw_Senha.setVisible(Boolean.FALSE);
        lblw_Pesquisa.setVisible(Boolean.FALSE);
    }

    private UsuarioModel filtrarUsuario(int idPesquisa) {
        UsuarioController categoriaController = new UsuarioController();
        UsuarioModel categoriaObtida = categoriaController.buscarUsuarioPorIdController(idPesquisa);
        return categoriaObtida;
    }

    private void configurarCampos(UsuarioModel usuarioEncontrado) {
        pnl_Id.setVisible(Boolean.TRUE);
        pnl_DadosUsuarios.setVisible(Boolean.TRUE);
        btn_Confirmar.setVisible(Boolean.TRUE);

        txtf_Id.setText(String.valueOf(usuarioEncontrado.getId()));
        txtf_Nome.setText(usuarioEncontrado.getNome());

        if (this.modo == ModoOperacaoEnum.DELETAR) {
            for (Component c : pnl_DadosUsuarios.getComponents()) {
                c.setEnabled(Boolean.FALSE);
            }
        }
    }

    private void cadastrarUsuario() {
        UsuarioController usuarioController = new UsuarioController();

        if (verificarCampos()) {
            String nome = txtf_Nome.getText();
            String senha = String.valueOf(ptxtf_Senha.getPassword());
            String perfilSelecionado = cb_Perfil.getSelectedItem().toString();

            PerfilEnum perfil = PerfilEnum.valueOf(perfilSelecionado);
            usuarioController.cadastrarUsuarioController(nome, senha, perfil);

            for (JInternalFrame frame : getDesktopPane().getAllFrames()) {
                if (frame instanceof TelaUsuarioView) {
                    TelaUsuarioView tela = (TelaUsuarioView) frame;
                    if (tela.modo == ModoOperacaoEnum.VER) {
                        tela.configurarTabela();
                    }
                }
            }
            dispose();
        }
    }

    private void editarUsuario() {
        UsuarioController usuarioController = new UsuarioController();

        if (verificarCampos()) {
            int id = Integer.parseInt(txtf_Id.getText().toString());
            String nome = txtf_Nome.getText().toString();
            String senha = String.valueOf(ptxtf_Senha.getPassword());
            String perfilSelecionado = cb_Perfil.getSelectedItem().toString();
            PerfilEnum perfil = PerfilEnum.valueOf(perfilSelecionado);

            usuarioController.alterarUsuarioController(id, nome, senha, perfil);

            for (JInternalFrame frame : getDesktopPane().getAllFrames()) {
                if (frame instanceof TelaUsuarioView) {
                    TelaUsuarioView tela = (TelaUsuarioView) frame;
                    if (tela.modo == ModoOperacaoEnum.VER) {
                        tela.configurarTabela();
                    }
                }
            }
        }

    }

    private void deletarUsuario() {
        UsuarioController usuarioController = new UsuarioController();

        int id = Integer.parseInt(txtf_Id.getText().toString());

        usuarioController.excluirUsuarioController(id);

        for (JInternalFrame frame : getDesktopPane().getAllFrames()) {
            if (frame instanceof TelaUsuarioView) {
                TelaUsuarioView tela = (TelaUsuarioView) frame;
                if (tela.modo == ModoOperacaoEnum.VER) {
                    tela.configurarTabela();
                }
            }
        }
    }

    private void confirmarAcao() {
        switch (this.modo) {
            case CADASTRAR:
                cadastrarUsuario();
                break;
            case EDITAR:
                editarUsuario();
                break;
            case DELETAR:
                deletarUsuario();
                break;
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

        String senha = String.valueOf(ptxtf_Senha.getPassword());

        if (senha == null || senha.isEmpty()) {
            lblw_Senha.setText("*Senha não pode estar vazia.");
            lblw_Senha.setVisible(Boolean.TRUE);
            camposCorretos = false;
        }
        return camposCorretos;
    }
}
