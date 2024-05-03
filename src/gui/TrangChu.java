package gui;

import java.awt.*;
import javax.swing.*;

public class TrangChu extends JFrame {

    private JButton btnCPass;
    private JButton btnExit;
    private JPanel Jcen;

    public TrangChu() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.setBackground(Color.DARK_GRAY);
        // Thêm tiêu đề
        JPanel Jnorth =new JPanel();
        JLabel titleLabel = new JLabel("Hệ thống quản lý rạp phim", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        Jnorth.add(titleLabel, BorderLayout.NORTH);
        add(Jnorth,BorderLayout.NORTH);
       

        JPanel JWest = new JPanel(new BorderLayout());
        JWest.setPreferredSize(new Dimension(500, 300));
        JWest.setBackground(Color.LIGHT_GRAY);
        contentPane.add(JWest, BorderLayout.WEST);

        JLabel lbltenUse = new JLabel("Welcome");
        lbltenUse.setHorizontalAlignment(SwingConstants.CENTER);
        JWest.add(lbltenUse, BorderLayout.CENTER);
        lbltenUse.setFont(new Font("Arial", Font.PLAIN, 20));

        JPanel Jsouth = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Jsouth.setPreferredSize(new Dimension(500, 100));
        JWest.add(Jsouth, BorderLayout.SOUTH);

        btnCPass = new JButton("Change Password");
        btnExit = new JButton("Exit");
        Jsouth.setBackground(Color.LIGHT_GRAY);
        Jsouth.add(btnCPass);
        Jsouth.add(btnExit);

        JLayeredPane layeredPane = new JLayeredPane();
        contentPane.add(layeredPane);

        Jcen = new JPanel();
        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("Image/LoginBackground.jpg"));
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 350, 500);

        ImageIcon backgroundImage1 = new ImageIcon(getClass().getResource("Image/poster.png"));
        JLabel backgroundLabel1 = new JLabel(backgroundImage1);
        backgroundLabel1.setBounds(350, 0, 350, 500);
        
        ImageIcon backgroundImage2 = new ImageIcon(getClass().getResource("Image/Poster2.png"));
        JLabel backgroundLabel2 = new JLabel(backgroundImage2);
        backgroundLabel2.setBounds(700, 0, 350, 500);
        

        layeredPane.add(backgroundLabel, Integer.valueOf(0));
        layeredPane.add(backgroundLabel1, Integer.valueOf(1));
        layeredPane.add(backgroundLabel2, Integer.valueOf(2));

        setTitle("Trang chủ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TrangChu());
    }
}
