package entity;
import java.time.LocalDate;

public class SuatChieu {
	private String MaSC;
	private LocalDate GioBD;
	private LocalDate GioKT;
	private LocalDate NgayChieu;
	private PhongChieu phongChieu;
	private Phim phim;
	
	public SuatChieu() {
		super();
	}

	public SuatChieu(Phim phim) {
		super();
	}

	public SuatChieu(PhongChieu phongChieu) {
		super();
	}

	public SuatChieu(String maSC, LocalDate gioBD, LocalDate gioKT, LocalDate ngayChieu, PhongChieu phongChieu,
			Phim phim) {
		super();
		this.MaSC = maSC;
		this.GioBD = gioBD;
		this.GioKT = gioKT;
		this.NgayChieu = ngayChieu;
		this.phongChieu = phongChieu;
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
		return "SuatChieu [MaSC=" + MaSC + ", GioBD=" + GioBD + ", GioKT=" + GioKT + ", NgayChieu=" + NgayChieu
				+ ", phongChieu=" + phongChieu + ", phim=" + phim + "]";
	}	
}
