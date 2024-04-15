package entity;
import java.time.LocalDate;

public class HoaDon {
	private String MaHD;
	private LocalDate NgayXHD;
	private NhanVien nhanVien;
	private KhachHang khachhang;
	
	public HoaDon(KhachHang khachhang) {
		super();
	}

	public HoaDon(NhanVien nhanVien) {
		super();
	}

	public HoaDon(String maHD, LocalDate ngayXHD, NhanVien nhanVien, KhachHang khachhang) {
		super();
		this.MaHD = maHD;
		this.NgayXHD = ngayXHD;
		this.nhanVien = nhanVien;
		this.khachhang = khachhang;
	}

	public String getMaHD() {
		return MaHD;
	}

	public void setMaHD(String maHD) {
		MaHD = maHD;
	}

	public LocalDate getNgayXHD() {
		return NgayXHD;
	}

	public void setNgayXHD(LocalDate ngayXHD) {
		NgayXHD = ngayXHD;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public KhachHang getKhachhang() {
		return khachhang;
	}

	public void setKhachhang(KhachHang khachhang) {
		this.khachhang = khachhang;
	}

	@Override
	public String toString() {
		return "HoaDon [MaHD=" + MaHD + ", NgayXHD=" + NgayXHD + ", nhanVien=" + nhanVien + ", khachhang=" + khachhang
				+ "]";
	}
}
