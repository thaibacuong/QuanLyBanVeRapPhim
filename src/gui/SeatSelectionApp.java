package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SeatSelectionApp extends JFrame {

    private boolean[][] seatStates; // Mảng để lưu trạng thái của các ghế
    private JButton[][] seats; // Mảng để lưu các ghế

    public SeatSelectionApp() {
        setTitle("Seat Selection");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel seatPanel = new JPanel(new GridLayout(6, 6));
        seatStates = new boolean[6][6];
        seats = new JButton[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                JButton seat = new JButton("Seat " + ((i * 6) + j + 1));
                seats[i][j] = seat;
                seatPanel.add(seat);

                // Đặt màu sắc cho hàng VIP (hàng từ thứ 4 trở đi)
                if (i >= 3) {
                    seat.setBackground(Color.BLUE);
                    seat.addActionListener(new SeatClickListener(i, j)); // Thêm bộ xử lý sự kiện cho ghế VIP
                } else {
                    seat.addActionListener(new SeatClickListener(i, j)); // Thêm bộ xử lý sự kiện cho các ghế thông thường
                }
            }
        }

        getContentPane().add(seatPanel);
        pack();
        setLocationRelativeTo(null); // Hiển thị cửa sổ ở giữa màn hình
    }

    // Bộ xử lý sự kiện cho ghế VIP và các ghế thông thường
    private class SeatClickListener implements ActionListener {
        private int row;
        private int col;

        public SeatClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!seatStates[row][col]) {
                seats[row][col].setBackground(Color.RED); // Thay đổi màu sắc khi ghế chưa được chọn
            } else {
                // Đặt lại màu sắc cho hàng VIP (nếu là ghế VIP)
                if (row >= 3) {
                    seats[row][col].setBackground(Color.BLUE);
                } else {
                    seats[row][col].setBackground(null); // Đặt lại màu sắc thành màu mặc định (transparent) cho các ghế thông thường
                }
            }
            seatStates[row][col] = !seatStates[row][col]; // Đảo ngược trạng thái
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SeatSelectionApp().setVisible(true);
        });
    }
}


