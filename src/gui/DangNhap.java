package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

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

import dao.NhanVien_Dao;
import entity.MaNV;
import entity.NhanVien;

public class DangNhap extends JFrame implements ActionListener{
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

        ImageIcon backgroundImg = new ImageIcon(this.getClass().getResource("Image/LoginBackground.jpg"));
        myLabel = new JLabel(backgroundImg);
        myLabel.setBounds(0, 0, 700, 700);
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

        btnReset.addActionListener(this);
        btnLogin.addActionListener(this);
        
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        JNorth.setBackground(new Color(0, 0, 0, 100)); // Màu đen semi-transparent
        JCen.setBackground(new Color(0, 0, 0, 100)); 
        JSouth.setBackground(new Color(0, 0, 0, 100)); 

    }

    public static void main(String[] args) throws SQLException {
		new DangNhap();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if(o.equals(btnLogin)) {
			String ma=txtMaNV.getText().toString();
			String mk=txtMatKhau.getText().toString();
			String matKhauFromDB = NhanVien_Dao.getMatKhauByMaNhanVien(ma).trim();
			if (matKhauFromDB != null && matKhauFromDB.equals(mk.trim())) {
			    MaNV manv=new MaNV(ma);
				dispose();
				try {
					new Tab().setVisible(true);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
		}
		if(o.equals(btnReset)) {
			txtMaNV.setText("");
			txtMatKhau.setText("");
		}
	}
}
