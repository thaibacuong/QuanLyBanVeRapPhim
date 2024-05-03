package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.ChiTietHoaDon;
import entity.HoaDon;
import entity.Phim;
import entity.Ve;

public class CT_HoaDon_DAO {
	public CT_HoaDon_DAO() {}
	public ArrayList<ChiTietHoaDon> getAllChiTietHoaDon(){
	    ArrayList<ChiTietHoaDon> ds = new ArrayList<ChiTietHoaDon>();
	    try {
	        ConnectDB.getInstance();
	        Connection con = ConnectDB.getConnection();
	    
	        String sql ="SELECT * FROM CT_HOADON";    
	        Statement st =  con.createStatement();
	        ResultSet rs = st.executeQuery(sql);
	        while(rs.next()) {
	            String mahoadon = rs.getString("maHoaDon");
	            String mave = rs.getString("maVe");
	            int soluong = rs.getInt("SoLuong");
	            HoaDon hoadon = new HoaDon(mahoadon);
	            Ve ve= new Ve(mave);
	            ChiTietHoaDon CTHoaDon = new ChiTietHoaDon(hoadon, soluong, ve); 
	            ds.add(CTHoaDon);            
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return ds;
	}

	public boolean addCTHoaDon(ChiTietHoaDon cthoadon) {
	    ConnectDB.getInstance();
	    Connection con = ConnectDB.getConnection();
	    int n = 0;
	    String sql ="INSERT INTO CT_HOADON VALUES (?, ?, ?)"; 
	    PreparedStatement pst = null;
	    try {
	        pst = con.prepareStatement(sql);
	        pst.setString(1, cthoadon.getHoaDon().getMaHD());
	        pst.setInt(2, cthoadon.getSoLuong());
	        pst.setString(3, cthoadon.getVe().getMaVe());
	        n = pst.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        close(pst);
	    }
	    return n > 0;
	}

	public void updateCTHoaDon(ChiTietHoaDon cthoadon) {
	    ConnectDB.getInstance();
	    PreparedStatement pst = null;
	    Connection con = ConnectDB.getConnection();
	    String sql = "UPDATE CT_HOADON SET  soluong = ? WHERE maHoaDon = ? end maVe = ?";
	    try {    
	        pst = con.prepareStatement(sql);

	        pst.setInt(1, cthoadon.getSoLuong());
	        pst.setString(2, cthoadon.getHoaDon().getMaHD());
	        pst.setString(3, cthoadon.getVe().getMaVe());
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
