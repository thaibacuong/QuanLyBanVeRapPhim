package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.GheNgoi;


public class GheNgoi_Dao {
    public GheNgoi_Dao() {}

    public ArrayList<GheNgoi> getAllGheNgoi() {
        ArrayList<GheNgoi> ds = new ArrayList<GheNgoi>();
        try {
            ConnectDB.getInstance();
            Connection con = ConnectDB.getConnection();

            String sql = "SELECT * FROM GHENGOI";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                String MaGN = rs.getString(1);
                String ViTriGN = rs.getString(2);
                Boolean TrangThai = rs.getBoolean(3);
                String LoaiGN = rs.getString(4);
                GheNgoi ghengoi = new GheNgoi(MaGN, ViTriGN, TrangThai, LoaiGN);
                ds.add(ghengoi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    public boolean addGheNgoi(GheNgoi ghengoi) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        int n = 0;
        String sql ="INSERT INTO GHENGOI VALUES (?, ?, ?, ?)";
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, ghengoi.getMaGN());
            pst.setString(2, ghengoi.getViTriGN());
            pst.setBoolean(3, ghengoi.getTrangThai());
            pst.setString(4, ghengoi.getLoaiGN());
            n = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pst);
        }
        return n > 0;
    }

    public void updateGheNgoi(GheNgoi ghengoi) {
        ConnectDB.getInstance();
        PreparedStatement pst = null;
        Connection con = ConnectDB.getConnection();
        String sql ="UPDATE GHENGOI SET viTriGhe=?, trangThai=? loaiGhe=? WHERE maGhe = ?";
        try {    
            pst = con.prepareStatement(sql);
            pst.setString(1, ghengoi.getViTriGN());
            pst.setBoolean(2, ghengoi.getTrangThai());
            pst.setString(3, ghengoi.getLoaiGN());
            pst.setString(4, ghengoi.getMaGN());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pst);
        }
    }

    public void delete(String maGhe) {
        ConnectDB.getInstance();
        PreparedStatement pst = null;
        Connection con = ConnectDB.getConnection();
        String sql = "DELETE FROM GHENGOI WHERE maGhe = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, maGhe);
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
