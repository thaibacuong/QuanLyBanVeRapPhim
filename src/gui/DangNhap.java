package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DangNhap extends JFrame {
    private JPanel JNorth;
    private JLabel lblTieuDe;
    private JPanel JCen;
    private JLabel lblMaNV;
    private JTextField txtMaNV;
    private JLabel lblMatKhau;
    private JTextField txtMatKhau;
    private JButton btnReset;
    private JButton btnLogin;
    private JLabel myLabel;

    public DangNhap() {
        setTitle("Đăng nhập");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);

        ImageIcon backgroundImg = new ImageIcon(this.getClass().getResource("background1.jpg"));
        myLabel = new JLabel(backgroundImg);
        myLabel.setBounds(0, 0, 500, 400);
        layeredPane.add(myLabel, Integer.valueOf(0)); 

        JNorth = new JPanel();
        JNorth.setBounds(0, 0, 500, 100);
        layeredPane.add(JNorth, Integer.valueOf(2)); 

        lblTieuDe = new JLabel("ĐĂNG NHẬP");
        lblTieuDe.setForeground(Color.white);
        Font fo = new Font("Arial", Font.BOLD, 33);
        lblTieuDe.setFont(fo);
        lblTieuDe.setBorder(new EmptyBorder(20, 20, 20, 20));
        JNorth.add(lblTieuDe);

        JCen = new JPanel();
        JCen.setBounds(0, 100, 500, 200);
        layeredPane.add(JCen, Integer.valueOf(2)); 

        JCen.setLayout(null);
        JCen.add(lblMaNV = new JLabel("Mã nhân viên:"));
        JCen.add(lblMatKhau = new JLabel("Mật khẩu:"));
        JCen.add(txtMatKhau = new JPasswordField());
        JCen.add(txtMaNV = new JTextField());

        Font f1 = new Font("Arial", Font.BOLD, 14);
        int w1 = 100, w2 = 300, h = 25;
        lblMaNV.setBounds(50, 50, w1, h);
        txtMaNV.setBounds(180, 50, w2, h);
        lblMatKhau.setBounds(50, 90, w1, h);
        txtMatKhau.setBounds(180, 90, w2, h);
        lblMaNV.setFont(f1);
        lblMatKhau.setFont(f1);
        txtMaNV.setBorder(BorderFactory.createEmptyBorder());
        txtMaNV.setBackground(new Color(220, 255, 220));
        txtMatKhau.setBorder(BorderFactory.createEmptyBorder());
        txtMatKhau.setBackground(new Color(220, 255, 220));
        lblMaNV.setForeground(Color.white); 
        lblMatKhau.setForeground(Color.white); 

        JPanel JSouth = new JPanel();
        JSouth.setBounds(0, 300, 500, 100);
        layeredPane.add(JSouth, Integer.valueOf(2)); 

        JSouth.add(btnReset = new JButton("Reset"));
        JSouth.add(btnLogin = new JButton("Login"));

        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        System.out.println(this.getClass().getResource("background1.jpg"));
        JNorth.setBackground(new Color(0, 0, 0, 100)); // Màu đen semi-transparent
        JCen.setBackground(new Color(0, 0, 0, 100)); // Màu đen semi-transparent
        JSouth.setBackground(new Color(0, 0, 0, 100)); // Màu đen semi-transparent

    }

    public static void main(String[] args) {
        new DangNhap();
    }
}
