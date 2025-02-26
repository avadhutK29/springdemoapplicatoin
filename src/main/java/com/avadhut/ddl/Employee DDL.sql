CREATE SEQUENCE IF NOT EXISTS emp_id_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE employee
(
    id              BIGINT NOT NULL,
    first_name      VARCHAR(255),
    last_name       VARCHAR(255),
    email           VARCHAR(255),
    phone           VARCHAR(255),
    address         VARCHAR(255),
    department      VARCHAR(255),
    title           VARCHAR(255),
    job_title       VARCHAR(255),
    job_description VARCHAR(255),
    salary          VARCHAR(255),
    project_name    VARCHAR(255),
    CONSTRAINT pk_employee PRIMARY KEY (id)
);