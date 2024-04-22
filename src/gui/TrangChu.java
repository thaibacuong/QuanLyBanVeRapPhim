package gui;

import javax.swing.JFrame;

public class TrangChu extends JFrame{
	public TrangChu() {
		
		
		
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
