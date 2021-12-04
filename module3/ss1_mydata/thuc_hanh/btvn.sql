DROP DATABASE IF EXISTS  demo_a07;
create database demo_a07;
use demo_a07;
create table tai_khoan (
username varchar(15) primary key,
`password` varchar(100) not null -- là bắt buộc nhập thông tin khi thêm mới hoặc sửa 
);

create table lop_hoc(
ma_lop_hoc int primary key auto_increment,
ten_lop_hoc varchar(100)
);

create table giang_vien(
ma_giang_vien int primary key auto_increment,
ten_giang_vien varchar(100),
ngay_sinh date
);

create table hoc_vien (
-- auto_increment : tự động tăng, áp dụng cho số
ma_hoc_vien int primary key auto_increment unique,
ten_hoc_vien varchar(100),
ngay_sinh date,
email varchar(100),
-- unique : không trùng lặp
username varchar(15) unique,
ma_lop_hoc int,
foreign key(ma_lop_hoc) references lop_hoc(ma_lop_hoc),
foreign key(username) references tai_khoan(username)
);

create table dia_chi(
ma_dia_chi int primary key auto_increment,
`dia_chi` varchar (255),
ma_hoc_vien int,
foreign key(ma_hoc_vien) references hoc_vien(ma_hoc_vien)
);

create table giang_vien_day_lop_hoc(
ma_giang_vien int,
ma_lop_hoc int,
primary key(ma_giang_vien,ma_lop_hoc), -- khóa phức hợp
foreign key(ma_giang_vien) references giang_vien(ma_giang_vien),
foreign key(ma_lop_hoc) references  lop_hoc(ma_lop_hoc)
);


insert into tai_khoan(username, `password`)
values('Tran Van A', '1234'),
	('Tran Tan B', '204245'),
      ('Nguyen Thi A', 'acbdv'),
      ('Ha', 'ha123'),
      ('NguyenC', '516565'),
      ('Trung', 'trung123'),
      ('Dung', 'dung113@');
      
insert into lop_hoc(ten_lop_hoc)
values ('A0421I2'),
	('A0721I3'),
       ('A0721I2'),
       ('C0321I1'),
       ('C0721I2'),
       ('A0421I2'),
       ('C0421I1');
  
insert into giang_vien(ten_giang_vien, ngay_sinh)
values ('Truong Tan Hai', '1996-10-01'),
	   ('Tran Duc Linh ', '1978-01-20'),
       ('Tran Van A', '200-04-01'),
       ('Nguyen Thi Linh', '1987-01-01'),
       ('Tran Van Chanh', '1968-05-01'),
       ('Hoang An', '1997-08-04'),
       ('Duong Van Chau', '1998-01-01');
select * from giang_vien;
insert into hoc_vien(ten_hoc_vien, ngay_sinh, email, username, ma_lop_hoc )
values ('Trung', '2000-04-01', 'Trungteo00@gmail.com', 'Trung00', 2),
	('Hau', '1999-01-21', 'Hau123@gmail.com','HNV94', 1 ),
       ('Dung', '1999-11-20', 'Dung12@gmail.com', 'Dungk1', 4),
       ('Hoang', '2000-12-01', 'Haoaang@gmail.com', 'Hoang04', 5),
       ('Le', '2001-03-01', 'Dungle@gmail.com', 'Le2k', 5),
       ('Nguyen', '1991-05-13', 'lenguyen3@gmail.com', 'TNguyen4', 9),
       ('Ha', '2000-10-01', 'ha2k@gmail.com', 'Ha123', 7);

insert into dia_chi (`dia_chi`, ma_hoc_vien)
values ('Quang Nam', 1),
	('Ha Noi', 4),
       ('Quang Tri', 2),
       ('Ha Binh', 3),
       ('Da Nang', 7),
       ('Quang Ngai', 6),
       ('Hue', 5);

insert into giang_vien_day_lop_hoc(ma_giang_vien, ma_lop_hoc)
values (1, 3),
	(2, 4),
       (3, 5),
       (4, 6),
       (5, 7),
       (6, 2), 
       (7, 1);
       
