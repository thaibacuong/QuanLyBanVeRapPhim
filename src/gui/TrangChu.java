package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

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
	private JLabel lbltenUse;

	private ImageIcon scaledIcon;

	private int scaledWidth;
	private int scaledHeight;

	private ImageIcon backgrounfImg1;
	private JButton btnCPass;
	private JButton btnExit;
	private JPanel Jcen;



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

        myLabel.setBorder(BorderFactory.createEmptyBorder(100, 50, 0, 50)); // Bố trí khoảng trống
        myLabel.setBorder(BorderFactory.createEmptyBorder(100, 100, 0, 100)); // Bố trí khoảng trống

	    // Thêm JLabel vào JPanel
	    JWest.add(myLabel, BorderLayout.NORTH);
	    
	    Font font = new Font("Arial",Font.BOLD,30);
	   
	    // Thêm JLabel mới để hiển thị văn bản
	    lbltenUse = new JLabel("Hi add"); 
	    lbltenUse.setHorizontalAlignment(JLabel.CENTER);
	    JWest.add(lbltenUse, BorderLayout.CENTER);
	    lbltenUse.setFont(font);


	    JPanel Jsouth = new JPanel();
	    Jsouth.setBounds(500, 0, 500, 100);
	    JWest.add(Jsouth, BorderLayout.SOUTH);
	    Jsouth.add(btnCPass = new JButton("change Password"));
	    Jsouth.add(btnExit = new JButton("exit"));
	    
	    JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);

	    Jcen = new JPanel();
	    backgrounfImg1 = new ImageIcon(getClass().getResource("Image/LoginBackground.jpg"));
	    myLabel = new JLabel(backgrounfImg1);
        myLabel.setBounds(0, 0, 1000, 1000);
        myLabel.setBounds(0, 0, 2000, 1000);
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