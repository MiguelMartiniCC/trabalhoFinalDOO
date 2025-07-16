package Views;

import Controllers.UsuarioController;
import Models.UsuarioModel;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaLoginView extends javax.swing.JFrame {

    public TelaLoginView() {
        initComponents();
        configurarLookAndFeel();
        limparCampos();
        limparMensagensErro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Login = new javax.swing.JPanel();
        lbl_Login = new javax.swing.JLabel();
        txtf_Login = new javax.swing.JTextField();
        lblw_Login = new javax.swing.JLabel();
        lbl_Senha = new javax.swing.JLabel();
        lblw_Senha = new javax.swing.JLabel();
        btn_Entrar = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        ptxtf_Senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AccountManager - Login");
        setFocusable(false);
        setResizable(false);
        setSize(new java.awt.Dimension(350, 250));

        lbl_Login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_Login.setText("Login");

        txtf_Login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtf_LoginFocusGained(evt);
            }
        });
        txtf_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtf_LoginKeyPressed(evt);
            }
        });

        lblw_Login.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblw_Login.setForeground(new java.awt.Color(255, 0, 0));
        lblw_Login.setText("* Forneça um valor para o campo 'Login'");

        lbl_Senha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_Senha.setText("Senha");

        lblw_Senha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblw_Senha.setForeground(new java.awt.Color(255, 0, 0));
        lblw_Senha.setText("* Forneça um valor para o campo 'Senha'");

        btn_Entrar.setText("Entrar");
        btn_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntrarActionPerformed(evt);
            }
        });

        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pnl_LoginLayout = new javax.swing.GroupLayout(pnl_Login);
        pnl_Login.setLayout(pnl_LoginLayout);
        pnl_LoginLayout.setHorizontalGroup(
            pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_LoginLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_LoginLayout.createSequentialGroup()
                        .addComponent(btn_Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Entrar))
                    .addGroup(pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtf_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Login)
                        .addComponent(lblw_Login)
                        .addComponent(lbl_Senha)
                        .addComponent(ptxtf_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblw_Senha)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnl_LoginLayout.setVerticalGroup(
            pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtf_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblw_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptxtf_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblw_Senha)
                .addGap(33, 33, 33)
                .addGroup(pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Entrar)
                    .addComponent(btn_Limpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntrarActionPerformed
        logarUsuario();
    }//GEN-LAST:event_btn_EntrarActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        limparCampos();
        limparMensagensErro();
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void txtf_LoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtf_LoginFocusGained
        lblw_Login.setVisible(false);
    }//GEN-LAST:event_txtf_LoginFocusGained

    private void ptxtf_SenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ptxtf_SenhaFocusGained
        lblw_Senha.setVisible(false);
    }//GEN-LAST:event_ptxtf_SenhaFocusGained

    private void txtf_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtf_LoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //Clique na tecla enter
            logarUsuario();
        }
    }//GEN-LAST:event_txtf_LoginKeyPressed

    private void ptxtf_SenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ptxtf_SenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //Clique na tecla enter
            logarUsuario();
        }
    }//GEN-LAST:event_ptxtf_SenhaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Entrar;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JLabel lbl_Login;
    private javax.swing.JLabel lbl_Senha;
    private javax.swing.JLabel lblw_Login;
    private javax.swing.JLabel lblw_Senha;
    private javax.swing.JPanel pnl_Login;
    private javax.swing.JPasswordField ptxtf_Senha;
    private javax.swing.JTextField txtf_Login;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        txtf_Login.setText("");
        ptxtf_Senha.setText("");
    }

    private void limparMensagensErro() {
        lblw_Login.setVisible(false);
        lblw_Senha.setVisible(false);
    }

    private boolean verificarCampos() {
        boolean camposCorretos = true;

        String login = txtf_Login.getText();
        String senha = String.valueOf(ptxtf_Senha.getPassword());

        if (login == null || login.isEmpty()) {
            lblw_Login.setText("*'Login' não pode estar vazio.");
            lblw_Login.setVisible(Boolean.TRUE);
            camposCorretos = false;
        }

        if (senha == null || senha.isEmpty()) {
            lblw_Senha.setText("*'Senha' não pode estar vazia.");
            lblw_Senha.setVisible(Boolean.TRUE);
            camposCorretos = false;
        }

        return camposCorretos;
    }

    private void logarUsuario() {
        if (verificarCampos()) {
            UsuarioController usuarioLogin = new UsuarioController();
            String login = txtf_Login.getText();
            String senha = String.valueOf(ptxtf_Senha.getPassword());

            UsuarioModel usuarioEncontrado;
            try {
                usuarioEncontrado = usuarioLogin.logarUsuarioController(login, senha);
                
                if (usuarioEncontrado != null) {
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                    TelaPrincipalView tela = new TelaPrincipalView(usuarioEncontrado.getPerfil());
                    tela.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou senha incorretos, tente novamente!");
                    txtf_Login.setText("");
                    ptxtf_Senha.setText("");
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados.");
            }
        }
    }

    private void configurarLookAndFeel() {
        try {
            javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            javax.swing.SwingUtilities.updateComponentTreeUI(this); // Atualiza L&F da tela atual (opcional)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
