CREATE TABLE faculty (
                         id INT PRIMARY KEY,
                         name VARCHAR(30) NOT NULL
);
CREATE TABLE subject (
                         id INT PRIMARY KEY,
                         name VARCHAR(100) NOT NULL,
                         lesson_quantity INT NOT NULL -- tổng số tiết học
);
CREATE TABLE student (
                         id INT PRIMARY KEY,
                         name VARCHAR(30) NOT NULL,
                         gender VARCHAR(10) NOT NULL, -- giới tính
                         birthday DATE NOT NULL,
                         hometown VARCHAR(100) NOT NULL, -- quê quán
                         scholarship DECIMAL(10, 2), -- học bổng
                         faculty_id INT NOT NULL, -- mã khoa
                         FOREIGN KEY (faculty_id) REFERENCES faculty(id) -- khóa ngoại liên kết với bảng faculty
);
CREATE TABLE exam_management (
                                 id INT PRIMARY KEY,
                                 student_id INT NOT NULL,
                                 subject_id INT NOT NULL,
                                 number_of_exam_taking INT NOT NULL, -- số lần thi (thi trên 1 lần được gọi là thi lại)
                                 mark DECIMAL(4, 2) NOT NULL, -- điểm
                                 FOREIGN KEY (student_id) REFERENCES student(id),
                                 FOREIGN KEY (subject_id) REFERENCES subject(id)
);
