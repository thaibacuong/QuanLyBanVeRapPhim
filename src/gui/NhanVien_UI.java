package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.NhanVien_Dao;
import entity.NhanVien;

public class NhanVien_UI extends JPanel implements ActionListener, MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTabbedPane tabbedPane;
	private JPanel pntrangchu;
	private JPanel pnphim;
	private JPanel pndatve;
	private JPanel pnhoadon;
	private JPanel pnthongke;
	private JPanel JWest;
	private JLabel lblTen;
	private JTextField txtTen;
	private JLabel lblNS;
	private JTextField txtNS;
	private JLabel lblGT;
	private JComboBox<String> cbxGT;
	private JTextField txtSDT;
	private JLabel lblCV;
	private JComboBox<String> cbxCV;
	private JLabel lblMK;
	private JButton btnThem;
	private JButton btnCapNhat;
	private JButton btnXoa;
	private JLabel lblSDT;
	private JTextField txtMK;
	private JButton btnThoat;
	private JPanel JCen1;
	private JPanel pnnhanvien;
	private JPanel JCen1nv;
	private JPanel JNorth1nv;
	private DefaultTableModel tablemodel;
	private JTable tablenv;
	private JScrollPane scrollnv;
	private JPanel JPSmall1;
	private JPanel JPSmall2;
	private Box vbnv1;
	private Box vbnv2;
	private Box hbnv1;
	private Box hbnv2;
	private Box hbnv4;
	private Box hbnv3;
	private JLabel lblchucvu;
	private JLabel lbltinhtrang;
	private JTextField txttennv;
	private JButton btnTimnv;
	private JLabel lbltennv;
	private JLabel lblsodienthoai;
	private JTextField txtsodienthoai;
	private JButton btnLammoinv;
	private NhanVien_Dao nv_dao;
	private JTextField txtManv;
	private JLabel lblManv;
	private JButton btnLamMoinv1;
	private JLabel lblTT;
	private JComboBox<String> cbxchucvu;
	private JComboBox<String> cbxtinhtrang;
	private JComboBox<String> cbxtinhtrangtrai;

	public NhanVien_UI() {
		UI();
	}

	private void UI() {
		nv_dao = new NhanVien_Dao();
		pnnhanvien = new JPanel(new BorderLayout());
		// nhân viên ui

		JWest = new JPanel();
		add(JWest, BorderLayout.WEST);
		JWest.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Thông tin nhân viên"));

		Box vb1 = Box.createVerticalBox();
		Box hb = Box.createHorizontalBox();
		Box hb1 = Box.createHorizontalBox();
		Box hb2 = Box.createHorizontalBox();
		Box hb3 = Box.createHorizontalBox();
		Box hb4 = Box.createHorizontalBox();
		Box hb5 = Box.createHorizontalBox();
		Box hb6 = Box.createHorizontalBox();
		Box hb7 = Box.createHorizontalBox();
		Box hb8 = Box.createHorizontalBox();
		Box hb9 = Box.createHorizontalBox();
		Box hb10 = Box.createHorizontalBox();

		JWest.add(vb1);
		String[] gioiTinh = { null, "Nam", "Nữ" };
		String[] chucVu = { null, "Nhân viên bán vé", "Quản lý" };

		lblManv = new JLabel("Mã nhân viên    ");
		txtManv = new JTextField(25);
		lblTen = new JLabel("Tên nhân viên   ");
		txtTen = new JTextField(25);
		lblNS = new JLabel("Năm sinh  ");
		txtNS = new JTextField(25);
		lblGT = new JLabel("Giới tính  ");
		cbxGT = new JComboBox<>(gioiTinh);
		lblSDT = new JLabel("Số điện thoại  ");
		txtSDT = new JTextField(25);
		lblTT = new JLabel("Tình trạng  ");
		String[] ttt = { "", "Còn làm việc", "Nghỉ việc" };
		cbxtinhtrangtrai = new JComboBox<String>(ttt);
		lblCV = new JLabel("Chức vụ  ");
		cbxCV = new JComboBox<>(chucVu);
		lblMK = new JLabel("Mật khẩu  ");
		txtMK = new JTextField(25);
		btnThem = new JButton("Thêm mới");
		btnCapNhat = new JButton("Cập nhật");
		btnXoa = new JButton("Xóa");
		btnLamMoinv1 = new JButton("Làm mới");
		btnThoat = new JButton("Thoát");

		Dimension defaultSize1 = lblTen.getPreferredSize();
		int increasedWidth1 = defaultSize1.width + 4;
		lblNS.setPreferredSize(new Dimension(increasedWidth1, defaultSize1.height));
		lblGT.setPreferredSize(new Dimension(increasedWidth1, defaultSize1.height));
		lblSDT.setPreferredSize(new Dimension(increasedWidth1, defaultSize1.height));
		lblTT.setPreferredSize(new Dimension(increasedWidth1, defaultSize1.height));
		lblCV.setPreferredSize(new Dimension(increasedWidth1, defaultSize1.height));
		lblMK.setPreferredSize(new Dimension(increasedWidth1, defaultSize1.height));

		btnCapNhat.setPreferredSize(btnThem.getPreferredSize());
		btnXoa.setPreferredSize(btnThem.getPreferredSize());
		btnLamMoinv1.setPreferredSize(btnThem.getPreferredSize());
		JWest.revalidate();
		JWest.repaint();

		hb.add(lblManv);
		hb.add(txtManv);
		hb1.add(lblTen);
		hb1.add(txtTen);
		hb2.add(lblNS);
		hb2.add(txtNS);
		hb3.add(lblGT);
		hb3.add(cbxGT);
		hb4.add(lblSDT);
		hb4.add(txtSDT);
		hb5.add(lblTT);
		hb5.add(cbxtinhtrangtrai);
		hb6.add(lblCV);
		hb6.add(cbxCV);
		hb7.add(lblMK);
		hb7.add(txtMK);
		hb8.add(btnThem);
		hb8.add(Box.createHorizontalStrut(30));
		hb8.add(btnCapNhat);
		hb9.add(btnXoa);
		hb9.add(Box.createHorizontalStrut(30));
		hb9.add(btnLamMoinv1);

		vb1.add(hb);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb1);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb2);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb3);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb4);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb5);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb6);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb7);
		vb1.add(Box.createVerticalStrut(30));
		vb1.add(hb8);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb9);
		vb1.add(Box.createVerticalStrut(25));

		JCen1 = new JPanel(new BorderLayout());
		add(JCen1, BorderLayout.CENTER);
		JNorth1nv = new JPanel(new GridLayout(1, 12));
		JCen1nv = new JPanel(new BorderLayout());
		String[] header = "Mã nhân viên;Tên nhân viên;Giới tính;Ngày sinh;Số điện thoại;Chức vụ;Mật khẩu;Trình trạng"
				.split(";");
		tablemodel = new DefaultTableModel(header, 0);
		tablenv = new JTable(tablemodel);
		scrollnv = new JScrollPane(tablenv);
		JCen1nv.add(scrollnv);
		JCen1.add(JCen1nv, BorderLayout.CENTER);
		JCen1.add(JNorth1nv, BorderLayout.NORTH);

		Box hbnv = Box.createHorizontalBox();
		JPSmall1 = new JPanel();
		JPSmall2 = new JPanel();
		JPSmall1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Lọc"));
		JPSmall2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Tra cứu"));
		hbnv.add(JPSmall1);
		hbnv.add(JPSmall2);
		JNorth1nv.add(hbnv);
		vbnv1 = Box.createVerticalBox();
		vbnv2 = Box.createVerticalBox();
		hbnv1 = Box.createHorizontalBox();
		hbnv2 = Box.createHorizontalBox();
		hbnv3 = Box.createHorizontalBox();
		hbnv4 = Box.createHorizontalBox();
		vbnv1.add(Box.createVerticalStrut(10));
		vbnv1.add(hbnv1);
		vbnv1.add(Box.createVerticalStrut(15));
		vbnv1.add(hbnv2);
		vbnv1.add(Box.createVerticalStrut(10));
		vbnv2.add(Box.createVerticalStrut(10));
		vbnv2.add(hbnv3);
		vbnv2.add(Box.createVerticalStrut(15));
		vbnv2.add(hbnv4);
		vbnv2.add(Box.createVerticalStrut(10));
		JPSmall1.add(vbnv1);
		JPSmall2.add(vbnv2);

		lblchucvu = new JLabel("Chức vụ:     ");
		String[] cv = { "Tất cả", "Nhân viên", "Quản lý" };
		cbxchucvu = new JComboBox<String>(cv);
		lbltinhtrang = new JLabel("Tình trạng:  ");
		String[] tt = { "Tất cả", "Còn làm việc", "Nghỉ việc" };
		cbxtinhtrang = new JComboBox<String>(tt);

		cbxtinhtrang.setPreferredSize(new Dimension(200, 25));

		hbnv1.add(lblchucvu);
		hbnv1.add(cbxchucvu);
		hbnv2.add(lbltinhtrang);
		hbnv2.add(cbxtinhtrang);

		lbltennv = new JLabel("Tên nhân viên:  ");
		txttennv = new JTextField();
		btnTimnv = new JButton("Tìm");
		lblsodienthoai = new JLabel("Số điện thoại:    ");
		txtsodienthoai = new JTextField();
		btnLammoinv = new JButton("Làm mới");

		hbnv3.add(lbltennv);
		hbnv3.add(txttennv);
		hbnv3.add(btnTimnv);
		hbnv4.add(lblsodienthoai);
		hbnv4.add(txtsodienthoai);
		hbnv4.add(btnLammoinv);

		txttennv.setPreferredSize(new Dimension(200, 25));
		txtsodienthoai.setPreferredSize(new Dimension(200, 25));
		btnTimnv.setPreferredSize(new Dimension(100, 25));
		btnLammoinv.setPreferredSize(new Dimension(100, 25));

		loaddataNhanVien();

		
//		add(pnnhanvien, "Nhân Viên");
//		tabbedPane.add(pnhoadon, "Hóa Đơn");
//		tabbedPane.add(pnthongke, "Thống Kê");
//		add(tabbedPane);

		btnLammoinv.addActionListener(this);
		btnLamMoinv1.addActionListener(this);
		btnThem.addActionListener(this);
		btnTimnv.addActionListener(this);
		cbxtinhtrang.addActionListener(this);
		cbxchucvu.addActionListener(this);
		btnXoa.addActionListener(this);
		btnCapNhat.addActionListener(this);
		
		tablenv.addMouseListener(this);
		
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setResizable(true);
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
//		setLocationRelativeTo(null);
//		setVisible(true);
	}

	

	@Override
	public void mouseClicked(MouseEvent e) {
//		JLabel clickedSeat = (JLabel) e.getSource();
//		Color originalColor = Color.GREEN;
//		Color selectedColor = Color.RED;
//
//		if (clickedSeat.getBackground().equals(originalColor)) {
//			clickedSeat.setBackground(selectedColor);
//		} else {
//			clickedSeat.setBackground(originalColor);
//		}
		int row= tablenv.getSelectedRow();
		txtManv.setText(tablenv.getValueAt(row, 0).toString());
        txtTen.setText(tablenv.getValueAt(row, 1).toString());
        txtNS.setText(tablenv.getValueAt(row, 3).toString());
        cbxGT.setSelectedItem(tablenv.getValueAt(row, 2).toString());
        txtSDT.setText(tablenv.getValueAt(row, 4).toString());
        cbxCV.setSelectedItem(tablenv.getValueAt(row, 5).toString());
        txtMK.setText(tablenv.getValueAt(row, 6).toString());
        cbxtinhtrangtrai.setSelectedItem(tablenv.getValueAt(row, 7).toString());
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
		Object o = e.getSource();
		if (e.getSource() == btnCapNhat) {
	        int selectedRow = tablenv.getSelectedRow();
	        if (selectedRow == -1) {
	            JOptionPane.showMessageDialog(null, "Vui lòng chọn một nhân viên để cập nhật.", "Thông báo", JOptionPane.WARNING_MESSAGE);
	        } else {
	        	String maNV = txtManv.getText();
				String tenNV = txtTen.getText();
				String ngaySinh = txtNS.getText();
				String soDT = txtSDT.getText();
				String trangthai = (String) cbxtinhtrangtrai.getSelectedItem();
				String matKH = txtMK.getText();
				String gioiTinh = (String) cbxGT.getSelectedItem();
				boolean gioiTinhBool = gioiTinh.equals("Nam") ? false : true;
				String chucVu = (String) cbxCV.getSelectedItem();
				boolean trangThai = trangthai.equals("Còn làm việc") ? false : true;

				NhanVien nv = new NhanVien(maNV, tenNV, gioiTinhBool, ngaySinh, soDT, chucVu, matKH, trangThai);
	            NhanVien_Dao nhanVienDao = new NhanVien_Dao();
	            nhanVienDao.updateNhanVien(nv);
	            tablemodel.setRowCount(0);
	            loaddataNhanVien();

	            JOptionPane.showMessageDialog(null, "Cập nhật thông tin nhân viên thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
	        }
	    }
		if(o.equals(btnXoa)) {
			int row= tablenv.getSelectedRow();
			System.out.println(row);
			loaddataXoanv(row);
		}
		if (o.equals(btnLammoinv)) {
			txttennv.setText("");
			txtsodienthoai.setText("");
		}
		if (o.equals(btnLamMoinv1)) {
			txtManv.setText("");
			txtTen.setText("");
			txtNS.setText("");
			txtSDT.setText("");
			cbxtinhtrangtrai.setSelectedIndex(0);
			txtMK.setText("");
			cbxGT.setSelectedIndex(0);
			cbxCV.setSelectedIndex(0);
		}
		String selectedTrangThai = (String) cbxtinhtrang.getSelectedItem();
		String selectedChucvu = (String) cbxchucvu.getSelectedItem();
		updateTableDataFilter(selectedTrangThai, selectedChucvu);
		if (o.equals(btnThem)) {
			String maNV = txtManv.getText();
			String tenNV = txtTen.getText();
			String ngaySinh = txtNS.getText();
			String soDT = txtSDT.getText();
			String trangthai = (String) cbxtinhtrangtrai.getSelectedItem();
			String matKH = txtMK.getText();
			String gioiTinh = (String) cbxGT.getSelectedItem();
			boolean gioiTinhBool = gioiTinh.equals("Nam") ? false : true;
			String chucVu = (String) cbxCV.getSelectedItem();
			boolean trangThai = trangthai.equals("Còn làm việc") ? false : true;

			NhanVien nv = new NhanVien(maNV, tenNV, gioiTinhBool, ngaySinh, soDT, chucVu, matKH, trangThai);

			try {
				boolean success = nv_dao.addNhanVien(nv);
				if (success) {
					tablemodel.setRowCount(0);
					loaddataNhanVien();
					JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");
				} else {
					JOptionPane.showMessageDialog(this, "Thêm nhân viên thất bại!");
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		if (o.equals(btnTimnv)) {
			loaddataTimnv();
		}
		
//		    txtTen.setText("");
//		    txtNS.setText("");
//		    txtSDT.setText("");
//		    txtTT.setText("");
//		    txtMK.setText("");
//		    cbxGT.setSelectedIndex(0);
//		    cbxCV.setSelectedIndex(0);
	}

	public void loaddataNhanVien() {
		NhanVien_Dao nhanVienDao = new NhanVien_Dao();
		ArrayList<NhanVien> danhSachNhanVien = nhanVienDao.getAllNhanVien();

		for (NhanVien nv : danhSachNhanVien) {
			tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nữ" : "Nam",
					nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
					nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
		}

	}

	public void updateTableDataFilter(String selectedTrangThai, String selectedChucvu) {
		NhanVien_Dao nhanVienDao = new NhanVien_Dao();
		ArrayList<NhanVien> danhSachNhanVien = nhanVienDao.getAllNhanVien();
		tablemodel.setRowCount(0);

		for (NhanVien nv : danhSachNhanVien) {
			if (selectedTrangThai.equals("Tất cả")) {
				if (selectedChucvu.equals("Tất cả")) {
					tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nữ" : "Nam",
							nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
							nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
				} else if (selectedChucvu.equals("Nhân viên")) {
					if (nv.getChuVu().equals("Nhân viên bán vé")) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nữ" : "Nam",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				} else {
					if (nv.getChuVu().equals("Quản lý")) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nữ" : "Nam",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				}
			} else if (selectedTrangThai.equals("Còn làm việc")) {
				if (selectedChucvu.equals("Tất cả")) {
					if (!nv.isTrangThai()) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nữ" : "Nam",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				} else if (selectedChucvu.equals("Nhân viên")) {
					if (nv.getChuVu().equals("Nhân viên bán vé") && !nv.isTrangThai()) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nữ" : "Nam",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				} else {
					if (nv.getChuVu().equals("Quản lý") && !nv.isTrangThai()) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nữ" : "Nam",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				}
			} else if (selectedTrangThai.equals("Nghỉ việc")) {
				if (selectedChucvu.equals("Tất cả")) {
					if (nv.isTrangThai()) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nữ" : "Nam",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				} else if (selectedChucvu.equals("Nhân viên")) {
					if (nv.getChuVu().equals("Nhân viên bán vé") && nv.isTrangThai()) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nữ" : "Nam",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				} else {
					if (nv.getChuVu().equals("Quản lý") && nv.isTrangThai()) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nữ" : "Nam",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				}
			}
		}
	}

	public void loaddataTimnv() {
		if (!txtsodienthoai.getText().equals("")) {
			NhanVien_Dao nhanVienDao = new NhanVien_Dao();
			ArrayList<NhanVien> danhSachNhanVien = nhanVienDao.getAllNhanVienBySDT(txtsodienthoai.getText());
			tablemodel.setRowCount(0);
			
			for (NhanVien nv : danhSachNhanVien) {
				tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nữ" : "Nam",
						nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
						nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
			}

		}
		if (!txttennv.getText().equals("")) {
			NhanVien_Dao nhanVienDao = new NhanVien_Dao();
			ArrayList<NhanVien> danhSachNhanVien = nhanVienDao.getAllNhanVienByTen(txttennv.getText());
			tablemodel.setRowCount(0);

			for (NhanVien nv : danhSachNhanVien) {
				tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nữ" : "Nam",
						nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
						nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });

			}
		}
	}
	public void loaddataXoanv(int row) {
		
	    if (row != -1) {
	        int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa nhân viên này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
	        if (choice == JOptionPane.YES_OPTION) {
	            XoaNV();
	        } else {
	            JOptionPane.showMessageDialog(null, "Hủy xóa nhân viên", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
	        }
	    } else {
	        JOptionPane.showMessageDialog(null, "Vui lòng chọn một nhân viên để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
	    }
	}

	
	public void XoaNV() {
		NhanVien_Dao nhanVienDao = new NhanVien_Dao();
		nhanVienDao.deleteNhanVien(txtManv.getText());
		ArrayList<NhanVien> danhSachNhanVien = nhanVienDao.getAllNhanVien();
		tablemodel.setRowCount(0);

		for (NhanVien nv : danhSachNhanVien) {
			tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ",
					nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
					nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });

		}
	}


	public static void main(String[] args) {
		NhanVien_UI banVeUI = new NhanVien_UI();
		banVeUI.loaddataNhanVien();
	}

}
