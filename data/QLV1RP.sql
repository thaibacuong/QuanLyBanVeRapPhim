CREATE DATABASE QLVRP1

ON PRIMARY
(NAME=QLVRP1_DATA,
FILENAME="D:\HSK_SQL\QLVRP\QLVRP1_DATA.mdf",
SIZE=25MB,
MAXSIZE=35MB,
FILEGROWTH=5MB
)
LOG ON
(NAME=QLVRP1_LOG,
FILENAME="D:\HSK_SQL\QLVRP\QLVRP1_LOG.ldf",
SIZE=15MB,
MAXSIZE=25MB,
FILEGROWTH=3MB
)

CREATE TABLE NHANVIEN
(maNhanVien CHAR(5) NOT NULL,
tenNhanVien NVARCHAR(30) NOT NULL,
gioiTinh NVARCHAR,
ngaySing DATETIME,
soDienThoai CHAR(10),
chucVu NVARCHAR(20),
matKhau CHAR(20),
trangThai BIT
)

CREATE TABLE KHACHHANG
(maKhachHang CHAR(5) NOT NULL,
tenKhachHang NVARCHAR(30),
soDienThoai CHAR(10),
ngaySinh DATETIME
)

CREATE TABLE HOADON
(maHoaDon CHAR(5) NOT NULL,
ngayXuatHD DATETIME,
giaVe MONEY,
soLuong int,
maNhanVien CHAR(5),
maKhachHang CHAR(5)
)

CREATE TABLE VEBAN
(maVeBan CHAR(5) NOT NULL,
loaiVe CHAR(10) NOT NULL,
ngayBatDau DATETIME,
ngayKetThuc DATETIME,
maPhongChieu CHAR(5),
maSuatChieu CHAR(5),
giaVe MONEY
)

CREATE TABLE CT_HOADON
(hoaDon CHAR(5) NOT NULL,
maVeBan CHAR(5) NOT NULL,
soLuong int
)

CREATE TABLE SUATCHIEU
(maSuatChieu CHAR(5) NOT NULL,
gioBatDau DATETIME,
gioKetThuc DATETIME,
ngayChieu DATETIME,
maPhim CHAR(5)
)

CREATE TABLE PHIM
(maPhim CHAR(5) NOT NULL,
tenPhim NVARCHAR(20) NOT NULL,
thoiLuong TIME,
gioiHanTuoi int,
ngayCongChieu DATETIME NOT NULL,
nhaSanXuat NVARCHAR(20) NOT NULL,
loaiPhim NVARCHAR(10) NOT NULL,
)

CREATE TABLE PHONGCHIEU
(maPhongChieu CHAR(5) NOT NULL,
tenPhongChieu CHAR(5) NOT NULL,
DienTich INT,
trangThai BIT,
maGhe CHAR(5)
)

CREATE TABLE GHENGOI
(maGhe CHAR(5) NOT NULL,
viTriGhe CHAR(5) NOT NULL,
trangThai BIT,
loaiGhe CHAR(5)
)

ALTER TABLE NHANVIEN
	ADD CONSTRAINT PK_maNhanVien PRIMARY KEY (maNhanVien)

ALTER TABLE KHACHHANG
	ADD CONSTRAINT PK_maKhachHang PRIMARY KEY (maKhachHang)

ALTER TABLE HOADON
	ADD CONSTRAINT PK_maHoaDon PRIMARY KEY (maHoaDon)

ALTER TABLE CT_HOADON
	ADD CONSTRAINT PK_maHoaDon_maVeBan PRIMARY KEY (maHoaDon,maVeBan)

ALTER TABLE VEBAN
	ADD CONSTRAINT PK_maVeBan PRIMARY KEY (maVeBan)

ALTER TABLE SUATCHIEU
	ADD CONSTRAINT PK_maSuatChieu PRIMARY KEY (maSuatChieu)

ALTER TABLE PHONGCHIEU
	ADD CONSTRAINT PK_maPhongChieu PRIMARY KEY (maPhongChieu)

ALTER TABLE GHENGOI
	ADD CONSTRAINT PK_maGhe PRIMARY KEY (maGhe)

ALTER TABLE PHIM
	ADD CONSTRAINT PK_maPhim PRIMARY KEY (maPhim)

ALTER TABLE HOADON
	ADD CONSTRAINT FK_HD_maNhanVien FOREIGN KEY(maNhanVien) REFERENCES NHANVIEN(maNhanVien)

ALTER TABLE HOADON
	ADD CONSTRAINT FK_HD_maKhachHang FOREIGN KEY(maKhachHang) REFERENCES KHACHHANG(maKhachHang)

ALTER TABLE CT_HOADON
	ADD CONSTRAINT FK_CT_maVeBan FOREIGN KEY(maVeBan) REFERENCES VEBAN(maVeBan)

ALTER TABLE CT_HOADON
	ADD CONSTRAINT FK_CT_maNhanVien FOREIGN KEY(maNhanVien) REFERENCES NHANVIEN(maNhanVien)

ALTER TABLE VEBAN
	ADD CONSTRAINT FK_VB_maPhongChieu FOREIGN KEY(maPhongChieu) REFERENCES PHONGCHIEU(maPhongChieu)

ALTER TABLE VEBAN
	ADD CONSTRAINT FK_VB_maSuatChieu FOREIGN KEY(maSuatChieu) REFERENCES SUATCHIEU(maSuatChieu)

ALTER TABLE PHONGCHIEU
	ADD CONSTRAINT FK_PC_maGhe FOREIGN KEY(maGhe) REFERENCES GHENGOI(maGhe)

ALTER TABLE SUATCHIEU
	ADD CONSTRAINT FK_SC_maPhim FOREIGN KEY(maPhim) REFERENCES PHIM(maPhim)

SET DATEFORMAT 'DMY'

