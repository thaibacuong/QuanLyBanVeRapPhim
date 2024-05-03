package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.KhachHang;

public class KhachHang_Dao {
    public KhachHang_Dao() {}

    public ArrayList<KhachHang> getAllKhachHang() {
        ArrayList<KhachHang> ds = new ArrayList<KhachHang>();
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();

            String sql = "SELECT * FROM HOADON";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
            	String maKH=rs.getString(1);
				String tenKH=rs.getString(2);
				String ngaySinh=rs.getString(4);
				String soDT=rs.getString(5);
                KhachHang khachhang = new KhachHang(maKH, tenKH, ngaySinh, soDT);
                ds.add(khachhang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    public boolean addKhachHang(KhachHang khachhang) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        int n = 0;
        String sql ="INSERT INTO VE VALUES (?, ?, ?, ?)";
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, khachhang.getMaKH());
            pst.setString(2, khachhang.getTenKH());
            pst.setString(3, khachhang.getNgaySinh());
            pst.setString(4, khachhang.getSoDT());
            n = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pst);
        }
        return n > 0;
    }

    public void updateHoaDon(KhachHang khachhang) {
        ConnectDB.getInstance();
        PreparedStatement pst = null;
        Connection con = ConnectDB.getConnection();
        String sql ="UPDATE HOADON SET tenKhachHang = ?,soDienThoai=?, ngaySinh=? WHERE maKhachHang = ?";
        try {    
            pst = con.prepareStatement(sql);
            pst.setString(1, khachhang.getTenKH());
            pst.setString(2, khachhang.getNgaySinh());
            pst.setString(3, khachhang.getSoDT());
            pst.setString(4, khachhang.getMaKH());
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
