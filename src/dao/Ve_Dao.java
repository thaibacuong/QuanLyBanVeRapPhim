package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.PhongChieu;
import entity.SuatChieu;
import entity.Ve;

public class Ve_Dao {
    public Ve_Dao() {}

    public ArrayList<Ve> getAllVe() {
        ArrayList<Ve> ds = new ArrayList<Ve>();
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();

            String sql = "SELECT * FROM VE";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                String maVe = rs.getString(1);
                String loaive=rs.getString(2);
                String ngayBD = rs.getString(3);
                String ngayKT = rs.getString(4);
                String maPhongChieu = rs.getString(5);
                String maSuatChieu = rs.getString(6);
                double giaVe = rs.getDouble(6);
                PhongChieu phong=new PhongChieu(maPhongChieu);
                SuatChieu suat=new SuatChieu(maSuatChieu);
                Ve ve = new Ve(maVe,loaive, ngayBD, ngayKT, suat, phong, giaVe);
                ds.add(ve);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    public boolean addVe(Ve ve) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        int n = 0;
        String sql ="INSERT INTO VE VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, ve.getMaVe());
            pst.setString(2, ve.getLoaiVe());
            pst.setString(3, ve.getNgayBD());
            pst.setString(4, ve.getNgayKT());
            pst.setString(5, ve.getPhongchieu().getMaPC());
            pst.setString(6, ve.getSuatChieu().getMaSC());
            pst.setDouble(7, ve.getGiaVe());
            n = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pst);
        }
        return n > 0;
    }

    public void updateVe(Ve ve) {
        ConnectDB.getInstance();
        PreparedStatement pst = null;
        Connection con = ConnectDB.getConnection();
        String sql ="UPDATE VE SET loaiVe = ?, ngayBatDau = ?, ngayKetThuc = ?, maPhongChieu = ?, maSuatChieu = ?, giaVe = ? WHERE maVe = ?";
        try {    
            pst = con.prepareStatement(sql);
            pst.setString(1, ve.getLoaiVe());
            pst.setString(2, ve.getNgayBD());
            pst.setString(3, ve.getNgayKT());
            pst.setString(4, ve.getPhongchieu().getMaPC());
            pst.setString(5, ve.getSuatChieu().getMaSC());
            pst.setDouble(6, ve.getGiaVe());
            pst.setString(7, ve.getMaVe());
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
