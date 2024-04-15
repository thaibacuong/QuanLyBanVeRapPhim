package entity;

import java.time.LocalDate;

public class NhanVien {
	private String MaNV;
	private String TenNV;
	private String SoCCCD;
	private String SoDT;
	private String ChuVu;
	private boolean GioiTinh;
	private String MatKH;
	private LocalDate NgaySinh;
	
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String maNV, String tenNV, String soCCCD, String soDT, String chuVu, boolean gioiTinh, String matKH,
			LocalDate ngaySinh) {
		super();
		this.MaNV = maNV;
		this.TenNV = tenNV;
		this.SoCCCD = soCCCD;
		this.SoDT = soDT;
		this.ChuVu = chuVu;
		this.GioiTinh = gioiTinh;
		this.MatKH = matKH;
		this.NgaySinh = ngaySinh;
	}

	public String getMaNV() {
		return MaNV;
	}

	public void setMaNV(String maNV) {
		MaNV = maNV;
	}

	public String getTenNV() {
		return TenNV;
	}

	public void setTenNV(String tenNV) {
		TenNV = tenNV;
	}

	public String getSoCCCD() {
		return SoCCCD;
	}

	public void setSoCCCD(String soCCCD) {
		SoCCCD = soCCCD;
	}

	public String getSoDT() {
		return SoDT;
	}

	public void setSoDT(String soDT) {
		SoDT = soDT;
	}

	public String getChuVu() {
		return ChuVu;
	}

	public void setChuVu(String chuVu) {
		ChuVu = chuVu;
	}

	public boolean isGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		GioiTinh = gioiTinh;
	}

	public String getMatKH() {
		return MatKH;
	}

	public void setMatKH(String matKH) {
		MatKH = matKH;
	}

	public LocalDate getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		NgaySinh = ngaySinh;
	}

	@Override
	public String toString() {
		return "NhanVien [MaNV=" + MaNV + ", TenNV=" + TenNV + ", SoCCCD=" + SoCCCD + ", SoDT=" + SoDT + ", ChuVu="
				+ ChuVu + ", GioiTinh=" + GioiTinh + ", MatKH=" + MatKH + ", NgaySinh=" + NgaySinh + "]";
	}

	
	
}
