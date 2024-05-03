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
                Time giobatdau = rs.getTime(2);
                Time gioketthuc = rs.getTime(3);
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

    public boolean addSuatChieu(SuatChieu sc) {
        ConnectDB.getInstance().connect();
        Connection con = ConnectDB.getConnection();      
        int n = 0;
        String sql = "insert into SUATCHIEU values(?,?,?,?,?)";
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, sc.getMaSC());
            pst.setTime(2, sc.getGioBD());
            pst.setTime(3, sc.getGioKT());
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
            pst.setTime(1, sc.getGioBD());
            pst.setTime(2, sc.getGioKT());
            pst.setString(3, sc.getNgayChieu());
            pst.setString(4, sc.getPhim().getMaPHIM());
            pst.setString(5, sc.getMaSC());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
