package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.Phim;

public class Phim_Dao {
	public Phim_Dao() {}

	public ArrayList<Phim> getAllPhim(){
	    ArrayList<Phim> ds = new ArrayList<Phim>();
	    try {
	        ConnectDB.getInstance();
	        Connection con = ConnectDB.getConnection();
	    
	        String sql ="SELECT * FROM PHIM";    
	        Statement st =  con.createStatement();
	        ResultSet rs = st.executeQuery(sql);
	        while(rs.next()) {
	            String maPhim = rs.getString("maPhim");
	            String tenPhim = rs.getString("tenPhim");
	            Time thoiLuong = rs.getTime("thoiLuong");
	            int gioiHanTuoi = rs.getInt("gioiHanTuoi");
	            String ngayCongChieu = rs.getString("ngayCongChieu"); 
	            String nhaSanXuat = rs.getString("nhaSanXuat");
	            String loaiPhim = rs.getString("loaiPhim"); 
	            Phim phim = new Phim(maPhim, tenPhim, thoiLuong, gioiHanTuoi, ngayCongChieu, nhaSanXuat, loaiPhim); 
	            ds.add(phim);            
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return ds;
	}

	public boolean addPhim(Phim phim) {
	    ConnectDB.getInstance();
	    Connection con = ConnectDB.getConnection();
	    int n = 0;
	    String sql ="INSERT INTO PHIM VALUES (?, ?, ?, ?, ?, ?, ?)"; 
	    PreparedStatement pst = null;
	    try {
	        pst = con.prepareStatement(sql);
	        pst.setString(1, phim.getMaPHIM());
	        pst.setString(2, phim.getTenPhim());
	        pst.setTime(3, phim.getThoiLuong());
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
	    ConnectDB.getInstance();
	    PreparedStatement pst = null;
	    Connection con = ConnectDB.getConnection();
	    String sql = "UPDATE PHIM SET tenPhim = ?, thoiLuong = ?, gioiHanTuoi = ?, ngayCongChieu = ?, nhaSanXuat = ?, loaiPhim = ? WHERE maPhim = ?";
	    try {    
	        pst = con.prepareStatement(sql);
	        pst.setString(1, phim.getTenPhim());
	        pst.setTime(2, phim.getThoiLuong());
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
