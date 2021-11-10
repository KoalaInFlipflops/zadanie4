package kt.log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;


public class GUI implements ActionListener {

    static Dane dane = new Dane();

    private static  JLabel userLabel;
    private static JTextField usernameField;
    private static JLabel passwordLabel;
    private static JPasswordField passwordField;
    private static JButton logInButton;
    private static JPanel panel;
    private static JFrame frame;
    private static JButton cancelButton;


    public void openGui(){

        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(680,428);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        usernameField = new JTextField(25);
        usernameField.setBounds(100,20,165,25);
        panel.add(usernameField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(25);
        passwordField.setBounds(100,50,165,25);
        panel.add(passwordField);

        logInButton = new JButton("Log In");
        logInButton.setBounds(100,80,165,25);
        logInButton.addActionListener(new GUI());
        panel.add(logInButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(100,110,165,25);
        panel.add(cancelButton);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String user = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());

        if(dane.userLogs.containsKey(user) && dane.userLogs.get(user).equals(password)){
            panel.setBackground(Color.green);
        } else{
            panel.setBackground(Color.red);
        }
    }
}
