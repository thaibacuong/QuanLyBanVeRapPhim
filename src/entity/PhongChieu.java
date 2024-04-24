package entity;
public class PhongChieu {
	private String MaPC;
	private String TenPC;
	private int DienTich;
	private boolean TrangThai;
	private GheNgoi gheNgoi;
	
	
	public PhongChieu(String maPC) {
		super();
		this.MaPC = maPC;
	}
	
	public PhongChieu(String maPC, String tenPC, int dientich, boolean trangThai, GheNgoi ghengoi) {
		this.MaPC = maPC;
		this.TenPC = tenPC;
		this.DienTich = dientich;
		this.TrangThai = trangThai;
		this.gheNgoi = ghengoi;
	}
	public String getMaPC() {
		return MaPC;
	}
	public void setMaPC(String maPC) {
		MaPC = maPC;
	}
	public String getTenPC() {
		return TenPC;
	}
	public void setTenPC(String tenPC) {
		TenPC = tenPC;
	}
	
	public boolean isTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(boolean trangThai) {
		TrangThai = trangThai;
	}

	public int getDienTich() {
		return DienTich;
	}

	public void setDienTich(int dienTich) {
		DienTich = dienTich;
	}

	public GheNgoi getGheNgoi() {
		return gheNgoi;
	}

	public void setGheNgoi(GheNgoi gheNgoi) {
		this.gheNgoi = gheNgoi;
	}

	@Override
	public String toString() {
		return "PhongChieu [MaPC=" + MaPC + ", TenPC=" + TenPC + ", DienTich=" + DienTich + ", TrangThai=" + TrangThai
				+ ", gheNgoi=" + gheNgoi + "]";
	}
	
}
