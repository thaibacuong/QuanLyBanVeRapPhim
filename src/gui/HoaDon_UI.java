package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
	private JPanel JPSmall2;
	private Box vb2;
	private Box hb3;
	private Box hb2;
	private Box hb4;
	private JLabel lbl;
	private JLabel lblnn;
	private JLabel lbltent;
	private JTextField txttent;
	private JButton btnTim;
	private JLabel lblloait;
	private JButton btnLammoinvw;
	private JTextField txtloait;
	private static Box vb1;
	private static JPanel JPSmall1;
	private static Box hb1;
	public HoaDon_UI() {

		JCenp = new JPanel(new BorderLayout());
		add(JCenp, BorderLayout.CENTER);
		JNorth = new JPanel(new GridLayout(1, 12));
		JCen1 = new JPanel(new BorderLayout());
		String[] header = "Mã hóa đơn;Ngày thanh toán;Giờ thanh toán;Tên nhân viên;Số vé;Tổng hóa đơn"
				.split(";");
		tablemodel = new DefaultTableModel(header, 0);
		table = new JTable(tablemodel);
		scroll = new JScrollPane(table);
		JCen1.add(scroll);
		JCenp.add(JCen1, BorderLayout.CENTER);
		JCenp.add(JNorth, BorderLayout.NORTH);

		Box hbphim = Box.createHorizontalBox();
		JPSmall1 = new JPanel();
		JPSmall2 = new JPanel();
		JPSmall1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Lọc"));
		JPSmall2
				.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Tra cứu"));
		hbphim.add(JPSmall1);
		hbphim.add(JPSmall2);
		JNorth.add(hbphim);
		vb1 = Box.createVerticalBox();
		vb2 = Box.createVerticalBox();
		hb1 = Box.createHorizontalBox();
		hb2 = Box.createHorizontalBox();
		hb3 = Box.createHorizontalBox();
		hb4 = Box.createHorizontalBox();
		vb1.add(Box.createVerticalStrut(10));
		vb1.add(hb1);
		vb1.add(Box.createVerticalStrut(15));
		vb1.add(hb2);
		vb1.add(Box.createVerticalStrut(10));
		vb2.add(Box.createVerticalStrut(10));
		vb2.add(hb3);
		vb2.add(Box.createVerticalStrut(15));
		vb2.add(hb4);
		vb2.add(Box.createVerticalStrut(10));
		JPSmall1.add(vb1);
		JPSmall2.add(vb2);

		lbl = new JLabel("Độ tuổi:   ");
		String[] tp = { "Tất cả", "10", "18" };
		JComboBox<String> cbxdotuoi = new JComboBox<String>(tp);
		lblnn = new JLabel("Thể loại:  ");
		String[] tgt = { "Tất cả", "Lãng mạn", "Hài" };
		JComboBox<String> cbxtgt = new JComboBox<String>(tgt);

		cbxtgt.setPreferredSize(new Dimension(200, 25));

		hb1.add(lbl);
		hb1.add(cbxdotuoi);
		hb2.add(lblnn);
		hb2.add(cbxtgt);

		lbltent = new JLabel("Tên phim:  ");
		txttent = new JTextField();
		btnTim = new JButton("Tìm");
		lblloait = new JLabel("Loại phim: ");
		txtloait = new JTextField();
		btnLammoinvw = new JButton("Làm mới");

		hb3.add(lbltent);
		hb3.add(txttent);
		hb3.add(btnTim);
		hb4.add(lblloait);
		hb4.add(txtloait);
		hb4.add(btnLammoinvw);
		
		txttent.setPreferredSize(new Dimension(200, 25));
		txtloait.setPreferredSize(new Dimension(200, 25));
		btnTim.setPreferredSize(new Dimension(100, 25));
		btnLammoinvw.setPreferredSize(new Dimension(100, 25));
		
		
	
		btnTim.addActionListener(this);
		btnLammoinvw.addActionListener(this);
		
		table.addMouseListener(this);
		
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
