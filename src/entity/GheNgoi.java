package entity;
public class GheNgoi {
	private String MaGN;
	private String ViTriGN;
	private int TrangThai;
	private String LoaiGN;
	
	public GheNgoi(String MaGN) {
		super();
		this.MaGN = MaGN;
	}

	public GheNgoi(String maGN, String viTriGN, int trangThai, String loaiGN) {
		this.MaGN = maGN;
		this.ViTriGN = viTriGN;
		this.TrangThai = trangThai;
		this.LoaiGN = loaiGN;

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


	@Override
	public String toString() {
		return "GheNgoi [MaGN=" + MaGN + ", ViTriGN=" + ViTriGN + ", TrangThai=" + TrangThai + ", LoaiGN=" + LoaiGN
			+ "]";
	}
	
	
	

}
