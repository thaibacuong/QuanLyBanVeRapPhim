package entity;
import java.time.LocalDate;

public class VeBan {
	private String maVeBan;
	private LocalDate ngayBatDau;
	private LocalDate ngayKetThuc;
	private GheNgoi gheNgoi;
	private SuatChieu suatChieu;
	private String loaiVe;
	
	public VeBan() {
		super();
	}

	
	
	public VeBan(String maVeBan, LocalDate ngayBatDau, LocalDate ngayKetThuc, GheNgoi gheNgoi, SuatChieu suatChieu,
			String loaiVe) {
		super();
		this.maVeBan = maVeBan;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.gheNgoi = gheNgoi;
		this.suatChieu = suatChieu;
		this.loaiVe = loaiVe;
	}



	public String getMaVeBan() {
		return maVeBan;
	}

	public void setMaVeBan(String maVeBan) {
		this.maVeBan = maVeBan;
	}

	public LocalDate getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(LocalDate ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public LocalDate getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(LocalDate ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	public GheNgoi getGheNgoi() {
		return gheNgoi;
	}

	public void setGheNgoi(GheNgoi gheNgoi) {
		this.gheNgoi = gheNgoi;
	}

	public SuatChieu getSuatChieu() {
		return suatChieu;
	}

	public void setSuatChieu(SuatChieu suatChieu) {
		this.suatChieu = suatChieu;
	}

	public String getLoaiVe() {
		return loaiVe;
	}

	public void setLoaiVe(String loaiVe) {
		this.loaiVe = loaiVe;
	}

	@Override
	public String toString() {
		return "VeBan [maVeBan=" + maVeBan + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc
				+ ", gheNgoi=" + gheNgoi + ", suatChieu=" + suatChieu + ", loaiVe=" + loaiVe + "]";
	}
	
	
}
