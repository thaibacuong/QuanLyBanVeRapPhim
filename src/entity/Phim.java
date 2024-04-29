package entity;

import java.sql.Time;
import java.sql.Date;

public class Phim {
	private String MaPHIM;
	private String TenPhim;
	private Time ThoiLuong;
	private int DoTuoi;
	private Date NgayCongChieu;
	private String NhaSX;
	private String LoaiPhim;

	public Phim(String maPHIM) {
		super();
		MaPHIM = maPHIM;
	}

	public Phim(String maPHIM, String tenPhim, Time thoiLuong, int doTuoi, Date ngayCongChieu, String nhaSX,
			String loaiPhim) {
		this.MaPHIM = maPHIM;
		this.TenPhim = tenPhim;
		this.ThoiLuong = thoiLuong;
		this.DoTuoi = doTuoi;
		this.NgayCongChieu = ngayCongChieu;
		this.NhaSX = nhaSX;
		this.LoaiPhim = loaiPhim;
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

	public Time getThoiLuong() {
		return ThoiLuong;
	}

	public void setThoiLuong(Time thoiLuong) {
		ThoiLuong = thoiLuong;
	}

	public int getDoTuoi() {
		return DoTuoi;
	}

	public void setDoTuoi(int doTuoi) {
		DoTuoi = doTuoi;
	}

	public Date getNgayCongChieu() {
		return NgayCongChieu;
	}

	public void setNgayCongChieu(Date ngayCongChieu) {
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

	@Override
	public String toString() {
		return "Phim [MaPHIM=" + MaPHIM + ", TenPhim=" + TenPhim + ", ThoiLuong=" + ThoiLuong + ", DoTuoi=" + DoTuoi
				+ ", NgayCongChieu=" + NgayCongChieu + ", NhaSX=" + NhaSX + ", LoaiPhim=" + LoaiPhim + "]";
	}

	
}
