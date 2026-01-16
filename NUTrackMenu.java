import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NUTrackMenu {

    public static void main(String[] args) {
        DashboardPage();
    }

    // MENU
    public static void DashboardPage() {

        // MENU
        JFrame Frame1 = new JFrame("MENU");
        Frame1.setSize(1920, 1080);
        Frame1.setLocationRelativeTo(null);
        Frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Frame1.setResizable(true);

        // PANEL NA NAKAPATONG SA FRAME1
        JPanel Panel1 = new JPanel();
        Panel1.setLayout(null);
        Panel1.setBackground(Color.decode("#EBEBEB"));
        Panel1.setOpaque(true);

        Frame1.add(Panel1);

        // BACKGROUND
        JLabel BackgroundDashb1 = new JLabel();
        BackgroundDashb1.setBounds(0, 0, 1920, 1080);
        ImageIcon image = new ImageIcon("NUTrack BG.png");
        BackgroundDashb1.setIcon(image);
        Panel1.add(BackgroundDashb1);

        // WELCOME
        JLabel Label1 = new JLabel("Welcome to Dashboard!");
        Label1.setBounds(290, 50, 1200, 300);
        Label1.setFont(new Font("Arial", Font.BOLD, 80));
        Label1.setForeground(Color.WHITE);
        // Label1.setForeground(Color.decode("#111e44"));
        BackgroundDashb1.add(Label1);

        // BACK BUTTON
        JButton Button1 = new JButton("Back");
        Button1.setBounds(15, 10, 100, 30);
        Button1.setFont(new Font("Arial", Font.BOLD, 20));
        Button1.setOpaque(false);
        Button1.setContentAreaFilled(false);
        // Button1.setBorderPainted(false);
        Button1.setForeground(Color.WHITE);
        BackgroundDashb1.add(Button1);

        // BOXES
        JPanel Panel2 = new JPanel();
        Panel2.setBounds(100, 380, 400, 180);
        Panel2.setBackground(Color.WHITE);
        Panel2.setOpaque(true);
        Panel2.setLayout(null);
        BackgroundDashb1.add(Panel2);

        // TITLE PANEL 2
        JLabel Label2 = new JLabel("<html>Student Development and<br>Activities Office (SDAO)<html>");
        Label2.setBounds(30, 0, 400, 100);
        Label2.setFont(new Font("Arial", Font.BOLD, 25));
        Label2.setForeground(Color.decode("#35408e"));
        Panel2.add(Label2);

        JLabel Label3 = new JLabel("<html>Add and view <br>announcements<html>");
        Label3.setBounds(20, 30, 130, 150);
        Label3.setFont(new Font("Arial", Font.PLAIN, 15));
        Label3.setForeground(Color.decode("#545454"));
        Panel2.add(Label3);

        JPanel Panel3 = new JPanel();
        Panel3.setBounds(570, 380, 400, 180);
        Panel3.setBackground(Color.WHITE);
        Panel3.setOpaque(true);
        BackgroundDashb1.add(Panel3);

        JPanel Panel4 = new JPanel();
        Panel4.setBounds(1050, 380, 400, 180);
        Panel4.setBackground(Color.WHITE);
        Panel4.setOpaque(true);
        BackgroundDashb1.add(Panel4);

        Frame1.setVisible(true);

    }

}
