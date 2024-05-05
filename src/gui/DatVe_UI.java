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
import dao.GheNgoi_Dao;
import dao.Phim_Dao;
import dao.PhongChieu_Dao;
import dao.SuatChieu_DAO;
import entity.Phim;

public class DatVe_UI extends JFrame implements ActionListener, MouseListener {
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
	private JComboBox cbxdsphong;
	private JLabel lblTongtien;
	private JTextField txtTongtien;
	private JPanel JEast;
	private JPanel JEastTongtien;
	private int sumTien=0;
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

		String tenduocchon = cbxdstenphim.getSelectedItem().toString();
		String maphim = Phim_Dao.getMaPhimByTenPhim(tenduocchon);

		// suất chiếu
		lblsuatchieuve = new JLabel("Suất chiếu:");

		ArrayList<String> danhSachSuatChieu = new ArrayList<>();
		danhSachSuatChieu = SuatChieu_DAO.getAllThoiGianSuatChieuByMaPhim(maphim);
		JComboBox<String> cbxdssuatchieu = new JComboBox<>(danhSachSuatChieu.toArray(new String[0]));

		// phòng

		lblPhong = new JLabel("Tên phòng:");

		ArrayList<String> danhSachPhong = new ArrayList<>();
		danhSachPhong = PhongChieu_Dao.getTenPhong();
		cbxdsphong = new JComboBox<>(danhSachPhong.toArray(new String[0]));

		lblSoGhe = new JLabel("Số ghế:");
		txtSoGhe = new JTextField(18);
		txtSoGhe.setEditable(false);
		JWest.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		hb0.add(lblTenPhim);
		hb0.add(cbxdstenphim);
		hb0.add(lblsuatchieuve);
		hb0.add(cbxdssuatchieu);
		hb0.add(lblPhong);
		hb0.add(cbxdsphong);
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
		
		createAllChairs();

		Box hbdatve = Box.createHorizontalBox();
		Box hbdatve1 = Box.createHorizontalBox();
		Box hbdatve2 = Box.createHorizontalBox();
		Box hbdatve3 = Box.createHorizontalBox();
		Box hbdatve4 = Box.createHorizontalBox();
		Box hbdatve5 = Box.createVerticalBox();

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

		lblTongtien = new JLabel("Tổng cộng:");
		txtTongtien = new JTextField(18);
		txtTongtien.setEditable(false);
		
		hbdatve1.add(lblghedaban);
		hbdatve1.add(lbldaban);
		hbdatve2.add(lblghechon);
		hbdatve2.add(lblchon);
		hbdatve3.add(lblghethuong);
		hbdatve3.add(lblthuong);
		hbdatve4.add(lblghevip);
		hbdatve4.add(lblvip);
		
		hbdatve5.add(lblTongtien);
		hbdatve5.add(txtTongtien);
		
		
		
		hbdatve.add(hbdatve1);
		hbdatve.add(hbdatve2);
		hbdatve.add(hbdatve3);
		hbdatve.add(hbdatve4);
		
		vbdatve.add(Box.createVerticalStrut(10));
		vbdatve.add(hbdatve);
		vbdatve.add(Box.createVerticalStrut(10));
		vbdatve.add(hbdatve5);
		
		
		JCendatveCenter.add(vbdatve, BorderLayout.CENTER);

		String[] headerdatve = "Mã nhân viên;Tên phim;Số ghế;Giá ghế;Thành tiền".split(";");
		tablemodeldatve = new DefaultTableModel(headerdatve, 0);
		tabledatve = new JTable(tablemodeldatve);
		scrolldatve = new JScrollPane(tabledatve);
		JCendatve.add(scrolldatve, BorderLayout.SOUTH);
	
		add(JCendatve, BorderLayout.CENTER);
		add(JWest, BorderLayout.WEST);

		cbxdstenphim.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tenduocchon = cbxdstenphim.getSelectedItem().toString();
				String maphim = Phim_Dao.getMaPhimByTenPhim(tenduocchon);
				ArrayList<String> danhSachSuatChieu = SuatChieu_DAO.getAllThoiGianSuatChieuByMaPhim(maphim);
				cbxdssuatchieu.removeAllItems();
				for (String thoiGian : danhSachSuatChieu) {
					cbxdssuatchieu.addItem(thoiGian);
				}
			}
		});

		cbxdssuatchieu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		cbxdsphong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				changeChairColor();
				
			}
		});
		
		setTitle("Đặt vé");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);

	}

	public void createAllChairs() {
	    int rows = 6;
	    int cols = 6;
	    char[] rowLabels = { 'A', 'B', 'C', 'D', 'E', 'F' };
	    chairs = new JLabel[rows][cols];
	    JPanel seatPanel = new JPanel(new GridLayout(rows, cols));

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            String seatCode = String.valueOf(rowLabels[i]) + (j + 1);
	            JLabel chairLabel = new JLabel(seatCode);
	            chairLabel.setHorizontalAlignment(SwingConstants.CENTER);
	            chairLabel.setOpaque(true);
	            chairLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	            chairLabel.setBackground(Color.GREEN);
	            chairLabel.setPreferredSize(new Dimension(40, 40));
	            chairLabel.addMouseListener(this);
	            chairs[i][j] = chairLabel;
	            seatPanel.add(chairLabel);
	        }
	    }

	    vbdatve.add(seatPanel);
	}

	public void changeChairColor() {
	    String maPhong = PhongChieu_Dao.getMaPhongByTenphong(cbxdsphong.getSelectedItem().toString());

	    for (int i = 0; i < chairs.length; i++) {
	        for (int j = 0; j < chairs[i].length; j++) {
	            String seatCode = String.valueOf((char) ('A' + i)) + (j + 1);
	            Boolean trangthai = GheNgoi_Dao.getTrangthaiByMaGheMaPhong(seatCode, maPhong);
	            String loaighe = GheNgoi_Dao.getLoaiGehByMaGheMaPhong(seatCode, maPhong);
	            
	            if (!trangthai) {
	                chairs[i][j].setBackground(Color.BLACK);
	            } else if (loaighe.equals("VIP")) {
	                chairs[i][j].setBackground(Color.YELLOW);
	            } else {
	                chairs[i][j].setBackground(Color.GREEN);
	            }
	        }
	    }
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
	    Color normalColor = Color.GREEN;
	    Color vipColor = Color.YELLOW;
	    Color selectedColor = Color.RED;
	    Color originalColor = clickedSeat.getBackground();

	    
	    String seatName = clickedSeat.getText(); 
	    String maPhong = PhongChieu_Dao.getMaPhongByTenphong(cbxdsphong.getSelectedItem().toString());
	    String loaiGhe = GheNgoi_Dao.getLoaiGehByMaGheMaPhong(seatName, maPhong);
	    boolean trangThai = GheNgoi_Dao.getTrangthaiByMaGheMaPhong(seatName, maPhong);
	    
	    if (trangThai) {
	        if (loaiGhe.equals("VIP")) {
	            if (originalColor.equals(vipColor)) {
	            	sumTien+=80000;
	                clickedSeat.setBackground(selectedColor);
	            } else {
	            	sumTien-=80000;
	                clickedSeat.setBackground(vipColor);
	            }
	        } else {
	            if (originalColor.equals(normalColor)) {
	            	sumTien+=60000;
	                clickedSeat.setBackground(selectedColor); 
	            } else {
	            	sumTien-=80000;
	                clickedSeat.setBackground(normalColor);
	            }
	        }
	    }
	    txtTongtien.setText( String.valueOf(sumTien));
	    updateNumberOfSelectedSeats(clickedSeat.getBackground());
	}

	private void updateNumberOfSelectedSeats(Color seatColor) {
	    String numberOfSeatsText = txtSoGhe.getText();
	    int currentNumberOfSeats = 0;
	    if (!numberOfSeatsText.isEmpty()) {
	        currentNumberOfSeats = Integer.parseInt(numberOfSeatsText);
	    }

	    if (seatColor.equals(Color.RED)) {
	        txtSoGhe.setText(String.valueOf(currentNumberOfSeats + 1)); 
	    } else {
	        txtSoGhe.setText(String.valueOf(currentNumberOfSeats - 1)); 
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
	}
}
