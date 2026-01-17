import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class NUTrack {

    public static void main(String[] args) {
        Frame3();

    }

    static void Frame3() {
        Font ArialRegular = new Font("Arial", Font.PLAIN, 14);
        Font ArialBold = new Font("Arial", Font.BOLD, 16);
        Font ArialTitle = new Font("Arial", Font.BOLD, 26);

        Color NavyBlue = new Color(54, 63, 148);
        Color Gold = new Color(255, 215, 0);
        Color LightGrayBackground = new Color(245, 245, 245);
        Color WhiteColor = Color.WHITE;

        Color BackButtonColor = new Color(255, 193, 7);
        Color ClearButtonColor = new Color(160, 160, 160);
        Color SaveButtonColor = new Color(76, 175, 80);
        Color ExitButtonColor = new Color(244, 67, 54);

        JFrame Frame3 = new JFrame("Student Development and Activities Office");
        Frame3.setSize(1920, 1080);
        Frame3.setLocationRelativeTo(null);
        Frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame3.setLayout(new BorderLayout());
        JPanel HeaderPanel = new JPanel(new BorderLayout());
        HeaderPanel.setBackground(NavyBlue);
        HeaderPanel.setPreferredSize(new Dimension(1920, 80));

        JPanel HeaderPanel2 = new JPanel(new BorderLayout());
        HeaderPanel2.setBackground(Gold);
        HeaderPanel2.setPreferredSize(new Dimension(1920, 90));
        Frame3.add(HeaderPanel2, BorderLayout.NORTH);
        HeaderPanel2.add(HeaderPanel, BorderLayout.NORTH);

        JLabel HeaderTitle = new JLabel("Student Development and Activities Office (SDAO)");
        HeaderTitle.setFont(ArialBold);
        HeaderTitle.setForeground(Color.WHITE);
        HeaderTitle.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 20));
        HeaderPanel.add(HeaderTitle, BorderLayout.WEST);

        JPanel Content = new JPanel(new BorderLayout(20, 20));
        Content.setBackground(LightGrayBackground);
        Content.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        Frame3.add(Content, BorderLayout.CENTER);

        JLabel PageTitle = new JLabel("To Seaside Bulldogs...");
        PageTitle.setFont(ArialTitle);
        PageTitle.setHorizontalAlignment(SwingConstants.CENTER);
        Content.add(PageTitle, BorderLayout.NORTH);

        JPanel Table = new JPanel(new BorderLayout());
        Table.setBackground(WhiteColor);

        String[] TableColumns = { "Date Posted", "Announcement" };
        DefaultTableModel AnnouncementTableModel = new DefaultTableModel(TableColumns, 0);
        JTable AnnouncementTable = new JTable(AnnouncementTableModel);
        AnnouncementTable.setFont(ArialRegular);
        AnnouncementTable.setRowHeight(30);

        // Sample data
        AnnouncementTableModel.addRow(new Object[] {
                "January 20, 2026",
                "Good Day! We will be having an important activity."
        });

        JScrollPane TableScrollPane = new JScrollPane(AnnouncementTable);
        Table.add(TableScrollPane, BorderLayout.CENTER);

        Content.add(Table, BorderLayout.CENTER);

        JPanel FormPanel = new JPanel(new BorderLayout(20, 10));
        FormPanel.setBackground(LightGrayBackground);

        JPanel DatePanel = new JPanel(new BorderLayout(5, 5));
        DatePanel.setBackground(LightGrayBackground);

        JLabel DatePostedLabel = new JLabel("Date Posted");
        DatePostedLabel.setFont(ArialBold);

        JTextField DatePostedField = new JTextField();
        DatePostedField.setFont(ArialRegular);

        DatePanel.add(DatePostedLabel, BorderLayout.NORTH);
        DatePanel.add(DatePostedField, BorderLayout.CENTER);

        JPanel AnnouncementPanel = new JPanel(new BorderLayout(5, 5));
        AnnouncementPanel.setBackground(LightGrayBackground);

        JLabel AnnouncementLabel = new JLabel("Announcement");
        AnnouncementLabel.setFont(ArialBold);

        JTextArea AnnouncementTextArea = new JTextArea(5, 20);
        AnnouncementTextArea.setFont(ArialRegular);
        AnnouncementTextArea.setLineWrap(true);
        AnnouncementTextArea.setWrapStyleWord(true);

        JScrollPane AnnouncementScrollPane = new JScrollPane(AnnouncementTextArea);

        AnnouncementPanel.add(AnnouncementLabel, BorderLayout.NORTH);
        AnnouncementPanel.add(AnnouncementScrollPane, BorderLayout.CENTER);

        FormPanel.add(DatePanel, BorderLayout.WEST);
        FormPanel.add(AnnouncementPanel, BorderLayout.CENTER);

        Content.add(FormPanel, BorderLayout.SOUTH);

        JPanel ButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 15));
        ButtonPanel.setBackground(LightGrayBackground);

        JButton BackButton = new JButton("Back");
        BackButton.setBackground(BackButtonColor);
        ActionListener backListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ea) {
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to back?", "Confirmation",
                        JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "You chose not to proceed.");
                    Frame3.setVisible(true);
                }
            }
        };
        BackButton.addActionListener(backListener);

        JButton ClearButton = new JButton("Clear");
        ClearButton.setBackground(ClearButtonColor);
        ActionListener clearListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ea) {
                DatePostedField.setText("");
                AnnouncementTextArea.setText("");
            }
        };
        ClearButton.addActionListener(clearListener);
        JButton SaveButton = new JButton("Save");
        SaveButton.setBackground(SaveButtonColor);
        ActionListener saveListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ea) {
                AnnouncementTableModel.addRow(new Object[] {
                        DatePostedField.getText(),
                        AnnouncementTextArea.getText()
                });
                DatePostedField.setText("");
                AnnouncementTextArea.setText("");
            }
        };
        SaveButton.addActionListener(saveListener);
        JButton ExitButton = new JButton("Exit");
        ExitButton.setBackground(ExitButtonColor);
        ActionListener exitListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ea) {
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation",
                        JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "You chose to exit. The application will now close.");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "You chose not to proceed.");
                    Frame3.setVisible(true);
                }
            }
        };
        ExitButton.addActionListener(exitListener);
        ButtonPanel.add(BackButton);
        ButtonPanel.add(ClearButton);
        ButtonPanel.add(SaveButton);
        ButtonPanel.add(ExitButton);

        Frame3.add(ButtonPanel, BorderLayout.SOUTH);

        Frame3.setVisible(true);

    }

}