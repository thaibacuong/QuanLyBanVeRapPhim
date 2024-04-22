package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
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
	private JPanel JCen;
	private Container layeredPane;

	
	public TrangChu() {
		// Khởi tạo JPanel và đặt layout
	    JWest = new JPanel(new BorderLayout());
	    add(JWest, BorderLayout.WEST);
	    JWest.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK)));

	    // Tạo JLabel để hiển thị hình ảnh
	    backgrounfImg = new ImageIcon(getClass().getResource("Image/useDangNhap.jpg"));
	    myLabel = new JLabel(backgrounfImg);

	    // Thêm JLabel vào JPanel
	    JWest.add(myLabel, BorderLayout.CENTER);

	    // Thêm JLabel mới để hiển thị văn bản
	    lbltenUse = new JLabel("Hi add");
	    JWest.add(lbltenUse, BorderLayout.SOUTH);

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
