
CREATE DATABASE QUANLYPHONGTRO
--ON(1E='QUANLYPHONGTRO_DEMO_1',FILE1E='C:\Program Files\Microsoft SQL Server\MSSQL10.CENTRALWALL\MSSQL\DATAQUANLYPHONGTRO_DEMO_1.MDF')
--LOG ON(1E='QUANLYPHONGTRO_DEMO_1',FILE1E='C:\Program Files\Microsoft SQL Server\MSSQL10.CENTRALWALL\MSSQL\DATAQUANLYPHONGTRO_DEMO_1.LDF')
GO
USE QUANLYPHONGTRO
GO

CREATE TABLE DAT_PHONG 
(
	maphong varchar(5),
	Username  nvarchar (25),
	songuoi int,
	ThoiGian datetime,

)
GO

CREATE TABLE USER_KHACHTHUE --Done
(
	UserID INT identity (1,1)PRIMARY KEY,
	Username  nvarchar (25),
	Pwd nvarchar(25),
	IsAdmin int check (IsAdmin IN (1,0)) Default 0,
	MaKhach varchar(5),
	TenKhach nvarchar(30),
	Email varchar(30), 
	Phai nvarchar(5),
	CMND varchar(11),
	QueQuan nvarchar(20), 
	NgheNghiep nvarchar(20),
	DienThoai varchar(11),
	TinhTrang int,
)
GO
CREATE TABLE KHACH_THUE --Done
(
	MaKhach varchar(5) primary key,
	TenKhach nvarchar(30),
	Phai nvarchar(5),
	CMND varchar(11),
	QueQuan nvarchar(20), 
	NgheNghiep nvarchar(20),
)
GO
CREATE TABLE PHONG_TRO
(
	MaPhong varchar(5)primary key,
	TrangThai int check (TrangThai IN (1,0)) Default 0,
	ThongTinPhong nvarchar(50),
	SoNguoi int,
)
GO
CREATE TABLE GIA_THUE
(
	SoNguoi int primary key,
	GiaTien money,
)
GO
CREATE TABLE BAO_TRI_THIET_BI --Done
(
	MaThietBi varchar(5) primary key,
	MaPhong varchar(5),
	TenThietBi nvarchar(30),
	TrangThai nvarchar(30),
)
GO
CREATE TABLE CT_KHACH_THUE
(
	MaKhach varchar(5),
	MaPhong varchar(5),
	NgayVaoPhong datetime,
	
)

GO
CREATE TABLE HOA_DON
(
	MaHoaDon int identity(1,1) primary key,
	NgayLap datetime,
	MaPhong varchar(5),
)
GO
CREATE TABLE HOP_DONG --done
(
	MaHopDong int identity primary key,
	NgayLap datetime,
	MaPhong varchar(5),
)
GO

CREATE TABLE DICH_VU --Done
(
	MaDichVu varchar(5) primary key,
	DichVu nvarchar(30),
	GiaDichVu money,
	MaLoaiDichVu varchar(5),
	QuyCach nvarchar(30),
)
GO
CREATE TABLE LOAI_DICH_VU
(
	MaLoaiDichVu varchar(5) primary key,
	TenLoaiDichVu nvarchar(20),
)
GO

Create table CT_DICHVU
(
	MaHoaDon int,
	MaDichVu varchar(5),
	DonViSuDung int,
)
ALTER TABLE DICH_VU
ADD CONSTRAINT FK_DICHVU_LOAIDICHVU FOREIGN KEY (MaLoaiDichVu)
REFERENCES LOAI_DICH_VU (MaLoaiDichVu)
ON UPDATE CASCADE


ALTER TABLE BAO_TRI_THIET_BI
ADD CONSTRAINT FK_BAOTRITHIETBI_PHONGTRO FOREIGN KEY (MaPhong)
REFERENCES PHONG_TRO (MaPhong)
ON UPDATE CASCADE

ALTER TABLE PHONG_TRO
ADD CONSTRAINT FK_PHONGTRO_GIATHUE FOREIGN KEY (SoNguoi)
REFERENCES GIA_THUE (SoNguoi)
ON UPDATE CASCADE

ALTER TABLE HOP_DONG
ADD CONSTRAINT FK_PHONGTRO_HOPDONG FOREIGN KEY (MaPhong)
REFERENCES PHONG_TRO (MaPhong)
ON UPDATE CASCADE
----PFK
GO
ALTER TABLE USER_KHACHTHUE
ADD CONSTRAINT FK_USERKHACHTHUE_KHACHTHUE FOREIGN KEY (MaKhach)
REFERENCES KHACH_THUE (MaKhach)
ON UPDATE CASCADE

ALTER TABLE CT_KHACH_THUE
ADD CONSTRAINT FK_CTKHACHTHUE_KHACHTHUE FOREIGN KEY (MaKhach)
REFERENCES KHACH_THUE (MaKhach)
ON UPDATE CASCADE

ALTER TABLE CT_KHACH_THUE
ADD CONSTRAINT FK_CTKHACHTHUE_PHONGTRO FOREIGN KEY (MaPhong)
REFERENCES PHONG_TRO (MaPhong)
ON UPDATE CASCADE

ALTER TABLE HOA_DON
ADD CONSTRAINT FK_HOADON_PHONGTRO FOREIGN KEY (MaPhong)
REFERENCES PHONG_TRO (MaPhong)
ON UPDATE CASCADE

ALTER TABLE CT_DICHVU
ADD CONSTRAINT FK_HOADON_CTDICHVU FOREIGN KEY (MaHoaDon)
REFERENCES HOA_DON (MaHoaDon)
ON UPDATE CASCADE

ALTER TABLE CT_DICHVU
ADD CONSTRAINT FK_DICHVU_CTDICHVU FOREIGN KEY (MaDichVu)
REFERENCES DICH_VU (MaDichVu)
ON UPDATE CASCADE
-----------------------------------------------------------------------------------------------------------------
GO
-----------------------------DATABASE-----------------------------
----ROLE
--INSERT ROLE_USER VALUES (111,'rwx')
--INSERT ROLE_USER VALUES (110,'rw')
--INSERT ROLE_USER VALUES (100,'r')

--GO
--KHACH_THUE

INSERT KHACH_THUE VALUES ('K01',N'Nguyễn Văn Tèo','Nam',281030001,N'Bình Định',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K02',N'Mạc Thị Bưởi',N'Nữ',281030002,N'Bình Dương',N'Công nhân'	)
INSERT KHACH_THUE VALUES ('K03',N'Ô Văn Quen','Nam',281030003,N'Bình Dương',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K04',N'Lao VănLực','Nam',281030004,N'TP.HCM',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K05',N'Hành văn Chính','Nam',281030005,N'Bình Dương',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K06',N'Kim Chi','Nam',281030008,N'Bình Định',N'Nhân viên')		
INSERT KHACH_THUE VALUES ('K07',N'Cường Văn Tráng','Nam',281030009,N'Bình Dương',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K08',N'Võ Tòng','Nam',281030010,N'TP.HCM',N'Lái xe')
INSERT KHACH_THUE VALUES ('K09',N'Lâm Sung','Nam',281030011,N'Bình Định',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K10',N'Tống Giang','Nam',281030012,N'TP.HCM',N'Sinh viên')		
INSERT KHACH_THUE VALUES ('K11',N'Quan Vũ','Nam',281030013,N'Bình Định',N'Sinh viên')		
INSERT KHACH_THUE VALUES ('K12',N'Lưu Bị','Nam',281030014,N'TP.HCM',N'Sinh viên')		
INSERT KHACH_THUE VALUES ('K13',N'Triệu Vân','Nam',281030015,N'Đồng Nai',N'Sinh viên')		
INSERT KHACH_THUE VALUES ('K14',N'Trương Phi','Nam',281030016,N'Đồng Nai',N'Công nhân')		
INSERT KHACH_THUE VALUES ('K15',N'Điêu Thuyền',N'Nữ',281030017,N'Bình Định',N'Công nhân')
INSERT KHACH_THUE VALUES ('K16',N'Tây Thi',N'Nữ',281030018,N'Đồng Tháp',N'Kế toán')
INSERT KHACH_THUE VALUES ('K17',N'Ngọc Trinh',N'Nữ',281030019,N'Đồng Nai',N'Phụ hồ')		
INSERT KHACH_THUE VALUES ('K18',N'Hà Trác Ngôn',N'Nữ',281030020,N'Lâm Đồng',N'Thợ may')		
INSERT KHACH_THUE VALUES ('K19',N'Lưu Diệc Phi',N'Nữ',281030021,N'Bình Thuận',N'Phụ hồ')		
INSERT KHACH_THUE VALUES ('K20',N'Lưu Văn Ban','Nam',281030022,N'Đồng Tháp',N'Công nhân')		
INSERT KHACH_THUE VALUES ('K21',N'Nguyễn Hữu Nam','Nam',281030023,N'TP.HCM',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K22',N'Trần Văn Chất','Nam',281030024,N'Tiền Giang',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K23',N'Nguyễn Văn D',N'Nữ',281030025,N'Kiên Giang',N'Sinh viên')
INSERT KHACH_THUE VALUES ('K24',N'Trần Thị B',N'Nữ',281030026,N'Bình Định',N'Kế toán')
INSERT KHACH_THUE VALUES ('K25',N'Nguyễn Thị E','Nam',281030027,N'TP.HCM',N'Sinh viên')		
INSERT KHACH_THUE VALUES ('K26',N'John','Nam',281030028,N'Nghệ An',N'Kinh Doanh')		
INSERT KHACH_THUE VALUES ('K27',N'Franky','Nam',281030029,N'Đồng Nai',N'IT')
INSERT KHACH_THUE VALUES ('K28',N'Ace','Nam',281030030,N'Quảng Nam',N'Sinh viên')		
INSERT KHACH_THUE VALUES ('K29',N'Nguyễn văn A',N'Nữ',281030031,N'Bạc Liêu',N'Công nhân')		
GO

--USER_KHACHTHUE
--INSERT USER_KHACHTHUE VALUES ('admin','admin',1,NULL)
--INSERT USER_KHACHTHUE VALUES ('user01','123456',0,'K01')
--INSERT USER_KHACHTHUE VALUES ('user02','123456',0,'K03')
--INSERT USER_KHACHTHUE VALUES ('user03','123456',0,'K04')
--INSERT USER_KHACHTHUE VALUES ('user04','123456',0,'K05')
--INSERT USER_KHACHTHUE VALUES ('user05','123456',0,'K07')
--INSERT USER_KHACHTHUE VALUES ('user06','123456',0,'K08')
--INSERT USER_KHACHTHUE VALUES ('user07','123456',0,'K09')
--INSERT USER_KHACHTHUE VALUES ('user08','123456',0,'K15')
--INSERT USER_KHACHTHUE VALUES ('user09','123456',0,'K21')
--INSERT USER_KHACHTHUE VALUES ('user10','123456',0,'K22')
--INSERT USER_KHACHTHUE VALUES ('user11','123456',0,'K23')
--INSERT USER_KHACHTHUE VALUES ('user12','123456',0,'K24')
--INSERT USER_KHACHTHUE VALUES ('user13','123456',0,'K27')
INSERT USER_KHACHTHUE VALUES ('admin','admin',1,NULL,	NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user01','123456',0,'K01',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user02','123456',0,'K03',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user03','123456',0,'K04',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user04','123456',0,'K05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user05','123456',0,'K07',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user06','123456',0,'K08',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user07','123456',0,'K09',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user08','123456',0,'K15',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user09','123456',0,'K21',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user10','123456',0,'K22',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user11','123456',0,'K23',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user12','123456',0,'K24',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user13','123456',0,'K27',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)
INSERT USER_KHACHTHUE VALUES ('user14','123456',0,NULL,'Vô danh','email@yahoo.com','Nam','1235699','TPHCM','IT','58852',1)


GO
--GIA_THUE
INSERT GIA_THUE VALUES (1,500000)
INSERT GIA_THUE VALUES (2,1000000)
INSERT GIA_THUE VALUES (3,1500000)
INSERT GIA_THUE VALUES (4,1700000)
INSERT GIA_THUE VALUES (5,2000000)

GO
--PHONG_TRO

INSERT PHONG_TRO VALUES ('A101',1,	NULL,	3)	
INSERT PHONG_TRO VALUES ('A102',1,	NULL,	3)	
INSERT PHONG_TRO VALUES ('A103',1,	NULL,	2)	
INSERT PHONG_TRO VALUES ('A104',1,	NULL,	1)	
INSERT PHONG_TRO VALUES ('A105',1,	NULL,	3)		
INSERT PHONG_TRO VALUES ('A106',1,	NULL,	1)	
INSERT PHONG_TRO VALUES ('A107',1,	NULL,	3)	
INSERT PHONG_TRO VALUES ('A108',1,	NULL,	3)		
INSERT PHONG_TRO VALUES ('A109',1,	NULL,	3)	
INSERT PHONG_TRO VALUES ('A110',1,	NULL,	4)	
INSERT PHONG_TRO VALUES ('B101',1,	NULL,	2)	
INSERT PHONG_TRO VALUES ('B102',1,	NULL,	1)	
INSERT PHONG_TRO VALUES ('B103',0,	NULL,	NULL)		
INSERT PHONG_TRO VALUES ('B104',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B105',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B106',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B107',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B108',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B109',0,	NULL,	NULL)	
INSERT PHONG_TRO VALUES ('B110',0,	NULL,	NULL)	

GO
--CT_KHACH_THUE
set dateformat dmy
INSERT CT_KHACH_THUE VALUES ('K01', 'A101',NULL)
INSERT CT_KHACH_THUE VALUES ('K02', 'A101',NULL)
INSERT CT_KHACH_THUE VALUES ('K03', 'A101',NULL)
INSERT CT_KHACH_THUE VALUES ('K04', 'A102',NULL)
INSERT CT_KHACH_THUE VALUES ('K05', 'A102',NULL)
INSERT CT_KHACH_THUE VALUES ('K06', 'A102',NULL)
INSERT CT_KHACH_THUE VALUES ('K07', 'A103',NULL)
INSERT CT_KHACH_THUE VALUES ('K08', 'A103',NULL)
INSERT CT_KHACH_THUE VALUES ('K09', 'A104',NULL)
INSERT CT_KHACH_THUE VALUES ('K10', 'A105',NULL)
INSERT CT_KHACH_THUE VALUES ('K11', 'A105',NULL)
INSERT CT_KHACH_THUE VALUES ('K12', 'A105',NULL)
INSERT CT_KHACH_THUE VALUES ('K13', 'A106',NULL)
INSERT CT_KHACH_THUE VALUES ('K14', 'A107',NULL)
INSERT CT_KHACH_THUE VALUES ('K15', 'A107',NULL)
INSERT CT_KHACH_THUE VALUES ('K16', 'A107',NULL)
INSERT CT_KHACH_THUE VALUES ('K17', 'A108',NULL)
INSERT CT_KHACH_THUE VALUES ('K18', 'A108',NULL)
INSERT CT_KHACH_THUE VALUES ('K19', 'A108',NULL)
INSERT CT_KHACH_THUE VALUES ('K20', 'A109',NULL)
INSERT CT_KHACH_THUE VALUES ('K21', 'A109',NULL)
INSERT CT_KHACH_THUE VALUES ('K22', 'A109',NULL)
INSERT CT_KHACH_THUE VALUES ('K23', 'A110',NULL)
INSERT CT_KHACH_THUE VALUES ('K24', 'A110',NULL)
INSERT CT_KHACH_THUE VALUES ('K25', 'A110',NULL)
INSERT CT_KHACH_THUE VALUES ('K26', 'A110',NULL)
INSERT CT_KHACH_THUE VALUES ('K27', 'B101',NULL)
INSERT CT_KHACH_THUE VALUES ('K28', 'B101',NULL)
INSERT CT_KHACH_THUE VALUES ('K29', 'B102',NULL)

GO
--BAO_TRI_THIET_BI

INSERT BAO_TRI_THIET_BI VALUES ('DL','A101',N'Đèn lớn',N'Hỏng')
INSERT BAO_TRI_THIET_BI VALUES ('DNT','A109',N'Đèn nhà vệ sinh',N'Mất điện')
INSERT BAO_TRI_THIET_BI VALUES ('OD','A110',N'Ổ điện',N'Hỏng')
INSERT BAO_TRI_THIET_BI VALUES ('DH','B105',N'Điều hòa',N'Hỏng')
INSERT BAO_TRI_THIET_BI VALUES ('VN','B105',N'Vòi nước',N'Hư')


GO

--HOP_DONG
set dateformat dmy


INSERT HOP_DONG VALUES ('01/01/2012','A101')
INSERT HOP_DONG VALUES ('09/01/2012','A102')
INSERT HOP_DONG VALUES ('15/01/2012','A103')
INSERT HOP_DONG VALUES ('16/01/2012','A104')
INSERT HOP_DONG VALUES ('20/01/2012','A105')
INSERT HOP_DONG VALUES ('03/02/2012','A106')
INSERT HOP_DONG VALUES ('05/02/2012','A107')
INSERT HOP_DONG VALUES ('09/02/2012','A108')
INSERT HOP_DONG VALUES ('18/02/2012','A109')
INSERT HOP_DONG VALUES ('21/02/2012','A110')
INSERT HOP_DONG VALUES ('25/02/2012','B101')
INSERT HOP_DONG VALUES ('28/02/2012','B102')
GO

--LOAI_DICH_VU
INSERT LOAI_DICH_VU VALUES ('DV01', N'Giải trí')
INSERT LOAI_DICH_VU VALUES ('DV02', N'Ăn uống')
INSERT LOAI_DICH_VU VALUES ('DV03', N'Điện/Nước')

GO
--DICH_VU
INSERT DICH_VU VALUES ('CAPTV'	,N'Cáp TV',		30000, 'DV01',N'Đồng/Tháng')
INSERT DICH_VU VALUES ('NET'	,N'Internet',	60000, 'DV01',N'Đồng/Tháng')
INSERT DICH_VU VALUES ('COM'	,N'Cơm',		50000,	'DV02',N'Đồng/Tháng')
INSERT DICH_VU VALUES ('NUOC'	,N'Nước (uống)',		50000,	'DV02',N'Đồng/Tháng')
INSERT DICH_VU VALUES ('ELECT'	,N'Điện',		1000,	'DV03',N'Đồng/kí')
INSERT DICH_VU VALUES ('WATER'	,N'Nước (máy)',		1000,	'DV03',N'Đồng/khối')

GO

--Hóa đơn
set dateformat dmy
insert into HOA_DON values('1/4/2013','A101')
insert into HOA_DON values('1/4/2013','A102')
insert into HOA_DON values('1/4/2013','A103')
insert into HOA_DON values('1/4/2013','A104')
insert into HOA_DON values('1/4/2013','A105')
insert into HOA_DON values('1/4/2013','A106')
insert into HOA_DON values('1/4/2013','A107')
insert into HOA_DON values('1/4/2013','A108')
insert into HOA_DON values('1/4/2013','A109')
insert into HOA_DON values('1/4/2013','A110')
insert into HOA_DON values('1/4/2013','B101')
--insert into HOA_DON values('1/4/2013','B102')
go
--CT_DICHVU
set dateformat dmy
INSERT CT_DICHVU VALUES (1, 'CAPTV', 1)
INSERT CT_DICHVU VALUES (1, 'ELECT', 50)
INSERT CT_DICHVU VALUES (1, 'WATER', 5)
INSERT CT_DICHVU VALUES (2, 'CAPTV', 1)
INSERT CT_DICHVU VALUES (2, 'ELECT', 51)
INSERT CT_DICHVU VALUES (2, 'WATER', 6)
INSERT CT_DICHVU VALUES (2, 'COM',	1)
INSERT CT_DICHVU VALUES (3, 'ELECT', 52)
INSERT CT_DICHVU VALUES (3, 'WATER', 6)
INSERT CT_DICHVU VALUES (4, 'CAPTV', 1)
INSERT CT_DICHVU VALUES (4, 'ELECT', 53)
INSERT CT_DICHVU VALUES (4, 'WATER', 7)
INSERT CT_DICHVU VALUES (5, 'CAPTV', 1)
INSERT CT_DICHVU VALUES (5, 'ELECT', 54)
INSERT CT_DICHVU VALUES (5, 'WATER', 8)
INSERT CT_DICHVU VALUES (5, 'COM', 1)
INSERT CT_DICHVU VALUES (5, 'NUOC', 1)
INSERT CT_DICHVU VALUES (5, 'NET', 1)
INSERT CT_DICHVU VALUES (6, 'CAPTV', 1)
INSERT CT_DICHVU VALUES (6, 'ELECT', 55)
INSERT CT_DICHVU VALUES (6, 'NET', 1)
INSERT CT_DICHVU VALUES (7, 'COM', 1)
INSERT CT_DICHVU VALUES (8, 'ELECT', 56)
INSERT CT_DICHVU VALUES (8, 'WATER', 9)
INSERT CT_DICHVU VALUES (9, 'NET', 1)
INSERT CT_DICHVU VALUES (9, 'ELECT', 57)
INSERT CT_DICHVU VALUES (9, 'WATER', 11)
INSERT CT_DICHVU VALUES (10, 'ELECT', 58)
INSERT CT_DICHVU VALUES (10, 'WATER', 12)
INSERT CT_DICHVU VALUES (11, 'ELECT', 59)
INSERT CT_DICHVU VALUES (11, 'WATER', 11)
--INSERT CT_DICHVU VALUES (12, 'WATER', 6)
--INSERT CT_DICHVU VALUES (12, 'ELECT', 60)

go
---------------------------------------------------------------------------Procedure-------------------------------
--Thêm khách thuê
create proc ThemKhachThue
(
@makhach varchar(5),
@tenkhach nvarchar(30),
@phai nvarchar(5),
@cmnd varchar(15),
@quequan nvarchar(30),
@nghenghiep nvarchar(30),
@Taikhoan varchar(25)
)
as
	begin
	if(@Taikhoan IS NULL)--Nếu như khách không có tài khoản
		insert into KHACH_THUE values(@makhach,@tenkhach,@phai,@cmnd,@quequan,@nghenghiep)

	else
		if(@Taikhoan IS NOT NULL)--Nếu như khách có tài khoản
		begin
			insert into KHACH_THUE values(@makhach,@tenkhach,@phai,@cmnd,@quequan,@nghenghiep)
			insert into USER_KHACHTHUE (Username,Pwd,IsAdmin,MaKhach)values(@Taikhoan,@Taikhoan,0, @makhach)
			update USER_KHACHTHUE set Makhach = @makhach where makhach = @makhach
			update USER_KHACHTHUE set Tinhtrang = 0 where makhach = @makhach 
		end
	end
go

--Xóa khách thuê
create proc XoaKhach
(
@makhach varchar(5),
@taikhoan varchar(25)
)
as
	begin
	--nếu như khách không có tài khoản và chưa thuê phòng
	if(@taikhoan IS NULL AND NOT EXISTS(select @makhach from CT_KHACH_THUE where @makhach = MaKhach))
			begin
				delete from KHACH_THUE where MaKhach = @makhach
			end
		else
	--nếu như khách không có tài khoản và đã thuê phòng
	if(@taikhoan IS NULL AND EXISTS(select @makhach from CT_KHACH_THUE where @makhach = MaKhach))
			begin
				delete from CT_KHACH_THUE where MaKhach = @makhach
				delete from KHACH_THUE where MaKhach = @makhach
			end
	--nếu khách có tài khoản và chưa thuê phòng
	if(@taikhoan IS NOT NULL AND NOT EXISTS(select @makhach from CT_KHACH_THUE where @makhach = MaKhach))
		begin
			delete from USER_KHACHTHUE where MaKhach = @makhach
			delete from KHACH_THUE where MaKhach = @makhach
		end
	--nếu khách có tài khoản và đã thuê phòng
	if(@taikhoan IS NOT NULL AND EXISTS(select @makhach from CT_KHACH_THUE where @makhach = MaKhach))
		begin
			delete from CT_KHACH_THUE where MaKhach = @makhach
			delete from USER_KHACHTHUE where MaKhach = @makhach
			delete from KHACH_THUE where MaKhach = @makhach
		end
	end
go

--Sửa khách thuê
create proc SuaKhachThue
(
	@makhach varchar(5),
	@tenkhach nvarchar(30),
	@phai nvarchar(5),
	@cmnd varchar(15),
	@quequan nvarchar(30),
	@nghenghiep nvarchar(30)
)
as
	begin
		update KHACH_THUE
		set TenKhach = @tenkhach,
			Phai = @phai,
			CMND = @cmnd,
			QueQuan = @quequan,
			NgheNghiep = @nghenghiep
		where MaKhach = @makhach
	end
go
---Bảng giá phòng trọ
--Thêm phòng

create proc ThemPhong
(
	@songuoi int,
	@giatien money
)
as
	begin
		insert into GIA_THUE values(@songuoi,@giatien)
	end
go
--Sửa giá tiền

create proc SuaPhong
(
	@songuoi int,
	@giatien money
)
as
	begin
		update GIA_THUE
		set GiaTien = @giatien
		where SoNguoi =@songuoi
	end
go

--Thêm khách thuê vào ở ghép
set dateformat dmy
go

--Khi khách thuê vào ở ghép thì ta phải cập nhật lại số người bên PHONG_TRO
create proc ThemKhachThueVaooGhep
(
	@MaKhach varchar(5),
	@MaPhong varchar(5),
	@NgayVaoPhong datetime
)
as
	begin
		insert into CT_KHACH_THUE values(@MaKhach,@MaPhong,convert(varchar(10),@NgayVaoPhong,103))
		update PHONG_TRO set SoNguoi+=1 where MaPhong = @MaPhong
	end
	go
go
--Thêm khách thuê vào phòng mới
--Khi khách thuê vào ở mới thì ta phải cập nhật lại số người bên PHONG_TRO
create proc ThemKhachThueVaoPhongMoi
(
	@MaKhach varchar(5),
	@MaPhong varchar(5),
	@NgayVaoPhong datetime
)
as
	begin
		insert into HOP_DONG values(convert(varchar(10),@NgayVaoPhong,103),@MaPhong)
		insert into CT_KHACH_THUE values(@MaKhach,@MaPhong,convert(varchar(10),@NgayVaoPhong,103))
		update PHONG_TRO set SoNguoi=1 where MaPhong = @MaPhong
	end
go
--Thêm mới hóa đơn và chi tiết hóa đơn
--Thêm mới hóa đơn
create proc ThemHoaDon
(
	@maphong varchar(5),
	@ngaylap datetime
)
as
	begin
		insert into HOA_DON values(convert(varchar(10),@ngaylap,103), @maphong)
	end
	
go
--Thêm mới chi tiết hóa đơn
create proc ThemChiTietDichVu
(
	@madichvu varchar(5),
	@donvisudung int
)
as
	begin
		declare @mahoadon int
			set @mahoadon= (select top(1) mahoadon from HOA_DON order by MaHoaDon desc)
		insert into CT_DICHVU values ( @mahoadon,@madichvu, @donvisudung)
	end
go
--Xóa hóa đơn và chi tiết hóa đơn
create proc XoaHoaDon
(
	@mahoadon int
)
as
	begin
		delete from CT_DICHVU where @mahoadon = MaHoaDon
		delete from HOA_DON where @mahoadon = MaHoaDon
	end
go
------- thong tin dich vu
--thêm dịch vụ
create proc ThemDichVu
(
	@madichvu varchar(5),
	@tendichvu nvarchar(30),
	@giatien money,
	@maloaidichvu varchar(5),
	@quycach nvarchar(30)
)
as
	begin
		insert into DICH_VU values(@madichvu,@tendichvu,@giatien,@maloaidichvu,@quycach)
	end
go
--Sửa dịch vụ

create proc SuaDichVu
(
	@madichvu varchar(5),
	@tendichvu nvarchar(30),
	@giatien money,
	@maloaidichvu varchar(5),
	@quycach nvarchar(30)
)
as
	begin
		update DICH_VU
		set DichVu = @tendichvu,
			GiaDichVu = @giatien,
			MaLoaiDichVu = @maloaidichvu,
			QuyCach = @quycach
		where MaDichVu = @madichvu
	end
go
---- xóa dv

create proc XoaDichVu
(
	@MaDichVu varchar(5)
)
as
	begin
		delete from DICH_VU where MaDichVu  = @MaDichVu
	end
go
--Đổi mật khẩu ADMIN
create proc DoiMatKhauADMIN
(
	@taikhoan varchar(25),
	@matkhaumoi varchar(25)
)
as
	begin
		update USER_KHACHTHUE 
			set pwd = @matkhaumoi
			where Username = @taikhoan
	end
--bonus


--create proc ThemKhachDatPhong
--(
	
--)
--as
--	begin
--		insert into KHACH_THUE values()
--	end