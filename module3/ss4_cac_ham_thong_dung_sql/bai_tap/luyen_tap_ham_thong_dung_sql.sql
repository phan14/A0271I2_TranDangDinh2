use quan_li_sinh_vien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select*, max(credit) from `Subject`
where credit = (select max(credit)from `subject`);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.

select `subject`.SubId , `subject`.SubName,max(Mark.mark)
from `subject` inner join mark on `Subject`.SubId = Mark.SubId;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần

select Student.StudentId,Student.StudentName,AVG(Mark.mark) as `avg`
from Student 
inner join Mark on Student.StudentId = Mark.StudentId
group by Student.StudentId
order by `avg` DESC