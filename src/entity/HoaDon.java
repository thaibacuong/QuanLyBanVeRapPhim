package entity;



public class HoaDon {
    private String MaHD;
    private String NgayXHD;
    private String GioXHD; 
    private String nhanVien;
    private String tongHoaDon; 

    public HoaDon(String maHD, String ngayXHD, String gioXHD, String nhanVien, String tongHoaDon) {
        this.MaHD = maHD;
        this.NgayXHD = ngayXHD;
        this.GioXHD = gioXHD;
        this.nhanVien = nhanVien;
        this.tongHoaDon = tongHoaDon;
    }

	public String getMaHD() {
		return MaHD;
	}

	public void setMaHD(String maHD) {
		MaHD = maHD;
	}

	public String getNgayXHD() {
		return NgayXHD;
	}

	public void setNgayXHD(String ngayXHD) {
		NgayXHD = ngayXHD;
	}

	public String getGioXHD() {
		return GioXHD;
	}

	public void setGioXHD(String gioXHD) {
		GioXHD = gioXHD;
	}

	public String getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(String nhanVien) {
		this.nhanVien = nhanVien;
	}


	public String getTongHoaDon() {
		return tongHoaDon;
	}

	public void setTongHoaDon(String tongHoaDon) {
		this.tongHoaDon = tongHoaDon;
	}

	@Override
	public String toString() {
		return "HoaDon [MaHD=" + MaHD + ", NgayXHD=" + NgayXHD + ", GioXHD=" + GioXHD + ", nhanVien=" + nhanVien
				+ ", tongHoaDon=" + tongHoaDon + "]";
	}
    
	
}