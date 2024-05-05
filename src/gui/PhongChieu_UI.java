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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dao.PhongChieu_Dao;
import entity.PhongChieu;

public class PhongChieu_UI extends JPanel implements ActionListener, MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel JWest;
	private JLabel lblMaPC;
	private JTextField txtMaPC;
	private JLabel lblTenPC;
	private JTextField txtTenPC;
	private JLabel lblSucchua;
	private JTextField txtSucchua;
	private JLabel lblTrangthai;
	private JTextField txtTrangthai;
	private JButton btnThemPC;
	private JButton btnCapNhatPC;
	private JButton btnLamMoiPC;
	private JButton btnXoaPC;
	private JButton btnThoatPC;
	private JPanel JCen1;
	private JPanel JCen1pc;
	private JTable tablepc;
	private DefaultTableModel tablemodel;
	private JScrollPane scrollpc;
	private JPanel JNorth1pc;

	public PhongChieu_UI() {
		JWest = new JPanel();
		add(JWest, BorderLayout.WEST);
		JWest.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Thông tin suất chiếu"));

		Box vb1 = Box.createVerticalBox();
		Box hb = Box.createHorizontalBox();
		Box hb1 = Box.createHorizontalBox();
		Box hb2 = Box.createHorizontalBox();
		Box hb3 = Box.createHorizontalBox();
		Box hb5 = Box.createHorizontalBox();
		Box hb6 = Box.createHorizontalBox();
		Box hb7 = Box.createHorizontalBox();

		JWest.add(vb1);

		lblMaPC = new JLabel("Mã phòng ");
		txtMaPC = new JTextField(25);
		lblTenPC = new JLabel("Tên phòng  ");
		txtTenPC = new JTextField(25);
		lblSucchua = new JLabel("Sức chứa  ");
		txtSucchua = new JTextField(25);
		lblTrangthai = new JLabel("Trạng thái  ");
		txtTrangthai = new JTextField(25);

		btnThemPC = new JButton("Thêm mới");
		btnCapNhatPC = new JButton("Cập nhật");
		btnXoaPC = new JButton("Xóa");
		btnLamMoiPC = new JButton("Làm mới");
		btnThoatPC = new JButton("Thoát");

		Dimension defaultSize1 = lblTenPC.getPreferredSize();
		int increasedWidth1 = defaultSize1.width + 4;
		lblSucchua.setPreferredSize(new Dimension(increasedWidth1, defaultSize1.height));
		lblTrangthai.setPreferredSize(new Dimension(increasedWidth1, defaultSize1.height));
		lblMaPC.setPreferredSize(new Dimension(increasedWidth1, defaultSize1.height));

		btnCapNhatPC.setPreferredSize(btnThemPC.getPreferredSize());
		btnXoaPC.setPreferredSize(btnThemPC.getPreferredSize());
		btnLamMoiPC.setPreferredSize(btnThemPC.getPreferredSize());

		JWest.revalidate();
		JWest.repaint();

		hb.add(lblMaPC);
		hb.add(txtMaPC);
		hb1.add(lblTenPC);
		hb1.add(txtTenPC);
		hb2.add(lblSucchua);
		hb2.add(txtSucchua);
		hb3.add(lblTrangthai);
		hb3.add(txtTrangthai);

		hb5.add(btnThemPC);
		hb5.add(Box.createHorizontalStrut(30));
		hb5.add(btnCapNhatPC);
		hb6.add(btnXoaPC);
		hb6.add(Box.createHorizontalStrut(30));
		hb6.add(btnLamMoiPC);
		hb7.add(btnThoatPC);

		vb1.add(Box.createVerticalStrut(15));
		vb1.add(hb);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb1);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb2);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb3);
		vb1.add(Box.createVerticalStrut(30));
		vb1.add(hb5);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb6);
		vb1.add(Box.createVerticalStrut(25));
		vb1.add(hb7);

		JCen1 = new JPanel(new BorderLayout());
		add(JCen1, BorderLayout.CENTER);
		JNorth1pc = new JPanel(new GridLayout(1, 12));
		JCen1pc = new JPanel(new BorderLayout());
		String[] header = "Mã phòng;Tên phòng;Sức chứa;Trạng thái".split(";");
		tablemodel = new DefaultTableModel(header, 0);
		tablepc = new JTable(tablemodel);
		scrollpc = new JScrollPane(tablepc);
		JCen1pc.add(scrollpc);
		JCen1.add(JCen1pc, BorderLayout.CENTER);
		JCen1.add(JNorth1pc, BorderLayout.NORTH);

		loaddataPhongChieu();

		btnThemPC.addActionListener(this);
		btnCapNhatPC.addActionListener(this);
		btnXoaPC.addActionListener(this);
		btnLamMoiPC.addActionListener(this);

		tablepc.addMouseListener(this);

//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setResizable(true);
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
//		setLocationRelativeTo(null);
//		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = tablepc.getSelectedRow();
		txtMaPC.setText(tablepc.getValueAt(row, 0).toString());
		txtTenPC.setText(tablepc.getValueAt(row, 1).toString());
		txtSucchua.setText(tablepc.getValueAt(row, 2).toString());
		txtTrangthai.setText(tablepc.getValueAt(row, 3).toString());
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
		Object o = e.getSource();

		if (o.equals(btnThemPC)) {
			String maPC = txtMaPC.getText();
			String tenPC = txtTenPC.getText();
			int dienTich = Integer.parseInt(txtSucchua.getText());
			String trangThai = txtTrangthai.getText();

			PhongChieu phongChieu = new PhongChieu(maPC, tenPC, dienTich, trangThai);

			try {
				PhongChieu_Dao phongChieuDao = new PhongChieu_Dao();
				boolean success = phongChieuDao.addPhongChieu(phongChieu);
				if (success) {
					loaddataPhongChieu();
					JOptionPane.showMessageDialog(this, "Thêm phòng chiếu thành công!");
				} else {
					JOptionPane.showMessageDialog(this, "Thêm phòng chiếu thất bại!");
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		if (e.getSource() == btnCapNhatPC) {
			int selectedRow = tablepc.getSelectedRow();
			if (selectedRow == -1) {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn một phòng chiếu để cập nhật.", "Thông báo",
						JOptionPane.WARNING_MESSAGE);
			} else {
				String maPC = txtMaPC.getText();
				String tenPC = txtTenPC.getText();
				int sucChua = Integer.parseInt(txtSucchua.getText());
				String trangThai = txtTrangthai.getText();

				PhongChieu phong = new PhongChieu(maPC, tenPC, sucChua, trangThai);

				try {
					PhongChieu_Dao phongChieuDao = new PhongChieu_Dao();
					phongChieuDao.updatePhongChieu(phong);
					loaddataPhongChieu();

					JOptionPane.showMessageDialog(null, "Cập nhật thông tin phòng chiếu thành công.", "Thông báo",
							JOptionPane.INFORMATION_MESSAGE);
				} catch (Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Cập nhật thông tin phòng chiếu thất bại.", "Thông báo",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		}

		if (o.equals(btnLamMoiPC)) {
			txtMaPC.setText("");
			txtTenPC.setText("");
			txtSucchua.setText("");
			txtTrangthai.setText("");
		}
	}

	public void loaddataPhongChieu() {
		PhongChieu_Dao phongChieuDao = new PhongChieu_Dao();
		tablemodel.setRowCount(0);
		ArrayList<PhongChieu> danhSachPhongChieu = phongChieuDao.getAllPhongChieu();
		for (PhongChieu phong : danhSachPhongChieu) {
			tablemodel.addRow(
					new Object[] { phong.getMaPC(), phong.getTenPC(), phong.getDienTich(), phong.isTrangThai() });
		}
	}

	public static void main(String[] args) {
		new PhongChieu_UI();
	}
}
