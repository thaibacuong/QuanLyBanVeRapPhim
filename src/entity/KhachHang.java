package entity;

public class KhachHang {
	private String MaKH;
	private String TenKH;
	private String SoDT;
	private String NgaySinh;
	
	public KhachHang(String maKH) {
		super();
		this.MaKH = maKH;
	}
	public KhachHang(String maKH, String tenKH, String soDT, String ngaySinh) {
		this.MaKH = maKH;
		this.TenKH = tenKH;
		this.SoDT = soDT;
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

	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	@Override
	public String toString() {
		return "KhachHang [MaKH=" + MaKH + ", TenKH=" + TenKH + ", SoDT=" + SoDT + ", NgaySinh=" + NgaySinh + "]";
	}
	
}
