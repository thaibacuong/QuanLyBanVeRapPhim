package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import connectDB.ConnectDB;
import dao.Phim_Dao;
import dao.SuatChieu_DAO;
import entity.Phim;

public class DatVe_UI extends JFrame implements ActionListener, MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel JWest;
	private JLabel lblTenPhim;
	private JLabel lblsuatchieuve;
	private JTextField txtPhong;
	private JLabel lblPhong;
	private JLabel lblSoGhe;
	private JPanel JCendatve;
	private JLabel lblManhinh;
	private JPanel JCendatveCenter;
	private JPanel JCendatveSouth;
	private JPanel JCendatveNorth;
	private Box vbdatve;
	private JLabel lbldaban;
	private JLabel lblthuong;
	private JLabel lblghevip;
	private JLabel lblchon;
	private JLabel lblvip;
	private DefaultTableModel tablemodeldatve;
	private JScrollPane scrolldatve;
	private JTextField txtSoGhe;
	private JLabel lblghedaban;
	private JLabel lblghethuong;
	private JLabel lblghechon;
	private JTable tabledatve;
	private JLabel[][] chairs;
	public DatVe_UI() throws SQLException {

		// đặt vé ui

		JWest = new JPanel();
		Box hb0 = Box.createVerticalBox();
		// tên phim
		lblTenPhim = new JLabel("Tên phim:");
		
		ArrayList<String> danhSachTenPhim = new ArrayList<>();
		try {
		    danhSachTenPhim = Phim_Dao.layDanhSachTenPhim();
		} catch (SQLException e) {
		    e.printStackTrace();
		}

		String[] arrayTenPhim = danhSachTenPhim.toArray(new String[danhSachTenPhim.size()]);
		JComboBox<String> cbxdstenphim = new JComboBox<>(arrayTenPhim);

		// lấy dữ liệu
		
		String tenduocchon=cbxdstenphim.getSelectedItem().toString();
		String maphim=Phim_Dao.getMaPhimByTenPhim(tenduocchon);
		
		// suất chiếu
		lblsuatchieuve = new JLabel("Suất chiếu:");
		
		ArrayList<String> danhSachSuatChieu = new ArrayList<>();
		danhSachSuatChieu = SuatChieu_DAO.getAllThoiGianSuatChieuByMaPhim(maphim);
		JComboBox<String> cbxdssuatchieu = new JComboBox<>(danhSachSuatChieu.toArray(new String[0]));

		
		lblPhong = new JLabel("Tên phòng:");
		txtPhong = new JTextField(18);
		txtPhong.setEditable(false);
		lblSoGhe = new JLabel("Số ghế:");
		txtSoGhe = new JTextField(18);
		txtSoGhe.setEditable(false);
		JWest.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		hb0.add(lblTenPhim);
		hb0.add(cbxdstenphim);
		hb0.add(lblsuatchieuve);
		hb0.add(cbxdssuatchieu);
		hb0.add(lblPhong);
		hb0.add(txtPhong);
		hb0.add(lblSoGhe);
		hb0.add(txtSoGhe);
		hb0.add(lblSoGhe);
		hb0.add(txtSoGhe);
		JWest.add(hb0);

		JCendatve = new JPanel(new BorderLayout());

		lblManhinh = new JLabel("MÀN HÌNH");
		Font fo = new Font("Arial", Font.BOLD, 20);
		lblManhinh.setFont(fo);
		lblManhinh.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		lblManhinh.setOpaque(true);
		lblManhinh.setBackground(Color.GRAY);
		JCendatveNorth = new JPanel();
		JCendatveCenter = new JPanel();
		JCendatveSouth = new JPanel();
		JCendatveNorth.add(lblManhinh, BorderLayout.CENTER);
		JCendatve.add(JCendatveNorth, BorderLayout.NORTH);
		JCendatve.add(JCendatveCenter, BorderLayout.CENTER);
		JCendatve.add(JCendatveSouth, BorderLayout.SOUTH);
		vbdatve = Box.createVerticalBox();
		createChair();

		Box hbdatve = Box.createHorizontalBox();
		Box hbdatve1 = Box.createHorizontalBox();
		Box hbdatve2 = Box.createHorizontalBox();
		Box hbdatve3 = Box.createHorizontalBox();
		Box hbdatve4 = Box.createHorizontalBox();

		lbldaban = new JLabel("  Ghế đã bán  ");
		lblghedaban = new JLabel("       ");
		lblghedaban.setOpaque(true);
		lblghedaban.setBackground(Color.BLACK);
		lblthuong = new JLabel("  Ghế thường  ");
		lblghethuong = new JLabel("       ");
		lblghethuong.setOpaque(true);
		lblghethuong.setBackground(Color.GREEN);
		lblvip = new JLabel("  Ghế vip  ");
		lblghevip = new JLabel("       ");
		lblghevip.setOpaque(true);
		lblghevip.setBackground(Color.YELLOW);
		lblchon = new JLabel("  Ghế đang chọn  ");
		lblghechon = new JLabel("       ");
		lblghechon.setBackground(Color.RED);
		lblghechon.setOpaque(true);

		hbdatve1.add(lblghedaban);
		hbdatve1.add(lbldaban);
		hbdatve2.add(lblghechon);
		hbdatve2.add(lblchon);
		hbdatve3.add(lblghethuong);
		hbdatve3.add(lblthuong);
		hbdatve4.add(lblghevip);
		hbdatve4.add(lblvip);
		hbdatve.add(hbdatve1);
		hbdatve.add(hbdatve2);
		hbdatve.add(hbdatve3);
		hbdatve.add(hbdatve4);
		vbdatve.add(Box.createVerticalStrut(20));
		vbdatve.add(hbdatve);

		JCendatveCenter.add(vbdatve, BorderLayout.CENTER);

	   

		
		String[] headerdatve = "Tên phim;Số ghế;Giá ghế;Thành tiền".split(";");
		tablemodeldatve = new DefaultTableModel(headerdatve, 0);
		tabledatve = new JTable(tablemodeldatve);
		scrolldatve = new JScrollPane(tabledatve);
		JCendatve.add(scrolldatve, BorderLayout.SOUTH);

		add(JCendatve, BorderLayout.CENTER);
		add(JWest, BorderLayout.WEST);
		
		setTitle("Đặt vé");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
	}
	public void createChair() {
		int rows = 6;
		int cols = 6;
		chairs = new JLabel[rows][cols];
		JPanel seatPanel = new JPanel(new GridLayout(rows, cols));

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				chairs[i][j] = new JLabel("Ghế " + (i * cols + j + 1));
				chairs[i][j].setHorizontalAlignment(SwingConstants.CENTER);
				chairs[i][j].setOpaque(true);
				chairs[i][j].setBorder(BorderFactory.createLineBorder(Color.BLUE));
				chairs[i][j].setBackground(Color.GREEN);
				chairs[i][j].setPreferredSize(new Dimension(50, 50));
				chairs[i][j].addMouseListener(this);
				seatPanel.add(chairs[i][j]);
			}
		}

		vbdatve.add(seatPanel);
	}
	
	public static void main(String[] args) {
		try {
			new DatVe_UI();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	




	
	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel clickedSeat = (JLabel) e.getSource();
		Color originalColor = Color.GREEN;
		Color selectedColor = Color.RED;

		if (clickedSeat.getBackground().equals(originalColor)) {
			clickedSeat.setBackground(selectedColor);
		} else {
			clickedSeat.setBackground(originalColor);
		}
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
