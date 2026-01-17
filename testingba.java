import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class testingba {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("GUI");
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // second frame
        JFrame frame1 = new JFrame("New Frame");
        frame1.setSize(800, 800);
        frame1.setLocationRelativeTo(null);
        frame1.setResizable(false);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.blue);
        panel2.setLayout(null);
        frame1.add(panel2);

        JLabel bglbl2 = new JLabel();
        bglbl2.setBounds(0, 0, 800, 800);
        ImageIcon bgimg2 = new ImageIcon("bulay1.png");
        bglbl2.setIcon(bgimg2);
        panel2.add(bglbl2);

        JLabel label2 = new JLabel("SDAO & DO MANAGEMENT SYSTEM");
        label2.setBounds(50, 70, 800, 50);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 40));
        label2.setForeground(Color.black);
        bglbl2.add(label2);

        frame1.setVisible(false);
        frame1.setResizable(false);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.blue);
        panel1.setLayout(null);
        frame.add(panel1);

        // third frame
        JFrame frame2 = new JFrame("Register Module");
        frame2.setSize(800, 800);
        frame2.setLocationRelativeTo(null);
        frame2.setResizable(false);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.lightGray);
        panel3.setLayout(null);
        frame2.add(panel3);

        JLabel bglbl3 = new JLabel();
        bglbl3.setBounds(0, 0, 800, 800);
        ImageIcon bgimg3 = new ImageIcon("bulay2.png");
        bglbl3.setIcon(bgimg3);
        panel3.add(bglbl3);

        JLabel labelA = new JLabel("Name:");
        labelA.setBounds(80, 150, 200, 30);
        labelA.setFont(new Font("Arial", Font.BOLD, 30));
        labelA.setForeground(Color.black);
        bglbl3.add(labelA);

        JLabel labelB = new JLabel("Age:");
        labelB.setBounds(80, 250, 200, 35);
        labelB.setFont(new Font("Arial", Font.BOLD, 30));
        labelB.setForeground(Color.black);
        bglbl3.add(labelB);

        JLabel labelC = new JLabel("Address:");
        labelC.setBounds(80, 350, 200, 30);
        labelC.setFont(new Font("Arial", Font.BOLD, 30));
        labelC.setForeground(Color.black);
        bglbl3.add(labelC);

        JLabel labelD = new JLabel("Occupation:");
        labelD.setBounds(80, 450, 200, 30);
        labelD.setFont(new Font("Arial", Font.BOLD, 30));
        labelD.setForeground(Color.black);
        bglbl3.add(labelD);

        JLabel lblA = new JLabel("__________________");
        lblA.setBounds(500, 150, 600, 30);
        lblA.setFont(new Font("Arial", Font.BOLD, 20));
        lblA.setForeground(Color.black);
        bglbl3.add(lblA);

        JLabel lblB = new JLabel("__________________");
        lblB.setBounds(500, 250, 600, 30);
        lblB.setFont(new Font("Arial", Font.BOLD, 20));
        lblB.setForeground(Color.black);
        bglbl3.add(lblB);

        JLabel lblC = new JLabel("___________________");
        lblC.setBounds(500, 350, 600, 30);
        lblC.setFont(new Font("Arial", Font.BOLD, 20));
        lblC.setForeground(Color.black);
        bglbl3.add(lblC);

        JLabel lblD = new JLabel("___________________");
        lblD.setBounds(500, 450, 600, 30);
        lblD.setFont(new Font("Arial", Font.BOLD, 20));
        lblD.setForeground(Color.black);
        bglbl3.add(lblD);

        JTextField textFieldA = new JTextField();
        textFieldA.setBounds(260, 150, 200, 30);
        bglbl3.add(textFieldA);

        JTextField textFieldB = new JTextField();
        textFieldB.setBounds(260, 250, 200, 30);
        bglbl3.add(textFieldB);

        JTextField textFieldC = new JTextField();
        textFieldC.setBounds(260, 350, 200, 30);
        bglbl3.add(textFieldC);

        JTextField textFieldD = new JTextField();
        textFieldD.setBounds(260, 450, 200, 30);
        bglbl3.add(textFieldD);

        JButton backBtn = new JButton("Back");
        backBtn.setBounds(430, 570, 100, 60);
        bglbl3.add(backBtn);

        ActionListener btnlistener5 = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                int choice = 0;
                 if (choice == 0) {
                    frame2.setVisible(false);
                    frame1.setVisible(true);
                    frame.setVisible(false);
                }
            }
        };

        backBtn.addActionListener(btnlistener5);

        JButton saveB = new JButton("Save");
        saveB.setBounds(100, 570, 100, 60);
        bglbl3.add(saveB);

        ActionListener btnlistener8 = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                lblA.setText(textFieldA.getText());
                lblB.setText(textFieldB.getText());
                lblC.setText(textFieldC.getText());
                lblD.setText(textFieldD.getText());
                textFieldA.setText("");
                textFieldB.setText("");
                textFieldC.setText("");
                textFieldD.setText("");

            }
        };

        saveB.addActionListener(btnlistener8);

        JButton clearB = new JButton("Clear");
        clearB.setBounds(260, 570, 100, 60);
        bglbl3.add(clearB);

        ActionListener btnlistener7 = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                lblA.setText("___________________");
                lblB.setText("___________________");
                lblC.setText("___________________");
                lblD.setText("___________________");
            }
        };

        clearB.addActionListener(btnlistener7);

        JButton exitB = new JButton("Exit");
        exitB.setBounds(590, 570, 100, 60);
        bglbl3.add(exitB);

        ActionListener btnlistener6 = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
                if (choice == 0) {
                    frame1.setVisible(false);
                    frame.setVisible(true);
                    frame2.setVisible(false);
                }
            }
        };

        exitB.addActionListener(btnlistener6);


        // for second frame
        JButton regMod = new JButton("Register Module");
        regMod.setBounds(100, 150, 130, 50);
        bglbl2.add(regMod);

        ActionListener btnlistener4 = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                int choice = 0;
                 if (choice == 0) {
                    frame2.setVisible(true);
                    frame1.setVisible(false);
                    frame.setVisible(false);
                }
            }
        };
                
        regMod.addActionListener(btnlistener4);

        JButton none = new JButton("Add");
        none.setBounds(260, 150, 130, 50);
        bglbl2.add(none);

        JButton none1 = new JButton("Add");
        none1.setBounds(420, 150, 130, 50);
        bglbl2.add(none1);

        JButton none2 = new JButton("Add");
        none2.setBounds(580, 150, 130, 50);
        bglbl2.add(none2);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(350, 600, 100, 60);
        bglbl2.add(exitBtn);

        ActionListener btnlistener3 = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
                if (choice == 0) {
                    frame1.setVisible(false);
                    frame.setVisible(true);
                    frame2.setVisible(false);
                }
            }
        };

        exitBtn.addActionListener(btnlistener3);

        // for frame 1
        JLabel bglbl = new JLabel();
        bglbl.setBounds(0, 0, 800, 800);
        ImageIcon bgimg = new ImageIcon("bulay.png");
        bglbl.setIcon(bgimg);
        panel1.add(bglbl);

        JLabel label1 = new JLabel("SDAO & DO MANAGEMENT SYSTEM");
        label1.setBounds(50, 250, 800, 50);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        label1.setForeground(Color.black);
        bglbl.add(label1);

        JTextField textField1 = new JTextField();
        textField1.setBounds(280, 360, 230, 35);
        bglbl.add(textField1);

        JPasswordField passwordField1 = new JPasswordField();
        passwordField1.setBounds(280, 430, 230, 35);
        bglbl.add(passwordField1);

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(350, 400, 200, 20);
        userLabel.setFont(new Font("Arial", Font.BOLD, 20));
        userLabel.setForeground(Color.black);
        bglbl.add(userLabel);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(350, 470, 200, 20);
        passLabel.setFont(new Font("Arial", Font.BOLD, 20));
        passLabel.setForeground(Color.black);
        bglbl.add(passLabel);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(230, 520, 100, 40);
        bglbl.add(loginButton);

        ActionListener btnlistener1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (textField1.getText().equals("admin") && passwordField1.getText().equals("1234")) {
                JOptionPane.showMessageDialog(null, "Correct PIN", "Valid", JOptionPane.INFORMATION_MESSAGE);
                frame1.setVisible(true);
                frame.setVisible(false);
                }
                else if(textField1.getText().equals("admin") && !passwordField1.getText().equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Wrong Password", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                    passwordField1.setText("");
                }
                else if(!textField1.getText().equals("admin") && passwordField1.getText().equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Wrong Username", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                    textField1.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Wrong PIN", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                    passwordField1.setText("");
                }
            }
        };

        loginButton.addActionListener(btnlistener1);
            
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(470, 520, 100, 40);
        bglbl.add(cancelButton);      

          ActionListener btnlistener2 = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Do you want to cancel?", "Cancel", JOptionPane.YES_NO_OPTION);
                if (choice == 0) {
                    frame1.setVisible(false);
                    frame.setVisible(false);
                    frame2.setVisible(false);
                }
            }
        };
 
        cancelButton.addActionListener(btnlistener2);
           
        frame.setVisible(true);
        frame.setResizable(false);
    }
}