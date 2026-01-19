import java.awt.*;
import javax.swing.*;

public class NUTrackLogin {

    public static void main(String[] args) {
        LoginPage();
    }

    // Login Page
    public static void LoginPage() {

        JFrame LoginFrame = new JFrame("NUTrack Login");
        LoginFrame.setSize(1920, 1080);
        LoginFrame.setLocationRelativeTo(null);
        LoginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel LoginPanel = new JPanel(null);
        LoginFrame.add(LoginPanel);

        // Login Background first
        JLabel background1 = new JLabel(new ImageIcon("NUtrackbg.png"));
        background1.setBounds(0, 0, 1920, 1080);
        LoginPanel.add(background1);

        // NUTrack Logo
        ImageIcon NUTrackLogo = new ImageIcon("NUTrackLogobgremove.png");
        Image img = NUTrackLogo.getImage().getScaledInstance(480, 280, Image.SCALE_SMOOTH);
        JLabel logoLabel = new JLabel(new ImageIcon(img));
        logoLabel.setBounds(1245, 200, 480, 280);
        LoginPanel.add(logoLabel);

        // Username
        JLabel Usernametxt = new JLabel("Username");
        Usernametxt.setBounds(1330, 420, 200, 30);
        Usernametxt.setFont(new Font("Arial", Font.BOLD, 18));
        Usernametxt.setForeground(Color.BLACK);
        LoginPanel.add(Usernametxt);

        JTextField usernameinput = new JTextField();
        usernameinput.setBounds(1330, 450, 310, 30);
        usernameinput.setForeground(Color.GRAY);
        LoginPanel.add(usernameinput);

        // Password
        JLabel Passwordtxt = new JLabel("Password");
        Passwordtxt.setBounds(1330, 485, 200, 30);
        Passwordtxt.setFont(new Font("Arial", Font.BOLD, 18));
        Passwordtxt.setForeground(Color.BLACK);
        LoginPanel.add(Passwordtxt);

        JPasswordField passwordinput = new JPasswordField();
        passwordinput.setBounds(1330, 515, 310, 30);
        passwordinput.setEchoChar('*');
        LoginPanel.add(passwordinput);

        // F1: Login Button
        JButton LoginButtonf1 = new JButton("Login");
        LoginButtonf1.setBounds(1350, 580, 110, 40);
        LoginButtonf1.setBackground(new Color(42, 234, 39));
        LoginButtonf1.setFont(new Font("Arial", Font.BOLD, 14));
        LoginButtonf1.setForeground(Color.WHITE);
        
         /*ActionListener LoginListener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass = new String(passwordinput.getPassword());

                if (usernameinput.getText().equals("a") && passwordinput.getText().equals("1")) {
                    JOptionPane.showMessageDialog(null, "Correct Username and Pin", "Valid", JOptionPane.INFORMATION_MESSAGE);
                    DashboardPage.setVisible(true);
                    LoginFrame.setVisible(false);
                }
                }
            };
        LoginButtonf1.addActionListener(LoginListener1);*/
        LoginPanel.add(LoginButtonf1);

        // F2: Exit Button
        JButton ExitButtonf2 = new JButton("Exit");
        ExitButtonf2.setBounds(1500, 580, 110, 40);
        ExitButtonf2.setBackground(new Color(255, 69, 69));
        ExitButtonf2.setFont(new Font("Arial", Font.BOLD, 14));
        ExitButtonf2.setForeground(Color.WHITE);
        LoginPanel.add(ExitButtonf2);

        //

    
        LoginPanel.setComponentZOrder(background1, LoginPanel.getComponentCount() - 1);
        LoginFrame.setVisible(true);

    }

}
