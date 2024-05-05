package gui;

import java.sql.SQLException;

import javax.swing.*;

public class Tab extends JFrame{
	JTabbedPane tp = new JTabbedPane();
	public Tab() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);

		TrangChu tc = new TrangChu();
		DatVe_UI dv = new DatVe_UI();
		HoaDon_UI hd = new HoaDon_UI();
		NhanVien_UI nv = new NhanVien_UI();
		Phim_UI p = new Phim_UI();
		PhongChieu_UI pc = new PhongChieu_UI();
		SuatChieu_UI sc = new SuatChieu_UI();
		

		tp.add("Trang Chủ", tc);
		tp.add("Đặt vé", dv);
		tp.add("Phim", p);
		tp.add("Phòng Chiếu", pc);
		tp.add("Suất chiếu", sc);
		tp.add("Hóa đơn", hd);
		tp.add("Nhân viên", nv);
		this.getContentPane().add(tp);
	}
}