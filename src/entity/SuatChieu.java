package entity;
import java.time.LocalDate;

public class SuatChieu {
	private String MaSC;
	private LocalDate GioBD;
	private LocalDate GioKT;
	private LocalDate NgayChieu;
	private Phim phim;

	public SuatChieu(String maSC) {
		super();
		this.MaSC = maSC;
	}

	public SuatChieu(Phim phim) {
		super();
		this.phim = phim;
	}

	public SuatChieu(String maSC, LocalDate gioBD, LocalDate gioKT, LocalDate ngayChieu,
			Phim phim) {
		this.MaSC = maSC;
		this.GioBD = gioBD;
		this.GioKT = gioKT;
		this.NgayChieu = ngayChieu;
		this.phim = phim;
	}

	public String getMaSC() {
		return MaSC;
	}

	public void setMaSC(String maSC) {
		MaSC = maSC;
	}

	public LocalDate getGioBD() {
		return GioBD;
	}

	public void setGioBD(LocalDate gioBD) {
		GioBD = gioBD;
	}

	public LocalDate getGioKT() {
		return GioKT;
	}

	public void setGioKT(LocalDate gioKT) {
		GioKT = gioKT;
	}

	public LocalDate getNgayChieu() {
		return NgayChieu;
	}

	public void setNgayChieu(LocalDate ngayChieu) {
		NgayChieu = ngayChieu;
	}


	public Phim getPhim() {
		return phim;
	}

	public void setPhim(Phim phim) {
		this.phim = phim;
	}

	@Override
	public String toString() {
		return "SuatChieu [MaSC=" + MaSC + ", GioBD=" + GioBD + ", GioKT=" + GioKT + ", NgayChieu=" + NgayChieu
				+ ", phim=" + phim + "]";
	}

	
}
