package entity;
public class GheNgoi {
	private String MaGN;
	private Boolean TrangThai;
	private String LoaiGN;
	private PhongChieu phongchieu;
	
	public GheNgoi(String MaGN) {
		super();
		this.MaGN = MaGN;
	}



	public GheNgoi(PhongChieu phongchieu) {
		super();
		this.phongchieu = phongchieu;
	}

	/**
	 * @param maGN
	 * @param viTriGN
	 * @param trangThai
	 * @param loaiGN
	 */

	public GheNgoi(String maGN,Boolean trangThai, String loaiGN, PhongChieu phongchieu) {
		super();
		this.MaGN = maGN;
		this.TrangThai = trangThai;
		this.LoaiGN = loaiGN;
		this.phongchieu = phongchieu;
	}



	public String getMaGN() {
		return MaGN;
	}




	public void setMaGN(String maGN) {
		MaGN = maGN;
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




	public PhongChieu getPhongchieu() {
		return phongchieu;
	}



	public void setPhongchieu(PhongChieu phongchieu) {
		this.phongchieu = phongchieu;
	}



	@Override
	public String toString() {
		return "GheNgoi [MaGN=" + MaGN + ", TrangThai=" + TrangThai + ", LoaiGN=" + LoaiGN
				+ ", phongchieu=" + phongchieu + "]";
	}
	

}
