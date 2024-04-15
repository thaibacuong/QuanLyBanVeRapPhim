package entity;
import java.time.LocalDate;

public class VeBan {
	private String MaVB;
	private LocalDate NgayBD;
	private LocalDate NgayKT;
	private GheNgoi gheNgoi;
	private SuatChieu suatChieu;
	private String LVe;
	private HoaDon hoadon;
	private GheNgoi ghengoi;
	
	public VeBan() {
		super();
	}

	public VeBan(HoaDon hoadon) {
		super();

	}

	public VeBan(GheNgoi ghengoi) {
		super();

	}

	public VeBan(SuatChieu suatChieu) {
		super();

	}

	public VeBan(String maVB, LocalDate ngayBD, LocalDate ngayKT, GheNgoi gheNgoi, SuatChieu suatChieu, String lVe,
			HoaDon hoadon, GheNgoi ghengoi2) {
		super();
		this.MaVB = maVB;
		this.NgayBD = ngayBD;
		this.NgayKT = ngayKT;
		this.gheNgoi = gheNgoi;
		this.suatChieu = suatChieu;
		this.LVe = lVe;
		this.hoadon = hoadon;
		this.ghengoi = ghengoi2;
	}

	public String getMaVB() {
		return MaVB;
	}

	public void setMaVB(String maVB) {
		MaVB = maVB;
	}

	public LocalDate getNgayBD() {
		return NgayBD;
	}

	public void setNgayBD(LocalDate ngayBD) {
		NgayBD = ngayBD;
	}

	public LocalDate getNgayKT() {
		return NgayKT;
	}

	public void setNgayKT(LocalDate ngayKT) {
		NgayKT = ngayKT;
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

	public String getLVe() {
		return LVe;
	}

	public void setLVe(String lVe) {
		LVe = lVe;
	}

	public HoaDon getHoadon() {
		return hoadon;
	}

	public void setHoadon(HoaDon hoadon) {
		this.hoadon = hoadon;
	}

	public GheNgoi getGhengoi() {
		return ghengoi;
	}

	public void setGhengoi(GheNgoi ghengoi) {
		this.ghengoi = ghengoi;
	}

	@Override
	public String toString() {
		return "VeBan [MaVB=" + MaVB + ", NgayBD=" + NgayBD + ", NgayKT=" + NgayKT + ", gheNgoi=" + gheNgoi
				+ ", suatChieu=" + suatChieu + ", LVe=" + LVe + ", hoadon=" + hoadon + ", ghengoi=" + ghengoi + "]";
	}
	
	

}
