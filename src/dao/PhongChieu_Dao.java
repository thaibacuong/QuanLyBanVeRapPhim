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


public class PhongChieu_Dao {
    public PhongChieu_Dao() {}

    public ArrayList<PhongChieu> getAllPhongChieu() {
        ArrayList<PhongChieu> ds = new ArrayList<PhongChieu>();
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();

            String sql = "SELECT * FROM GHENGOI";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                String MaPC = rs.getString(1);
                String TenPC = rs.getString(2);
                int DienTich = rs.getInt(3);
                Boolean TrangThai = rs.getBoolean(4);
                GheNgoi ghe=new GheNgoi(rs.getString(5));
                PhongChieu phong = new PhongChieu(MaPC, TenPC, DienTich, TrangThai,ghe);
                ds.add(phong);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    public boolean addPhongChieu(PhongChieu phong) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        int n = 0;
        String sql ="INSERT INTO PHONGCHIEU VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, phong.getMaPC());
            pst.setString(2, phong.getTenPC());
            pst.setInt(3, phong.getDienTich());
            pst.setBoolean(4, phong.isTrangThai());
            pst.setString(5, phong.getGheNgoi().getMaGN());
            n = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pst);
        }
        return n > 0;
    }

    public void updatePhongChieu(PhongChieu phong) {
        ConnectDB.getInstance();
        PreparedStatement pst = null;
        Connection con = ConnectDB.getConnection();
        String sql ="UPDATE PHONGCHIEU SET tenPhongChieu=?,dientich = ?, trangThai=?, maghe=?  WHERE maPhongChieu = ?";
        try {    
        	pst = con.prepareStatement(sql);
            pst.setString(1, phong.getTenPC());
            pst.setInt(2,phong.getDienTich());
            pst.setBoolean(3, phong.isTrangThai());
            pst.setString(4, phong.getGheNgoi().getMaGN());
            pst.setString(5, phong.getMaPC());
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
