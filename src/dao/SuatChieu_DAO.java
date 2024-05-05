package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.Phim;
import entity.SuatChieu;

public class SuatChieu_DAO {
	public SuatChieu_DAO() {}

    public ArrayList<SuatChieu> getAllSuatChieu() {
        ArrayList<SuatChieu> ds = new ArrayList<SuatChieu>();
        ConnectDB.getInstance().connect();
        try (Connection con = ConnectDB.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM SUATCHIEU")) {
            while (rs.next()) {
                String masuatchieu = rs.getString(1);
                String giobatdau = rs.getString(2);
                String gioketthuc = rs.getString(3);
                String ngaychieu = rs.getString(4);
                String maphim = rs.getString(5);
                Phim phim = new Phim(maphim);
                SuatChieu suatchieu = new SuatChieu(masuatchieu, giobatdau, gioketthuc, ngaychieu, phim);
                ds.add(suatchieu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    public static ArrayList<String> getAllThoiGianSuatChieuByMaPhim(String ma) {
        ArrayList<String> ds = new ArrayList<String>();
        ConnectDB.getInstance().connect();
        try (Connection con = ConnectDB.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT gioBD, gioKT FROM SUATCHIEU WHERE ")) {
            while (rs.next()) {
                String giobatdau = rs.getString("gioBD");
                String gioketthuc = rs.getString("gioKT");
                String thoiGian = giobatdau + " - " + gioketthuc;
                ds.add(thoiGian);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    
    public boolean addSuatChieu(SuatChieu sc) {
        ConnectDB.getInstance().connect();
        Connection con = ConnectDB.getConnection();      
        int n = 0;
        String sql = "insert into SUATCHIEU values(?,?,?,?,?)";
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, sc.getMaSC());
            pst.setString(2, sc.getGioBD());
            pst.setString(3, sc.getGioKT());
            pst.setString(4, sc.getNgayChieu());
            pst.setString(5, sc.getPhim().getMaPHIM());
            n = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return n > 0;
    }

    public void updateSuatChieu(SuatChieu sc) {
    	ConnectDB.getInstance().connect();
        String sql = "UPDATE SUATCHIEU SET gioBatDau = ?, gioKetThuc = ?, ngayChieu = ?, maPhim = ? WHERE maSuatChieu = ?";
        try (Connection con = ConnectDB.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, sc.getGioBD());
            pst.setString(2, sc.getGioKT());
            pst.setString(3, sc.getNgayChieu());
            pst.setString(4, sc.getPhim().getMaPHIM());
            pst.setString(5, sc.getMaSC());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<SuatChieu> getAllSuatChieuByNgayChieu(String ngayChieu) {
        ArrayList<SuatChieu> ds = new ArrayList<SuatChieu>();
        ConnectDB.getInstance().connect();
        String sql = "SELECT * FROM SUATCHIEU WHERE ngayChieu=?";
        try (Connection con = ConnectDB.getConnection();
            PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, ngayChieu);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maSC = rs.getString(1);
                String gioBD = rs.getString(2);
                String gioKT = rs.getString(3);
                String ngay = rs.getString(4);
                String maPhim = rs.getString(5);
                
                Phim phim = new Phim(maPhim);
                SuatChieu suatChieu = new SuatChieu(maSC, gioBD, gioKT, ngay, phim);
                ds.add(suatChieu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    
    public void deleteSuatChieu(String masc) {
    	ConnectDB.getInstance().connect();
        String sql = "DELETE FROM SUATCHIEU WHERE maSuatChieu = ?";
        try (Connection con = ConnectDB.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, masc);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
