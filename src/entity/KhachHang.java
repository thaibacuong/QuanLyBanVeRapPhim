package entity;

import java.time.LocalDate;


public class KhachHang {
	private String MaKH;
	private String TenKH;
	private String SoDT;
	private boolean GioiTinh;
	private LocalDate NgaySinh;
	public KhachHang() {
		super();
	}
	public KhachHang(String maKH, String tenKH, String soDT, boolean gioiTinh, LocalDate ngaySinh) {
		super();
		this.MaKH = maKH;
		this.TenKH = tenKH;
		this.SoDT = soDT;
		this.GioiTinh = gioiTinh;
		this.NgaySinh = ngaySinh;
	}
	public String getMaKH() {
		return MaKH;
	}
	public void setMaKH(String maKH) {
		MaKH = maKH;
	}
	public String getTenKH() {
		return TenKH;
	}
	public void setTenKH(String tenKH) {
		TenKH = tenKH;
	}
	public String getSoDT() {
		return SoDT;
	}
	public void setSoDT(String soDT) {
		SoDT = soDT;
	}
	public boolean isGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public LocalDate getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		NgaySinh = ngaySinh;
	}
	@Override
	public String toString() {
		return "KhachHang [MaKH=" + MaKH + ", TenKH=" + TenKH + ", SoDT=" + SoDT + ", GioiTinh=" + GioiTinh
				+ ", NgaySinh=" + NgaySinh + "]";
	}
	
}
