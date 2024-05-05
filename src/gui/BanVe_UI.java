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

public class BanVe_UI extends JFrame implements ActionListener, MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTabbedPane tabbedPane;
	private JPanel pntrangchu;
	private JPanel pnphim;
	private JPanel pndatve;
	private JPanel pnkhachhang;
	private JPanel pnhoadon;
	private JPanel pnthongke;
	private JPanel JTim;
	private JLabel lblTim;
	private JTextField txtTim;
	private JButton btnTim;
	private JPanel JWest;
	private JLabel lblTenPhim;
	private JTextField txtTenPhim;
	private JLabel lblPhong;
	private JTextField txtPhong;
	private JLabel lblThoiGian;
	private JTextField txtThoiGian;
	private JLabel lblSoGhe;
	private JTextField txtSoGhe;
	private JPanel JCen;
	private JLabel[] lblPhims;
	private JLabel[] phimImages;
	private JButton[] btnDatVes;
	private JPanel[] JPhims;
	private JPanel JSouth;
	private ImageIcon originalIcon;
	private int scaledWidth;
	private int scaledHeight;
	private ImageIcon scaledIcon;
	private JLabel lblTen;
	private JTextField txtTen;
	private JLabel lblNS;
	private JTextField txtNS;
	private JLabel lblGT;
	private JComboBox cbxGT;
	private JTextField txtSDT;
	private JLabel lblCCCD;
	private JTextField txtCCCD;
	private JLabel lblCV;
	private JComboBox cbxCV;
	private JLabel lblMK;
	private JButton btnThem;
	private JButton btnCapNhat;
	private JButton btnXoa;
	private JButton btnLamMoi;
	private JLabel lblSDT;
	private JTextField txtMK;
	private JButton btnThoat;
	private JPanel JNorth;
	private JPanel JTraCuu;
	private JPanel JThoat;
	private JPanel JNorth1;
	private JLabel lblNgayBD;
	private JTextField txtNgayBD;
	private JLabel lblTenNV;
	private JTextField txtTenNV;
	private JLabel lblNgayKT;
	private JTextField txtNgayKT;
	private JLabel lblSoDT;
	private JTextField txtSoDT;
	private JButton btnChiTiet;
	private DefaultTableModel tableModel;
	private JTable table;
	private JScrollPane scroll;
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
	private Box vbnv3;
	private Box vbnv4;
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
	private JPanel JCentk;
	private JPanel JNorthtk;
	private JPanel JCentk1;
	private JPanel JCentk2;
	private JPanel JCentk3;
	private JPanel JNorthtk1;
	private JPanel JNorthtk2;
	private JLabel lblngaybd;
	private JLabel lblngaykt;
	private JTextField txtngaybd;
	private JTextField txtngaykt;
	private JLabel lbltenphim;
	private JTextField txtenphim;
	private JLabel lbltenphong;
	private JTextField txttenphong;
	private JButton btnlammoitk;
	private JButton btntimtk;
	private JPanel JWestphim;
	private JLabel lblthoiluong;
	private JTextField txttenphim;
	private JTextField txtthoiluong;
	private JLabel lbltuoi;
	private JTextField txttuoi;
	private JTextField txtngayck;
	private JLabel lblngayck;
	private JLabel lblnhasx;
	private JTextField txtnhasx;
	private JLabel lblloaiphim;
	private JTextField txtloaiphim;
	private JComboBox cbxloaiphim;
	private JButton btnCapNhatphim;
	private JButton btnThemphim;
	private JButton btnXoaphim;
	private JButton btnLamMoiphim;
	private JButton btnThoatphim;
	private JPanel JCen1phim;
	private JPanel JNorth1phim;
	private DefaultTableModel tablemodelphim;
	private JTable tablephim;
	private JScrollPane scrollphim;
	private JPanel JPSmall1phim;
	private JPanel JPSmall2phim;
	private Box vbphim1;
	private Box vbphim2;
	private Box hbphim1;
	private Box hbphim2;
	private Box hbphim3;
	private Box hbphim4;
	private JLabel lbltenphimtk;
	private JLabel lblnn;
	private JTextField txttenphimt;
	private JLabel lbltenphimt;
	private JLabel lblsodienthoaiw;
	private JButton btnTimphim;
	private JTextField txtsodienthoaiw;
	private JButton btnLammoinvw;
	private JPanel JCen1p;
	private JLabel lblloaiphimt;
	private JTextField txtloaiphimt;
	private JLabel lblsuatchieuve;
	private JLabel lblLoaiGhe;
	private JTextField txtLoaiGhe;
	private JPanel JCendatve;
	private JLabel lblManhinh;
	private JLabel[][] chairs;
	private Vector<?> headerdatve;
	private JTable tabledatve;
	private DefaultTableModel tablemodeldatve;
	private JScrollPane scrolldatve;
	private JLabel lbldadat;
	private JLabel lblthuong;
	private JLabel lblvip;
	private JLabel lblghedadat;
	private JLabel lblghethuong;
	private JLabel lblghevip;
	private JLabel lblghedamua;
	private JLabel lblghedaban;
	private JLabel lbldaban;
	private JLabel lblchon;
	private JLabel lblghechon;
	private JPanel JCendatveNorth;
	private JPanel JCendatveCenter;
	private JPanel JCendatveSouth;
	private Box vbdatve;
	private NhanVien_Dao nv_dao;
	private JTextField txtManv;
	private JLabel lblManv;
	private JButton btnLamMoinv1;
	private JTextField txtTT;
	private JLabel lblTT;
	private JComboBox<String> cbxchucvu;
	private JComboBox<String> cbxtinhtrang;
	private JComboBox<String> cbxtinhtrangtrai;

	public BanVe_UI() {
		UI();
	}

	private void UI() {
		nv_dao = new NhanVien_Dao();

		

		pndatve = new JPanel(new BorderLayout());

		// đặt vé ui

		JWest = new JPanel();
		Box hb0 = Box.createVerticalBox();
		lblTenPhim = new JLabel("Tên phim:");
		String[] dstenphim = { "", "Avenger", "Mắt biếc" };
		JComboBox<String> cbxdstenphim = new JComboBox<String>(dstenphim);
		lblsuatchieuve = new JLabel("Suất chiếu:");
		String[] dssuatchieu = { "", "2:00-4:00", "6:00-8:00" };
		JComboBox<String> cbxdssuatchieu = new JComboBox<String>(dssuatchieu);
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

		pndatve.add(JCendatve, BorderLayout.CENTER);
		pndatve.add(JWest, BorderLayout.WEST);

		pnnhanvien = new JPanel(new BorderLayout());
		// nhân viên ui

		JWest = new JPanel();
		pnnhanvien.add(JWest, BorderLayout.WEST);
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
		hb10.add(btnThoat);

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
		vb1.add(hb10);

		JCen1 = new JPanel(new BorderLayout());
		pnnhanvien.add(JCen1, BorderLayout.CENTER);
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

		pnhoadon = new JPanel(new BorderLayout());
		// hóa đơn

		JNorth1 = new JPanel();
		JTraCuu = new JPanel();
		JThoat = new JPanel();
		JNorth1.add(JTraCuu, BorderLayout.CENTER);
		JNorth1.add(JThoat, BorderLayout.EAST);
		pnhoadon.add(JNorth1, BorderLayout.NORTH);
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

		JCen = new JPanel(new BorderLayout());
		pnhoadon.add(JCen, BorderLayout.CENTER);
		JCen.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Danh sách bán vé"));
		String[] headers = "Mã hóa đơn;Ngày thanh toán;Giờ thanh toán;Tên nhân viên;Tên khách hàng;Số điện thoại khách hàng;Tổng hóa đơn"
				.split(";");
		tableModel = new DefaultTableModel(headers, 0);
		table = new JTable(tableModel);
		scroll = new JScrollPane(table);
		JCen.add(scroll, BorderLayout.CENTER);

		pnthongke = new JPanel(new BorderLayout());
		// thong ke UI
		JCentk = new JPanel();
		JNorthtk = new JPanel();
		pnthongke.add(JCentk, BorderLayout.CENTER);
		pnthongke.add(JNorthtk, BorderLayout.NORTH);
		JCentk1 = new JPanel();
		JCentk2 = new JPanel();
		JCentk3 = new JPanel();
		JNorthtk1 = new JPanel();
		JNorthtk2 = new JPanel();

		Box hbtk1 = Box.createHorizontalBox();
		Box hbtk2 = Box.createHorizontalBox();
		Box hbtk3 = Box.createHorizontalBox();
		Box hbtk4 = Box.createHorizontalBox();

		lblngaybd = new JLabel("Ngày bắt đầu: ");
		txtngaybd = new JTextField();
		lblngaykt = new JLabel("Ngày kết thúc: ");
		txtngaykt = new JTextField();
		lbltenphim = new JLabel("Tên phim: ");
		txtenphim = new JTextField();
		lbltenphong = new JLabel("Tên phòng: ");
		txttenphong = new JTextField();
		btntimtk = new JButton("Tìm");
		btnlammoitk = new JButton("Làm mới");

		tabbedPane = new JTabbedPane();
		tabbedPane.add(pntrangchu, "Trang Chủ");
		tabbedPane.add(pnphim, "Phim");
		tabbedPane.add(pndatve, "Đặt Vé");
		tabbedPane.add(pnnhanvien, "Nhân Viên");
		tabbedPane.add(pnhoadon, "Hóa Đơn");
		tabbedPane.add(pnthongke, "Thống Kê");
		add(tabbedPane);

		btnLammoinv.addActionListener(this);
		btnLamMoinv1.addActionListener(this);
		btnThem.addActionListener(this);
		btnTimnv.addActionListener(this);
		cbxtinhtrang.addActionListener(this);
		cbxchucvu.addActionListener(this);
		btnXoa.addActionListener(this);
		btnCapNhat.addActionListener(this);
		
		tablenv.addMouseListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void createChair() {
		int rows = 7;
		int cols = 7;
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
		} else if (o.equals(btnLamMoinv1)) {
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
			tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ",
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
					tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ",
							nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
							nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
				} else if (selectedChucvu.equals("Nhân viên")) {
					if (nv.getChuVu().equals("Nhân viên bán vé")) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				} else {
					if (nv.getChuVu().equals("Quản lý")) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				}
			} else if (selectedTrangThai.equals("Còn làm việc")) {
				if (selectedChucvu.equals("Tất cả")) {
					if (!nv.isTrangThai()) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				} else if (selectedChucvu.equals("Nhân viên")) {
					if (nv.getChuVu().equals("Nhân viên bán vé") && !nv.isTrangThai()) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				} else {
					if (nv.getChuVu().equals("Quản lý") && !nv.isTrangThai()) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				}
			} else if (selectedTrangThai.equals("Nghỉ việc")) {
				if (selectedChucvu.equals("Tất cả")) {
					if (nv.isTrangThai()) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				} else if (selectedChucvu.equals("Nhân viên")) {
					if (nv.getChuVu().equals("Nhân viên bán vé") && nv.isTrangThai()) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ",
								nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
								nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
					}
				} else {
					if (nv.getChuVu().equals("Quản lý") && nv.isTrangThai()) {
						tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ",
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
				tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ",
						nv.getNgaySinh(), nv.getSoDT(), nv.getChuVu(), nv.getMatKH(),
						nv.isTrangThai() ? "Nghỉ việc" : "Còn làm việc" });
			}

		}
		if (!txttennv.getText().equals("")) {
			NhanVien_Dao nhanVienDao = new NhanVien_Dao();
			ArrayList<NhanVien> danhSachNhanVien = nhanVienDao.getAllNhanVienByTen(txttennv.getText());
			tablemodel.setRowCount(0);

			for (NhanVien nv : danhSachNhanVien) {
				tablemodel.addRow(new Object[] { nv.getMaNV(), nv.getTenNV(), nv.isGioiTinh() ? "Nam" : "Nữ",
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
		BanVe_UI banVeUI = new BanVe_UI();
		banVeUI.loaddataNhanVien();
	}

}
