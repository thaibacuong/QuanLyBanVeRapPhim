package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class TrangChu extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel JWest;
	private ImageIcon backgrounfImg;
	private JLabel myLabel;
	private JLabel lbltenUse,l;
	private JPanel JCen;
	private Container layeredPane;
	private ImageIcon originalIcon;
	private ImageIcon scaledIcon;
	private ImageIcon scaledImgIcon;
	private int scaledWidth;
	private int scaledHeight;
	private Container panel;
	private JPanel Jcen;
	private JLabel myLabel1;
	private ImageIcon backgrounfImg1;
	private int scaledWidth1;
	private int scaledHeight1;
	private JLabel myLabel11;
	private ImageIcon scaledIcon1;
	private JButton btnCPass;
	private JButton btnLogin;
	private JButton btnExit;
	private JButton btnMovie,nv,thongke,datve,hoadon,dangxuat;

	
	public TrangChu() {
		// Khởi tạo JPanel và đặt layout
	    JWest = new JPanel(new BorderLayout());
	    add(JWest, BorderLayout.WEST);
	    JWest.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK)));

	    // Tạo JLabel để hiển thị hình ảnh
	    backgrounfImg = new ImageIcon(getClass().getResource("Image/useDangNhap.jpg"));
	    myLabel = new JLabel(backgrounfImg);
	    
	    scaledWidth = backgrounfImg.getIconWidth() / 2;
        scaledHeight = backgrounfImg.getIconHeight() / 2;
        scaledIcon = new ImageIcon(backgrounfImg.getImage().getScaledInstance(scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH));
        myLabel = new JLabel(scaledIcon);
 
        myLabel.setBorder(BorderFactory.createEmptyBorder(100, 100, 0, 100)); // Bố trí khoảng trống

	    // Thêm JLabel vào JPanel
	    JWest.add(myLabel, BorderLayout.NORTH);
	    
	    Font font = new Font("Arial",Font.BOLD,30);
	   
	    // Thêm JLabel mới để hiển thị văn bản
	    lbltenUse = new JLabel("Hi"); 
	    lbltenUse.setHorizontalAlignment(JLabel.CENTER);
	    JWest.add(lbltenUse, BorderLayout.CENTER);
	    lbltenUse.setFont(font);
	    
	    JPanel Jsouth = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Jsouth.setPreferredSize(new Dimension(500, 300));
        JWest.add(Jsouth, BorderLayout.SOUTH);

        btnCPass = new JButton("Đổi mật khẩu");
        btnExit = new JButton("Thoát");
        Jsouth.add(btnCPass);
        Jsouth.add(btnExit);
        
	    JLayeredPane layeredPane = new JLayeredPane();
	   
        getContentPane().add(layeredPane);
        
        
	    Jcen = new JPanel(new GridLayout(2,3));
	   
	    btnMovie=new JButton("Phim", new ImageIcon(getClass().getResource("Image/Movies.png")));
	    ImageIcon originalIcon = new ImageIcon(getClass().getResource("Image/Movies.png"));
	    int scaledWidth = 50 ;
	    int scaledHeight = 50 ;
	    ImageIcon scaledIcon = new ImageIcon(originalIcon.getImage().getScaledInstance(scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH));
	    btnMovie.setIcon(scaledIcon);
	    Jcen.add(btnMovie);
	    
	    nv=new JButton("Nhân Viên", new ImageIcon(getClass().getResource("Image/Customer.png")));
	    ImageIcon originalInv = new ImageIcon(getClass().getResource("Image/Customer.png"));
	    ImageIcon scaledIconNv = new ImageIcon(originalInv.getImage().getScaledInstance(scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH));
	    nv.setIcon(scaledIconNv);
	    Jcen.add(nv);
	    
	    thongke=new JButton("Thống Kê", new ImageIcon(getClass().getResource("Image/Statistic.png")));
	    ImageIcon originalItk = new ImageIcon(getClass().getResource("Image/Statistic.png"));
	    ImageIcon scaledIcontk = new ImageIcon(originalItk.getImage().getScaledInstance(scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH));
	    thongke.setIcon(scaledIcontk);
	    Jcen.add(thongke);
	    
	    datve=new JButton("Đặt Vé", new ImageIcon(getClass().getResource("Image/Rooms.png")));
	    ImageIcon originalIdv = new ImageIcon(getClass().getResource("Image/Rooms.png"));
	    ImageIcon scaledIcondv = new ImageIcon(originalIdv.getImage().getScaledInstance(scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH));
	    datve.setIcon(scaledIcondv);
	    Jcen.add(datve);
	    
	    hoadon=new JButton("Hóa Đơn", new ImageIcon(getClass().getResource("Image/History.png")));
	    hoadon.setBounds(0, 0, 400, 0);
	    ImageIcon originalIhd = new ImageIcon(getClass().getResource("Image/History.png"));
	    ImageIcon scaledIconhd = new ImageIcon(originalIhd.getImage().getScaledInstance(scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH));
	    hoadon.setIcon(scaledIconhd);
	    Jcen.add(hoadon);
	    
	    dangxuat=new JButton("Đăng Xuất", new ImageIcon(getClass().getResource("Image/Back.png")));
	    ImageIcon originalIdx = new ImageIcon(getClass().getResource("Image/Back.png"));
	    ImageIcon scaledIcondx = new ImageIcon(originalIdx.getImage().getScaledInstance(scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH));
	    dangxuat.setIcon(scaledIcondx);
	    Jcen.add(dangxuat);

	    
	    add(Jcen);
	    Jcen.setLayout(new GridLayout(2, 3, 10, 10)); // 10 là khoảng cách ngang và dọc giữa các thành phần

	 // Hoặc sử dụng EmptyBorder cho từng JButton
	 int padding = 10; // Đặt khoảng cách mong muốn
	 Border emptyBorder = BorderFactory.createEmptyBorder(padding, padding, padding, padding);

	 btnMovie.setBorder(emptyBorder);
	 nv.setBorder(emptyBorder);
	 thongke.setBorder(emptyBorder);
	 datve.setBorder(emptyBorder);
	 hoadon.setBorder(emptyBorder);
	 dangxuat.setBorder(emptyBorder);
        layeredPane.add(myLabel, Integer.valueOf(0)); 
        
//        Jcen.add(myLabel11, BorderLayout.CENTER);
        

	    setTitle("Trang chủ");
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setResizable(false);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
	    setSize(500, 400);
	    setLocationRelativeTo(null);
	    setVisible(true);
	}
	public static void main(String[] args) {
		new TrangChu();
	}
}
