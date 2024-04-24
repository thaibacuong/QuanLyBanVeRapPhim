package entity;


public class Ve {
	private String MaVe;
	private int NgayBD;
	private int NgayKT;
	private SuatChieu suatChieu;
	private String LoaiVe;
	private PhongChieu Phongchieu;
	private Double GiaVe;
	
	public Ve(String maVe) {
		super();
		this.MaVe = maVe;
	}
	
	public Ve(SuatChieu suatChieu, PhongChieu phongchieu) {
		super();
		this.suatChieu = suatChieu;
		Phongchieu = phongchieu;
	}

	public Ve(String maVe, int ngayBD, int ngayKT, SuatChieu suatChieu, String loaiVe, PhongChieu phongchieu,
			Double giaVe) {
		this.MaVe = maVe;
		this.NgayBD = ngayBD;
		this.NgayKT = ngayKT;
		this.suatChieu = suatChieu;
		this.LoaiVe = loaiVe;
		this.Phongchieu = phongchieu;
		this.GiaVe = giaVe;
	}

	public String getMaVe() {
		return MaVe;
	}

	public void setMaVe(String maVe) {
		MaVe = maVe;
	}

	public int getNgayBD() {
		return NgayBD;
	}

	public void setNgayBD(int ngayBD) {
		NgayBD = ngayBD;
	}

	public int getNgayKT() {
		return NgayKT;
	}

	public void setNgayKT(int ngayKT) {
		NgayKT = ngayKT;
	}

	public SuatChieu getSuatChieu() {
		return suatChieu;
	}

	public void setSuatChieu(SuatChieu suatChieu) {
		this.suatChieu = suatChieu;
	}

	public String getLoaiVe() {
		return LoaiVe;
	}

	public void setLoaiVe(String loaiVe) {
		LoaiVe = loaiVe;
	}

	public PhongChieu getPhongchieu() {
		return Phongchieu;
	}

	public void setPhongchieu(PhongChieu phongchieu) {
		Phongchieu = phongchieu;
	}

	public Double getGiaVe() {
		return GiaVe;
	}

	public void setGiaVe(Double giaVe) {
		GiaVe = giaVe;
	}

	@Override
	public String toString() {
		return "Ve [MaVe=" + MaVe + ", NgayBD=" + NgayBD + ", NgayKT=" + NgayKT + ", suatChieu=" + suatChieu
				+ ", LoaiVe=" + LoaiVe + ", Phongchieu=" + Phongchieu + ", GiaVe=" + GiaVe + "]";
	}
	
	

}
