package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BanVe_UI extends JFrame implements ActionListener, MouseListener{
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
	public BanVe_UI() {
		UI();
	}
	private void UI() {
		pnphim = new JPanel(new BorderLayout());
		
		//phim ui
		JTim = new JPanel();
        JTim.add(lblTim = new JLabel("Nhập phim cần tìm: "));
        JTim.add(txtTim = new JTextField(15));
        JTim.add(btnTim = new JButton("Tìm"));
        pnphim.add(JTim, BorderLayout.NORTH);

        JWest=new JPanel();
        Box hb0=Box.createVerticalBox();
        lblTenPhim=new JLabel("Tên phim:");
        txtTenPhim=new JTextField(18);
        lblPhong=new JLabel("Tên phòng:");
        txtPhong=new JTextField(18);
        lblThoiGian=new JLabel("Thời gian:");
        txtThoiGian=new JTextField(18);
        lblSoGhe=new JLabel("Số ghế:");
        txtSoGhe=new JTextField(18);
        hb0.add(lblTenPhim);
        hb0.add(txtTenPhim);
        hb0.add(lblPhong);
        hb0.add(txtPhong);
        hb0.add(lblThoiGian);
        hb0.add(txtThoiGian);
        hb0.add(lblSoGhe);
        hb0.add(txtSoGhe);
        JWest.add(hb0);
        JWest.setPreferredSize(new Dimension(230, 600));
        pnphim.add(JWest,BorderLayout.WEST);
        
        JCen = new JPanel(new GridLayout(0, 6)); 
        int numPanels = 5; 
        phimImages = new JLabel[numPanels];
        lblPhims = new JLabel[numPanels];
        btnDatVes = new JButton[numPanels];
        JPhims = new JPanel[numPanels];
        createPanel(numPanels);
        pnphim.add(new JScrollPane(JCen), BorderLayout.CENTER);
        
        JSouth=new JPanel();
        
        pnkhachhang = new JPanel(new BorderLayout());
		//khách hàng ui
        
        JWest=new JPanel();
        pnkhachhang.add(JWest,BorderLayout.WEST);
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
		txtTen=new JTextField(25);
		lblNS=new JLabel("Năm sinh");
		txtNS=new JTextField(25);
		lblGT=new JLabel("Giới tính");
		cbxGT=new JComboBox<>(gioiTinh);
		lblSDT=new JLabel("Số điện thoại");
		txtSDT=new JTextField(25);
		lblCCCD=new JLabel("CCCD");
		txtCCCD=new JTextField(20);
		lblCV=new JLabel("Chức vụ");
		cbxCV=new JComboBox<>(chucVu);
		lblMK=new JLabel("Mật khẩu");
		txtMK=new JTextField(25);
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
        
		pnhoadon = new JPanel(new BorderLayout());
		//hóa đơn
		
		JNorth1=new JPanel();
		JTraCuu=new JPanel();
		JThoat=new JPanel();
		JNorth1.add(JTraCuu,BorderLayout.CENTER);
		JNorth1.add(JThoat,BorderLayout.EAST);
		pnhoadon.add(JNorth1,BorderLayout.NORTH);
		Box hb11=Box.createVerticalBox();
		Box vb11=Box.createHorizontalBox();
		Box vb21=Box.createHorizontalBox();
		hb11.add(vb11);
		hb11.add(Box.createVerticalStrut(15));
		hb11.add(vb21);
		
		JTraCuu.add(hb11);
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
		
		btnChiTiet=new JButton("Xem chi tiết");
		btnThoat=new JButton("Thoát");
		Box vbT=Box.createHorizontalBox();
		vbT.add(Box.createHorizontalStrut(40));
		vbT.add(btnChiTiet);
		vbT.add(Box.createHorizontalStrut(50));
		vbT.add(btnThoat);
		JThoat.add(vbT);
		
		JCen = new JPanel(new BorderLayout()); 
		pnhoadon.add(JCen, BorderLayout.CENTER);
		JCen.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Danh sách bán vé"));
		String[] headers = "Mã hóa đơn;Ngày thanh toán;Giờ thanh toán;Tên nhân viên;Tên khách hàng;Số điện thoại khách hàng;Tổng hóa đơn".split(";");
		tableModel = new DefaultTableModel(headers, 0);
		table = new JTable(tableModel);
		scroll = new JScrollPane(table);
		JCen.add(scroll, BorderLayout.CENTER);
		
        tabbedPane = new JTabbedPane();
		tabbedPane.add(pntrangchu, "Trang Chủ");
		tabbedPane.add(pnphim, "Phim");
		tabbedPane.add(pndatve, "Đặt Vé");
		tabbedPane.add(pnkhachhang, "Khách Hàng");
		tabbedPane.add(pnhoadon, "Hóa Đơn");
		tabbedPane.add(pnthongke, "Thống Kê");
		add(tabbedPane);
        
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
	}
	private void createPanel(int n) {
		for (int i = 0; i < n; i++) {
            String imageName = "Image/PhimImage" + (i + 1) + ".jpg";
            JPhims[i] = new JPanel();
            originalIcon = new ImageIcon(getClass().getResource(imageName));
            scaledWidth = originalIcon.getIconWidth() / 2;
            scaledHeight = originalIcon.getIconHeight() / 2;
            scaledIcon = new ImageIcon(originalIcon.getImage().getScaledInstance(scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH));
            phimImages[i] = new JLabel(scaledIcon);
            lblPhims[i] = new JLabel("Avenger");
            btnDatVes[i] = new JButton("Đặt vé");

            Box vb = Box.createVerticalBox();
            vb.add(phimImages[i]);
            vb.add(lblPhims[i]);
            vb.add(btnDatVes[i]);
            JPhims[i].add(vb);

            JCen.add(JPhims[i]);
		
		}
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
	public static void main(String[] args) {
		new BanVe_UI();
	}
}