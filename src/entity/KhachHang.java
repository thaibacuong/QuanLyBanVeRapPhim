package entity;

public class KhachHang {
	private String MaKH;
	private String TenKH;
	private String SoDT;
	private boolean GioiTinh;
	private int NgaySinh;
	
	public KhachHang(String maKH) {
		super();
		this.MaKH = maKH;
	}
	public KhachHang(String maKH, String tenKH, String soDT, boolean gioiTinh, int ngaySinh) {
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
	public int getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(int ngaySinh) {
		NgaySinh = ngaySinh;
	}
	@Override
	public String toString() {
		return "KhachHang [MaKH=" + MaKH + ", TenKH=" + TenKH + ", SoDT=" + SoDT + ", GioiTinh=" + GioiTinh
				+ ", NgaySinh=" + NgaySinh + "]";
	}
	
}
