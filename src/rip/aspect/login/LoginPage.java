package rip.aspect.login;

/*
    Code by Aspect @ Uprising Studios
    Project: login
    Date: 11/27/2022 @ 5:55 PM
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    HashMap<String, String> credentials;

    public LoginPage(HashMap<String, String> original) {
        credentials = original;
    }

    public void launch() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
