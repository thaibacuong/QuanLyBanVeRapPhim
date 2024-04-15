package entity;
public class GheNgoi {
	private String MaGN;
	private String ViTriGN;
	private int TrangThai;
	private String LoaiGN;
	private PhongChieu phongChieu;
	
	public GheNgoi(PhongChieu phongChieu) {
		super();
	}

	public GheNgoi(String maGN, String viTriGN, int trangThai, String loaiGN, PhongChieu phongChieu) {
		super();
		this.MaGN = maGN;
		this.ViTriGN = viTriGN;
		this.TrangThai = trangThai;
		this.LoaiGN = loaiGN;
		this.phongChieu = phongChieu;
	}

	public String getMaGN() {
		return MaGN;
	}

	public void setMaGN(String maGN) {
		MaGN = maGN;
	}

	public String getViTriGN() {
		return ViTriGN;
	}

	public void setViTriGN(String viTriGN) {
		ViTriGN = viTriGN;
	}

	public int getTrangThai() {
		return TrangThai;
	}

	public void setTrangThai(int trangThai) {
		TrangThai = trangThai;
	}

	public String getLoaiGN() {
		return LoaiGN;
	}

	public void setLoaiGN(String loaiGN) {
		LoaiGN = loaiGN;
	}

	public PhongChieu getPhongChieu() {
		return phongChieu;
	}

	public void setPhongChieu(PhongChieu phongChieu) {
		this.phongChieu = phongChieu;
	}

	@Override
	public String toString() {
		return "GheNgoi [MaGN=" + MaGN + ", ViTriGN=" + ViTriGN + ", TrangThai=" + TrangThai + ", LoaiGN=" + LoaiGN
				+ ", phongChieu=" + phongChieu + "]";
	}
	
	
	

}
