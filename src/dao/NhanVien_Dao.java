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
	public boolean addNhanVien(NhanVien nv) {
		ConnectDB.getInstance();
		 Connection con = ConnectDB.getConnection();
		int n=0;
		 String sql ="insert into NHANVIEN values(?,?,?,?,?,?,?,?)";
		 PreparedStatement pst = null;
		 try {
			pst = con.prepareStatement(sql);
			pst.setString(1, nv.getMaNV());
			pst.setString(2, nv.getTenNV());
			pst.setBoolean(3, nv.isGioiTinh());
			pst.setString(4, nv.getNgaySinh());
			pst.setString(5, nv.getSoDT());
			pst.setString(6, nv.getChuVu());
			pst.setString(7, nv.getMatKH());
			pst.setBoolean(8, nv.isTrangThai());
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
	public void updateNhanVien(NhanVien nv) {
		ConnectDB.getInstance();
		PreparedStatement pst =null;
		 Connection con = ConnectDB.getConnection();
		
		 String sql ="update NHANVIEN  set maNhanVien = ?,tenNhanVien=?,gioiTinh=?,ngaySing=?,soDienThoai=?,chucVu=?,matKhau=?,trangThai=? where soKhung =?";
		 try {	
			 pst = con.prepareStatement(sql);
				pst.setString(1, nv.getMaNV());
				pst.setString(2, nv.getTenNV());
				pst.setBoolean(3, nv.isGioiTinh());
				pst.setString(4, nv.getNgaySinh());
				pst.setString(5, nv.getSoDT());
				pst.setString(6, nv.getChuVu());
				pst.setString(7, nv.getMatKH());
				pst.setBoolean(8, nv.isTrangThai());
			 pst.executeUpdate() ;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			close(pst);
		}
	}

	public void DeleteNhanVien(String ma) {
		ConnectDB.getInstance();
		PreparedStatement pst = null;
		Connection con = ConnectDB.getConnection();

		String sql = "DELETE FROM NHANVIEN WHERE sokhung =?";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, ma);
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

