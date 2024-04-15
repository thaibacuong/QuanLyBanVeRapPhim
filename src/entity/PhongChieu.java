package entity;
public class PhongChieu {
	private String MaPC;
	private String TenPC;
	private int SucChua;
	private boolean TrangThai;
	public PhongChieu(String maPC, String tenPC, int sucChua, boolean trangThai) {
		super();
		this.MaPC = maPC;
		this.TenPC = tenPC;
		this.SucChua = sucChua;
		this.TrangThai = trangThai;
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
	public int getSucChua() {
		return SucChua;
	}
	public void setSucChua(int sucChua) {
		SucChua = sucChua;
	}
	public boolean isTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(boolean trangThai) {
		TrangThai = trangThai;
	}
	@Override
	public String toString() {
		return "PhongChieu [MaPC=" + MaPC + ", TenPC=" + TenPC + ", SucChua=" + SucChua + ", TrangThai=" + TrangThai
				+ "]";
	}
}
