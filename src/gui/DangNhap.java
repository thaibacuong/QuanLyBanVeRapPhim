package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class DangNhap extends JFrame{
	private JPanel JNorth;
	private JLabel lblTieuDe;
	private JPanel JCen;
	private JLabel lblMaNV;
	private JTextField txtMaNV;
	private JLabel lblMatKhau;
	private JTextField txtMatKhau;
	private JButton btnReset;
	private JButton btnLogin;

	public DangNhap() {
	
		ImageIcon backgroundImg = new ImageIcon("background.jpg");
		setTitle("Đăng nhập");
		JNorth=new JPanel();
		add(JNorth, BorderLayout.NORTH);
		lblTieuDe=new JLabel("ĐĂNG NHẬP");
		lblTieuDe.setForeground(Color.white);
		Font fo=new Font("Arial", Font.BOLD, 33);
		lblTieuDe.setFont(fo);
		lblTieuDe.setBorder(new EmptyBorder(20, 20, 20, 20));
		JNorth.add(lblTieuDe);
		JNorth.setBackground(new Color(152, 251, 152));
		
		JCen=new JPanel();
		add(JCen,BorderLayout.CENTER);
		JCen.setLayout(null);
		JCen.add(lblMaNV=new JLabel("Mã nhân viên:"));
		JCen.add(lblMatKhau=new JLabel("Mật khẩu:"));
		JCen.add(txtMatKhau=new JTextField());
		JCen.add(txtMaNV=new JTextField());
		
		Font f1=new Font("Arial", Font.BOLD, 14);
		
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
	    JCen.setBackground(new Color(152, 251, 152));
	    
		JPanel JSouth;
		add(JSouth = new JPanel(), BorderLayout.SOUTH);
		JSouth.add(btnReset = new JButton("Reset"));
		JSouth.add(btnLogin = new JButton("Login"));
		JSouth.setBackground(new Color(152, 251, 152));
		
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
