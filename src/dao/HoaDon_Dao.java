package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.HoaDon;
import entity.NhanVien;

public class HoaDon_Dao {

	public HoaDon_Dao() {
	}

	public ArrayList<HoaDon> getAllHoaDon() {

		ArrayList<HoaDon> ds = new ArrayList<>();
		String sql = "SELECT * FROM HOADON";
		ConnectDB.getInstance().connect();
		try (Connection con = ConnectDB.getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql)) {

			while (rs.next()) {
				String maHoaDon = rs.getString(1);
				String ngayXHD = rs.getString(2);
				String gioXHD = rs.getString(3);
				String tenNV = rs.getString(4);
				String tongHoaDon = rs.getString(5);
				HoaDon hoadon = new HoaDon(maHoaDon, ngayXHD, gioXHD, tenNV, tongHoaDon);
				ds.add(hoadon);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ds;
	}

	public ArrayList<HoaDon> getAllHoaDonByTenNV(String tenNV) {
	    ArrayList<HoaDon> ds = new ArrayList<>();
	    String sql = "SELECT * FROM HOADON WHERE tenNhanVien = ?";
	    ConnectDB.getInstance().connect();
	    try (Connection con = ConnectDB.getConnection();
	         PreparedStatement pst = con.prepareStatement(sql)) {

	        pst.setString(1, tenNV);
	        try (ResultSet rs = pst.executeQuery()) {
	            while (rs.next()) {
	                String maHoaDon = rs.getString(1);
	                String ngayXHD = rs.getString(2);
	                String gioXHD = rs.getString(3);
	                String tenNhanVien = rs.getString(4);
	                String tongHoaDon = rs.getString(5);
	                HoaDon hoadon = new HoaDon(maHoaDon, ngayXHD, gioXHD, tenNhanVien, tongHoaDon);
	                ds.add(hoadon);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return ds;
	}

	
	public void addHoaDon(HoaDon hoadon) {
		ConnectDB.getInstance().getConnection();
		String sql = "INSERT INTO HOADON VALUES (?, ?, ?, ?, ?)";
		ConnectDB.getInstance().connect();

		Connection con = ConnectDB.getConnection();
		try (PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setString(1, hoadon.getMaHD());
			pst.setString(2, hoadon.getNgayXHD());
			pst.setString(3, hoadon.getGioXHD());
			pst.setString(4, hoadon.getNhanVien());
			pst.setString(5, hoadon.getTongHoaDon());

			int n = pst.executeUpdate();
			if (n > 0) {
				System.out.println("Thêm hóa đơn thành công!");
			} else {
				System.out.println("Thêm hóa đơn không thành công!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateHoaDon(HoaDon hoadon) {
		ConnectDB.getInstance().getConnection();
		Connection con = ConnectDB.getConnection();
		String sql = "UPDATE HOADON SET ngayXuatHD = ?, gioXuatHD = ?, tenNhanVien = ?, tongHoaDon = ? WHERE maHoaDon = ?";
		try (PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setString(1, hoadon.getNgayXHD());
			pst.setString(2, hoadon.getGioXHD());
			pst.setString(3, hoadon.getNhanVien());
			pst.setString(4, hoadon.getTongHoaDon());
			pst.setString(5, hoadon.getMaHD());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
