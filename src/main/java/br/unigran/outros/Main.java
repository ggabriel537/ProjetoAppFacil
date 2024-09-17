package br.unigran.outros;

import br.unigran.views.TelaZero.TelaZero;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        boolean status = false;

        LoginDao LC = new LoginDao();
        List<Login> loginList = LC.getListaDados();
        for (Login loginL : loginList) {
            if (loginL.getLogin() != null) {
                status = true;
                if (loginL.getSenha() != null) {
                    status = true;
                }
            }
        }
        if (status == true) {
//            new TelaLogin().setVisible(true);
        } else {
//            new TelaZero().setVisible(true);
        }
        */
        new TelaZero().setVisible(true);
    }
}