package entity;
public class ChiTietHoaDon {
	private HoaDon hoaDon;
	private VeBan veBan;
	private int soLuong;
	private double tongTien;
	
	public ChiTietHoaDon() {
		super();
	}

	public ChiTietHoaDon(HoaDon hoaDon, VeBan veBan, int soLuong, double tongTien) {
		super();
		this.hoaDon = hoaDon;
		this.veBan = veBan;
		this.soLuong = soLuong;
		this.tongTien = tongTien;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public VeBan getVeBan() {
		return veBan;
	}

	public void setVeBan(VeBan veBan) {
		this.veBan = veBan;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [hoaDon=" + hoaDon + ", veBan=" + veBan + ", soLuong=" + soLuong + ", tongTien="
				+ tongTien + "]";
	}
	
	
}
