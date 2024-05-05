package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Chinh extends JFrame implements MenuListener {
    private JPanel pnlWest;
    private JMenuBar mnubar = new JMenuBar();
    private JMenu mnuTrangChu, mnuDSNhanVien, mnuThongKe, mnuThoat;
    private JLabel lblTrangChu;

    public Chinh() {
        setTitle("GIAO DIỆN CỦA QUẢN LÝ");
        setSize(1350, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        createGUI();
    }

    private void createGUI() {
        setJMenuBar(mnubar);
        mnubar.add(mnuTrangChu = new JMenu("Trang chủ"));
        mnubar.add(mnuTrangChu = new JMenu(""));
        mnubar.add(mnuDSNhanVien = new JMenu("Quản lý nhân viên"));
        mnubar.add(mnuTrangChu = new JMenu(""));
        mnubar.add(mnuThongKe = new JMenu("Thống kê doanh thu"));
        mnubar.add(mnuTrangChu = new JMenu(""));
        mnubar.add(mnuThoat = new JMenu("Thoát"));

        // Tạo panel mới để chứa nội dung của trang chủ
        JPanel pnlTrangChu = new JPanel();
        pnlTrangChu.setLayout(new BorderLayout());
        add(pnlTrangChu, BorderLayout.CENTER);

        // Thêm label cho trang chủ
        lblTrangChu = new JLabel("Chào mừng bạn đến với trang chủ!");
        lblTrangChu.setHorizontalAlignment(JLabel.CENTER);
        lblTrangChu.setFont(new Font("Arial", Font.BOLD, 24));
        pnlTrangChu.add(lblTrangChu, BorderLayout.CENTER);

        // Xử lý sự kiện khi nhấn vào các menu
        mnuDSNhanVien.addMenuListener(this);
        mnuThongKe.addMenuListener(this);
        mnuThoat.addMenuListener(this);
    }

    public static void main(String[] args) {
    	Chinh chinh = new Chinh();
        chinh.setVisible(true);
    }

    @Override
    public void menuSelected(MenuEvent e) {
        Object o = e.getSource();
        if (o.equals(mnuDSNhanVien)) {
            // Hiển thị giao diện quản lý nhân viên
            // Code của bạn ở đây
        }
        if (o.equals(mnuThongKe)) {
            // Hiển thị giao diện thống kê
            // Code của bạn ở đây
        }
        if (o.equals(mnuThoat)) {
            System.exit(0);
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {}

    @Override
    public void menuCanceled(MenuEvent e) {}
}
