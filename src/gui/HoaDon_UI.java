package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class HoaDon_UI extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel JNorth;
	private JLabel lblNgayBD;
	private JLabel lblNgayKT;
	private JTextField txtNgayKT;
	private JTextField txtNgayBD;
	private JTextField txtTenNV;
	private JLabel lblTenNV;
	private JLabel lblSoDT;
	private JTextField txtSoDT;
	private JButton btnTim;
	private JButton btnLamMoi;
	private JPanel JTraCuu;
	private JPanel JThoat;
	private JButton btnChiTiet;
	private JButton btnThoat;
	private JPanel JCen;
	private DefaultTableModel tableModel;
	private JTable table;
	private JScrollPane scroll;
	public HoaDon_UI() {
		JNorth=new JPanel();
		JTraCuu=new JPanel();
		JThoat=new JPanel();
		JNorth.add(JTraCuu,BorderLayout.CENTER);
		JNorth.add(JThoat,BorderLayout.EAST);
		add(JNorth,BorderLayout.NORTH);
		Box hb1=Box.createVerticalBox();
		Box vb1=Box.createHorizontalBox();
		Box vb2=Box.createHorizontalBox();
		hb1.add(vb1);
		hb1.add(Box.createVerticalStrut(15));
		hb1.add(vb2);
		
		JTraCuu.add(hb1);
		JTraCuu.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),"Tra cứu"));
		lblNgayBD=new JLabel("Ngày bắt đầu:");
		txtNgayBD=new JTextField(20);
		lblTenNV=new JLabel("Tên nhân viên:");
		txtTenNV=new JTextField(20);
		btnTim=new JButton("Tìm");
		lblNgayKT=new JLabel("Ngày kết thúc:");
		txtNgayKT=new JTextField(20);
		lblSoDT=new JLabel("Sô điện thoại khách:");
		txtSoDT=new JTextField(20);
		btnLamMoi=new JButton("Làm mới");
		
		Font fo=new Font("Arial", Font.BOLD, 14);
		lblNgayBD.setFont(fo);
		lblNgayKT.setFont(fo);
		lblSoDT.setFont(fo);
		lblTenNV.setFont(fo);
		
		lblNgayBD.setPreferredSize(lblSoDT.getPreferredSize());
		lblNgayKT.setPreferredSize(lblSoDT.getPreferredSize());
		lblTenNV.setPreferredSize(lblSoDT.getPreferredSize());
		btnTim.setPreferredSize(btnLamMoi.getPreferredSize());
		
		vb1.add(lblNgayBD);
		vb1.add(txtNgayBD);
		vb1.add(Box.createHorizontalStrut(15));
		vb1.add(lblTenNV);
		vb1.add(txtTenNV);
		vb1.add(Box.createHorizontalStrut(15));
		vb1.add(btnTim);
		vb2.add(lblNgayKT);
		vb2.add(txtNgayKT);
		vb2.add(Box.createHorizontalStrut(15));
		vb2.add(lblSoDT);
		vb2.add(txtSoDT);
		vb2.add(Box.createHorizontalStrut(15));
		vb2.add(btnLamMoi);
		
		btnChiTiet=new JButton("Xem chi tiết");
		btnThoat=new JButton("Thoát");
		Box vbT=Box.createHorizontalBox();
		vbT.add(Box.createHorizontalStrut(40));
		vbT.add(btnChiTiet);
		vbT.add(Box.createHorizontalStrut(50));
		vbT.add(btnThoat);
		JThoat.add(vbT);
		
		JCen = new JPanel(new BorderLayout()); 
		add(JCen, BorderLayout.CENTER);
		JCen.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Danh sách bán vé"));
		String[] headers = "Mã hóa đơn;Ngày thanh toán;Giờ thanh toán;Tên nhân viên;Tên khách hàng;Số điện thoại khách hàng;Tổng hóa đơn".split(";");
		tableModel = new DefaultTableModel(headers, 0);
		table = new JTable(tableModel);
		scroll = new JScrollPane(table);
		JCen.add(scroll, BorderLayout.CENTER);

		
		setTitle("Phim");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
        
        btnTim.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new HoaDon_UI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}
}
