package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrangChu extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel JWest;
	
	public TrangChu() {
		JWest=new JPanel();
		add(JWest,BorderLayout.WEST);
		JWest.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK)));
				
		Box vbl=Box.createVerticalBox();
		
		JWest.add(vbl);
		
		ImageIcon backgrounfImg = new ImageIcon(this.getClass().getResource("Log"))
		
		setTitle("Trang chủ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	public static void main(String[] args) {
		new TrangChu();
	}
}
