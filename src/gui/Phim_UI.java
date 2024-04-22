 package gui;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Phim_UI extends JFrame implements ActionListener, MouseListener{
    private JLabel[] phimImages;
    private JLabel[] lblPhims;
    private JButton[] btnDatVes;
    private JPanel[] JPhims;
    private ImageIcon originalIcon;
    private int scaledWidth;
    private int scaledHeight;
    private ImageIcon scaledIcon;
    private JPanel JTim;
    private JLabel lblTim;
    private JTextField txtTim;
    private JButton btnTim;
    private JPanel JCen;
    private JPanel JSuatChieu;
    private DefaultTableModel modelSuatChieu;
    private JTable tableSuatChieu;
	private JPanel JWest;
	private JLabel lblTenPhim;
	private JTextField txtTenPhim;
	private JTextField txtPhong;
	private JLabel lblPhong;
	private JLabel lblThoiGian;
	private JTextField txtThoiGian;
	private JLabel lblSoGhe;
	private JTextField txtSoGhe;
	private JPanel JSouth;

    public Phim_UI() {
        JTim = new JPanel();
        JTim.add(lblTim = new JLabel("Nhập phim cần tìm: "));
        JTim.add(txtTim = new JTextField(15));
        JTim.add(btnTim = new JButton("Tìm"));
        add(JTim, BorderLayout.NORTH);

        JWest=new JPanel();
        Box hb1=Box.createVerticalBox();
        lblTenPhim=new JLabel("Tên phim:");
        txtTenPhim=new JTextField(18);
        lblPhong=new JLabel("Tên phòng:");
        txtPhong=new JTextField(18);
        lblThoiGian=new JLabel("Thời gian:");
        txtThoiGian=new JTextField(18);
        lblSoGhe=new JLabel("Số ghế:");
        txtSoGhe=new JTextField(18);
        hb1.add(lblTenPhim);
        hb1.add(txtTenPhim);
        hb1.add(lblPhong);
        hb1.add(txtPhong);
        hb1.add(lblThoiGian);
        hb1.add(txtThoiGian);
        hb1.add(lblSoGhe);
        hb1.add(txtSoGhe);
        JWest.add(hb1);
        JWest.setPreferredSize(new Dimension(230, 600));
        add(JWest,BorderLayout.WEST);
        
        JCen = new JPanel(new GridLayout(0, 6)); 
        int numPanels = 5; 
        phimImages = new JLabel[numPanels];
        lblPhims = new JLabel[numPanels];
        btnDatVes = new JButton[numPanels];
        JPhims = new JPanel[numPanels];
        createPanel(numPanels);
        add(new JScrollPane(JCen), BorderLayout.CENTER);
        
        JSouth=new JPanel();
        
        setTitle("Phim");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
//        setSize(800, 600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    public void createPanel(int n) {
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

    public static void main(String[] args) {
        new Phim_UI();
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
		Object o=e.getSource();
		
		
	}
}
