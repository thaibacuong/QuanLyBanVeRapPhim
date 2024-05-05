package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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

public class HoaDon_UI extends JFrame implements ActionListener, MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel JCen1;
	private JPanel JCenp;
	private JPanel JNorth;
	private DefaultTableModel tablemodel;
	private JTable table;
	private JScrollPane scroll;
	private JButton btnTim;
	private JPanel JNorth1;
	private JPanel JTraCuu;
	private JPanel JThoat;
	private JLabel lblNgayBD;
	private JLabel lblTenNV;
	private JTextField txtNgayBD;
	private JTextField txtTenNV;
	private JLabel lblNgayKT;
	private JTextField txtNgayKT;
	private JTextField txtSoDT;
	private JLabel lblSoDT;
	private JButton btnLamMoi;
	private JButton btnChiTiet;
	private JButton btnThoat;
	public HoaDon_UI() {

		JNorth1 = new JPanel();
		JTraCuu = new JPanel();
		JThoat = new JPanel();
		JNorth1.add(JTraCuu, BorderLayout.CENTER);
		JNorth1.add(JThoat, BorderLayout.EAST);
		add(JNorth1, BorderLayout.NORTH);
		Box hb11 = Box.createVerticalBox();
		Box vb11 = Box.createHorizontalBox();
		Box vb21 = Box.createHorizontalBox();
		hb11.add(vb11);
		hb11.add(Box.createVerticalStrut(15));
		hb11.add(vb21);

		JTraCuu.add(hb11);
		JTraCuu.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Tra cứu"));
		lblNgayBD = new JLabel("Ngày bắt đầu:");
		txtNgayBD = new JTextField(20);
		lblTenNV = new JLabel("Tên nhân viên:");
		txtTenNV = new JTextField(20);
		btnTim = new JButton("Tìm");
		lblNgayKT = new JLabel("Ngày kết thúc:");
		txtNgayKT = new JTextField(20);
		lblSoDT = new JLabel("Sô điện thoại khách:");
		txtSoDT = new JTextField(20);
		btnLamMoi = new JButton("Làm mới");

		Font fo1 = new Font("Arial", Font.BOLD, 14);
		lblNgayBD.setFont(fo1);
		lblNgayKT.setFont(fo1);
		lblSoDT.setFont(fo1);
		lblTenNV.setFont(fo1);

		lblNgayBD.setPreferredSize(lblSoDT.getPreferredSize());
		lblNgayKT.setPreferredSize(lblSoDT.getPreferredSize());
		lblTenNV.setPreferredSize(lblSoDT.getPreferredSize());
		btnTim.setPreferredSize(btnLamMoi.getPreferredSize());

		vb11.add(lblNgayBD);
		vb11.add(txtNgayBD);
		vb11.add(Box.createHorizontalStrut(15));
		vb11.add(lblTenNV);
		vb11.add(txtTenNV);
		vb11.add(Box.createHorizontalStrut(15));
		vb11.add(btnTim);
		vb21.add(lblNgayKT);
		vb21.add(txtNgayKT);
		vb21.add(Box.createHorizontalStrut(15));
		vb21.add(lblSoDT);
		vb21.add(txtSoDT);
		vb21.add(Box.createHorizontalStrut(15));
		vb21.add(btnLamMoi);

		btnChiTiet = new JButton("Xem chi tiết");
		btnThoat = new JButton("Thoát");
		Box vbT = Box.createHorizontalBox();
		vbT.add(Box.createHorizontalStrut(40));
		vbT.add(btnChiTiet);
		vbT.add(Box.createHorizontalStrut(50));
		vbT.add(btnThoat);
		JThoat.add(vbT);

		JCenp = new JPanel(new BorderLayout());
		add(JCenp, BorderLayout.CENTER);
		JNorth = new JPanel(new GridLayout(1, 12));
		JCen1 = new JPanel(new BorderLayout());
		String[] header = "Mã hóa đơn;Ngày thanh toán;Giờ thanh toán;Mã nhân viên;Số vé;Tổng hóa đơn"
				.split(";");
		tablemodel = new DefaultTableModel(header, 0);
		table = new JTable(tablemodel);
		scroll = new JScrollPane(table);
		JCen1.add(scroll);
		JCenp.add(JCen1, BorderLayout.CENTER);
		JCenp.add(JNorth, BorderLayout.NORTH);

		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new HoaDon_UI();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
