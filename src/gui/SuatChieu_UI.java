package gui;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import entity.SuatChieu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SuatChieu_UI extends JFrame implements ActionListener {
   

    private JPanel JWest;
	private JLabel lblMaSC;
	private JLabel lblGioBD;
	private JLabel lblGioKT;
	private JTextField txtMaSC;
	private JTextField txtGioKT;
	private JTextField txtGioBD;
	private JTextField txtNgayChieu;
	private JLabel lblNgayChieu;
	private JLabel lblPhim;
	private JTextField txtMaPhim;
	private JButton btnThemSC;
	private JButton btnCapNhatSC;
	private JButton btnXoaSC;
	private JButton btnLamMoiSC;
	private JButton btnThoatSC;
	private JLabel lblNgayBD;
	private JTextField txtNgayBD;
	private JLabel lblNgayKT;
	private JTextField txtNgayKT;
	private JTextField txtGioBDp;
	private JLabel lblGioBDp;
	private JLabel lblGioKTp;
	private JTextField txtGioKTp;

	public SuatChieu_UI() {
        setTitle("Quản lý Suất chiếu");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JWest = new JPanel();
        add(JWest, BorderLayout.WEST);
        JWest.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Thông tin suất chiếu"));

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

        lblMaSC = new JLabel("Mã suất chiếu ");
        txtMaSC = new JTextField(25);
        lblGioBD = new JLabel("Giờ bắt đầu  ");
        txtGioBD = new JTextField(25);
        lblGioKT = new JLabel("Giờ kết thúc  ");
        txtGioKT = new JTextField(25);
        lblNgayChieu = new JLabel("Ngày chiếu  ");
        txtNgayChieu = new JTextField(25);
        lblPhim = new JLabel("Mã phim  ");
        txtMaPhim = new JTextField(25);

        btnThemSC = new JButton("Thêm mới");
        btnCapNhatSC = new JButton("Cập nhật");
        btnXoaSC = new JButton("Xóa");
        btnLamMoiSC = new JButton("Làm mới");
        btnThoatSC = new JButton("Thoát");

        Dimension defaultSize1 = lblGioKT.getPreferredSize();
        int increasedWidth1 = defaultSize1.width + 4;
        lblGioBD.setPreferredSize(new Dimension(increasedWidth1, defaultSize1.height));
        lblNgayChieu.setPreferredSize(new Dimension(increasedWidth1, defaultSize1.height));
        lblPhim.setPreferredSize(new Dimension(increasedWidth1, defaultSize1.height));

        btnCapNhatSC.setPreferredSize(btnThemSC.getPreferredSize());
        btnXoaSC.setPreferredSize(btnThemSC.getPreferredSize());
        btnLamMoiSC.setPreferredSize(btnThemSC.getPreferredSize());

        JWest.revalidate();
        JWest.repaint();

        hb.add(lblMaSC);
        hb.add(txtMaSC);
        hb1.add(lblGioBD);
        hb1.add(txtGioBD);
        hb2.add(lblGioKT);
        hb2.add(txtGioKT);
        hb3.add(lblNgayChieu);
        hb3.add(txtNgayChieu);
        hb4.add(lblPhim);
        hb4.add(txtMaPhim);
        hb5.add(btnThemSC);
        hb5.add(Box.createHorizontalStrut(30));
        hb5.add(btnCapNhatSC);
        hb6.add(btnXoaSC);
        hb6.add(Box.createHorizontalStrut(30));
        hb6.add(btnLamMoiSC);
        hb7.add(btnThoatSC);

        vb1.add(Box.createVerticalStrut(15));
        vb1.add(hb);
        vb1.add(Box.createVerticalStrut(25));
        vb1.add(hb1);
        vb1.add(Box.createVerticalStrut(25));
        vb1.add(hb2);
        vb1.add(Box.createVerticalStrut(25));
        vb1.add(hb3);
        vb1.add(Box.createVerticalStrut(25));
        vb1.add(hb4);
        vb1.add(Box.createVerticalStrut(30));
        vb1.add(hb5);
        vb1.add(Box.createVerticalStrut(25));
        vb1.add(hb6);
        vb1.add(Box.createVerticalStrut(25));
        vb1.add(hb7);


        lblGioBDp = new JLabel("Ngày bắt đầu  ");
        txtGioBDp = new JTextField(25);
        lblGioKTp = new JLabel("Ngày kết thúc  ");
        txtGioKTp = new JTextField(25);

        vb1.add(hb2); 
        vb1.add(Box.createVerticalStrut(25));
        vb1.add(hb3); 

        
        btnThemSC.addActionListener(this);
        btnCapNhatSC.addActionListener(this);
        btnXoaSC.addActionListener(this);
        btnLamMoiSC.addActionListener(this);
//        .addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        
    }

    

    public void XoaSuatchieu() {
        // Code xử lý xóa suất chiếu
    }

    public void loaddataTimsc() {
        // Code xử lý tìm kiếm suất chiếu
    }

    public void loaddataXoaSuatchieu(int row) {
        // Code xử lý load dữ liệu khi xóa suất chiếu
    }

    public static void main(String[] args) {
        SuatChieu_UI ui = new SuatChieu_UI();
        ui.setVisible(true);
    }
}
