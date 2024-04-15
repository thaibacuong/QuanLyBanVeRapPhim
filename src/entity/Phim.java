package entity;

import java.time.LocalDate;

public class Phim {
		private String MaPHIM;
		private String TenPhim;
		private int ThoiLuong;
		private int DoTuoi;
		private LocalDate NgayCongChieu;
		private String NhaSX;
		private String LoaiPhim;
		private SuatChieu suatchieu;
		
		public Phim(SuatChieu suatchieu) {
			super();

		}

		public Phim(String maPHIM, String tenPhim, int thoiLuong, int doTuoi, LocalDate ngayCongChieu, String nhaSX,
				String loaiPhim, SuatChieu suatchieu) {
			super();
			this.MaPHIM = maPHIM;
			this.TenPhim = tenPhim;
			this.ThoiLuong = thoiLuong;
			this.DoTuoi = doTuoi;
			this.NgayCongChieu = ngayCongChieu;
			this.NhaSX = nhaSX;
			this.LoaiPhim = loaiPhim;
			this.suatchieu = suatchieu;
		}

		public String getMaPHIM() {
			return MaPHIM;
		}

		public void setMaPHIM(String maPHIM) {
			MaPHIM = maPHIM;
		}

		public String getTenPhim() {
			return TenPhim;
		}

		public void setTenPhim(String tenPhim) {
			TenPhim = tenPhim;
		}

		public int getThoiLuong() {
			return ThoiLuong;
		}

		public void setThoiLuong(int thoiLuong) {
			ThoiLuong = thoiLuong;
		}

		public int getDoTuoi() {
			return DoTuoi;
		}

		public void setDoTuoi(int doTuoi) {
			DoTuoi = doTuoi;
		}

		public LocalDate getNgayCongChieu() {
			return NgayCongChieu;
		}

		public void setNgayCongChieu(LocalDate ngayCongChieu) {
			NgayCongChieu = ngayCongChieu;
		}

		public String getNhaSX() {
			return NhaSX;
		}

		public void setNhaSX(String nhaSX) {
			NhaSX = nhaSX;
		}

		public String getLoaiPhim() {
			return LoaiPhim;
		}

		public void setLoaiPhim(String loaiPhim) {
			LoaiPhim = loaiPhim;
		}

		public SuatChieu getSuatchieu() {
			return suatchieu;
		}

		public void setSuatchieu(SuatChieu suatchieu) {
			this.suatchieu = suatchieu;
		}

		@Override
		public String toString() {
			return "Phim [MaPHIM=" + MaPHIM + ", TenPhim=" + TenPhim + ", ThoiLuong=" + ThoiLuong + ", DoTuoi=" + DoTuoi
					+ ", NgayCongChieu=" + NgayCongChieu + ", NhaSX=" + NhaSX + ", LoaiPhim=" + LoaiPhim
					+ ", suatchieu=" + suatchieu + "]";
		}
		
		
		
}
