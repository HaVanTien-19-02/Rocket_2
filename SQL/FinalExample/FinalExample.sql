DROP DATABASE IF EXISTS QUANLYDIEM;
CREATE DATABASE IF NOT EXISTS QUANLYDIEM;
USE QUANLYDIEM;

-- 1 Tạo table với các ràng buộc và kiểu dữ liệu ,Thêm ít nhất 3 bản ghi vào table
DROP TABLE IF EXISTS Student; 
CREATE TABLE IF NOT EXISTS Student
(
RN      TINYINT PRIMARY KEY NOT NULL,
Name    NVARCHAR(50) NOT NULL,
Age     CHAR(3)      NOT NULL,
Gender  ENUM ('0','1', 'Unknow')      
);

DROP TABLE IF EXISTS Subject; 
CREATE TABLE IF NOT EXISTS Subject
(
sID     TINYINT PRIMARY KEY NOT NULL,
sName   NVARCHAR(50)   NOT NULL
);

DROP TABLE IF EXISTS StudentSubject; 
CREATE TABLE IF NOT EXISTS StudentSubject
(
RN       TINYINT NOT NULL, 
sID      TINYINT NOT NULL,
Mark     CHAR(5) ,
SSDate   DATE NOT NULL,
FOREIGN KEY(RN)  REFERENCES Student(RN),
FOREIGN KEY(sID) REFERENCES Subject(sID)
);

INSERT INTO Student (    RN,     Name,             Age,     Gender)
VALUES              (    1,   'Ha Van Tien',        10,     '1' ),
			   	    (    2,   'Bui Van Tien',       10,     '1' ),
			 	    (    3,   'Nguyen Thi Linh',    10,      '0');

INSERT INTO Subject (     sID,     sName)
VALUES              (      1,     'Toan'),
                    (      2,     'Van' ),
                    (      3,     'Anh' );
                    
INSERT INTO StudentSubject  (RN,  sID,  Mark,     SSDate   )  
VALUES                      ( 1,   1,   10,    '2015/10/2'),                     
                            ( 2,   1,    9,    '2015/10/2'),
                            ( 3,   1,    8,    '2015/10/2'),
                            ( 1,   2,    7,    '2015/10/5'),
                            ( 2,   2,    6,    '2015/10/5'),
                            ( 3,   2,    9,    '2015/10/5'),
                            ( 1,   3,    8,    '2015/10/7'),
                            ( 2,   3,    9,    '2015/10/7'),
                            ( 3,   3,   10,    '2015/10/7');
                            
-- 2 Viết lệnh để
-- a. Lấy tất cả các môn học không có bất kì điểm nào

SELECT 
    sb.sName
FROM
    Subject sb
        JOIN
    StudentSubject ss ON sb.sID = ss.sID
WHERE
    ss.Mark IS NULL;

-- b. Lấy danh sách các môn học có ít nhất 2 điểm            

SELECT 
    sb.sName
FROM
    Subject sb
        JOIN
    StudentSubject ss ON sb.sID = ss.sID
GROUP BY ss.sID    
HAVING COUNT(ss.Mark) >= 2;

-- 3 Tạo "StudentInfo" view có các thông tin về học sinh bao gồm:
-- RN,sID,Name, Age, Gender, sName, Mark, Date. Với cột Gender show
-- Male để thay thế cho 0, Female thay thế cho 1 và Unknow thay thế cho null
DROP VIEW IF EXISTS StudentInfo;

CREATE VIEW StudentInfo AS
    SELECT 
        ss.RN,
        ss.sID,
        st.Age,
        st.Gender, 
        sb.sName,
        ss.Mark,
        ss.SSDate
    FROM
        StudentSubject ss
            JOIN
        Student st ON ss.RN = st.RN
            JOIN
        Subject sb ON ss.sID = sb.sID
;

-- 4 Tạo trigger cho table Subject:
-- a. Trigger CasUpdate: khi thay đổi data của cột sID, thì giá trị của
-- cột sID của table StudentSubject cũng thay đổi theo
DROP TRIGGER IF EXISTS CasUpdate ;
DELIMITER $$
CREATE TRIGGER CasUpdate
AFTER UPDATE ON Subject 
FOR EACH ROW
    BEGIN
      IF (OLD.sID != NEW.sID ) THEN
      INSERT INTO StudentSubject (sID)
      VALUES (NEW.sID);      
    END IF;  
    END$$
DELIMITER ;    

UPDATE Subject 
SET    sID = '9'
WHERE  sName = 'Toan';

SELECT sID
FROM   StudentSubject;

-- b. Trigger casDel: Khi xóa 1 student, các dữ liệu của table StudentSubject cũng sẽ bị xóa theo
DROP TRIGGER IF EXISTS casDel ;

DELIMITER $$
CREATE TRIGGER casDel
AFTER DELETE ON Subject 
FOR EACH ROW
    BEGIN
    DELETE FROM StudentSubject 
    WHERE  RN = OLD.RN;
    END$$
DELIMITER ;    

DELETE FROM Subject
WHERE  RN = '1';

-- 5 Viết 1 thủ tục (có 2 parameters: student name, mark). 
-- Thủ tục sẽ xóa tất cả các thông tin liên quan tới học sinh có cùng tên như parameter 
-- và tất cả các điểm nhỏ hơn của các học sinh đó.
-- Trong trường hợp nhập vào "*" thì thủ tục sẽ xóa tất cả các học sinh

DROP PROCEDURE IF EXISTS XoaHS

DELIMITER $$
CREATE PROCEDURE XoaHS(IN v_Name NVARCHAR(50), IN v_Mark CHAR(5) )
    BEGIN
        IF(v_Name = '*') THEN 
             DELETE FROM Student;
        ELSE 
			 DELETE FROM Student WHERE Name = v_Name;
             DELETE FROM StudentSubject WHERE Mark < v_Mark;
        END IF;    
    END$$
DELIMITER ;

call XoaHS();
SELECT*FROM Student;
SELECT*FROM StudentSubject;
               