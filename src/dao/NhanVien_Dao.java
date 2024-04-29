package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectDB.ConnectDB;
import entity.NhanVien;




public class NhanVien_Dao {
	public NhanVien_Dao() {}
	

	public ArrayList<NhanVien> getAllNhanVien(){
		ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
		
			String sql ="SELECT * FROM NHANVIEN";		 
			Statement st =  con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String ma=rs.getString(1);
				String ten=rs.getString(2);
				Boolean gioiTinh =rs.getBoolean(3);
				String ngaySinh=rs.getString(4);
				String soDT=rs.getString(5);
				String chucVU=rs.getString(6);
				String matKhau=rs.getString(7);
				Boolean trangThai=rs.getBoolean(8);
				
				NhanVien nhanVien = new NhanVien(ma,ten,gioiTinh,ngaySinh,soDT,chucVU,matKhau,trangThai);
				
				ds.add(nhanVien);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return ds;
	}
	public boolean addXeMay(NhanVien xm) {
		ConnectDB.getInstance();
		 Connection con = ConnectDB.getConnection();
		int n=0;
		 String sql ="insert into NHANVIEN values(?,?,?,?,?,?,?,?)";
		 PreparedStatement pst = null;
		 try {
			pst = con.prepareStatement(sql);
			pst.setString(1, xm.getMaNV());
			pst.setString(2, xm.getTenNV());
			pst.setBoolean(3, xm.isGioiTinh());
			pst.setString(4, xm.getNgaySinh());
			pst.setString(5, xm.getSoDT());
			pst.setString(6, xm.getChuVu());
			pst.setString(7, xm.getMatKH());
			pst.setBoolean(8, xm.isTrangThai());
			n= pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 finally {
		try {
			 pst.close();
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}	 
		 
		 }
		return n>0;
}
	public void updateXeMay(NhanVien xm) {
		ConnectDB.getInstance();
		PreparedStatement pst =null;
		 Connection con = ConnectDB.getConnection();
		
		 String sql ="update NHANVIEN  set maNhanVien = ?,tenNhanVien=?,gioiTinh=?,ngaySing=?,soDienThoai=?,chucVu=?,matKhau=?,trangThai=? where soKhung =?";
		 try {	
			 pst = con.prepareStatement(sql);
				pst.setString(1, xm.getMaNV());
				pst.setString(2, xm.getTenNV());
				pst.setBoolean(3, xm.isGioiTinh());
				pst.setString(4, xm.getNgaySinh());
				pst.setString(5, xm.getSoDT());
				pst.setString(6, xm.getChuVu());
				pst.setString(7, xm.getMatKH());
				pst.setBoolean(8, xm.isTrangThai());
			 pst.executeUpdate() ;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			close(pst);
		}
	}

	public void DeleteXeMay(String sokhung) {
		ConnectDB.getInstance();
		PreparedStatement pst = null;
		Connection con = ConnectDB.getConnection();

		String sql = "DELETE FROM NHANVIEN WHERE maNhanVien =?";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, sokhung);
			pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close(pst);
		}
	}
	private void close(PreparedStatement pst) {
		if (pst !=null) {
			try {
				pst.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

