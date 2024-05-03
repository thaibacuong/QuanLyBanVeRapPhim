package entity;

import java.sql.Time;

public class SuatChieu {
	private String MaSC;
	private Time GioBD;
	private Time GioKT;
	private String NgayChieu;
	private Phim phim;

	public SuatChieu(String maSC) {
		super();
		this.MaSC = maSC;
	}

	public SuatChieu(Phim phim) {
		super();
		this.phim = phim;
	}

	public SuatChieu(String maSC, Time gioBD, Time gioKT, String ngayChieu,
			Phim phim) {
		this.MaSC = maSC;
		this.GioBD = gioBD;
		this.GioKT = gioKT;
		this.NgayChieu = ngayChieu;
		this.phim = phim;
	}

	public String getMaSC() {
		return MaSC;
	}

	public void setMaSC(String maSC) {
		MaSC = maSC;
	}

	public Time getGioBD() {
		return GioBD;
	}

	public void setGioBD(Time gioBD) {
		GioBD = gioBD;
	}

	public Time getGioKT() {
		return GioKT;
	}

	public void setGioKT(Time gioKT) {
		GioKT = gioKT;
	}

	public String getNgayChieu() {
		return NgayChieu;
	}

	public void setNgayChieu(String ngayChieu) {
		NgayChieu = ngayChieu;
	}


	public Phim getPhim() {
		return phim;
	}

	public void setPhim(Phim phim) {
		this.phim = phim;
	}

	@Override
	public String toString() {
		return "SuatChieu [MaSC=" + MaSC + ", GioBD=" + GioBD + ", GioKT=" + GioKT + ", NgayChieu=" + NgayChieu
				+ ", phim=" + phim + "]";
	}

	
}
