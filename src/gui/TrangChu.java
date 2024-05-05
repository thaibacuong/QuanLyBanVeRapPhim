package gui;
import java.awt.*;
import javax.swing.*;

public class TrangChu extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel JWest;
	private ImageIcon backgrounfImg;
	private JLabel myLabel;
	private JLabel lbltenUse;

	private ImageIcon scaledIcon;

	private int scaledWidth;
	private int scaledHeight;

	private ImageIcon backgrounfImg1;
	private JButton btnCPass;
	private JButton btnExit;
	private JPanel Jcen;
	private Image scaledImage;

	public TrangChu() {
		ImageIcon icon = new ImageIcon("gui.Image/LoginBackground.jpg");
		Image image = icon.getImage();
		JLabel label = new JLabel(icon);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Image scaledImage = image.getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
		add(label);
		
//		// Khởi tạo JPanel và đặt layout
//	    JWest = new JPanel(new BorderLayout());
//	    add(JWest, BorderLayout.WEST);
//	    JWest.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK)));
//	    // Tạo JLabel để hiển thị hình ảnh
//	    backgrounfImg = new ImageIcon(getClass().getResource("Image/useDangNhap.jpg"));
//	    myLabel = new JLabel(backgrounfImg);
//	    
//	    scaledWidth = backgrounfImg.getIconWidth() / 2;
//        scaledHeight = backgrounfImg.getIconHeight() / 2;
//        scaledIcon = new ImageIcon(backgrounfImg.getImage().getScaledInstance(scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH));
//        myLabel = new JLabel(scaledIcon);
//
//        myLabel.setBorder(BorderFactory.createEmptyBorder(100, 100, 0, 100)); // Bố trí khoảng trống
////        myLabel.setBorder(BorderFactory.createEmptyBorder(100, 100, 0, 100)); // Bố trí khoảng trống
//
//	    // Thêm JLabel vào JPanel
//	    JWest.add(myLabel, BorderLayout.NORTH);
//	    
//	    Font font = new Font("Arial",Font.BOLD,30);
//	   
//	    // Thêm JLabel mới để hiển thị văn bản
//	    lbltenUse = new JLabel("Hi add"); 
//	    lbltenUse.setHorizontalAlignment(JLabel.CENTER);
//	    JWest.add(lbltenUse, BorderLayout.CENTER);
//	    
//	    lbltenUse.setFont(font);
//
//
//	    JPanel Jsouth = new JPanel();
//	    JWest.add(Jsouth, BorderLayout.SOUTH);
//	    Jsouth.add(btnCPass = new JButton("change Password"));
//	    Jsouth.add(btnExit = new JButton("exit"));
//	    Jsouth.setBorder(BorderFactory.createEmptyBorder(0, 0, 150, 0));
//	    
//	    JLayeredPane layeredPane = new JLayeredPane();
//        getContentPane().add(layeredPane);
//
//	    Jcen = new JPanel();
//	    backgrounfImg1 = new ImageIcon(getClass().getResource("Image/TCdaomai.png"));
//	    scaledImage = backgrounfImg1.getImage().getScaledInstance(1300, 1000, Image.SCALE_SMOOTH);
//        ImageIcon scaledIcon = new ImageIcon(scaledImage);
//	    myLabel = new JLabel(scaledIcon);
//        myLabel.setBounds(20, 100, 1400, 950);
//
//        layeredPane.add(myLabel, Integer.valueOf(0)); 
//        
//        JLabel textLabel = new JLabel("RẠP VÉ XEM PHIM");
//        textLabel.setFont(new Font("Courier New", Font.BOLD, 50));
//        textLabel.setForeground(Color.RED); // Chỉnh màu chữ
//        textLabel.setBounds(500, 0, 600, 100); // Đặt vị trí
//        layeredPane.add(textLabel, Integer.valueOf(1)); // Đặt lớp vị trí
//        
//	    setTitle("Trang chủ");
//	    setDefaultCloseOperation(EXIT_ON_CLOSE);
//	    setResizable(false);
//	    setExtendedState(JFrame.MAXIMIZED_BOTH);
//	    setSize(500, 400);
//	    setLocationRelativeTo(null);
//	    setVisible(true);
	}
	public static void main(String[] args) {
		new TrangChu();
	}
	public void getPanelTrangChu() {
		// TODO Auto-generated method stub
		new TrangChu();
	}
}