package entity;
import java.time.LocalDate;

public class SuatChieu {
	private String maSuatChieu;
	private LocalDate gioBatDau;
	private LocalDate gioKetThuc;
	private PhongChieu phongChieu;
	private Phim phim;
	
	public SuatChieu() {
		super();
	}

	public String getMaSuatChieu() {
		return maSuatChieu;
	}

	public void setMaSuatChieu(String maSuatChieu) {
		this.maSuatChieu = maSuatChieu;
	}

	public LocalDate getGioBatDau() {
		return gioBatDau;
	}

	public void setGioBatDau(LocalDate gioBatDau) {
		this.gioBatDau = gioBatDau;
	}

	public LocalDate getGioKetThuc() {
		return gioKetThuc;
	}

	public void setGioKetThuc(LocalDate gioKetThuc) {
		this.gioKetThuc = gioKetThuc;
	}

	public PhongChieu getPhongChieu() {
		return phongChieu;
	}

	public void setPhongChieu(PhongChieu phongChieu) {
		this.phongChieu = phongChieu;
	}

	public Phim getPhim() {
		return phim;
	}

	public void setPhim(Phim phim) {
		this.phim = phim;
	}

	@Override
	public String toString() {
		return "SuatChieu [maSuatChieu=" + maSuatChieu + ", gioBatDau=" + gioBatDau + ", gioKetThuc=" + gioKetThuc
				+ ", phongChieu=" + phongChieu + ", phim=" + phim + "]";
	}
	
	
}
