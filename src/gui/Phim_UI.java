package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import dao.NhanVien_Dao;
import dao.Phim_Dao;
import entity.NhanVien;
import entity.Phim;

public class Phim_UI extends JPanel implements ActionListener, MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel JWestphim;
	private JLabel lbltenphim;
	private JTextField txttenphim;
	private JTextField txtthoiluong;
	private JLabel lblthoiluong;
	private JLabel lbltuoi;
	private JTextField txtngayck;
	private JLabel lblngayck;
	private JTextField txttuoi;
	private JLabel lblnhasx;
	private JLabel lblloaiphim;
	private JComboBox cbxloaiphim;
	private JTextField txtnhasx;
	private JButton btnThemphim;
	private JButton btnXoaphim;
	private JButton btnCapNhatphim;
	private JButton btnLamMoiphim;
	private JButton btnThoatphim;
	private JPanel JCen1p;
	private JPanel JNorth1phim;
	private JPanel JCen1phim;
	private DefaultTableModel tablemodelphim;
	
	private JPanel JPSmall1phim;
	private JPanel JPSmall2phim;
	private Box vbphim1;
	private Box hbphim2;
	private Box vbphim2;
	private Box hbphim1;
	private Box hbphim3;
	private Box hbphim4;
	private JLabel lbltenphimtk;
	private JLabel lblnn;
	private JLabel lbltenphimt;
	private JButton btnTimphim;
	private JTextField txtloaiphimt;
	private JTextField txttenphimt;
	private JLabel lblloaiphimt;
	private JButton btnLammoinvw;
	private JTable tablephim;
	private JScrollPane scrollphim;
	private JLabel lblmaphim;
	private JTextField txtmaphim;
	private JComboBox<String> cbxdotuoi;
	private JComboBox<String> cbxtgt;
	public Phim_UI() {
		
		JWestphim = new JPanel();
		add(JWestphim, BorderLayout.WEST);
		JWestphim.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Thông tin nhân viên"));

		Box vb1phim = Box.createVerticalBox();
		Box hb0phim = Box.createHorizontalBox();
		Box hb1phim = Box.createHorizontalBox();
		Box hb2phim = Box.createHorizontalBox();
		Box hb3phim = Box.createHorizontalBox();
		Box hb4phim = Box.createHorizontalBox();
		Box hb5phim = Box.createHorizontalBox();
		Box hb6phim = Box.createHorizontalBox();
		Box hb7phim = Box.createHorizontalBox();
		Box hb8phim = Box.createHorizontalBox();
		Box hb9phim = Box.createHorizontalBox();
		Box hb10phim = Box.createHorizontalBox();

		JWestphim.add(vb1phim);
		String[] loaiphim = { null, "Hài", "Tình cảm" };

		lblmaphim = new JLabel("Mã phim   ");
		txtmaphim = new JTextField(25);
		lbltenphim = new JLabel("Tên phim   ");
		txttenphim = new JTextField(25);
		lblthoiluong = new JLabel("Thời lượng  ");
		txtthoiluong = new JTextField(25);
		lbltuoi = new JLabel("Giới hạn tuổi  ");
		txttuoi = new JTextField(25);
		lblngayck = new JLabel("Ngày công chiếu ");
		txtngayck = new JTextField(25);
		lblnhasx = new JLabel("Nhà sản xuất  ");
		txtnhasx = new JTextField(20);
		lblloaiphim = new JLabel("Loại phim  ");
		cbxloaiphim = new JComboBox<>(loaiphim);

		btnThemphim = new JButton("Thêm mới");
		btnCapNhatphim = new JButton("Cập nhật");
		btnXoaphim = new JButton("Xóa");
		btnLamMoiphim = new JButton("Làm mới");
		btnThoatphim = new JButton("Thoát");

		Dimension defaultSize = lblngayck.getPreferredSize();
		int increasedWidth = defaultSize.width + 4;
		lblmaphim.setPreferredSize(new Dimension(increasedWidth, defaultSize.height));
		lbltenphim.setPreferredSize(new Dimension(increasedWidth, defaultSize.height));
		lblthoiluong.setPreferredSize(new Dimension(increasedWidth, defaultSize.height));
		lbltuoi.setPreferredSize(new Dimension(increasedWidth, defaultSize.height));
		lblngayck.setPreferredSize(new Dimension(increasedWidth, defaultSize.height));
		lblnhasx.setPreferredSize(new Dimension(increasedWidth, defaultSize.height));
		lblloaiphim.setPreferredSize(new Dimension(increasedWidth, defaultSize.height));

		btnCapNhatphim.setPreferredSize(btnThemphim.getPreferredSize());
		btnXoaphim.setPreferredSize(btnThemphim.getPreferredSize());
		btnLamMoiphim.setPreferredSize(btnThemphim.getPreferredSize());
		JWestphim.revalidate();
		JWestphim.repaint();

		hb0phim.add(lblmaphim);
		hb0phim.add(txtmaphim);
		hb1phim.add(lbltenphim);
		hb1phim.add(txttenphim);
		hb2phim.add(lblthoiluong);
		hb2phim.add(txtthoiluong);
		hb3phim.add(lbltuoi);
		hb3phim.add(txttuoi);
		hb4phim.add(lblngayck);
		hb4phim.add(txtngayck);
		hb5phim.add(lblnhasx);
		hb5phim.add(txtnhasx);
		hb6phim.add(lblloaiphim);
		hb6phim.add(cbxloaiphim);

		hb8phim.add(btnThemphim);
		hb8phim.add(Box.createHorizontalStrut(30));
		hb8phim.add(btnCapNhatphim);
		hb9phim.add(btnXoaphim);
		hb9phim.add(Box.createHorizontalStrut(30));
		hb9phim.add(btnLamMoiphim);

		vb1phim.add(hb0phim);
		vb1phim.add(Box.createVerticalStrut(25));
		vb1phim.add(hb1phim);
		vb1phim.add(Box.createVerticalStrut(25));
		vb1phim.add(hb2phim);
		vb1phim.add(Box.createVerticalStrut(25));
		vb1phim.add(hb3phim);
		vb1phim.add(Box.createVerticalStrut(25));
		vb1phim.add(hb4phim);
		vb1phim.add(Box.createVerticalStrut(25));
		vb1phim.add(hb5phim);
		vb1phim.add(Box.createVerticalStrut(25));
		vb1phim.add(hb6phim);
		vb1phim.add(Box.createVerticalStrut(25));
		vb1phim.add(hb7phim);
		vb1phim.add(Box.createVerticalStrut(30));
		vb1phim.add(hb8phim);
		vb1phim.add(Box.createVerticalStrut(25));
		vb1phim.add(hb9phim);
		vb1phim.add(Box.createVerticalStrut(25));

		JCen1p = new JPanel(new BorderLayout());
		add(JCen1p, BorderLayout.CENTER);
		JNorth1phim = new JPanel(new GridLayout(1, 12));
		JCen1phim = new JPanel(new BorderLayout());
		String[] headerphim = "Mã phim;Tên phim;Thời lượng;Giới hạn tuổi;Ngày công chiếu;Nhà sản xuất;Loại phim"
				.split(";");
		tablemodelphim = new DefaultTableModel(headerphim, 0);
		tablephim = new JTable(tablemodelphim);
		scrollphim = new JScrollPane(tablephim);
		JCen1phim.add(scrollphim);
		JCen1p.add(JCen1phim, BorderLayout.CENTER);
		JCen1p.add(JNorth1phim, BorderLayout.NORTH);

		Box hbphim = Box.createHorizontalBox();
		JPSmall1phim = new JPanel();
		JPSmall2phim = new JPanel();
		JPSmall1phim.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Lọc"));
		JPSmall2phim
				.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Tra cứu"));
		hbphim.add(JPSmall1phim);
		hbphim.add(JPSmall2phim);
		JNorth1phim.add(hbphim);
		vbphim1 = Box.createVerticalBox();
		vbphim2 = Box.createVerticalBox();
		hbphim1 = Box.createHorizontalBox();
		hbphim2 = Box.createHorizontalBox();
		hbphim3 = Box.createHorizontalBox();
		hbphim4 = Box.createHorizontalBox();
		vbphim1.add(Box.createVerticalStrut(10));
		vbphim1.add(hbphim1);
		vbphim1.add(Box.createVerticalStrut(15));
		vbphim1.add(hbphim2);
		vbphim1.add(Box.createVerticalStrut(10));
		vbphim2.add(Box.createVerticalStrut(10));
		vbphim2.add(hbphim3);
		vbphim2.add(Box.createVerticalStrut(15));
		vbphim2.add(hbphim4);
		vbphim2.add(Box.createVerticalStrut(10));
		JPSmall1phim.add(vbphim1);
		JPSmall2phim.add(vbphim2);

		lbltenphimtk = new JLabel("Độ tuổi:   ");
		String[] tp = { "Tất cả", "10", "18" };
		cbxdotuoi = new JComboBox<String>(tp);
		lblnn = new JLabel("Thể loại:  ");
		String[] tgt = { "Tất cả", "Tình cảm", "Hài" };
		cbxtgt = new JComboBox<String>(tgt);

		cbxtgt.setPreferredSize(new Dimension(200, 25));

		hbphim1.add(lbltenphimtk);
		hbphim1.add(cbxdotuoi);
		hbphim2.add(lblnn);
		hbphim2.add(cbxtgt);

		lbltenphimt = new JLabel("Tên phim:  ");
		txttenphimt = new JTextField();
		btnTimphim = new JButton("Tìm");
		lblloaiphimt = new JLabel("Loại phim: ");
		txtloaiphimt = new JTextField();
		btnLammoinvw = new JButton("Làm mới");

		hbphim3.add(lbltenphimt);
		hbphim3.add(txttenphimt);
		hbphim3.add(btnTimphim);
		hbphim4.add(lblloaiphimt);
		hbphim4.add(txtloaiphimt);
		hbphim4.add(btnLammoinvw);
		
		txttenphimt.setPreferredSize(new Dimension(200, 25));
		txtloaiphimt.setPreferredSize(new Dimension(200, 25));
		btnTimphim.setPreferredSize(new Dimension(100, 25));
		btnLammoinvw.setPreferredSize(new Dimension(100, 25));
		
		loaddataPhim();
		
		btnThemphim.addActionListener(this);
		btnXoaphim.addActionListener(this);
		btnLamMoiphim.addActionListener(this);
		btnTimphim.addActionListener(this);
		btnLammoinvw.addActionListener(this);
		
		cbxdotuoi.addActionListener(this);
		cbxtgt.addActionListener(this);
		
		tablephim.addMouseListener(this);
		
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setResizable(true);
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
//		setLocationRelativeTo(null);
//		setVisible(true);
	}
	public static void main(String[] args) {
		new Phim_UI();
	}
	public void actionPerformed(ActionEvent e) {
	    Object o = e.getSource();

	    if (o.equals(btnXoaphim)) {
	        int row = tablephim.getSelectedRow();
	        if (row != -1) {
	            int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa phim này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
	            if (choice == JOptionPane.YES_OPTION) {
	                deletePhim(); 
	            } else {
	                JOptionPane.showMessageDialog(null, "Hủy xóa phim", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "Vui lòng chọn một phim để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
	        }
	    }

	    if (o.equals(btnThemphim)) {
	        String maPhim = txtmaphim.getText();
	        String tenPhim = txttenphim.getText();
	        String thoiLuong = txtthoiluong.getText();
	        int doTuoi = Integer.parseInt(txttuoi.getText());
	        String ngayCongChieu = txtngayck.getText();
	        String nhaSX = txtnhasx.getText();
	        String loaiPhim = cbxloaiphim.getSelectedItem().toString();
	     
	        Phim phim = new Phim(maPhim, tenPhim, thoiLuong, doTuoi, ngayCongChieu, nhaSX, loaiPhim);

	        try {
	            Phim_Dao phimDao = new Phim_Dao();
	            boolean success = phimDao.addPhim(phim);
	            if (success) {
	                loaddataPhim();
	                JOptionPane.showMessageDialog(this, "Thêm phim thành công!");
	            } else {
	                JOptionPane.showMessageDialog(this, "Thêm phim thất bại!");
	            }
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }

	    String selectedTuoi = (String) cbxdotuoi.getSelectedItem();
		String selectedLoai = (String) cbxtgt.getSelectedItem();
		updateTableDataFilter(selectedTuoi, selectedLoai);
	    
	    if(o.equals(btnLammoinvw)){
	    	 txtloaiphimt.setText("");
	    	 txttenphimt.setText("");
	    	 loaddataPhim();
	    }
	    

	    if (o.equals(btnTimphim)) {
	        loaddataTimPhim();
	    }

	    if (o.equals(btnLamMoiphim)) {
	        clearFields(); 
	    }
	   
	}
	
	public void updateTableDataFilter(String selectedTuoi, String selectedLoai) {
		Phim_Dao phimDao = new Phim_Dao();
		ArrayList<Phim> danhSachPhim = phimDao.getAllPhim();
		tablemodelphim.setRowCount(0);

		for (Phim phim : danhSachPhim) {
			if (selectedTuoi.equals("Tất cả")) {
				if (selectedLoai.equals("Tất cả")) {
					tablemodelphim.addRow(new Object[] { phim.getMaPHIM(), phim.getTenPhim(), phim.getThoiLuong(), phim.getDoTuoi(),
		                    phim.getNgayCongChieu(), phim.getNhaSX(), phim.getLoaiPhim() });
				} else if (selectedLoai.equals("Hài")) {
					if (phim.getLoaiPhim().equals("Hài")) {
						tablemodelphim.addRow(new Object[] { phim.getMaPHIM(), phim.getTenPhim(), phim.getThoiLuong(), phim.getDoTuoi(),
			                    phim.getNgayCongChieu(), phim.getNhaSX(), phim.getLoaiPhim() });
					}
				} else {
					if (phim.getLoaiPhim().equals("Tình cảm")) {
						tablemodelphim.addRow(new Object[] { phim.getMaPHIM(), phim.getTenPhim(), phim.getThoiLuong(), phim.getDoTuoi(),
			                    phim.getNgayCongChieu(), phim.getNhaSX(), phim.getLoaiPhim() });
					}
				}
			} else if (selectedTuoi.equals("10")) {
				if (selectedLoai.equals("Tất cả")) {
					if(phim.getDoTuoi()==10) {
						tablemodelphim.addRow(new Object[] { phim.getMaPHIM(), phim.getTenPhim(), phim.getThoiLuong(), phim.getDoTuoi(),
			                    phim.getNgayCongChieu(), phim.getNhaSX(), phim.getLoaiPhim() });
					}
				} else if (selectedLoai.equals("Hài")) {
					if (phim.getLoaiPhim().equals("Hài") && phim.getDoTuoi()==10) {
						tablemodelphim.addRow(new Object[] { phim.getMaPHIM(), phim.getTenPhim(), phim.getThoiLuong(), phim.getDoTuoi(),
			                    phim.getNgayCongChieu(), phim.getNhaSX(), phim.getLoaiPhim() });
					}
				} else {
					if (phim.getLoaiPhim().equals("Tình cảm") && phim.getDoTuoi()==10) {
						tablemodelphim.addRow(new Object[] { phim.getMaPHIM(), phim.getTenPhim(), phim.getThoiLuong(), phim.getDoTuoi(),
			                    phim.getNgayCongChieu(), phim.getNhaSX(), phim.getLoaiPhim() });
					}
				}
			} else if (selectedTuoi.equals("18")) {
				if (selectedLoai.equals("Tất cả")) {
					if (phim.getDoTuoi()==18) {
						tablemodelphim.addRow(new Object[] { phim.getMaPHIM(), phim.getTenPhim(), phim.getThoiLuong(), phim.getDoTuoi(),
			                    phim.getNgayCongChieu(), phim.getNhaSX(), phim.getLoaiPhim() });
					}
				} else if (selectedLoai.equals("Hài")) {
					if (phim.getLoaiPhim().equals("Hài") && phim.getDoTuoi()==18) {
						tablemodelphim.addRow(new Object[] { phim.getMaPHIM(), phim.getTenPhim(), phim.getThoiLuong(), phim.getDoTuoi(),
			                    phim.getNgayCongChieu(), phim.getNhaSX(), phim.getLoaiPhim() });
					}
				} else {
					if (phim.getLoaiPhim().equals("Tình cảm") && phim.getDoTuoi()==18) {
						tablemodelphim.addRow(new Object[] { phim.getMaPHIM(), phim.getTenPhim(), phim.getThoiLuong(), phim.getDoTuoi(),
			                    phim.getNgayCongChieu(), phim.getNhaSX(), phim.getLoaiPhim() });
					}
				}
			}
		}
	}
	
	
	public void clearFields() {
		txtmaphim.setText("");
	    txttenphim.setText(""); 
	    txtthoiluong.setText("");
	    txttuoi.setText("");
	    txtngayck.setText("");
	    txtnhasx.setText("");
	    cbxloaiphim.setSelectedIndex(0); 
	}

	public void loaddataTimPhim() {
	    if (!txttenphimt.getText().equals("")) {
	        Phim_Dao phimDao = new Phim_Dao();
	        ArrayList<Phim> danhSachPhim = phimDao.getAllPhimByTenLoai(txttenphimt.getText(),txtloaiphimt.getText());
	        tablemodelphim.setRowCount(0);

	        for (Phim phim : danhSachPhim) {
	        	tablemodelphim.addRow(new Object[] { phim.getMaPHIM(), phim.getTenPhim(), phim.getThoiLuong(), phim.getDoTuoi(),
	                    phim.getNgayCongChieu(), phim.getNhaSX(), phim.getLoaiPhim() });
	        }
	    }

	    
	}


	public void deletePhim() {
	    try {
	        String maPhim = txtmaphim.getText();
	        
	        Phim_Dao phimDao = new Phim_Dao();
	        phimDao.deletePhim(maPhim);
	        
	        loaddataPhim();
	        
	        JOptionPane.showMessageDialog(null, "Xóa phim thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
	    } catch (Exception ex) {
	        ex.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Xóa phim thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
	    }
	}


	public void loaddataPhim() {
	    try {
	        Phim_Dao phimDao = new Phim_Dao();
	        ArrayList<Phim> danhSachPhim = phimDao.getAllPhim();
	        
	        DefaultTableModel model = (DefaultTableModel) tablephim.getModel();
	        model.setRowCount(0);
	        
	        for (Phim phim : danhSachPhim) {
	            model.addRow(new Object[] {
	                phim.getMaPHIM(),
	                phim.getTenPhim(),
	                phim.getThoiLuong(),
	                phim.getDoTuoi(),
	                phim.getNgayCongChieu(),
	                phim.getNhaSX(),
	                phim.getLoaiPhim()
	            });
	        }
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	    int row = tablephim.getSelectedRow();
	    txtmaphim.setText(tablephim.getValueAt(row, 0).toString());
	    txttenphim.setText(tablephim.getValueAt(row, 1).toString());
	    txtthoiluong.setText(tablephim.getValueAt(row, 2).toString());
	    txttuoi.setText(tablephim.getValueAt(row, 3).toString());
	    txtngayck.setText(tablephim.getValueAt(row, 4).toString());
	    txtnhasx.setText(tablephim.getValueAt(row, 5).toString());
	    cbxloaiphim.setSelectedItem(tablephim.getValueAt(row, 6).toString());
	   
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
