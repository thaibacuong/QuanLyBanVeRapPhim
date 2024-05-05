package entity;



public class HoaDon {
    private String MaHD;
    private String NgayXHD;
    private String GioXHD; 
    private NhanVien nhanVien;
    private int soVe; 
    private double tongHoaDon; 

    public HoaDon(String maHD, String ngayXHD, String gioXHD, NhanVien nhanVien, int soVe, double tongHoaDon) {
        this.MaHD = maHD;
        this.NgayXHD = ngayXHD;
        this.GioXHD = gioXHD;
        this.nhanVien = nhanVien;
        this.soVe = soVe;
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

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public int getSoVe() {
		return soVe;
	}

	public void setSoVe(int soVe) {
		this.soVe = soVe;
	}

	public double getTongHoaDon() {
		return tongHoaDon;
	}

	public void setTongHoaDon(double tongHoaDon) {
		this.tongHoaDon = tongHoaDon;
	}

	@Override
	public String toString() {
		return "HoaDon [MaHD=" + MaHD + ", NgayXHD=" + NgayXHD + ", GioXHD=" + GioXHD + ", nhanVien=" + nhanVien
				+ ", soVe=" + soVe + ", tongHoaDon=" + tongHoaDon + "]";
	}
    
	
}