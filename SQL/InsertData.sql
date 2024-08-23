INSERT INTO subject (id, name, lesson_quantity) VALUES
                                                    (1, 'Cơ sở dữ liệu', 45),
                                                    (2, 'Trí tuệ nhân tạo', 45),
                                                    (3, 'Truyền tin', 45),
                                                    (4, 'Đồ họa', 60),
                                                    (5, 'Văn phạm', 45);
INSERT INTO faculty (id, name) VALUES
                                   (1, 'Anh - Văn'),
                                   (2, 'Tin học'),
                                   (3, 'Triết học'),
                                   (4, 'Vật lý');
INSERT INTO student (id, name, gender, birthday, hometown, scholarship, faculty_id) VALUES
                                                                                        (1, 'Nguyễn Thị Hải', 'Nữ', '1990-02-23', 'Hà Nội', 130000, 2),
                                                                                        (2, 'Trần Văn Chính', 'Nam', '1992-12-24', 'Bình Định', 150000, 4),
                                                                                        (3, 'Lê Thu Yến', 'Nữ', '1990-02-21', 'TP HCM', 150000, 2),
                                                                                        (4, 'Lê Hải Yến', 'Nữ', '1990-02-21', 'TP HCM', 170000, 2),
                                                                                        (5, 'Trần Anh Tuấn', 'Nam', '1990-12-20', 'Hà Nội', 180000, 1),
                                                                                        (6, 'Trần Thanh Mai', 'Nữ', '1991-08-12', 'Hải Phòng', NULL, 3),
                                                                                        (7, 'Trần Thị Thu Thủy', 'Nữ', '1991-01-02', 'Hải Phòng', 10000, 1);
INSERT INTO exam_management (id, student_id, subject_id, number_of_exam_taking, mark) VALUES
                                                                                          (1, 1, 1, 1, 3.00),
                                                                                          (2, 1, 2, 2, 6.00),
                                                                                          (3, 1, 3, 1, 5.00),
                                                                                          (4, 2, 1, 1, 4.50),
                                                                                          (5, 2, 3, 1, 10.00),
                                                                                          (6, 2, 5, 1, 9.00),
                                                                                          (7, 3, 1, 2, 5.00),
                                                                                          (8, 3, 3, 1, 2.50),
                                                                                          (9, 4, 5, 2, 10.00),
                                                                                          (10, 5, 1, 1, 7.00),
                                                                                          (11, 5, 3, 1, 2.50),
                                                                                          (12, 6, 2, 1, 6.00),
                                                                                          (13, 6, 4, 1, 10.00);
