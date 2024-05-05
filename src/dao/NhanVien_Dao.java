package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.NhanVien;

public class NhanVien_Dao {
    public NhanVien_Dao() {}

    public ArrayList<NhanVien> getAllNhanVien() {
        ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
        ConnectDB.getInstance().connect();
        try (Connection con = ConnectDB.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM NHANVIEN")) {

            while (rs.next()) {
                String ma = rs.getString(1);
                String ten = rs.getString(2);
                boolean gioiTinh = rs.getBoolean(3);
                String ngaySinh = rs.getString(4);
                String soDT = rs.getString(5);
                String chuVu = rs.getString(6);
                String matKhau = rs.getString(7);
                boolean trangThai = rs.getBoolean(8);
                NhanVien nhanVien = new NhanVien(ma, ten, gioiTinh, ngaySinh, soDT, chuVu, matKhau, trangThai);
                ds.add(nhanVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    public boolean addNhanVien(NhanVien nv) {
        ConnectDB.getInstance().connect();
        
        Connection con = ConnectDB.getConnection();
        
        int n = 0;
        String sql = "insert into NHANVIEN values(?,?,?,?,?,?,?,?)";
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

    public void updateNhanVien(NhanVien nv) {
    	ConnectDB.getInstance().connect();
        String sql = "UPDATE NHANVIEN SET tenNhanVien = ?, gioiTinh = ?, ngaySinh = ?, soDienThoai = ?, chucVu = ?, matKhau = ?, trangThai = ? WHERE maNhanVien = ?";
        try (Connection con = ConnectDB.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, nv.getTenNV());
            pst.setBoolean(2, nv.isGioiTinh());
            pst.setString(3, nv.getNgaySinh());
            pst.setString(4, nv.getSoDT());
            pst.setString(5, nv.getChuVu());
            pst.setString(6, nv.getMatKH());
            pst.setBoolean(7, nv.isTrangThai());
            pst.setString(8, nv.getMaNV());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<NhanVien> getAllNhanVienByTen(String name) {
        ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
        ConnectDB.getInstance().connect();
        String sql = "SELECT * FROM NHANVIEN WHERE tenNhanVien= ?";
        try (Connection con = ConnectDB.getConnection();
            PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String ma = rs.getString(1);
                String ten = rs.getString(2);
                Boolean gioiTinh = rs.getBoolean(3);
                String ngaySinh = rs.getString(4);
                String soDT = rs.getString(5);
                String chuVu = rs.getString(6);
                String matKhau = rs.getString(7);
                Boolean trangThai = rs.getBoolean(8);
                NhanVien nhanVien = new NhanVien(ma, ten, gioiTinh, ngaySinh, soDT, chuVu, matKhau, trangThai);
                ds.add(nhanVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    public ArrayList<NhanVien> getAllNhanVienBySDT(String sdt) {
        ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
        ConnectDB.getInstance().connect();
        String sql = "SELECT * FROM NHANVIEN WHERE soDienThoai=?";
        try (Connection con = ConnectDB.getConnection();
            PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, sdt);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
            	String ma = rs.getString(1);
                String ten = rs.getString(2);
                Boolean gioiTinh = rs.getBoolean(3);
                String ngaySinh = rs.getString(4);
                String soDT = rs.getString(5);
                String chuVu = rs.getString(6);
                String matKhau = rs.getString(7);
                Boolean trangThai = rs.getBoolean(8);
                NhanVien nhanVien = new NhanVien(ma, ten, gioiTinh, ngaySinh, soDT, chuVu, matKhau, trangThai);
                ds.add(nhanVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }
    
    public static String getMatKhauByMaNhanVien(String maNhanVien) {
        String matKhau = null;
        ConnectDB.getInstance().connect();
        String sql = "SELECT matKhau FROM NHANVIEN WHERE maNhanVien=?";
        try (Connection con = ConnectDB.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, maNhanVien);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                matKhau = rs.getString("matKhau");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matKhau;
    }

    
    public void delete(String manv) {
        ConnectDB.getInstance();
        PreparedStatement pst = null;
        Connection con = ConnectDB.getConnection();
        String sql = "DELETE FROM GHENGOI WHERE maGhe = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, manv);
            pst.executeUpdate();
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
    }
    public void deleteNhanVien(String ma) {
    	ConnectDB.getInstance().connect();
        String sql = "DELETE FROM NHANVIEN WHERE maNhanVien = ?";
        try (Connection con = ConnectDB.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, ma);
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

