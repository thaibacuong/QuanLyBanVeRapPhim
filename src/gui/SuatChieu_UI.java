package gui;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import dao.SuatChieu_DAO;
import entity.Phim;
import entity.SuatChieu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class SuatChieu_UI extends JPanel implements ActionListener, MouseListener {
   

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private JTextField txtGioBDp;
	private JLabel lblGioBDp;
	private JLabel lblGioKTp;
	private JTextField txtGioKTp;
	private JPanel JCen1;
	private JPanel JCen1sc;
	private JPanel JNorth1sc;
	private DefaultTableModel tablemodel;
	private JScrollPane scrollsc;
	private JTable tablesc;
	private JPanel JPSmall1;
	private JPanel JPSmall2;
	private Box vbsc2;
	private Box vbsc1;
	private Box hbsc1;
	private Box hbsc2;
	private Box hbsc3;
	private JButton btnLocscp;
	private JLabel lblNgayp;
	private JTextField txtNgayp;
	private JButton btnTimscp;

	public SuatChieu_UI() {

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

        JCen1 = new JPanel(new BorderLayout());
		add(JCen1, BorderLayout.CENTER);
		JNorth1sc = new JPanel(new GridLayout(1, 12));
		JCen1sc = new JPanel(new BorderLayout());
		String[] header = "Mã suất chiếu;Giờ bắt đầu;Giờ kết thúc;Ngày chiếu;Mã phim".split(";");
		tablemodel = new DefaultTableModel(header, 0);
		tablesc = new JTable(tablemodel);
		scrollsc = new JScrollPane(tablesc);
		JCen1sc.add(scrollsc);
		JCen1.add(JCen1sc, BorderLayout.CENTER);
		JCen1.add(JNorth1sc, BorderLayout.NORTH);
        
		Box hbsc = Box.createHorizontalBox();
		JPSmall1 = new JPanel();
		JPSmall2 = new JPanel();
		JPSmall1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Lọc"));
		JPSmall2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Tra cứu"));
		hbsc.add(JPSmall1);
		hbsc.add(JPSmall2);
		JNorth1sc.add(hbsc);
		vbsc1 = Box.createVerticalBox();
		vbsc2 = Box.createVerticalBox();
		hbsc1 = Box.createHorizontalBox();
		hbsc2 = Box.createHorizontalBox();
		hbsc3 = Box.createHorizontalBox();
		vbsc1.add(Box.createVerticalStrut(10));
		vbsc1.add(hbsc1);
		vbsc1.add(Box.createVerticalStrut(15));
		vbsc1.add(hbsc2);
		vbsc1.add(Box.createVerticalStrut(10));
		vbsc2.add(Box.createVerticalStrut(25));
		vbsc2.add(hbsc3);
		vbsc2.add(Box.createVerticalStrut(10));
		JPSmall1.add(vbsc1);
		JPSmall2.add(vbsc2);
		
        lblGioBDp = new JLabel("Giờ bắt đầu   ");
        txtGioBDp = new JTextField(25);
        lblGioKTp = new JLabel("Giờ kết thúc  ");
        txtGioKTp = new JTextField(25);
        btnLocscp=new JButton("Lọc");
        
        txtGioBDp.setPreferredSize(new Dimension(200,25));
        
        hbsc1.add(lblGioBDp);
		hbsc1.add(txtGioBDp);
		hbsc2.add(lblGioKTp);
		hbsc2.add(txtGioKTp);
		hbsc2.add(btnLocscp);
        
		lblNgayp = new JLabel("Ngày chiếu   ");
        txtNgayp = new JTextField(25);
        btnTimscp=new JButton("Tìm");
		hbsc3.add(lblNgayp);
		hbsc3.add(txtNgayp);
		hbsc3.add(btnTimscp);
		
		loaddataSuatChieu(); 
		
        btnThemSC.addActionListener(this);
        btnCapNhatSC.addActionListener(this);
        btnXoaSC.addActionListener(this);
        btnLamMoiSC.addActionListener(this);
        btnTimscp.addActionListener(this);
        btnLocscp.addActionListener(this);
        
        
        tablesc.addMouseListener(this);
        
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setResizable(true);
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
//		setLocationRelativeTo(null);
//		setVisible(true);
    }

	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(btnXoaSC)) {
			int row = tablesc.getSelectedRow();
			if (row != -1) {
				int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa suất chiếu này?",
						"Xác nhận xóa", JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {
					deleteSuatChieu(); 
				} else {
					JOptionPane.showMessageDialog(null, "Hủy xóa suất chiếu", "Thông báo",
							JOptionPane.INFORMATION_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn một suất chiếu để xóa.", "Thông báo",
						JOptionPane.WARNING_MESSAGE);
			}
		}
		if (o.equals(btnThemSC)) {
		    String maSC = txtMaSC.getText();
		    String gioBD = txtGioBD.getText();
		    String gioKT = txtGioKT.getText();
		    String ngayChieu = txtNgayChieu.getText();
		    String maPhim = txtMaPhim.getText();
		    
		    Phim phim = new Phim(maPhim);
		    SuatChieu sc = new SuatChieu(maSC, gioBD, gioKT, ngayChieu, phim);

		    try {
		    	SuatChieu_DAO suatChieuDao = new SuatChieu_DAO();
		        boolean success = suatChieuDao.addSuatChieu(sc);
		        if (success) {
		            loaddataSuatChieu();
		            JOptionPane.showMessageDialog(this, "Thêm suất chiếu thành công!");
		        } else {
		            JOptionPane.showMessageDialog(this, "Thêm suất chiếu thất bại!");
		        }
		    } catch (Exception ex) {
		        ex.printStackTrace();
		    }
		}

		if (e.getSource() == btnCapNhatSC) {
		    int selectedRow = tablesc.getSelectedRow();
		    if (selectedRow == -1) {
		        JOptionPane.showMessageDialog(null, "Vui lòng chọn một suất chiếu để cập nhật.", "Thông báo", JOptionPane.WARNING_MESSAGE);
		    } else {
		        String maSC = txtMaSC.getText();
		        String gioBD = txtGioBD.getText();
		        String gioKT = txtGioKT.getText();
		        String ngayChieu = txtNgayChieu.getText();
		        String maPhim = txtMaPhim.getText();
		        
		        Phim phim = new Phim(maPhim);
		        SuatChieu sc = new SuatChieu(maSC, gioBD, gioKT, ngayChieu, phim);

		        try {
		        	SuatChieu_DAO suatChieuDao = new SuatChieu_DAO();
		            suatChieuDao.updateSuatChieu(sc);
		            loaddataSuatChieu();

		            JOptionPane.showMessageDialog(null, "Cập nhật thông tin suất chiếu thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		        } catch (Exception ex) {
		            ex.printStackTrace();
		            JOptionPane.showMessageDialog(null, "Cập nhật thông tin suất chiếu thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		}
		
		if(o.equals(btnTimscp)) {
			loaddataTimSC();
		}
		
		if(o.equals(btnLamMoiSC)) {
			txtMaSC.setText("");
	        txtGioBD.setText("");
	        txtGioKT.setText("");
	        txtNgayChieu.setText("");
	        txtMaPhim.setText("");
		}
		if(o.equals(btnLocscp)) {
			loaddataloc();
		}
	}

	public void loaddataTimSC() {
	    if (!txtNgayp.getText().equals("")) {
	        SuatChieu_DAO suatChieuDao = new SuatChieu_DAO();
	        ArrayList<SuatChieu> danhSachSuatChieu = suatChieuDao.getAllSuatChieuByNgayChieu(txtNgayp.getText());
	        tablemodel.setRowCount(0);

	        for (SuatChieu sc : danhSachSuatChieu) {
	            tablemodel.addRow(new Object[] { sc.getMaSC(), sc.getGioBD(), sc.getGioKT(), sc.getNgayChieu(), sc.getPhim().getMaPHIM() });
	        }
	    }
	}

	public void loaddataloc() {
		if(!txtGioBDp.getText().equals("") && !txtGioKTp.getText().equals("")) {
			SuatChieu_DAO suatChieuDao = new SuatChieu_DAO();
	        ArrayList<SuatChieu> danhSachSuatChieu = suatChieuDao.getAllSuatChieuByNgayChieu(txtNgayp.getText());
	        tablemodel.setRowCount(0);

	        for (SuatChieu sc : danhSachSuatChieu) {
	            tablemodel.addRow(new Object[] { sc.getMaSC(), sc.getGioBD(), sc.getGioKT(), sc.getNgayChieu(), sc.getPhim().getMaPHIM() });
	        }
		}
	}
	
    public void deleteSuatChieu() {
    	    SuatChieu_DAO suatChieuDao = new SuatChieu_DAO();
    	    suatChieuDao.deleteSuatChieu(txtMaSC.getText());
    	    loaddataSuatChieu(); 
    }

    public void loaddataSuatChieu() {
    	SuatChieu_DAO suatChieuDao = new SuatChieu_DAO();
        tablemodel.setRowCount(0);
        ArrayList<SuatChieu> danhSachSuatChieu=suatChieuDao.getAllSuatChieu();
    	for (SuatChieu sc : danhSachSuatChieu) {
    	        tablemodel.addRow(new Object[] { sc.getMaSC(), sc.getGioBD(), sc.getGioKT(), sc.getNgayChieu(), sc.getPhim().getMaPHIM() });
    	    }
    	}

    public static void main(String[] args) {
        SuatChieu_UI ui = new SuatChieu_UI();
        ui.setVisible(true);
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = tablesc.getSelectedRow();
		txtMaSC.setText(tablesc.getValueAt(row, 0).toString());
		txtGioBD.setText(tablesc.getValueAt(row, 1).toString());
		txtGioKT.setText(tablesc.getValueAt(row, 2).toString());
		txtNgayChieu.setText(tablesc.getValueAt(row, 3).toString());
		txtMaPhim.setText(tablesc.getValueAt(row, 4).toString());

		
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
}
