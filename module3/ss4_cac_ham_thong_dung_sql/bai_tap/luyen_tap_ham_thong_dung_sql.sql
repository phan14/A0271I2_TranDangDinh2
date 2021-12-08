use quanlysinhvien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * from subject;


select*, max(credit) from `Subject`
where credit = (select max(credit)from `subject`);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.


select sub.subid,sub.subname,sub.status ,max(Mark_hihi) as total_diem
 from `subject` sub join mark m 
 on sub.subid= m.subid;
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select * from subject;
select * from student;
select * from mark;

select st.studentid,st.studentname,st.address,sub.subname ,avg(Mark_hihi) as diem_TB 
from student  st  join mark m 
on st.studentid = m.studentid 
 join subject sub 
on sub.subid=m.subid
group by st.studentid,st.studentname,st.address,sub.subname
order by avg(Mark_hihi) desc
