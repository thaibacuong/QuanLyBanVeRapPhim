package entity;

import java.util.ArrayList;

public class HoaDon {
	private String MaHD;
	private String NgayXHD;
	private NhanVien nhanVien;
    private ArrayList<ChiTietHoaDon> chiTietHoaDonList;
    
	public HoaDon(String maHD) {
		super();
		MaHD = maHD;
	}


	public HoaDon(NhanVien nhanVien) {
		super();
		this.nhanVien = nhanVien;
	}

	public HoaDon(String maHD, String ngayXHD, NhanVien nhanVien) {
		this.MaHD = maHD;
		this.NgayXHD = ngayXHD;
		this.nhanVien = nhanVien;
	}

	public String getMaHD() {
		return MaHD;
	}

	public void setMaHD(String maHD) {
		MaHD = maHD;
	}

	public String getNgayXHD() {
		return NgayXHD;
	}

	public void setNgayXHD(String ngayXHD) {
		NgayXHD = ngayXHD;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public double tinhTongTien() {
	    double tongTien = 0.0;
	    for (ChiTietHoaDon chiTiet : chiTietHoaDonList) {
	        tongTien += chiTiet.thanhTien();
	    }
	    return tongTien;
	}

	@Override
	public String toString() {
		return "HoaDon [MaHD=" + MaHD + ", NgayXHD=" + NgayXHD + ", nhanVien=" + nhanVien + ", chiTietHoaDonList="
				+ chiTietHoaDonList + "]";
	}
}
