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
    public HoaDon_Dao() {}

    public ArrayList<HoaDon> getAllHoaDon() {
        ArrayList<HoaDon> ds = new ArrayList<HoaDon>();
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();

            String sql = "SELECT * FROM HOADON";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                String maHoaDon = rs.getString(1);
                String ngayXHD = rs.getString(2);
                String MaNV = rs.getString(3);
                NhanVien nhanvien=new NhanVien(MaNV);
                HoaDon hoadon = new HoaDon(maHoaDon, ngayXHD, nhanvien);
                ds.add(hoadon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    public boolean addHoaDon(HoaDon hoadon) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        int n = 0;
        String sql ="INSERT INTO HOADON VALUES (?, ?, ?)";
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, hoadon.getMaHD());
            pst.setString(2, hoadon.getNgayXHD());
            pst.setString(3, hoadon.getNhanVien().getMaNV());
            n = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pst);
        }
        return n > 0;
    }

    public void updateHoaDon(HoaDon hoadon) {
        ConnectDB.getInstance();
        PreparedStatement pst = null;
        Connection con = ConnectDB.getConnection();
        String sql ="UPDATE HOADON SET ngayXuatHD = ?,maNhanVien=? WHERE maHoaDon = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, hoadon.getNgayXHD());
            pst.setString(2, hoadon.getNhanVien().getMaNV());
            pst.setString(4, hoadon.getMaHD());
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
