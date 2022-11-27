package rip.aspect.login;

/*
    Code by Aspect @ Uprising Studios
    Project: login
    Date: 11/27/2022 @ 5:55 PM
*/

import rip.aspect.login.utils.Interface;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;

public class LoginPage extends Interface implements ActionListener {

    HashMap<String, String> credentials;

    public LoginPage(HashMap<String, String> original) {
        credentials = original;
    }

    public void launch() {

        JFrame frame = new JFrame();
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
                frame.dispose();
            }
        });

        title = new JLabel();
        title.setText("MOONLIGHT");
        title.setFont(new Font("Impact", Font.PLAIN, 64));
        title.setBounds(70, 20, 350, 70);

        lowerTitle = new JLabel();
        lowerTitle.setText("LAUNCHER");
        lowerTitle.setFont(new Font("Impact", Font.PLAIN, 24));
        lowerTitle.setBounds(165, 82, 100, 30);

        username = new JLabel();
        username.setText("Username:");
        username.setFont(new Font(null, Font.BOLD, 13));
        username.setBounds(50, 150, 125, 25);
        username.setForeground(Color.WHITE);

        password = new JLabel();
        password.setText("Password:");
        password.setFont(new Font(null, Font.BOLD, 13));
        password.setBounds(50, 300, 125, 25);
        password.setForeground(Color.WHITE);

        player_username = new JTextField();
        player_username.setBounds(50, 175, 330, 40);
        player_username.setBackground(new Color(48, 48, 48));
        player_username.setBorder(new LineBorder(Color.GRAY, 2));
        player_username.setFont(new Font("Calibri", Font.PLAIN, 18));
        player_username.setForeground(Color.WHITE);

        player_password = new JPasswordField();
        player_password.setBounds(50, 325, 330, 40);
        player_password.setBackground(new Color(48, 48, 48));
        player_password.setBorder(new LineBorder(Color.GRAY, 2));
        player_password.setFont(new Font("Calibri", Font.PLAIN, 22));
        player_password.setForeground(Color.WHITE);

        password_notifs = new JLabel();
        password_notifs.setBounds(50, 365, 300, 20);

        username_notifs = new JLabel();
        username_notifs.setBounds(50, 215, 300, 20);

        correct_password_notifs = new JLabel();
        correct_password_notifs.setBounds(185, 330, 200, 200);

        login = new JButton();
        login.setText("LOGIN");
        login.setFont(new Font("Impact", Font.BOLD, 32));
        login.setBounds(157, 450, 120, 60);
        login.setBorder(new LineBorder(Color.GRAY, 2));
        login.setFocusable(false);
        login.addActionListener(this);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(69, 69, 69));
        frame.setResizable(false);
        frame.setTitle("Moonlight Launcher");
        frame.setLayout(null);

        frame.add(title);
        frame.add(lowerTitle);
        frame.add(username);
        frame.add(password);
        frame.add(player_username);
        frame.add(player_password);
        frame.add(login);
        frame.add(username_notifs);
        frame.add(password_notifs);
        frame.add(correct_password_notifs);

        frame.pack();

        frame.setSize(new Dimension(440, 600));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String inputUsername = player_username.getText();
        String inputPassword = String.valueOf(player_password.getPassword());

        if (e.getSource() == login) {

            if (credentials.containsKey(inputUsername)) {

                if (credentials.get(inputUsername).equals(inputPassword)) {
                    correct_password_notifs.setForeground(Color.GREEN);
                    correct_password_notifs.setText("Authorized!");
                    username_notifs.setText(null);
                    player_password.setText(null);

                } else {
                    password_notifs.setForeground(Color.RED);
                    password_notifs.setText("Invalid password! Try again later.");
                    username_notifs.setText(null);
                    player_password.setText(null);
                }
            } else {
                username_notifs.setForeground(Color.RED);
                username_notifs.setText("Invalid username! Try again later.");
                player_username.setText(null);
                password_notifs.setText(null);
            }
        }
    }
}