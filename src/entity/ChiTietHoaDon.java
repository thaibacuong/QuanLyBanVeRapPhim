package entity;
public class ChiTietHoaDon {
	private HoaDon hoaDon;
	private int SoL;
	private double GiaT;
	
	
	public ChiTietHoaDon(HoaDon hoaDon) {
		super();
	}


	public ChiTietHoaDon(HoaDon hoaDon, int soL, double giaT) {
		super();
		this.hoaDon = hoaDon;
		this.SoL = soL;
		this.GiaT = giaT;
	}


	public HoaDon getHoaDon() {
		return hoaDon;
	}


	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}


	public int getSoL() {
		return SoL;
	}


	public void setSoL(int soL) {
		SoL = soL;
	}


	public double getGiaT() {
		return GiaT;
	}


	public void setGiaT(double giaT) {
		GiaT = giaT;
	}


	@Override
	public String toString() {
		return "ChiTietHoaDon [hoaDon=" + hoaDon + ", SoL=" + SoL + ", GiaT=" + GiaT + "]";
	}
	
}
