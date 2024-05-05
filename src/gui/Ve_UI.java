package gui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ve_UI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblMaGhe;
	private JLabel lblPhongChieu;
	private JLabel lblSuatChieu;
	private JLabel lblTieude;
	private Font fo;
	private JLabel lblNgayChieu;
	private JLabel lblTenNhanVien;
	private JLabel lblTenPhim;
	private JLabel lblTongcong;

	public Ve_UI(String tenNhanVien, String maGhe, String phongChieu, String suatChieu,String ngayChieu, String tenPhim, String tongtien) {
		lblTenNhanVien = new JLabel("Tên nhân viên: " + tenNhanVien);
		lblMaGhe = new JLabel("Mã ghế: " + maGhe);
		lblPhongChieu = new JLabel("Phòng chiếu: " + phongChieu);
		lblSuatChieu = new JLabel("Suất chiếu: " + suatChieu);
		lblNgayChieu = new JLabel("Ngày chiếu: " + ngayChieu);
		lblTenPhim = new JLabel("Tên phim: " + tenPhim);
		lblTongcong=new JLabel("Tổng cộng: "+ tongtien);
		
		lblTieude=new JLabel("THÔNG TIN VÉ");
		fo=new Font("Arial", Font.BOLD, 20);
		lblTieude.setFont(fo);
		
		Box vb=Box.createVerticalBox();
		Box hb1=Box.createHorizontalBox();
		Box hb2=Box.createHorizontalBox();
		Box hb3=Box.createHorizontalBox();
		Box hb4=Box.createHorizontalBox();
	
		hb1.add(lblTenPhim);
		hb1.add(Box.createHorizontalStrut(10));
		hb1.add(lblPhongChieu);	
		hb2.add(lblMaGhe);
		hb2.add(Box.createHorizontalStrut(10));
		hb2.add(lblNgayChieu);
		hb3.add(lblSuatChieu);
		hb3.add(Box.createHorizontalStrut(10));
		hb4.add(lblTenNhanVien);
		hb4.add(Box.createHorizontalStrut(10));
		hb4.add(lblTongcong);
		vb.add(hb1);
		vb.add(Box.createVerticalStrut(10));
		vb.add(hb2);
		vb.add(Box.createVerticalStrut(10));
		vb.add(hb3);
		vb.add(Box.createVerticalStrut(10));
		vb.add(hb4);
		
		add(lblTieude,BorderLayout.NORTH);
		lblTieude.setHorizontalAlignment(SwingConstants.CENTER);
		add(vb,BorderLayout.CENTER);
		
		setTitle("Thông tin thanh toán");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
	}
}
