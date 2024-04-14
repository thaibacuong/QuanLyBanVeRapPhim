package entity;
public class PhongChieu {
	private String maPhongChieu;
	private String tenPhongChieu;
	private int sucChua;
	private boolean trangThai;
	
	public PhongChieu() {
		super();
	}

	public String getMaPhongChieu() {
		return maPhongChieu;
	}

	public void setMaPhongChieu(String maPhongChieu) {
		this.maPhongChieu = maPhongChieu;
	}

	public String getTenPhongChieu() {
		return tenPhongChieu;
	}

	public void setTenPhongChieu(String tenPhongChieu) {
		this.tenPhongChieu = tenPhongChieu;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	@Override
	public String toString() {
		return "PhongChieu [maPhongChieu=" + maPhongChieu + ", tenPhongChieu=" + tenPhongChieu + ", sucChua=" + sucChua
				+ ", trangThai=" + trangThai + "]";
	}
	
	
	
}
