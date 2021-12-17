
create database casetudy_furama;
use casetudy_furama;

-- tao bang
-- VI tri
create table vi_tri(
ma_vi_tri int auto_increment primary key,
ten_vi_tri varchar(45)
);

-- trinh do
create table trinh_do (
ma_trinh_do int auto_increment primary key,
ten_trinh_do varchar(45)
);

-- bo phan
create table bo_phan (
ma_bo_phan int auto_increment primary key,
ten_bo_phan varchar(45)
);


-- nhan vien
-- on delete cascade : khi xoá giá trị trong Pk thì giá trị trong fk cũng bị xóa
-- on update cascade : khi update giá trị trong Pk thì giá trị trong fk cũng update tự động
create table nhan_vien(
ma_nhan_vien int not null auto_increment primary key,
ho_ten varchar(45) not null,
ngay_sinh date,
so_cmnd varchar(45),
luong double,
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
ma_vi_tri  int not null,
ma_trinh_do  int not null,
ma_bo_phan  int not null,
foreign key(ma_vi_tri) references vi_tri(ma_vi_tri)
on update cascade on delete cascade,
foreign key(ma_trinh_do) references trinh_do(ma_trinh_do)
on update cascade on delete cascade,
foreign key(ma_bo_phan) references bo_phan(ma_bo_phan)
on update cascade on delete cascade
);

-- loai khách
create table loai_khach(
ma_loai_khach int auto_increment primary key,
ten_loai_khach varchar(45)
);

-- khách hàng
create table khach_hang(
ma_khach_hang int not null auto_increment primary key,
ho_ten varchar(45),
ngay_sinh date,
gioi_tinh bit(1),
so_cmnd varchar(45),
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
ma_loai_khach int not null,
foreign key(ma_loai_khach) references loai_khach(ma_loai_khach)
on update cascade on delete cascade
);

-- kiểu thuê
create table kieu_thue(
ma_kieu_thue int auto_increment primary key,
ten_kieu_thue varchar(45)
);

-- loai dich vu
create table loai_dich_vu(
ma_loai_dich_vu int auto_increment primary key,
ten_loai_dich_vu varchar(45)
);

-- dich vu
create table  dich_vu(
ma_dich_vu int not null auto_increment primary key,
ten_dich_vu varchar (45),
dien_tinh int not null,
chi_phi_thue double not null,
so_nguoi_toi_da int not null,
tieu_chuan_phong varchar(45),
mo_ta_tien_nghi_khac varchar(45),
dien_tich_ho_boi double,
so_tang int,
ma_kieu_thue int not null,
ma_loai_dich_vu int not null,
foreign key (ma_kieu_thue) references kieu_thue(ma_kieu_thue)
on update cascade on delete cascade,
foreign key (ma_loai_dich_vu) references loaI_dich_vu(ma_loai_dich_vu)
on update cascade on delete cascade
);

-- hop dong
create table hop_dong(
ma_hop_dong int auto_increment primary key,
ngay_lam_hop_dong datetime not null,
ngay_ket_thuc datetime not null,
tien_dat_coc double not null,
ma_nhan_vien int not null,
ma_khach_hang int not null,
ma_dich_vu int not null ,
foreign key (ma_nhan_vien) references nhan_vien(ma_nhan_vien)
on update cascade on delete cascade,
foreign key (ma_khach_hang) references khach_hang(ma_khach_hang)
on update cascade on delete cascade,
foreign key (ma_dich_vu) references dich_vu(ma_dich_vu)
on update cascade on delete cascade
);

-- dich vu di kem
create table dich_vu_di_kem(
ma_dich_vu_di_kem int not null auto_increment primary key,
ten_dich_vu_di_kem varchar(45) not null,
gia double not null,
don_vi varchar(45) not null,
trang_thai varchar(45) not null
);

-- hop dong chi tiet 
create table hop_dong_chi_tiet (
ma_hop_dong_chi_tiet int not null auto_increment primary key,
so_luong int not null,
ma_hop_dong int not null,
ma_dich_vu_di_kem int not null,
foreign key (ma_hop_dong) references hop_dong(ma_hop_dong)
on update cascade on delete cascade,
foreign key (ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem)
on update cascade on delete cascade
);

-- sql co ban
-- Thêm mới thông tin 

-- vi tri
insert into vi_tri values
(1,'Quản lý'),(2,'Nhân Viên');

-- trinh do 
insert trinh_do values
(1,'Trung Cấp'),
(2,'Cao Đẳng'),
(3,'Đại Học'),
(4,'Sau Đại Học');

-- bo phan
insert bo_phan values
(1,'Sale-Marketing'),
(2,'Hành chính'),
(3,'Phục vụ'),
(4,'Quản lý');

-- nhân vien
INSERT INTO nhan_vien (`ma_nhan_vien`, `ho_ten`, `ngay_sinh`, `so_cmnd`, `luong`, `so_dien_thoai`, `email`, `dia_chi`, `ma_vi_tri`, `ma_trinh_do`, `ma_bo_phan`) 
values('1','Nguyễn Văn An',	'1970-11-07',	'456231786',	'10000000',	'0901234121	','annguyen@gmail.com',	'295 Nguyễn Tất Thành, Đà Nẵng',	'1','3','1'),
('2','Lê Văn Bình',	'1997-04-09',	'654231234',	'7000000',	'0934212314','binhlv@gmail.com',	'22 Yên Bái, Đà Nẵng',	'1','2','2'),
('3','Hồ Thị Yến',	'1995-12-12',	'999231723',	'14000000',	'0412352315	','thiyen@gmail.com',	'K234/11 Điện Biên Phủ, Gia Lai',	'1','3','2'),
('4','Võ Công Toản',	'1980-04-04',	'123231365',	'17000000',	'0374443232	','toan0404@gmail.com',	'77 Hoàng Diệu, Quảng Trị',	'1','4','4'),
('5','Nguyễn Bỉnh Phát',	'1999-12-09',	'454363232',	'6000000',	'0902341231	','phatphat@gmail.com',	'43 Yên Bái, Đà Nẵng',	'2','1','1'),
('6','Khúc Nguyễn An Nghi',	'2000-11-08',	'964542311',	'7000000',	'0978653213	','annghi20@gmail.com',	'294 Nguyễn Tất Thành, Đà Nẵng',	'2','2','3'),
('7','Nguyễn Hữu Hà',	'1993-01-01',	'534323231',	'8000000',	'0941234553	','nhh0101@gmail.com',	'4 Nguyễn Chí Thanh, Huế',	'2','3','2'),
('8','Nguyễn Hà Đông',	'1989-09-03',	'234414123',	'9000000',	'0642123111	','donghanguyen@gmail.com',	'111 Hùng Vương, Hà Nội',	'2','4','4'),
('9','Tòng Hoang',	'1982-09-03',	'256781231',	'6000000',	'0245144444	','hoangtong@gmail.com',	'213 Hàm Nghi, Đà Nẵng',	'2','4','4'),
('10','Nguyễn Công Đạo',	'1994-01-08',	'755434343',	'8000000',	'0988767111','nguyencongdao12@gmail.com',	'6 Hoà Khánh, Đồng Nai',	'2','3','2');


-- loai khách
insert into loai_khach (ten_loai_khach)
values ('Diamond '),
('Platinium'),
('Gold'),
('Silver'),
('Member');

-- khách hàng
insert into khach_hang(	`ma_khach_hang`,`ho_ten`,`ngay_sinh`,`gioi_tinh`,`so_cmnd`,`so_dien_thoai`,`email`,`dia_chi`,`ma_loai_khach`	)
values
 ('1',  'Nguyễn Thị Hào','1970-11-07',0,'643431213','0945423362','thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng','5'),
('2',	'Phạm Xuân Diệu','1992-08-08',1,'865342123','0954333333','xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị','3'),
('3',	'Trương Đình Nghệ','1990-02-27',1,'488645199','0373213122','nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh','1'),
('4',	'Dương Văn Quan','1981-07-08',1,'543432111','0490039241','duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng','1'),
('5',	'Hoàng Trần Nhi Nhi','1995-12-09',0,'795453345','0312345678','nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai','4'),
('6',	'Tôn Nữ Mộc Châu','2005-12-06',0,'732434215','0988888844	','tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng','4'),
('7',	'Nguyễn Mỹ Kim','1984-04-08',0,'856453123','0912345698','	kimcuong84@gmail.com','K123/45 Lê Lợi, Hồ Chí Minh','1'),
('8',	'Nguyễn Thị Hào','1999-04-08',0,'965656433','0763212345','	haohao99@gmail.com	','55 Nguyễn Văn Linh, Kon Tum','3'),
('9',	'Trần Đại Danh','1994-07-01',1,'432341235','0643343433','	danhhai99@gmail.com','24 Lý Thường Kiệt, Quảng Ngãi','1'),
('10',	'Nguyễn Tâm Đắc','1989-07-01',1,'344343432','0987654321','	dactam@gmail.com','22 Ngô Quyền, Đà Nẵng','	2');

-- kieu thue
insert into kieu_thue(ten_kieu_thue)
values('year'),
('month'),
('day'),
('hour');

-- loai dich vu
insert into loai_dich_vu(ten_loai_dich_vu)
values('Villa'),
('House'),
('Room');

-- dich vu

	
insert into dich_vu (`ma_dich_vu`, `ten_dich_vu`, `dien_tinh`, `chi_phi_thue`, `so_nguoi_toi_da`, `tieu_chuan_phong`, `mo_ta_tien_nghi_khac`, `dien_tich_ho_boi`, `so_tang`, `ma_kieu_thue`, `ma_loai_dich_vu`) 
values ('1', 'Villa Beach Front', '25000', '10000000', '10', 'vip', 'có hồ bơi', '500', '4', '3', '1');
insert into dich_vu  (`ma_dich_vu`, `ten_dich_vu`, `dien_tinh`, `chi_phi_thue`, `so_nguoi_toi_da`, `tieu_chuan_phong`, `mo_ta_tien_nghi_khac`, `so_tang`, `ma_kieu_thue`, `ma_loai_dich_vu`) 
values ('2', 'House Princess 01', '14000', '5000000', '7', 'vip', 'có thêm bếp nướng', '3', '2', '2');
insert into dich_vu  (`ma_dich_vu`, `ten_dich_vu`, `dien_tinh`, `chi_phi_thue`, `so_nguoi_toi_da`, `tieu_chuan_phong`, `mo_ta_tien_nghi_khac`, `ma_kieu_thue`, `ma_loai_dich_vu`) 
values ('3', 'Room Twin 01', '5000', '1000000', '2', 'normal', 'có tivi', '4', '3');
insert into dich_vu  (`ma_dich_vu`, `ten_dich_vu`, `dien_tinh`, `chi_phi_thue`, `so_nguoi_toi_da`, `tieu_chuan_phong`, `mo_ta_tien_nghi_khac`, `dien_tich_ho_boi`, `ma_kieu_thue`, `ma_loai_dich_vu`) 
values ('4', 'Villa No Beach Front', '22000', '9000000', '8', 'normal', 'có hồ bơi', '300', '3', '1');
insert into dich_vu  (`ma_dich_vu`, `ten_dich_vu`, `dien_tinh`, `chi_phi_thue`, `so_nguoi_toi_da`, `tieu_chuan_phong`, `mo_ta_tien_nghi_khac`, `so_tang`, `ma_kieu_thue`, `ma_loai_dich_vu`)
 values ('5', 'House Princess 02', '10000', '4000000', '5', 'normal', 'có thêm bếp nướng', '3', '3', '2');
insert into dich_vu  (`ma_dich_vu`, `ten_dich_vu`, `dien_tinh`, `chi_phi_thue`, `so_nguoi_toi_da`, `tieu_chuan_phong`, `mo_ta_tien_nghi_khac`, `so_tang`, `ma_kieu_thue`, `ma_loai_dich_vu`)
 values ('6', 'Room Twin 02', '3000', '900000', '2', 'normal', 'có tivi', '2', '4', '3');


-- dich vu đi kem
insert into dich_vu_di_kem (ten_dich_vu_di_kem	,gia,	don_vi,	trang_thai	)
values ('Karaoke','	10000','giờ	','	tiện nghi, hiện tại '),
 ('Thuê xe máy','10000','chiếc','hỏng 1 xe '),
 ('Thuê xe đạp	','	20000','chiếc','tốt '),
 ('Buffet buổi sáng','	15000','suất','	đầy đủ đồ ăn, tráng miệng '),
 ('Buffet buổi trưa','	90000','suất','	đầy đủ đồ ăn, tráng miệng '),
 ('Buffet buổi tối	','	16000','suất','	đầy đủ đồ ăn, tráng miệng ');

-- hop đông
insert into hop_dong (`ngay_lam_hop_dong`,`ngay_ket_thuc`,`tien_dat_coc`,`ma_nhan_vien`	,`ma_khach_hang`,`ma_dich_vu`	)
values ('2020-12-08	',	'2020-12-08',	'0',	'3',	'1',	'3 '),
('2020-07-14',		'2020-07-21',	'200000',	'7'	,	'3'	,	'1'),
('2021-03-15',		'2021-03-17',	'50000',	'3',	'4',	'2 '),
('2021-01-14',		'2021-01-18',	'100000',	'7',	'5',	'5 '),
('2021-07-14',		'2021-07-15',		'0',	'7',	'2',	'6 '),
('2021-06-01',		'2021-06-03',	'0',	'7',	'7',	'6'),
('2021-09-02',		'2021-09-05',	'100000',	'7',	'4',	'4 '),
('2021-06-17',		'2021-06-18',	'150000',	'3',	'4',	'1 '),
('2020-11-19',		'2020-11-19',	'0',	'3',	'4',	'3 '),
('2021-04-12',		'2021-04-14',	'0',	'10',	'3',	'5'),
('2021-04-25',		'2021-04-25',	'0',	'2',	'2',	'1'),
('2021-05-25',	'2021-05-27',	'0',	'7',	'10',	'1');

-- hop dong chi tiet 
insert into hop_dong_chi_tiet(so_luong,	ma_hop_dong,	ma_dich_vu_di_kem)
values ('5','2','4'),
('8','2','5'),
('15','2','6'),
('1','3','1'),
('11','3','2'),
('1','1','3'),
('2','1','2'),
('2','12','2');


-- 2. Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là
-- một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.



select*
from nhan_vien
where  char_length(ho_ten)<=15 and  
    ((select substring_index(ho_ten,' ',-1)) regexp '^T|K|H');

-- 3. Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và
-- có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from khach_hang
 where (year(now())-year(ngay_sinh)) between 18 and 50 
 and (khach_hang.dia_chi='da nang' or khach_hang.dia_chi='quang tri');
 


-------- 4. Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu
-- lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của
-- khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là
-- “Diamond”.


select l.ma_khach_hang, l.ho_ten, lk.ten_loai_khach,count(h.ma_hop_dong) as so_lan_dat_phong
from khach_hang l
inner join hop_dong h on l.ma_khach_hang = h.ma_khach_hang
join loai_khach lk on  l.ma_loai_khach = lk.ma_loai_khach
where lk.ten_loai_khach ='diamod'
order by count(H.ma_hop_dong) asc;



-- 5. Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong,
-- ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien (Với
-- tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng *
-- Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem,
-- hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. (những
-- khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select I.ma_khach_hang, I.ho_ten, L.ten_loai_khach, H.ma_hop_dong,
D.ten_dich_vu, H.ngay_lam_hop_dong, H.ngay_ket_thuc, 
sum(D.chi_phi_thue + CT.so_luong * DV.gia) as total
from khach_hang I 
inner join loai_khach L on I.ma_loai_khach = L.ma_loai_khach
inner join hop_dong H  on  I.ma_khach_hang = H.ma_khach_hang
inner join dich_vu  D  on  D.ma_dich_vu = H.ma_dich_vu
inner join hop_dong_chi_tiet CT on CT.ma_hop_dong = H.ma_hop_dong
inner join dich_vu_di_kem  DV on DV.ma_dich_vu_di_kem = CT.ma_dich_vu_di_kem
group by I.ma_khach_hang;


-- 6.Hiển thị ma_dich_vu, ten_dich_vu, dien_tich,
-- chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ chưa 
-- từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).


select d.ma_dich_vu,d.ten_dich_vu,d.dien_tich,d.chi_phi_thue,l.ten_loai_dich_vu,h.ngay_lam_hop_dong
from dich_vu d
inner join loai_dich_vu l on d.ma_loai_dich_vu = l.ma_loai_dich_vu
inner join hop_dong h on d.ma_dich_vu = h.ma_dich_vu
where month(h.ngay_lam_hop_dong)  not in (1 or 2 or 3) ;


-- 7. Hiển thị thông tin ma_dich_vu, ten_dich_vu, 
-- dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ đã từng được khách hàng 
-- đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.

select d.ma_dich_vu, d.ten_dich_vu, d.dien_tich, d.so_nguoi_toi_da, d.chi_phi_thue, dv.ten_loai_dich_vu 
from dich_vu d 
join loai_dich_vu dv on d.ma_loai_dich_vu = dv.ma_loai_dich_vu

join hop_dong hd on  d.ma_dich_vu = hd.ma_dich_vu

where hd.ngay_lam_hop_dong in(
            select ngay_lam_hop_dong from hop_dong
            where year(hd.ngay_lam_hop_dong) =2020)
            
            and hd.ngay_lam_hop_dong not in (
            select ngay_lam_hop_dong from hop_dong
            where year(hd.ngay_lam_hop_dong) =2021);
            
            
-- 8 . Hiển thị thông tin ho_ten khách hàng có trong hệ thống,
--  với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.


select distinct h.ho_ten from khach_hang h;

select h.ho_ten from khach_hang h
union select h.ho_ten from khach_hang h;

select h.ho_ten from khach_hang h 
group by h.ho_ten;


-- 9. Thực hiện thống kê doanh thu theo tháng, 
-- nghĩa là tương ứng với mỗi tháng trong năm 2021 
-- thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select sum(D.chi_phi_thue + CT.so_luong * DV.gia) as doanh_thu 
,month(hd.ngay_lam_hop_dong) as theo_thang
from hop_dong hd
inner join dich_vu  D  on  hd.ma_dich_vu = D.ma_dich_vu
inner join hop_dong_chi_tiet r  on  hd.ma_hop_dong= r.ma_hop_dong
inner join hop_dong_chi_tiet CT on CT.ma_hop_dong = hd.ma_hop_dong
inner join dich_vu_di_kem  DV on DV.ma_dich_vu_di_kem = CT.ma_dich_vu_di_kem
where year(ngay_lam_hop_dong)=2021
group by month(ngay_lam_hop_dong);

-- 10. Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng
--  bao nhiêu dịch vụ đi kèm. Kết quả hiển thị bao gồm 
--  ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem 
--  (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).

select hd.ma_hop_dong, hd.ngay_lam_hop_dong, hd.ngay_ket_thuc, hd.tien_dat_coc, 
sum(ma_dich_vu_di_kem) as so_luong_dich_vu_di_kem
from hop_dong hd 
join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
group by hdct.ma_hop_dong;


--  11 Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng 
-- có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select loai.ten_loai_khach,kh.dia_chi
from  hop_dong h
inner join khach_hang kh on kh.ma_khach_hang = h.ma_khach_hang
inner join  loai_khach loai on loai.ma_loai_khach = kh.ma_khach_hang  
where loai.ten_loai_khach = 'Diamond' and  kh.dia_chi = 'vinh' or 'quang ngai';


select kh.ho_ten,kh.dia_chi,lk.ten_loai_khach,dvdk.ma_dich_vu_di_kem,
 dvdk.ten_dich_vu_di_kem,dvdk.gia,dvdk.don_vi,dvdk.trang_thai
 from dich_vu_di_kem dvdk
 join hop_dong_chi_tiet hdct on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
 join hop_dong hd on hd.ma_hop_dong = hdct.ma_hop_dong
 join khach_hang kh on hd.ma_khach_hang = kh.ma_khach_hang
 join loai_khach lk on kh.ma_loai_khach = lk.ma_loai_khach
 where (
 select  lk.ten_loai_khach from loai_khach lk
 where 
 lk.ten_loai_khach  ='diamond' and (dia_chi = 'vinh' or dia_chi ='quảng ngãi')
 );


-- 12.  Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng),
--  so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem
--  (được tính dựa trên việc sum so_luong ở dich_vu_di_kem),
--  tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt 
--  vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 
--  tháng đầu năm 2021.

-- select ma_hop_dong, ho_ten as 'nhân viên', ho_ten as 'khách hàng', 
-- so_dien_thoai as 'khách hàng', ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc


-- 13




 select hdct.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem,count(hdct.ma_dich_vu_di_kem) as so_luong_dich_vu_di_kem
 from hop_dong_chi_tiet hdct 
 join dich_vu_di_kem dvdk on hdct.ma_dich_vu_di_kem =dvdk.ma_dich_vu_di_kem
 group by hdct.ma_dich_vu_di_kem
 having count(hdct.ma_dich_vu_di_kem) >= all (
    select
        count(hdct.ma_dich_vu_di_kem)
    from
        hop_dong_chi_tiet hdct
    group by hdct.ma_dich_vu_di_kem);



















