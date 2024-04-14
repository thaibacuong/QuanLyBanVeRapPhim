package entity;

import java.time.LocalDate;

public class Phim {
		private String maPhim;
		private String tenPhim;
		private int thoiLuong;
		private int gioiHanTuoi;
		private LocalDate ngayCongChieu;
		private String nhaSanXuat;
		private String tomTat;
		private String loaiPhim;
		private String quocGia;
		private String maLoaiPhim;
		public Phim() {
			super();
		}
		public String getMaPhim() {
			return maPhim;
		}
		public void setMaPhim(String maPhim) {
			this.maPhim = maPhim;
		}
		public String getTenPhim() {
			return tenPhim;
		}
		public void setTenPhim(String tenPhim) {
			this.tenPhim = tenPhim;
		}
		public int getThoiLuong() {
			return thoiLuong;
		}
		public void setThoiLuong(int thoiLuong) {
			this.thoiLuong = thoiLuong;
		}
		public int getGioiHanTuoi() {
			return gioiHanTuoi;
		}
		public void setGioiHanTuoi(int gioiHanTuoi) {
			this.gioiHanTuoi = gioiHanTuoi;
		}
		public LocalDate getNgayCongChieu() {
			return ngayCongChieu;
		}
		public void setNgayCongChieu(LocalDate ngayCongChieu) {
			this.ngayCongChieu = ngayCongChieu;
		}
		public String getNhaSanXuat() {
			return nhaSanXuat;
		}
		public void setNhaSanXuat(String nhaSanXuat) {
			this.nhaSanXuat = nhaSanXuat;
		}
		public String getTomTat() {
			return tomTat;
		}
		public void setTomTat(String tomTat) {
			this.tomTat = tomTat;
		}
		public String getLoaiPhim() {
			return loaiPhim;
		}
		public void setLoaiPhim(String loaiPhim) {
			this.loaiPhim = loaiPhim;
		}
		public String getQuocGia() {
			return quocGia;
		}
		public void setQuocGia(String quocGia) {
			this.quocGia = quocGia;
		}
		public String getMaLoaiPhim() {
			return maLoaiPhim;
		}
		public void setMaLoaiPhim(String maLoaiPhim) {
			this.maLoaiPhim = maLoaiPhim;
		}
		@Override
		public String toString() {
			return "Phim [maPhim=" + maPhim + ", tenPhim=" + tenPhim + ", thoiLuong=" + thoiLuong + ", gioiHanTuoi="
					+ gioiHanTuoi + ", ngayCongChieu=" + ngayCongChieu + ", nhaSanXuat=" + nhaSanXuat + ", tomTat="
					+ tomTat + ", loaiPhim=" + loaiPhim + ", quocGia=" + quocGia + ", maLoaiPhim=" + maLoaiPhim + "]";
		}
		
}
