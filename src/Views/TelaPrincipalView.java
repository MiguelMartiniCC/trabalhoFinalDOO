package Views;

import Models.Enums.PerfilEnum;
import Views.Enums.ModoOperacaoEnum;

public class TelaPrincipalView extends javax.swing.JFrame {

    PerfilEnum perfil;

    public TelaPrincipalView(PerfilEnum perfil) {
        this.perfil = perfil;
        initComponents();
        configurarComponentes();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dp_Principal = new javax.swing.JDesktopPane();
        mnb_Principal = new javax.swing.JMenuBar();
        mn_Inicio = new javax.swing.JMenu();
        mni_Logout = new javax.swing.JMenuItem();
        mn_Usuarios = new javax.swing.JMenu();
        mni_CadastrarUsuario = new javax.swing.JMenuItem();
        mni_EditarUsuario = new javax.swing.JMenuItem();
        mni_VerUsuarios = new javax.swing.JMenuItem();
        mni_DeletarUsuario = new javax.swing.JMenuItem();
        mn_Categorias = new javax.swing.JMenu();
        mni_CriarCategoria = new javax.swing.JMenuItem();
        mni_EditarCategoria = new javax.swing.JMenuItem();
        mni_VerCategorias = new javax.swing.JMenuItem();
        mni_DeletarCategoria = new javax.swing.JMenuItem();
        mn_Contas = new javax.swing.JMenu();
        mni_CadastrarConta = new javax.swing.JMenuItem();
        mni_EditarConta = new javax.swing.JMenuItem();
        mni_VerContas = new javax.swing.JMenuItem();
        mni_DeletarConta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AccountManager - Home");

        javax.swing.GroupLayout dp_PrincipalLayout = new javax.swing.GroupLayout(dp_Principal);
        dp_Principal.setLayout(dp_PrincipalLayout);
        dp_PrincipalLayout.setHorizontalGroup(
            dp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        dp_PrincipalLayout.setVerticalGroup(
            dp_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        mn_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        mn_Inicio.setText("Início");

        mni_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/quit.png"))); // NOI18N
        mni_Logout.setText("Logout");
        mni_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_LogoutActionPerformed(evt);
            }
        });
        mn_Inicio.add(mni_Logout);

        mnb_Principal.add(mn_Inicio);

        mn_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/users.png"))); // NOI18N
        mn_Usuarios.setText("Usuários");

        mni_CadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/create.png"))); // NOI18N
        mni_CadastrarUsuario.setText("Cadastrar");
        mni_CadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_CadastrarUsuarioActionPerformed(evt);
            }
        });
        mn_Usuarios.add(mni_CadastrarUsuario);

        mni_EditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        mni_EditarUsuario.setText("Editar");
        mni_EditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_EditarUsuarioActionPerformed(evt);
            }
        });
        mn_Usuarios.add(mni_EditarUsuario);

        mni_VerUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/read.png"))); // NOI18N
        mni_VerUsuarios.setText("Ler");
        mni_VerUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_VerUsuariosActionPerformed(evt);
            }
        });
        mn_Usuarios.add(mni_VerUsuarios);

        mni_DeletarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        mni_DeletarUsuario.setText("Deletar");
        mni_DeletarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_DeletarUsuarioActionPerformed(evt);
            }
        });
        mn_Usuarios.add(mni_DeletarUsuario);

        mnb_Principal.add(mn_Usuarios);

        mn_Categorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/category.png"))); // NOI18N
        mn_Categorias.setText("Categorias");

        mni_CriarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/create.png"))); // NOI18N
        mni_CriarCategoria.setText("Criar");
        mni_CriarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_CriarCategoriaActionPerformed(evt);
            }
        });
        mn_Categorias.add(mni_CriarCategoria);

        mni_EditarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        mni_EditarCategoria.setText("Editar");
        mni_EditarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_EditarCategoriaActionPerformed(evt);
            }
        });
        mn_Categorias.add(mni_EditarCategoria);

        mni_VerCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/read.png"))); // NOI18N
        mni_VerCategorias.setText("Ver");
        mni_VerCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_VerCategoriasActionPerformed(evt);
            }
        });
        mn_Categorias.add(mni_VerCategorias);

        mni_DeletarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        mni_DeletarCategoria.setText("Deletar");
        mni_DeletarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_DeletarCategoriaActionPerformed(evt);
            }
        });
        mn_Categorias.add(mni_DeletarCategoria);

        mnb_Principal.add(mn_Categorias);

        mn_Contas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account.png"))); // NOI18N
        mn_Contas.setText("Contas");

        mni_CadastrarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/create.png"))); // NOI18N
        mni_CadastrarConta.setText("Cadastrar");
        mn_Contas.add(mni_CadastrarConta);

        mni_EditarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        mni_EditarConta.setText("Editar");
        mn_Contas.add(mni_EditarConta);

        mni_VerContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/read.png"))); // NOI18N
        mni_VerContas.setText("Ver");
        mn_Contas.add(mni_VerContas);

        mni_DeletarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        mni_DeletarConta.setText("Deletar");
        mn_Contas.add(mni_DeletarConta);

        mnb_Principal.add(mn_Contas);

        setJMenuBar(mnb_Principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp_Principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp_Principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mni_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_LogoutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mni_LogoutActionPerformed

    private void mni_CadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_CadastrarUsuarioActionPerformed
        TelaUsuarioView telaProdutoView = new TelaUsuarioView(ModoOperacaoEnum.CADASTRAR);
        dp_Principal.add(telaProdutoView);
        telaProdutoView.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_mni_CadastrarUsuarioActionPerformed

    private void mni_EditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_EditarUsuarioActionPerformed
        TelaUsuarioView telaProdutoView = new TelaUsuarioView(ModoOperacaoEnum.EDITAR);
        dp_Principal.add(telaProdutoView);
        telaProdutoView.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_mni_EditarUsuarioActionPerformed

    private void mni_VerUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_VerUsuariosActionPerformed
        TelaUsuarioView telaProdutoView = new TelaUsuarioView(ModoOperacaoEnum.VER);
        dp_Principal.add(telaProdutoView);
        telaProdutoView.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_mni_VerUsuariosActionPerformed

    private void mni_CriarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_CriarCategoriaActionPerformed
        TelaCategoriaView telaCategoriaView = new TelaCategoriaView(ModoOperacaoEnum.CADASTRAR);
        dp_Principal.add(telaCategoriaView);
        telaCategoriaView.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_mni_CriarCategoriaActionPerformed

    private void mni_EditarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_EditarCategoriaActionPerformed
        TelaCategoriaView telaCategoriaView = new TelaCategoriaView(ModoOperacaoEnum.EDITAR);
        dp_Principal.add(telaCategoriaView);
        telaCategoriaView.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_mni_EditarCategoriaActionPerformed

    private void mni_VerCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_VerCategoriasActionPerformed
        TelaCategoriaView telaCategoriaView = new TelaCategoriaView(ModoOperacaoEnum.VER);
        dp_Principal.add(telaCategoriaView);
        telaCategoriaView.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_mni_VerCategoriasActionPerformed

    private void mni_DeletarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_DeletarCategoriaActionPerformed
        TelaCategoriaView telaCategoriaView = new TelaCategoriaView(ModoOperacaoEnum.DELETAR);
        dp_Principal.add(telaCategoriaView);
        telaCategoriaView.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_mni_DeletarCategoriaActionPerformed

    private void mni_DeletarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_DeletarUsuarioActionPerformed
        TelaUsuarioView telaProdutoView = new TelaUsuarioView(ModoOperacaoEnum.DELETAR);
        dp_Principal.add(telaProdutoView);
        telaProdutoView.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_mni_DeletarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dp_Principal;
    private javax.swing.JMenu mn_Categorias;
    private javax.swing.JMenu mn_Contas;
    private javax.swing.JMenu mn_Inicio;
    private javax.swing.JMenu mn_Usuarios;
    private javax.swing.JMenuBar mnb_Principal;
    private javax.swing.JMenuItem mni_CadastrarConta;
    private javax.swing.JMenuItem mni_CadastrarUsuario;
    private javax.swing.JMenuItem mni_CriarCategoria;
    private javax.swing.JMenuItem mni_DeletarCategoria;
    private javax.swing.JMenuItem mni_DeletarConta;
    private javax.swing.JMenuItem mni_DeletarUsuario;
    private javax.swing.JMenuItem mni_EditarCategoria;
    private javax.swing.JMenuItem mni_EditarConta;
    private javax.swing.JMenuItem mni_EditarUsuario;
    private javax.swing.JMenuItem mni_Logout;
    private javax.swing.JMenuItem mni_VerCategorias;
    private javax.swing.JMenuItem mni_VerContas;
    private javax.swing.JMenuItem mni_VerUsuarios;
    // End of variables declaration//GEN-END:variables

    private void configurarComponentes() {
        setTitle("AccountManager - Home (" + this.perfil + ")");

        if (this.perfil.name().equalsIgnoreCase("NORMAL")) {
            mn_Usuarios.setEnabled(Boolean.FALSE);
            mn_Categorias.setEnabled(Boolean.FALSE);
        }
    }
}
