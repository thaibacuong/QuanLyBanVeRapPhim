package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectDB.ConnectDB;
import entity.NhanVien;




public class NhanVien_Dao {
	 
	public List<NhanVien> getAllNhanViens(){
		List<NhanVien> ds = new ArrayList<NhanVien>();
		ConnectDB.getInstance();
		 Connection con = ConnectDB.getConnection();
		try {
			String sql ="SELECT * FROM Xe";
					 
			Statement st =  con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String ma=rs.getString(1);
				String ten=rs.getString(2);
				String soCCCD=rs.getString(3);
				Integer soDT=rs.getInt(4);
				String mauxe=rs.getString(5);
				
				NhanVien xeMay = new NhanVien();
				
				ds.add(xeMay);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return ds;
	}
	public boolean addXeMay(XeMay xm) {
		ConnectDB.getInstance();
		 Connection con = ConnectDB.getConnection();
		int n=0;
		 String sql ="insert into Xe values(?,?,?,?,?)";
		 PreparedStatement pst = null;
		 try {
			pst = con.prepareStatement(sql);
			pst.setString(1, xm.getSoKhung());
			pst.setString(2, xm.getNuocSx());
			pst.setString(3, xm.getLoaiXe());
			pst.setInt(4, xm.getSoPK());
			pst.setString(5, xm.getMauxe());
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
	public void updateXeMay(XeMay xm) {
		ConnectDB.getInstance();
		PreparedStatement pst =null;
		 Connection con = ConnectDB.getConnection();
		
		 String sql ="update Xe  set nuocSx = ?,loaiXe=?,soPK=?,mauxe=? where soKhung =?";
		 try {
			 pst = con.prepareStatement(sql);
			 pst = con.prepareStatement(sql);
				
				pst.setString(1, xm.getNuocSx());
				pst.setString(2, xm.getLoaiXe());
				pst.setInt(3, xm.getSoPK());
				pst.setString(4, xm.getMauxe());
				pst.setString(5, xm.getSoKhung());
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
		
		 String sql ="DELETE FROM Xe WHERE sokhung =?";
		 try {
			 pst = con.prepareStatement(sql);
			pst.setString(1, sokhung);
			 pst.executeUpdate() ;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
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

