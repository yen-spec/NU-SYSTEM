import java.awt.*;
import javax.swing.*;

public class NUTrackaboutus {
    public static void main(String[] args) {
        AboutUsPage();

    }

    // About Us Page
    public static void AboutUsPage() {

        JFrame AboutUsFrame = new JFrame("NUTrack About Us");
        AboutUsFrame.setSize(1920, 1080);
        AboutUsFrame.setLocationRelativeTo(null);
        AboutUsFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel AboutusPanel = new JPanel(null);
        AboutUsFrame.add(AboutusPanel);

        // About Us Background first
        JLabel background1 = new JLabel(new ImageIcon("NUTrackAboutUs.png"));
        background1.setBounds(0, 0, 1920, 1080);
        AboutusPanel.add(background1);

        // NU Logo
        ImageIcon NULogo = new ImageIcon("nulogo2.png");
        Image img = NULogo.getImage().getScaledInstance(100, 110, Image.SCALE_SMOOTH);
        JLabel logoLabel = new JLabel(new ImageIcon(img));
        logoLabel.setBounds(910, 90, 100, 110);
        AboutusPanel.add(logoLabel);

        // NU Track Logo
        ImageIcon NUTrackLogo = new ImageIcon("NUTrackLogobgremove.png");
        Image img2 = NUTrackLogo.getImage().getScaledInstance(630, 360, Image.SCALE_SMOOTH);
        JLabel logoLabel2 = new JLabel(new ImageIcon(img2));
        logoLabel2.setBounds(650, 200, 630, 360);
        AboutusPanel.add(logoLabel2);

        // About Us Text
        JLabel textLabel = new JLabel(
                "<html><div align='center'>NUTrack is an integrated management system for the Student Development and Activities<br>Office (SDAO) and the Discipline Office (DO). It is a digital platform designed to automate school<br>processes, replacing error-prone manual workflows with a transparent and efficient system.</div></html>");
        textLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setBounds(420, 420, 1100, 120);
        AboutusPanel.add(textLabel);

        // Developer Text
        JLabel devLabel = new JLabel(
                "<html><div align='center'>Developed by <br>Arevalo, Mary Angelene<br>Celle, Marcus<br>Duyag, Rod Angelo<br>Zabala, Andrei R.</div></html>");
        devLabel.setFont(new Font("Arial", Font.ITALIC, 14));
        devLabel.setHorizontalAlignment(SwingConstants.CENTER);
        devLabel.setBounds(420, 750, 1100, 120);
        AboutusPanel.add(devLabel);

        JButton backButton = new JButton("Back");
        backButton.setBounds(12, 20, 100, 30);
        backButton.setFont(new Font("Arial", Font.BOLD, 16));
        backButton.setForeground(new Color(0, 102, 204)); // Blue text
        backButton.setContentAreaFilled(false); // No background fill
        backButton.setBorderPainted(false); // No border
        backButton.setFocusPainted(false); // No focus outline
        AboutusPanel.add(backButton);

        AboutusPanel.setComponentZOrder(background1, AboutusPanel.getComponentCount() - 1);
        AboutUsFrame.setVisible(true);

    }

}
