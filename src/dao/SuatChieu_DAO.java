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
                String masuatchieu = rs.getString("maSuatChieu");
                Time giobatdau = rs.getTime("gioBatDau");
                Time gioketthuc = rs.getTime("gioKetThuc");
                String ngaychieu = rs.getString("ngayChieu");
                String maphim = rs.getString("maPhim");
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
        String sql = "UPDATE SUATCHIEU SET giobatdau = ?, gioketthuc = ?, ngaychieu = ?, maphim = ? WHERE maSuatChieu = ?";
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

//    public ArrayList<NhanVien> getAllSuatChieuByTen(String name) {
//        ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
//        ConnectDB.getInstance().connect();
//        String sql = "SELECT * FROM NHANVIEN WHERE tenNhanVien= ?";
//        try (Connection con = ConnectDB.getConnection();
//            PreparedStatement pst = con.prepareStatement(sql)) {
//            pst.setString(1, name);
//            ResultSet rs = pst.executeQuery();
//            while (rs.next()) {
//                String ma = rs.getString("maNhanVien");
//                String ten = rs.getString("tenNhanVien");
//                boolean gioiTinh = rs.getBoolean("gioiTinh");
//                String ngaySinh = rs.getString("ngaySing");
//                String soDT = rs.getString("soDienThoai");
//                String chuVu = rs.getString("chucVu");
//                String matKhau = rs.getString("matKhau");
//                boolean trangThai = rs.getBoolean("trangThai");
//                NhanVien nhanVien = new NhanVien(ma, ten, gioiTinh, ngaySinh, soDT, chuVu, matKhau, trangThai);
//                ds.add(nhanVien);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return ds;
//    }
//
//    public ArrayList<NhanVien> getAllNhanVienBySDT(String sdt) {
//        ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
//        ConnectDB.getInstance().connect();
//        String sql = "SELECT * FROM NHANVIEN WHERE soDienThoai=?";
//        try (Connection con = ConnectDB.getConnection();
//            PreparedStatement pst = con.prepareStatement(sql)) {
//            pst.setString(1, sdt);
//            ResultSet rs = pst.executeQuery();
//            while (rs.next()) {
//                String ma = rs.getString("maNhanVien");
//                String ten = rs.getString("tenNhanVien");
//                boolean gioiTinh = rs.getBoolean("gioiTinh");
//                String ngaySinh = rs.getString("ngaySing");
//                String soDT = rs.getString("soDienThoai");
//                String chuVu = rs.getString("chucVu");
//                String matKhau = rs.getString("matKhau");
//                boolean trangThai = rs.getBoolean("trangThai");
//                NhanVien nhanVien = new NhanVien(ma, ten, gioiTinh, ngaySinh, soDT, chuVu, matKhau, trangThai);
//                ds.add(nhanVien);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return ds;
//    }
    
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
