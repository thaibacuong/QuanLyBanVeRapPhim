package gui;

import javax.swing.JFrame;

public class DatVe_UI extends JFrame{
	public DatVe_UI() {
		
		
		setTitle("Phim");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	public static void main(String[] args) {
		new DatVe_UI();
	}
}
