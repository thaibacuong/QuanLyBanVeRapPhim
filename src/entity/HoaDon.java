package entity;
import java.time.LocalDate;

public class HoaDon {
	private String maHoaDon;
	private LocalDate ngayXuatHD;
	private NhanVien nhanVien;
	
	public HoaDon() {
		super();
	}
	
	public HoaDon(String maHoaDon, LocalDate ngayXuatHD, NhanVien nhanVien) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayXuatHD = ngayXuatHD;
		this.nhanVien = nhanVien;
	}

	public String getMaHoaDon() {
		return maHoaDon;
	}



	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}



	public LocalDate getNgayXuatHD() {
		return ngayXuatHD;
	}



	public void setNgayXuatHD(LocalDate ngayXuatHD) {
		this.ngayXuatHD = ngayXuatHD;
	}



	public NhanVien getNhanVien() {
		return nhanVien;
	}



	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
