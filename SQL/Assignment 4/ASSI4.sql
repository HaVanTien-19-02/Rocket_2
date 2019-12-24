DROP DATABASE IF EXISTS ASSI4;
CREATE DATABASE IF NOT EXISTS ASSI4;

USE ASSI4;

-- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu
-- Bảng phòng ban
DROP TABLE IF EXISTS DEPARTMENT;
CREATE TABLE IF NOT EXISTS DEPARTMENT
(   
    LEADER_ID                         TINYINT NOT NULL,
    DEPARTMENT_NUMBER                 TINYINT NOT NULL,   
	DEPARTMENT_NAME                   VARCHAR(50) NOT NULL,
    PRIMARY KEY                       (LEADER_ID)
);
-- Bảng nhân viên
DROP TABLE IF EXISTS EMPLOYEE_TABLE;
CREATE TABLE IF NOT EXISTS EMPLOYEE_TABLE
(
    EMPLOYEE_NUMBER                   TINYINT NOT NULL UNIQUE,
    EMPLOYEE_NAME                     VARCHAR(50) NOT NULL,
    DEPARTMENT_NUMBER                 TINYINT NOT NULL,
    PRIMARY KEY                      (EMPLOYEE_NUMBER)
);
-- Bảng kỹ năng nhân viên
DROP TABLE IF EXISTS EMPLOYEE_SKILL_TABLE;
CREATE TABLE IF NOT EXISTS EMPLOYEE_SKILL_TABLE
(
    EMPLOYEE_NUMBER                   TINYINT NOT NULL,
    SKILL_CODE                        CHAR(20),
    DATE_REGISTERED                   DATE NOT NULL,
    FOREIGN KEY                       (EMPLOYEE_NUMBER) REFERENCES EMPLOYEE_TABLE(EMPLOYEE_NUMBER)
);

-- Question 2: Thêm ít nhất 10 bản ghi vào mỗi bảng			
INSERT INTO DEPARTMENT            (LEADER_ID, DEPARTMENT_NUMBER, DEPARTMENT_NAME)
VALUES                            (   1,             1,               'A'       ),
								  (   2,             2,               'B'       ),
								  (   3,             3,               'C'       ),
								  (   4,             4,               'D'       ),
								  (   5,             5,               'E'       ),
                                  (   6,             6,               'F'       ),
                                  (   7,             7,               'G'       ),
                                  (   8,             8,               'H'       ),
								  (   9,             9,               'J'       ),
                                  (  10,            10,               'K'       );
                          
INSERT INTO EMPLOYEE_TABLE   (EMPLOYEE_NUMBER, EMPLOYEE_NAME,       DEPARTMENT_NUMBER)
VALUES                       (        1,       'HA VAN TIEN',           1        ),
                             (        2,       'NGUYEN VAN TUNG',       2        ),
                             (        3,       'HA VAN TUNG',           3        ),
                             (        4,       'NGUYEN THI THANH',      1        ),
                             (        5,       'BUI THI HOA',           2        ),
                             (        6,       'NGUYEN TRUNG HIEU',     3        ),
                             (        7,       'LE TIEN THAI',          1        ),
                             (        8,       'TRAN THI ANH',          2        ),
                             (        9,       'BUI VAN THU',           4        ),
                             (       10,       'TRAN CUNG HOAN',        4        ); 

INSERT INTO EMPLOYEE_SKILL_TABLE   (EMPLOYEE_NUMBER,     SKILL_CODE,         DATE_REGISTERED       )
VALUES                       (		  1,                     'JAVA',           '1990-1-1'          ),
                             (		  2,                   'PYTHON',           '1991-3-2'          ),
                             (		  3,                       'C#',           '1992-4-3'          ),
                             (		  4,                     'TEST',           '1992-5-6'          ),
                             (		  5,                 'HTML,CSS',           '1991-5-4'          ),
                             (		  6,                     'JAVA',           '1993-7-6'          ),
                             (		  1,                      'PHP',           '1990-1-1'          ),
                             (		  8,                     'TEST',           '1990-9-8'          ),
                             (		  9,                     'JAVA',           '1993-10-9'         ),
                             (		 10,                     'TEST',           '1994-11-10'        ); 
                             
-- Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java.
SELECT 
    E.EMPLOYEE_NUMBER, E.EMPLOYEE_NAME, D.SKILL_CODE
FROM
    EMPLOYEE_TABLE E
        JOIN
    EMPLOYEE_SKILL_TABLE D ON E.EMPLOYEE_NUMBER = D.EMPLOYEE_NUMBER
WHERE
    SKILL_CODE = 'JAVA';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên

SELECT        C.DEPARTMENT_NUMBER, 
              GROUP_CONCAT(E.EMPLOYEE_NAME SEPARATOR ',')      AS LIST_EMPLOY,
              COUNT(E.EMPLOYEE_NAME)                           
FROM          DEPARTMENT C
JOIN          EMPLOYEE_TABLE E ON C.DEPARTMENT_NUMBER=E.DEPARTMENT_NUMBER 
GROUP BY      C.DEPARTMENT_NUMBER
HAVING        COUNT(E.EMPLOYEE_NAME) >= 3;

-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.

SELECT        C.DEPARTMENT_NUMBER, C.DEPARTMENT_NAME,
              GROUP_CONCAT(E.EMPLOYEE_NAME SEPARATOR ',')      AS LIST_EMPLOY,
              COUNT(E.EMPLOYEE_NAME)
FROM          DEPARTMENT C
JOIN          EMPLOYEE_TABLE E ON C.DEPARTMENT_NUMBER=E.DEPARTMENT_NUMBER 
GROUP BY      C.DEPARTMENT_NUMBER
ORDER BY      C.DEPARTMENT_NUMBER ASC;

-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
SELECT        E.EMPLOYEE_NUMBER, E.EMPLOYEE_NAME, D.SKILL_CODE,
              COUNT(D.SKILL_CODE)    AS SKILL_CODE_NUMBER
FROM          EMPLOYEE_TABLE E
JOIN          EMPLOYEE_SKILL_TABLE D ON E.EMPLOYEE_NUMBER = D.EMPLOYEE_NUMBER
GROUP BY      E.EMPLOYEE_NUMBER
HAVING        COUNT(D.SKILL_CODE) > 1;


