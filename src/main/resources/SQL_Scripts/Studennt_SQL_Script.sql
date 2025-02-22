CREATE SEQUENCE student_rollnumber_seq START 101;

CREATE TABLE student (
    roll_number BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    class_name VARCHAR(255) NOT NULL,
    grade INT NOT NULL,
    favorite_subject BIGINT,
    address BIGINT
);



INSERT INTO student (roll_number, name, class_name, grade, favorite_subject, address)
VALUES
    (nextval('student_rollnumber_seq'), 'John Doe', 'Math 101', 90, 1, 1001),
    (nextval('student_rollnumber_seq'), 'Jane Smith', 'Science 102', 85, 2, 1002),
    (nextval('student_rollnumber_seq'), 'Emily Brown', 'History 103', 92, 3, 1003),
    (nextval('student_rollnumber_seq'), 'Michael Johnson', 'Math 101', 88, 1, 1004),
    (nextval('student_rollnumber_seq'), 'Chris Lee', 'English 104', 87, 4, 1005),
    (nextval('student_rollnumber_seq'), 'Sarah Miller', 'Science 102', 91, 2, 1006),
    (nextval('student_rollnumber_seq'), 'David Williams', 'History 103', 79, 3, 1007),
    (nextval('student_rollnumber_seq'), 'Sophia Clark', 'Math 101', 94, 1, 1008),
    (nextval('student_rollnumber_seq'), 'Daniel Lewis', 'English 104', 82, 4, 1009),
    (nextval('student_rollnumber_seq'), 'Olivia Martinez', 'History 103', 95, 3, 1010);
    
    commit;
    
    select * from student;