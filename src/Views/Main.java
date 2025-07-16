package Views;

import Utils.DBInit;

public class Main {

    public static void main(String[] args) {
        DBInit db = new DBInit();
        db.inicializar();
        
        TelaLoginView telaLogin = new TelaLoginView();
        telaLogin.setLocationRelativeTo(null);
        telaLogin.setVisible(true);
    }
}
