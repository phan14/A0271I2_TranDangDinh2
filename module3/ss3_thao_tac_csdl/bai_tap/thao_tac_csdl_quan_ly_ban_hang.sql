drop database if exists manager_ban_hang;
create database manager_ban_hang;
use manager_ban_hang;
create table customer(
	`c_id` int primary key,
	`c_name` varchar(50),
	`c_age` int
);
create table `order`(
	`o_id` int primary key,
	`c_id` int,
	`o_date` date,
	`o_total_price` varchar(50),
	foreign key(`c_id`)references customer(`c_id`)
);
create table product(
	p_id int primary key,
	p_name varchar(50),
	p_price varchar(20)
);
create table `order_detail`(
	o_id int primary key,
	p_id int ,
	od_qty int,
	foreign key (o_id)references `order`(o_id),
	foreign key (p_id)references product(p_id)
);

insert into customer
value (1,'Minh Quan',10),
	(2,'Hoang Bao',20),
	(3,'Bao Hoang',50);
    
insert into `order`
value(1,1,'2006/3/21','null'),   
(2,2,'2006/3/23','null'),  
(3,1,'2006/3/16','null');


insert into product   
value (1,'May Giat',3),
(2,'Tu lanh',5),
(3,'Dieu hoa',7),
(4,'Quat',1),
(5,'Bep',2);

insert into `order_detail`
value(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select o_id,o_date,o_total_price	
from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select *
from `order`
inner join Customer on customer.c_id = `order`.c_id;   


--  Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select *
from Customer
left join `order` on Customer.c_id = `order`.c_id
where `order`.c_id is null ;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của 
-- từng loại mặt hàng xuất hiện trong hóa đơn. 
--  Giá bán của từng loại được tính = odQTY*pPrice)

select `order`.o_id , `order`.o_date ,product.p_price,
sum(product.p_price * `order_detail`.od_qty) as o_total_price
from `order_detail`
inner join `order` on `order`.o_id = `order_detail`.o_id
inner join product on product.p_id = `order_detail`.p_id
group by order_detail.o_id;

