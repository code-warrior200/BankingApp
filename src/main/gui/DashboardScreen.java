package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DashboardScreen extends JFrame {

    public DashboardScreen() {
        setTitle("🏦 MyBank - Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        // Main container
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(245, 250, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        // Header
        JLabel titleLabel = new JLabel("Welcome, User 👋", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
        titleLabel.setForeground(new Color(33, 53, 85));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 30, 0));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // Button grid panel
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 20, 20));
        buttonPanel.setOpaque(false);

        String[] actions = {"➕ Deposit", "➖ Withdraw", "🔁 Transfer", "📄 Statement"};
        for (String action : actions) {
            buttonPanel.add(createModernButton(action));
        }

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Add panel to frame
        add(mainPanel);
        setVisible(true);
    }

    // Modern rounded button with hover effect
    private JButton createModernButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        button.setFocusPainted(false);
        button.setBackground(new Color(0, 123, 255));
        button.setForeground(Color.WHITE);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setBorder(BorderFactory.createEmptyBorder(12, 20, 12, 20));

        button.setUI(new javax.swing.plaf.basic.BasicButtonUI()); // Flat look

        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                button.setBackground(new Color(0, 105, 220));
            }

            public void mouseExited(MouseEvent evt) {
                button.setBackground(new Color(0, 123, 255));
            }
        });

        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DashboardScreen::new);
    }
}
