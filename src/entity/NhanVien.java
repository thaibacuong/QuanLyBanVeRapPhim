package entity;


public class NhanVien {
	private String MaNV;
	private String TenNV;
	private String SoDT;
	private String ChuVu;
	private boolean GioiTinh;
	private String MatKH;
	private String NgaySinh;
	private boolean TrangThai;
	
	public NhanVien(String maNV) {
		super();
		this.MaNV = maNV;
	}

	public NhanVien(String maNV, String tenNV, String soDT, String chuVu, boolean gioiTinh, String matKH,
			String ngaySinh, boolean Trangthai) {
		this.MaNV = maNV;
		this.TenNV = tenNV;
		this.SoDT = soDT;
		this.ChuVu = chuVu;
		this.GioiTinh = gioiTinh;
		this.MatKH = matKH;
		this.NgaySinh = ngaySinh;
		this.TrangThai=Trangthai;
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

	public String getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	

	public boolean isTrangThai() {
		return TrangThai;
	}

	public void setTrangThai(boolean trangThai) {
		TrangThai = trangThai;
	}

	@Override
	public String toString() {
		return "NhanVien [MaNV=" + MaNV + ", TenNV=" + TenNV + ", SoDT=" + SoDT + ", ChuVu="
				+ ChuVu + ", GioiTinh=" + GioiTinh + ", MatKH=" + MatKH + ", NgaySinh=" + NgaySinh + "]";
	}

	
	
}
