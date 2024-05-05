package entity;
public class PhongChieu {
	private String MaPC;
	private String TenPC;
	private int DienTich;
	private String TrangThai;
	
	
	public PhongChieu(String maPC) {
		super();
		this.MaPC = maPC;
	}
	
	public PhongChieu(String maPC, String tenPC, int dientich, String trangThai) {
		this.MaPC = maPC;
		this.TenPC = tenPC;
		this.DienTich = dientich;
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
	
	public String isTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}

	public int getDienTich() {
		return DienTich;
	}

	public void setDienTich(int dienTich) {
		DienTich = dienTich;
	}

	

	@Override
	public String toString() {
		return "PhongChieu [MaPC=" + MaPC + ", TenPC=" + TenPC + ", DienTich=" + DienTich + ", TrangThai=" + TrangThai + "]";
	}
	
}
