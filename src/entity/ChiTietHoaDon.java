package entity;
public class ChiTietHoaDon {
	private HoaDon hoaDon;
	private int SoLuong;
	private Ve ve;
	
	
	public ChiTietHoaDon(HoaDon hoaDon) {
		super();
		this.hoaDon = hoaDon;
	}
	
	public ChiTietHoaDon(Ve ve) {
		super();
		this.ve = ve;
	}
	
	public ChiTietHoaDon(HoaDon hoaDon, int soLuong, Ve ve) {
		this.hoaDon = hoaDon;
		this.SoLuong = soLuong;
		this.ve = ve;
	}
	
	public HoaDon getHoaDon() {
		return hoaDon;
	}
	
	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}
	
	public int getSoLuong() {
		return SoLuong;
	}


	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}


	public Ve getVe() {
		return ve;
	}

	public void setVe(Ve ve) {
		this.ve = ve;
	}

	public double thanhTien() {
	    return SoLuong * ve.getGiaVe();
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [hoaDon=" + hoaDon + ", SoLuong=" + SoLuong + ", ve=" + ve + "]";
	}
}
