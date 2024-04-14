package entity;

import java.time.LocalDate;

public class NhanVien {
	private String MaNV;
	private String TenNV;
	private String SoCCCD;
	private String SoDienThoai;
	private String ChuVu;
	private boolean phai;
	private String MatKhau;
	private LocalDate NgaySinh;
	
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String maNV, String tenNV, String soCCCD, String soDienThoai, String chuVu, boolean phai,
			String matKhau, LocalDate ngaySinh) {
		super();
		this.MaNV = maNV;
		this.TenNV = tenNV;
		this.SoCCCD = soCCCD;
		this.SoDienThoai = soDienThoai;
		this.ChuVu = chuVu;
		this.phai = phai;
		this.MatKhau = matKhau;
		this.NgaySinh = ngaySinh;
	}

	public LocalDate getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		NgaySinh = ngaySinh;
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

	public String getSoDienThoai() {
		return SoDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}

	public String getChuVu() {
		return ChuVu;
	}

	public void setChuVu(String chuVu) {
		ChuVu = chuVu;
	}

	public boolean isPhai() {
		return phai;
	}

	public void setPhai(boolean phai) {
		this.phai = phai;
	}

	public String getMatKhau() {
		return MatKhau;
	}

	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}

	@Override
	public String toString() {
		return "NhanVien [MaNV=" + MaNV + ", TenNV=" + TenNV + ", SoCCCD=" + SoCCCD + ", SoDienThoai=" + SoDienThoai
				+ ", ChuVu=" + ChuVu + ", phai=" + phai + ", MatKhau=" + MatKhau + ", NgaySinh=" + NgaySinh + "]";
	}
	
}
