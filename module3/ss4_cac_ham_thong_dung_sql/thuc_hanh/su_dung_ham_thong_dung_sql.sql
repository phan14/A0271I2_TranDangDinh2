use quanlysinhvien;
select * from student;
 
 -- Sử dụng hàm count để hiển thị số lượng sinh viên ở từng nơi
SELECT Address, COUNT(studentid) AS 'Số lượng học viên'
FROM Student
GROUP BY Address;
 
 -- Tính điểm trung bình các môn học của mỗi học viên bằng cách sử dụng hàm AVG
SELECT S.Studentid,S.Studentname, AVG(Mark_hihi)
FROM Student S join Mark M on S.Studentid = M.Studentid
GROUP BY S.Studentid, S.Studentname;

-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
 SELECT S.StudentId,S.StudentName, AVG(Mark_hihi)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.Studentname
HAVING AVG(Mark_hihi) > 15;
 
 -- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
  
 SELECT S.StudentId, S.StudentName, AVG(Mark_hihi)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
HAVING AVG(Mark_hihi) >= ALL (SELECT AVG(Mark_hihi) FROM Mark GROUP BY Mark.StudentId);

