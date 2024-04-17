package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KhachHang_UI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel JWest;
	private JTextField txtTen;
	private JLabel lblTen;
	private JComboBox cbxCV;
	private JLabel lblMK;
	private JTextField txtMK;
	private JLabel lblCV;
	private JTextField txtCCCD;
	private JLabel lblCCCD;
	private JTextField txtSDT;
	private JLabel lblSDT;
	private JComboBox cbxGT;
	private JLabel lblGT;
	private JTextField txtNS;
	private JLabel lblNS;
	private JButton btnThem;
	private JButton btnCapNhat;
	private JButton btnLamMoi;
	private JButton btnXoa;
	private JButton btnThoat;
	public KhachHang_UI() {
		JWest=new JPanel();
		add(JWest,BorderLayout.WEST);
		JWest.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),"Thông tin nhân viên"));
		Box vb1=Box.createVerticalBox();
		Box hb1=Box.createHorizontalBox();
		Box hb2=Box.createHorizontalBox();
		Box hb3=Box.createHorizontalBox();
		Box hb4=Box.createHorizontalBox();
		Box hb5=Box.createHorizontalBox();
		Box hb6=Box.createHorizontalBox();
		Box hb7=Box.createHorizontalBox();
		Box hb8=Box.createHorizontalBox();
		Box hb9=Box.createHorizontalBox();
		Box hb10=Box.createHorizontalBox();
		
		JWest.add(vb1);
		String[] gioiTinh = {null,"Nam","Nữ"};
		String[] chucVu = {null,"Nhân viên bán vé", "Quản lý"};
		
		lblTen=new JLabel("Tên nhân viên");
		txtTen=new JTextField(15);
		lblNS=new JLabel("Năm sinh");
		txtNS=new JTextField(15);
		lblGT=new JLabel("Giới tính");
		cbxGT=new JComboBox<>(gioiTinh);
		lblSDT=new JLabel("Số điện thoại");
		txtSDT=new JTextField(15);
		lblCCCD=new JLabel("CCCD");
		txtCCCD=new JTextField(15);
		lblCV=new JLabel("Chức vụ");
		cbxCV=new JComboBox<>(chucVu);
		lblMK=new JLabel("Mật khẩu");
		txtMK=new JTextField(15);
		btnThem=new JButton("Thêm mới");
		btnCapNhat=new JButton("Cập nhật");
		btnXoa=new JButton("Xóa");
		btnLamMoi=new JButton("Làm mới");
		btnThoat=new JButton("Thoát");
		
		lblNS.setPreferredSize(lblTen.getPreferredSize());
		lblGT.setPreferredSize(lblTen.getPreferredSize());
		lblSDT.setPreferredSize(lblTen.getPreferredSize());
		lblCCCD.setPreferredSize(lblTen.getPreferredSize());
		lblCV.setPreferredSize(lblTen.getPreferredSize());
		lblMK.setPreferredSize(lblTen.getPreferredSize());
		
		btnCapNhat.setPreferredSize(btnThem.getPreferredSize());
		btnXoa.setPreferredSize(btnThem.getPreferredSize());
		btnLamMoi.setPreferredSize(btnThem.getPreferredSize());
		JWest.revalidate();
		JWest.repaint();
		
		hb1.add(lblTen);
		hb1.add(txtTen);
		hb2.add(lblNS);
		hb2.add(txtNS);
		hb3.add(lblGT);
		hb3.add(cbxGT);
		hb4.add(lblSDT);
		hb4.add(txtSDT);
		hb5.add(lblCCCD);
		hb5.add(txtCCCD);
		hb6.add(lblCV);
		hb6.add(cbxCV);
		hb7.add(lblMK);
		hb7.add(txtMK);
		hb8.add(btnThem);
		hb8.add(Box.createHorizontalStrut(30));
		hb8.add(btnCapNhat);
		hb9.add(btnXoa);
		hb9.add(Box.createHorizontalStrut(30));
		hb9.add(btnLamMoi);
		hb10.add(btnThoat);
		
		vb1.add(hb1);
		vb1.add(Box.createVerticalStrut(15));
		vb1.add(hb2);
		vb1.add(Box.createVerticalStrut(15));
		vb1.add(hb3);
		vb1.add(Box.createVerticalStrut(15));
		vb1.add(hb4);
		vb1.add(Box.createVerticalStrut(15));
		vb1.add(hb5);
		vb1.add(Box.createVerticalStrut(15));
		vb1.add(hb6);
		vb1.add(Box.createVerticalStrut(15));
		vb1.add(hb7);
		vb1.add(Box.createVerticalStrut(30));
		vb1.add(hb8);
		vb1.add(Box.createVerticalStrut(15));
		vb1.add(hb9);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb10);
		
		setTitle("Khách hàng");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
	}
	public static void main(String[] args) {
		new KhachHang_UI();
	}
}
