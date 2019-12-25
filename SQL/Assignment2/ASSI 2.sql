-- Exercise 1:Design a table
DROP database IF EXISTS QUANLYFRESHER;
CREATE DATABASE IF NOT EXISTS QUANLYFRESHER;
USE QUANLYFRESHER;
 
DROP TABLE IF EXISTS TRAINEE;
CREATE TABLE TRAINEE
(
   TRAINEE_ID                TINYINT AUTO_INCREMENT PRIMARY KEY,
   FULL_NAME                 NVARCHAR(30) NOT NULL,
   BIRTH_DATE                DATE NOT NULL,
   GENDER                    ENUM('MALE','FEMALE','UNKNOWN'),
   ET_IQ                     TINYINT CHECK ((ET_IQ >= 0) AND (ET_IQ <= 20)) NOT NULL,
   ET_GMATH                  TINYINT CHECK ((ET_GMATH >= 0) AND (ET_GMATH <= 20)) NOT NULL,
   ET_ENGLISH                TINYINT CHECK ((ET_ENGLISH >= 0) AND (ET_ENGLISH <= 50)) NOT NULL,
   TRAINING_CLASS            CHAR(10) NOT NULL,
   EVALUATION                NVARCHAR(200)
);

-- Question 2: thêm trường VTI_Account với điều kiện not null & unique
ALTER TABLE Trainee
	ADD COLUMN VTI_Account		NVARCHAR(30) NOT NULL UNIQUE;
    

	-- Exercise 2: Data Types
DROP TABLE IF EXISTS Bang1;
CREATE TABLE Bang1
(
	ID1					MEDIUMINT AUTO_INCREMENT PRIMARY KEY,
    Name_ID1			NVARCHAR(35) NOT NULL,
    Code				TINYINT CHECK((Code >= 0) AND (Code <=5)),
    ModifiedData_ID1	DATETIME
);


	-- Exercise 3: Data Types (2)
DROP TABLE IF EXISTS Bang2;
CREATE TABLE Bang2
(
	ID2					MEDIUMINT AUTO_INCREMENT PRIMARY KEY,
    Name_ID2			NVARCHAR(40) NOT NULL,
    BrithDate_ID2		DATE NOT NULL,
    Gender_ID2			ENUM('male','female','unknown'),
    IsDeletedFlag_ID2	TINYINT
);


