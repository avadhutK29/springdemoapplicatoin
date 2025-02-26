CREATE SEQUENCE IF NOT EXISTS student_roll_num_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE student
(
    roll_number      BIGINT NOT NULL,
    name             VARCHAR(255),
    class_name       VARCHAR(255),
    grade            VARCHAR(255),
    favorite_subject VARCHAR(255),
    address          VARCHAR(255),
    CONSTRAINT pk_student PRIMARY KEY (roll_number)
);