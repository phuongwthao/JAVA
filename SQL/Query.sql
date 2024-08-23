-- A.Basic
-- 1. Liệt kê danh sách sinh viên sắp xếp theo thứ tự:
--      a. id tăng dần
SELECT * from student order by id ASC
--      b. giới tính
SELECT *
FROM student
ORDER BY
    CASE
        WHEN gender = 'Nam' THEN 1
        WHEN gender = 'Nữ' THEN 2
        ELSE 3
        END;
--      c. ngày sinh TĂNG DẦN và học bổng GIẢM DẦN
SELECT * from student order by student.birthday ASC, student.scholarship DESC

-- 2. Môn học có tên bắt đầu bằng chữ 'T'
SELECT * FROM subject WHERE name LIKE 'T%';
-- 3. Sinh viên có chữ cái cuối cùng trong tên là 'i'
SELECT * FROM student WHERE name LIKE '%i';
-- 4. Những khoa có ký tự thứ hai của tên khoa có chứa chữ 'n'
SELECT *
FROM faculty
WHERE SUBSTRING(name, 2, 1) = 'n';
-- 5. Sinh viên trong tên có từ 'Thị'
SELECT *
FROM student
WHERE name LIKE '%Thị%';
-- 6. Sinh viên có ký tự đầu tiên của tên nằm trong khoảng từ 'a' đến 'm', sắp xếp theo họ tên sinh viên
SELECT *
FROM student
WHERE SUBSTRING(name, 1, 1) BETWEEN 'a' AND 'm'
ORDER BY name ASC;
-- 7. Sinh viên có học bổng lớn hơn 100000, sắp xếp theo mã khoa giảm dần
SELECT *
FROM student
WHERE scholarship > 100000
ORDER BY faculty_id DESC;
-- 8. Sinh viên có học bổng từ 150000 trở lên và sinh ở Hà Nội
SELECT *
FROM student
WHERE scholarship >= 150000
  AND hometown = 'Hà Nội';
-- 9. Những sinh viên có ngày sinh từ ngày 01/01/1991 đến ngày 05/06/1992
SELECT *
FROM student
WHERE birthday BETWEEN '1991-01-01' AND '1992-06-05';
-- 10. Những sinh viên có học bổng từ 80000 đến 150000
SELECT * FROM student where scholarship between 80000 AND 150000;
-- 11. Những môn học có số tiết lớn hơn 30 và nhỏ hơn 45
SELECT * FROM subject WHERE lesson_quantity>30 AND lesson_quantity<45

-- B. CALCULATION QUERY
-- 1. Cho biết thông tin về mức học bổng của các sinh viên, gồm: Mã sinh viên, Giới tính, Mã
-- khoa, Mức học bổng. Trong đó, mức học bổng sẽ hiển thị là “Học bổng cao” nếu giá trị
-- của học bổng lớn hơn 500,000 và ngược lại hiển thị là “Mức trung bình”.
SELECT
    id AS student_id,
    gender,
    faculty_id,
    scholarship,
    CASE
        WHEN scholarship > 500000 THEN 'Học bổng cao'
        ELSE 'Mức trung bình'
        END AS scholarship_level
FROM student;
-- 2. Tính tổng số sinh viên của toàn trường
SELECT COUNT(*) AS total_students from student;
-- 3. Tính tổng số sinh viên nam và tổng số sinh viên nữ.
SELECT
    COUNT(CASE WHEN gender = 'Nam' THEN 1 END) AS total_male_students,
    COUNT(CASE WHEN gender = 'Nữ' THEN 1 END) AS total_female_students
FROM student;
-- 4. Tính tổng số sinh viên từng khoa
SELECT
    faculty_id,
    COUNT(*) AS total_students
FROM student
GROUP BY faculty_id;
-- 5. Tính tổng số sinh viên của từng môn học
SELECT
    subject_id,
    COUNT(*) AS total_students
FROM exam_management
GROUP BY exam_management.subject_id;
-- 6. Tính số lượng môn học mà sinh viên đã học
SELECT
    student_id,
    COUNT(DISTINCT subject_id) AS number_of_subjects
FROM exam_management
GROUP BY student_id;
-- 7. Tổng số học bổng của mỗi khoa
SELECT
    faculty_id,
    COUNT(scholarship) AS number_of_scholarship
FROM student
GROUP BY student.faculty_id
-- 8. Cho biết học bổng cao nhất của mỗi khoa
SELECT
    faculty_id,
    MAX(scholarship) AS max_of_scholarship
FROM student
GROUP BY student.faculty_id
-- 9. Cho biết tổng số sinh viên nam và tổng số sinh viên nữ của mỗi khoa
SELECT
    faculty_id,
    COUNT(CASE WHEN gender = 'Nam' THEN 1 END) AS total_male_students,
    COUNT(CASE WHEN gender = 'Nữ' THEN 1 END) AS total_female_students
FROM student
group by  faculty_id
-- 10. Cho biết số lượng sinh viên theo từng độ tuổi
SELECT
    FLOOR(DATEDIFF(CURDATE(), birthday) / 365) AS age,
    COUNT(*) AS number_of_students
FROM student
GROUP BY age
ORDER BY age;
-- 11. Cho biết những nơi nào có ít nhất 2 sinh viên đang theo học tại trường
SELECT
    hometown,
    COUNT(*) AS number_of_students
FROM student
GROUP BY hometown
HAVING COUNT(*) >= 2;
-- 12. Cho biết những sinh viên thi lại ít nhất 2 lần
SELECT
    student_id,
    SUM(number_of_exam_taking) AS sum_of_exam_taking
FROM exam_management
GROUP BY student_id
HAVING sum_of_exam_taking >=2;
-- 13. Cho biết những sinh viên nam có điểm trung bình lần 1 trên 7.0
SELECT
    s.id,
    s.name,
    AVG(CASE WHEN e.number_of_exam_taking = 1 THEN e.mark END) AS average_mark
FROM student s
         JOIN exam_management e ON s.id = e.student_id
WHERE s.gender = 'Nam'
GROUP BY s.id, s.name
HAVING AVG(CASE WHEN e.number_of_exam_taking = 1 THEN e.mark END) > 7.0;
-- 14. Cho biết danh sách các sinh viên rớt ít nhất 2 môn ở lần thi 1 (rớt môn là điểm thi của môn không quá 4 điểm)
SELECT
    student_id,
    COUNT(*) AS number_of_failed_subjects
FROM exam_management
where number_of_exam_taking=1 AND mark<=4
group by student_id
having  number_of_failed_subjects >=2;
-- 15. Cho biết danh sách những khoa có nhiều hơn 2 sinh viên nam
SELECT
    faculty_id,
    COUNT(CASE WHEN gender = 'Nam' THEN 1 END) AS number_of_male
FROM student
GROUP BY faculty_id
HAVING COUNT(CASE WHEN gender = 'Nam' THEN 1 END) > 2;
-- 16. Cho biết những khoa có 2 sinh viên đạt học bổng từ 200000 đến 300000
SELECT
    faculty_id,
    COUNT(CASE WHEN scholarship BETWEEN 20000 AND 30000 THEN 1 END) AS number_of_std
FROM student
GROUP BY faculty_id
HAVING COUNT(CASE WHEN scholarship BETWEEN 20000 AND 30000 THEN 1 END) = 2;
-- 17. Cho biết sinh viên nào có học bổng cao nhất
SELECT *
FROM student
WHERE scholarship = (
    SELECT MAX(scholarship)
    FROM student
);
