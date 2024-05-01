package entity;
public class GheNgoi {
	private String MaGN;
	private String ViTriGN;
	private Boolean TrangThai;
	private String LoaiGN;
	
	public GheNgoi(String MaGN) {
		super();
		this.MaGN = MaGN;
	}

	


	/**
	 * @param maGN
	 * @param viTriGN
	 * @param trangThai
	 * @param loaiGN
	 */
	public GheNgoi(String maGN, String viTriGN, Boolean trangThai, String loaiGN) {
		super();
		MaGN = maGN;
		ViTriGN = viTriGN;
		TrangThai = trangThai;
		LoaiGN = loaiGN;
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




	public Boolean getTrangThai() {
		return TrangThai;
	}




	public void setTrangThai(Boolean trangThai) {
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
