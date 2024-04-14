package gui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DangNhap extends JFrame{
	private JPanel JNorth;
	private JLabel lblTieuDe;
	private JPanel JCen;
	private JLabel lblMaNV;
	private JTextField txtMaNV;
	private JLabel lblMatKhau;
	private JTextField txtMatKhau;

	public DangNhap() {
		setTitle("Đăng nhập");
		
		
		JNorth=new JPanel();
		add(JNorth, BorderLayout.NORTH);
		lblTieuDe=new JLabel("ĐĂNG NHẬP");
		Font fo=new Font("Arial", Font.BOLD, 26);
		lblTieuDe.setFont(fo);
		JNorth.add(lblTieuDe);
		
		JCen=new JPanel();
		add(JCen,BorderLayout.CENTER);
		lblMaNV=new JLabel("Mã nhân viên:");
		txtMaNV=new JTextField(15);
		lblMatKhau=new JLabel("Mật khẩu:");
		txtMatKhau=new JTextField(15);
		Box bo=Box.createHorizontalBox();
		Box b1=Box.createVerticalBox();
		Box b2=Box.createVerticalBox();
		b1.add(lblMaNV);
		b1.add(txtMaNV);
		b2.add(lblMatKhau);
		b2.add(txtMatKhau);
		bo.add(b1);
		bo.add(b2);
		JCen.add(bo);
		
		setSize(900, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
