package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.GheNgoi;
import entity.PhongChieu;


public class GheNgoi_Dao {
    public GheNgoi_Dao() {}

    public ArrayList<GheNgoi> getAllGheNgoi() {
        ArrayList<GheNgoi> ds = new ArrayList<GheNgoi>();
        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT * FROM GHENGOI";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                String MaGN = rs.getString(1);
                Boolean TrangThai = rs.getBoolean(2);
                String LoaiGN = rs.getString(3);
                String maphonghcieu = rs.getString(4);
                PhongChieu phongchieu = new PhongChieu(maphonghcieu);
                GheNgoi ghengoi = new GheNgoi(MaGN, TrangThai, LoaiGN,phongchieu);
                ds.add(ghengoi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    public static Boolean getTrangthaiByMaGheMaPhong(String maGhe, String maPhong) {
        Boolean trangthai = false;

        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT trangThai FROM GHENGOI WHERE maGhe=? AND maphongchieu=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maGhe); 
            ps.setString(2, maPhong);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                trangthai = rs.getBoolean("trangThai"); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return trangthai;
    }

    public static String getLoaiGehByMaGheMaPhong(String maGhe, String maPhong) {
        String loai = "";

        try {
            ConnectDB.getInstance().connect();
            Connection con = ConnectDB.getConnection();
            String sql = "SELECT loaiGhe FROM GHENGOI WHERE maGhe=? AND maphongchieu=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maGhe); 
            ps.setString(2, maPhong);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                loai = rs.getString("loaiGhe"); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return loai;
    }

    
    public boolean addGheNgoi(GheNgoi ghengoi) {
        ConnectDB.getInstance().connect();
        Connection con = ConnectDB.getConnection();
        int n = 0;
        String sql ="INSERT INTO GHENGOI VALUES (?, ?, ?, ?)";
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, ghengoi.getMaGN());
            pst.setBoolean(2, ghengoi.getTrangThai());
            pst.setString(3, ghengoi.getLoaiGN());
            pst.setString(4, ghengoi.getPhongchieu().getMaPC());
            n = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pst);
        }
        return n > 0;
    }

    public void updateGheNgoi(GheNgoi ghengoi) {
        ConnectDB.getInstance().connect();
        PreparedStatement pst = null;
        Connection con = ConnectDB.getConnection();
        String sql ="UPDATE GHENGOI SET trangThai=? loaiGhe=?, maphongchieu = ? WHERE maGhe = ?";
        try {    
            pst = con.prepareStatement(sql);
            pst.setBoolean(1, ghengoi.getTrangThai());
            pst.setString(2, ghengoi.getLoaiGN());
            pst.setString(3, ghengoi.getPhongchieu().getMaPC());
            pst.setString(4, ghengoi.getMaGN());
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
