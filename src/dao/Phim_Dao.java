package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.Phim;

public class Phim_Dao {
	public Phim_Dao() {}

	public ArrayList<Phim> getAllPhim(){
		ConnectDB.getInstance().connect();
	    ArrayList<Phim> ds = new ArrayList<Phim>();
	    try {
	        ConnectDB.getInstance();
	        Connection con = ConnectDB.getConnection();
	    
	        String sql ="SELECT * FROM PHIM";    
	        Statement st =  con.createStatement();
	        ResultSet rs = st.executeQuery(sql);
	        while(rs.next()) {
	            String maPhim = rs.getString(1);
	            String tenPhim = rs.getString(2);
	            String thoiLuong = rs.getString(3);
	            int gioiHanTuoi = rs.getInt(4);
	            String ngayCongChieu = rs.getString(5); 
	            String nhaSanXuat = rs.getString(6);
	            String loaiPhim = rs.getString(7); 
	            Phim phim = new Phim(maPhim, tenPhim, thoiLuong, gioiHanTuoi, ngayCongChieu, nhaSanXuat, loaiPhim); 
	            ds.add(phim);            
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return ds;
	}
	
	public ArrayList<Phim> getAllPhimByTenLoai(String tenPhim, String loaiPhim) {
	    ConnectDB.getInstance().connect();
	    ArrayList<Phim> ds = new ArrayList<>();
	    try {
	        ConnectDB.getInstance();
	        Connection con = ConnectDB.getConnection();
	        
	        String sql = "SELECT * FROM PHIM WHERE tenPhim=? AND loaiPhim=?";
	        PreparedStatement pst = con.prepareStatement(sql);
	        pst.setString(1, tenPhim);
	        pst.setString(2, loaiPhim);
	        ResultSet rs = pst.executeQuery();
	        
	        while (rs.next()) {
	            String maPhim = rs.getString(1);
	            String thoiLuong = rs.getString(3);
	            int gioiHanTuoi = rs.getInt(4);
	            String ngayCongChieu = rs.getString(5);
	            String nhaSanXuat = rs.getString(6);
	            Phim phim = new Phim(maPhim, tenPhim, thoiLuong, gioiHanTuoi, ngayCongChieu, nhaSanXuat, loaiPhim);
	            ds.add(phim);
	        }
	        
	        pst.close();
	        con.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return ds;
	}



	public boolean addPhim(Phim phim) {
		ConnectDB.getInstance().connect();
	    ConnectDB.getInstance();
	    Connection con = ConnectDB.getConnection();
	    int n = 0;
	    String sql ="INSERT INTO PHIM VALUES (?, ?, ?, ?, ?, ?, ?)"; 
	    PreparedStatement pst = null;
	    try {
	        pst = con.prepareStatement(sql);
	        pst.setString(1, phim.getMaPHIM());
	        pst.setString(2, phim.getTenPhim());
	        pst.setString(3, phim.getThoiLuong());
	        pst.setInt(4, phim.getDoTuoi()); 
	        pst.setString(5, phim.getNgayCongChieu());
	        pst.setString(6, phim.getNhaSX());
	        pst.setString(7, phim.getLoaiPhim());
	        n = pst.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        close(pst);
	    }
	    return n > 0;
	}

	public void updatePhim(Phim phim) {
		ConnectDB.getInstance().connect();
	    ConnectDB.getInstance();
	    PreparedStatement pst = null;
	    Connection con = ConnectDB.getConnection();
	    String sql = "UPDATE PHIM SET tenPhim = ?, thoiLuong = ?, gioiHanTuoi = ?, ngayCongChieu = ?, nhaSanXuat = ?, loaiPhim = ? WHERE maPhim = ?";
	    try {    
	        pst = con.prepareStatement(sql);
	        pst.setString(1, phim.getTenPhim());
	        pst.setString(2, phim.getThoiLuong());
	        pst.setInt(3, phim.getDoTuoi());
	        pst.setString(4, phim.getNgayCongChieu());
	        pst.setString(5, phim.getNhaSX());
	        pst.setString(6, phim.getLoaiPhim());
	        pst.setString(7, phim.getMaPHIM());
	        pst.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        close(pst);
	    }
	}

	public void deletePhim(String maPhim) {
	    ConnectDB.getInstance().connect();
	    String sql = "DELETE FROM PHIM WHERE maPhim = ?";
	    try (Connection con = ConnectDB.getConnection();
	         PreparedStatement pst = con.prepareStatement(sql)) {
	        pst.setString(1, maPhim);
	        pst.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	
	private void close(PreparedStatement pst) {
	    if (pst != null) {
	        try {
	            pst.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
}
