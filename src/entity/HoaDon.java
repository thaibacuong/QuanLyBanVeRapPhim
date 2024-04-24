package entity;

import java.util.ArrayList;

public class HoaDon {
	private String MaHD;
	private int NgayXHD;
	private NhanVien nhanVien;
	private KhachHang khachhang;
    private ArrayList<ChiTietHoaDon> chiTietHoaDonList;
    
	public HoaDon(String maHD) {
		super();
		MaHD = maHD;
	}

	public HoaDon(KhachHang khachhang) {
		super();
		this.khachhang = khachhang;
	}

	public HoaDon(NhanVien nhanVien) {
		super();
		this.nhanVien = nhanVien;
	}

	public HoaDon(String maHD, int ngayXHD, NhanVien nhanVien, KhachHang khachhang) {
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

	public int getNgayXHD() {
		return NgayXHD;
	}

	public void setNgayXHD(int ngayXHD) {
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
	
	public double tinhTongTien() {
	    double tongTien = 0.0;
	    for (ChiTietHoaDon chiTiet : chiTietHoaDonList) {
	        tongTien += chiTiet.thanhTien();
	    }
	    return tongTien;
	}

	@Override
	public String toString() {
		return "HoaDon [MaHD=" + MaHD + ", NgayXHD=" + NgayXHD + ", nhanVien=" + nhanVien + ", khachhang=" + khachhang
				+ "]";
	}
}
