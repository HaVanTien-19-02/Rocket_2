USE QUANLYFRESHER;
-- Question 1: Thêm ít nhất 10 bản ghi vào table


INSERT INTO TRAINEE 
(FULL_NAME,             BIRTH_DATE,  GENDER, ET_IQ, ET_GMATH, ET_ENGLISH, TRAINING_CLASS, EVALUATION) 
VALUES
('HA VAN TIEN',        '2000-01-01', 'MALE',   15,    10,          30,     'ROCKET2',     'MY CLASS IS GREAT'),
('HA VAN TUNG',        '2001-05-01', 'MALE',   16,    10,          31,     'ROCKET3',     'MY CLASS IS BAD'),  
('NGUYEN THI A',       '2002-01-06', 'FEMALE', 11,    20,          33,     'ROCKET1',     'MY CLASS IS BAD'),
('NGUYEN THI B',       '2003-06-09', 'FEMALE', 15,    15,          35,     'ROCKET4',     'MY CLASS IS GREAT'),
('BUI MINH DUC',       '1999-11-12', 'MALE',   16,    10,          30,     'ROCKET2',     'MY CLASS IS GREAT'),
('NGUYEN QUANG CHIEN', '1998-11-09', 'MALE',   20,    10,          30,     'ROCKET1',     'MY CLASS IS OK'),
('PHAM VAN DUC',       '1997-01-01', 'MALE',   15,    10,          36,     'ROCKET3',     'MY CLASS IS GREAT'),
('TRAN THI LOAN',      '2001-01-01', 'FEMALE', 15,    10,          40,     'ROCKET4',     'MY CLASS IS OK'),
('HA THI XINH',        '2000-10-09', 'FEMALE', 15,    19,          30,     'ROCKET3',     'MY CLASS IS GREAT'),
('HA VAN KIEN',        '1999-07-06', 'MALE',   15,    10,          49,     'ROCKET1',     'MY CLASS IS BABD');


-- Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào, nhóm chúng thành các tháng sinh khác nhau

SELECT       
            MONTH(BIRTH_DATE),    
            COUNT(FULL_NAME)						AS NUMBER_PEOPLE,
			GROUP_CONCAT(Full_name SEPARATOR ', ') 	AS PEOPLE
FROM          
            TRAINEE            
WHERE 
		    ET_IQ >= 15
GROUP BY 
            MONTH(BIRTH_DATE)
HAVING 
            COUNT(FULL_NAME)            
ORDER BY   
            MONTH(BIRTH_DATE) ASC
 ;           

-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau: 
-- tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)

SELECT 
			FULL_NAME,
            (YEAR(NOW()) - YEAR(BIRTH_DATE))           AS TUOI,
            GENDER,
            ET_IQ,
            ET_GMATH,
            ET_ENGLISH,
            TRAINING_CLASS,
            LENGTH(FULL_NAME)                          AS MAX_LENGTH_NAME
FROM     
            TRAINEE
WHERE
            LENGTH(FULL_NAME) = (SELECT
                                         MAX(LENGTH(FULL_NAME))
                                 FROM
                                         TRAINEE)
;

-- Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là: 
-- những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
-- (ET_IQ + ET_Gmath>=20) && (ET_IQ>=8) && (ET_Gmath>=8) && (ET_English>=18)

SELECT 
            TRAINEE_ID,
            FULL_NAME,
            ET_IQ,
            ET_GMATH,
            ET_ENGLISH,
            SUM(ET_IQ + ET_GMATH)        AS SUM_ET
FROM            
			TRAINEE
WHERE            
			ET_IQ             >= 8 
			AND ET_GMATH      >= 8
			AND ET_ENGLISH    >= 18
GROUP BY  
            FULL_NAME
HAVING  
            SUM(ET_IQ + ET_GMATH) >= 20
;


-- Question5: delete information of trainee who has TraineeID = 3

DELETE FROM 
			TRAINEE
WHERE 
            TRAINEE_ID = 3
;            
-- kiem tra
SELECT 
            TRAINEE_ID, 
            FULL_NAME 
FROM        
            TRAINEE
;
-- Question6: trainee who has TraineeID = 5 move "2" class. Let update information into database 

UPDATE 
			TRAINEE
SET 
            TRAINING_CLASS = 'ROCKET2'
WHERE 
            TRAINEE_ID = 5
;            
