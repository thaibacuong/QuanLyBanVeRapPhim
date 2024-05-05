CREATE DATABASE QLBV1RP

ON PRIMARY
(NAME=QLBV1RP_DATA,
FILENAME="D:\HSK_SQL\QLVRP\QLBV1RP_DATA.mdf",
SIZE=25MB,
MAXSIZE=35MB,
FILEGROWTH=5MB
)
LOG ON
(NAME=QLBV1RP_LOG,
FILENAME="D:\HSK_SQL\QLVRP\QLBV1RP_LOG.ldf",
SIZE=15MB,
MAXSIZE=25MB,
FILEGROWTH=3MB
)

CREATE TABLE NHANVIEN
(maNhanVien CHAR(5) NOT NULL,
tenNhanVien NVARCHAR(30) NOT NULL,
gioiTinh bit,
ngaySing NVARCHAR(20),
soDienThoai CHAR(10),
chucVu NVARCHAR(20),
matKhau CHAR(20) Not Null,
trangThai BIT Not Null
)

select * from NHANVIEN

CREATE TABLE KHACHHANG
(maKhachHang CHAR(5) NOT NULL,
tenKhachHang NVARCHAR(30),
soDienThoai CHAR(10),
ngaySinh DATE Not Null
)

CREATE TABLE HOADON
(maHoaDon CHAR(5) NOT NULL,
ngayXuatHD DATE,
maNhanVien CHAR(5),
maKhachHang CHAR(5)
)

CREATE TABLE VE
(maVe CHAR(5) NOT NULL,
loaiVe CHAR(10) NOT NULL,
ngayBatDau DATE,
ngayKetThuc DATE,
maPhongChieu CHAR(5),
maSuatChieu CHAR(5),
giaVe MONEY
)

CREATE TABLE CT_HOADON
(hoaDon CHAR(5) NOT NULL,
maVe CHAR(5) NOT NULL,
soLuong int
)

CREATE TABLE SUATCHIEU
(maSuatChieu CHAR(5) NOT NULL,
gioBatDau NVARCHAR(10),
gioKetThuc NVARCHAR(10),
ngayChieu NVARCHAR(10),
maPhim CHAR(5)
)

use QLBV1RP
drop table PHONGCHIEU

CREATE TABLE PHIM
(maPhim CHAR(5) NOT NULL,
tenPhim NVARCHAR(20) NOT NULL,
thoiLuong NVARCHAR(20),
gioiHanTuoi int Not Null,
ngayCongChieu NVARCHAR(20),
nhaSanXuat NVARCHAR(20) NOT NULL,
loaiPhim NVARCHAR(10) NOT NULL,
)

CREATE TABLE PHONGCHIEU
(maPhongChieu CHAR(5) NOT NULL,
tenPhongChieu NVARCHAR(20) NOT NULL,
DienTich INT,
trangThai NVARCHAR(20) Not Null,
)

CREATE TABLE GHENGOI
(maGhe CHAR(5) NOT NULL,
trangThai BIT Not Null,
loaiGhe CHAR(5),
maphongchieu CHAR(5)
)

ALTER TABLE NHANVIEN
	ADD CONSTRAINT PK_maNhanVien PRIMARY KEY (maNhanVien)

ALTER TABLE KHACHHANG
	ADD CONSTRAINT PK_maKhachHang PRIMARY KEY (maKhachHang)

ALTER TABLE HOADON
	ADD CONSTRAINT PK_maHoaDon PRIMARY KEY (maHoaDon)

ALTER TABLE CT_HOADON
	ADD CONSTRAINT PK_maHoaDon_maVe PRIMARY KEY (hoaDon,maVe)

ALTER TABLE VE
	ADD CONSTRAINT PK_maVe PRIMARY KEY (maVe)

ALTER TABLE SUATCHIEU
	ADD CONSTRAINT PK_maSuatChieu PRIMARY KEY (maSuatChieu)

ALTER TABLE PHONGCHIEU
	ADD CONSTRAINT PK_maPhongChieu PRIMARY KEY (maPhongChieu)

ALTER TABLE GHENGOI
	ADD CONSTRAINT PK_maGhe PRIMARY KEY (maGhe)

ALTER TABLE PHIM
	ADD CONSTRAINT PK_maPhim PRIMARY KEY (maPhim)

ALTER TABLE HOADON
ADD CONSTRAINT FK_HD_maNhanVien FOREIGN KEY (maNhanVien) REFERENCES NHANVIEN(maNhanVien)
ON DELETE Cascade
ON UPDATE Cascade

ALTER TABLE HOADON
ADD CONSTRAINT FK_HD_maKhachHang FOREIGN KEY (maKhachHang) REFERENCES KHACHHANG(maKhachHang)
ON DELETE Cascade
ON UPDATE Cascade

ALTER TABLE CT_HOADON
ADD CONSTRAINT FK_CT_maVe FOREIGN KEY (maVe) REFERENCES VE(maVe)
ON DELETE Cascade
ON UPDATE Cascade

ALTER TABLE CT_HOADON
ADD CONSTRAINT FK_CT_maHoaDon FOREIGN KEY (hoaDon) REFERENCES HoaDon(maHoaDon)
ON DELETE Cascade
ON UPDATE Cascade

ALTER TABLE VE
ADD CONSTRAINT FK_VB_maPhongChieu FOREIGN KEY (maPhongChieu) REFERENCES PHONGCHIEU(maPhongChieu)
ON DELETE Cascade
ON UPDATE Cascade

ALTER TABLE VE
ADD CONSTRAINT FK_VB_maSuatChieu FOREIGN KEY (maSuatChieu) REFERENCES SUATCHIEU(maSuatChieu)
ON DELETE Cascade
ON UPDATE Cascade

ALTER TABLE GHENGOI
ADD CONSTRAINT FK_GN_maGhe FOREIGN KEY (maphongchieu) REFERENCES PHONGCHIEU(maPhongChieu)
ON DELETE Cascade
ON UPDATE Cascade

ALTER TABLE SUATCHIEU
ADD CONSTRAINT FK_SC_maPhim FOREIGN KEY (maPhim) REFERENCES PHIM(maPhim)
ON DELETE Cascade
ON UPDATE Cascade

SET DATEFORMAT 'DMY'




INSERT INTO GHENGOI (maGhe, trangThai, loaiGhe, maphongchieu)
VALUES 
('A1', true, 'th??ng', 'PC001'),
('A2', true, 'th??ng', 'PC001'),
('A3', true, 'th??ng', 'PC001'),
('A4', true, 'th??ng', 'PC001'),
('A5', true, 'th??ng', 'PC001'),
('A6', true, 'th??ng', 'PC001'),
('B1', true, 'th??ng', 'PC001'),
('B2', true, 'th??ng', 'PC001'),
('B3', true, 'th??ng', 'PC001'),
('B4', true, 'th??ng', 'PC001'),
('B5', true, 'th??ng', 'PC001'),
('B6', true, 'th??ng', 'PC001'),
('C1', true, 'th??ng', 'PC001'),
('C2', true, 'th??ng', 'PC001'),
('C3', true, 'th??ng', 'PC001'),
('C4', true, 'th??ng', 'PC001'),
('C5', true, 'th??ng', 'PC001'),
('C6', true, 'th??ng', 'PC001'),
('D1', true, 'th??ng', 'PC001'),
('D2', true, 'th??ng', 'PC001'),
('D3', true, 'th??ng', 'PC001'),
('D4', true, 'th??ng', 'PC001'),
('D5', true, 'th??ng', 'PC001'),
('D6', true, 'th??ng', 'PC001'),
('E1', true, 'vip', 'PC001'),
('E2', true, 'vip', 'PC001'),
('E3', true, 'vip', 'PC001'),
('E4', true, 'vip', 'PC001'),
('E5', true, 'vip', 'PC001'),
('E6', true, 'vip', 'PC001'),
('F1', true, 'vip', 'PC001'),
('F2', true, 'vip', 'PC001'),
('F3', true, 'vip', 'PC001'),
('F4', true, 'vip', 'PC001'),
('F5', true, 'vip', 'PC001'),
('F6', true, 'vip', 'PC001');
