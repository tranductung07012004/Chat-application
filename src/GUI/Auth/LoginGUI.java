package GUI.Auth;

import GUI.MainFrameGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginGUI extends JPanel {

    public LoginGUI(MainFrameGUI mainFrame) {

        // Define the label for login screen
        JLabel screenName = new JLabel("LOGIN");
        screenName.setBounds(315, 80, 95, 50);
        screenName.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        screenName.setForeground(Color.BLUE);


        // Define the account name input
        JTextField accountName = new JTextField();
        accountName.setBounds(200, 150, 300, 30);
        JLabel accLabel = new JLabel("Username:");
        accLabel.setBounds(130, 150, 100, 30);

        // Define the password field
        JPasswordField passField = new JPasswordField();
        passField.setBounds(200, 200, 300, 30);
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(130, 200, 100, 30);

        // Define the properties for login button
        JButton loginBtn = new JButton("OK!");
        loginBtn.setBounds(247, 300, 95, 40);

        // Define the properties for register button
        JButton registerBtn = new JButton("Register ?");
        registerBtn.setBounds(347, 300, 95, 40);

        // Define the properties for admin button
        JButton adminBtn = new JButton("Administrator ?");
        adminBtn.setBounds(247, 350, 95 * 2 + 5, 40);

        // Add listener
        registerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.showRegisterPanel();
            }
        });

        adminBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  { mainFrame.showVerifyAdminGUIPanel(); }
        });

        // Add the components above to the JFrame window
        add(registerBtn);
        add(loginBtn);
        add(passLabel);
        add(passField);
        add(accountName);
        add(accLabel);
        add(screenName);
        add(adminBtn);

        setSize(700, 500);
        setLayout(null);
    }

}




