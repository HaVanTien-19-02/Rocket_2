DROP DATABASE IF EXISTS TESTINGFINAL;
CREATE DATABASE IF NOT EXISTS TESTINGFINAL;
USE TESTINGFINAL;

-- A  Tạo 3 table với các ràng buộc và kiểu dữ liệu
--    Thêm ít nhất 10 bản ghi vào table.

DROP TABLE IF EXISTS CUSTOMER; 
CREATE TABLE IF NOT EXISTS CUSTOMER
(
CustomerID  TINYINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
Name        NVARCHAR(50) NOT NULL,
Phone       CHAR(10) NOT NULL,
Email       VARCHAR(50) NOT NULL,
Address     NVARCHAR(50) NOT NULL,
NoteCus     NVARCHAR(100) 
); 

DROP TABLE IF EXISTS CAR; 
CREATE TABLE IF NOT EXISTS CAR
(
CarID       TINYINT PRIMARY KEY NOT NULL,
Maker       VARCHAR(10) NOT NULL,
Model       VARCHAR(50) NOT NULL,
Year        CHAR(4) NOT NULL,
Color       CHAR(20) NOT NULL,
NoteCar     NVARCHAR(100)
);

DROP TABLE IF EXISTS CAR_ORDER; 
CREATE TABLE IF NOT EXISTS CAR_ORDER
(
OrderID      TINYINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
CustomerID   TINYINT NOT NULL,
CarID        TINYINT NOT NULL,
Amount       CHAR(10) NOT NULL,
SalePrice    CHAR(20) NOT NULL,
OrderDate    DATE  NOT NULL,
DeliveryDate DATE NOT NULL,
DeliveryAddress NVARCHAR(50) NOT NULL,
Status       CHAR(1) NOT NULL,
NoteOrder    NVARCHAR(100),
FOREIGN KEY(CustomerID) REFERENCES CUSTOMER(CustomerID),
FOREIGN KEY(CarID) REFERENCES CAR(CarID)
);

INSERT INTO CUSTOMER (    Name,          Phone,            Email,                 Address,   NoteCus )
VALUES               ('Ha Van Tien',     0123456789, 'havantien1902@gmail.com',  'Thai Binh',    'OK' ),
                     ('Bui Van Tien',    0123454567, 'buivantien1802@gmail.com', 'Thai Binh',    'OK' ),
                     ('Nguyen Van Tung', 0123478989, 'nguyenvantung@gmail.com',  'Thai Nguyen',  'OK' ),
                     ('Tran Van Tuan',   012753789, 'tranvantuan@gmail.com',     'Thanh Hoa',    'OK' ),
                     ('Ha Manh Duc',     0128556789, 'hamanhduc@gmail.com',      'Nam Dinh',     'OK' ),
                     ('Bui Thi Loan',    012987654, 'loanbuithi@gmail.com',      'Ninh Binh',    'OK' ),
                     ('Pham Thi Linh',   0123435789, 'linhphamthi@gmail.com',    'Ha Nam',       'OK' ),
                     ('Nguyen Van Hieu', 012396359, 'nguyenvanhieu@gmail.com',   'Hai Duong',    'OK' ),
                     ('Tran Thi Nhung',  0128523699, 'tranthinhung@gmail.com',   'Hai Phong',    'OK' ),
                     ('Ha Van Long',     0128521489, 'longhavan@gmail.com',      'Quang Ninh',   'OK' );
                    
INSERT INTO CAR ( CarID,   Maker,        Model,    Year,   Color,     NoteCar)
VALUES          (   1  ,  'HONDA',      'CITY',    2015,  'BLACK',     'OK' ), 
                (   2  ,  'NISSAN',    'TEANA',    2016,  'WHITE',     'OK' ),
                (   3  ,  'HONDA',     'CIVIC',    2019,  'BLACK',     'OK' ),
                (   4  ,  'TOYOTA',    'CAMRY',    2018,  'WHITE',     'OK' ),
                (   5  ,  'TOYOTA',    'CAMRY',    2019,  'RED',       'OK' ),
                (   6  ,  'NISSAN',    'TEANA',    2015,  'RED',       'OK' ),
                (   7  ,  'TOYOTA', 'FORTUNER',    2016,  'BLACK',     'OK' ),
                (   8  ,  'NISSAN',    'SUNNY',    2017,  'WHITE',     'OK' ),
                (   9  ,  'TOYOTA', 'FORTUNER',    2018,  'BLACK',     'OK' ),
                (   10  , 'TOYOTA', 'FORTUNER',    2019,  'RED',       'OK' );
                
INSERT INTO  CAR_ORDER ( CustomerID, CarID, Amount, SalePrice,   OrderDate, DeliveryDate,  DeliveryAddress,            Status, NoteOrder)
VALUES                 (      1,       1,     1,   '1000000000', '2016/1/1',  '2016/8/12', 'TP.THAI BINH, THAI BINH',      1,       'OK'),
                       (      2,       2,     2,   '2000000000', '2017/1/1',  '2017/7/10', 'TP.THAI BINH, THAI BINH',      2,       'OK'),
                       (      3,       3,     2,   '1500000000', '2020/1/1',  '2020/6/11', 'TP.THAI NGUYEN, THAI NGUYEN',  1,       'OK'),
                       (      4,       4,     3,   '2000000000', '2019/1/1',  '2019/5/18', 'TP.THANH HOA, THANH HOA',      1,       'OK'),
                       (      5,       5,     3,   '2000000000', '2020/1/1',  '2020/4/25', 'TP.NAM DINH, NAM DINH',        0,       'OK'),
                       (      6,       6,     3,   '2000000000', '2016/1/1',  '2016/3/23', 'TP.NINH BINH, NINH BINH',      1,       'OK'),
                       (      7,       7,     1,   '2500000000', '2017/1/1',  '2017/4/02', 'TP.HA NAM, HA NAM',            2,       'OK'),
                       (      8,       8,     4,   '1100000000', '2018/1/1',  '2018/5/05', 'TP.HAI DUONG, HAI DUONG',      1,       'OK'),
                       (      9,       9,     2,   '2500000000', '2019/1/1',  '2019/6/15', 'TP.HAI PHONG, HAI PHONG',      1,       'OK'),
                       (     10,      10,     2,   '1100000000', '2020/1/1',  '2020/7/20', 'TP.QUANG NINH, QUANG NINH',    0,       'OK');
                       
                       
-- B   Viết lệnh lấy ra thông tin của khách hàng: tên, số lượng oto khách hàng đã mua 
--     và sắp sếp tăng dần theo số lượng oto đã mua.
  
SELECT 
    `Name`, Amount
FROM
    CUSTOMER c
        JOIN
    CAR_ORDER o ON c.CustomerID = o.CustomerID
WHERE o.Status IN ('0','1')    
ORDER BY o.Amount ASC;

-- C   Viết hàm (không có parameter) trả về tên hãng sản xuất đã bán được nhiều
--     oto nhất trong năm nay.

DROP FUNCTION IF EXISTS HANGSX;

DELIMITER $$

CREATE FUNCTION HANGSX () RETURNS VARCHAR(10)
    BEGIN 
       SELECT a.Maker
       FROM   CAR a
       JOIN   CAR_ORDER o ON a.CarID = o.CarID
       WHERE  a.Year(DeliveryDate)='2020' AND o.CarID='1' 
       GROUP BY a.Maker;
    END$$
DELIMITER ;


-- D Viết 1 thủ tục (không có parameter) để xóa các đơn hàng đã bị hủy của
--   những năm trước. In ra số lượng bản ghi đã bị xóa.

DROP PROCEDURE IF EXISTS DonHangHuy;

DELIMITER $$
CREATE PROCEDURE DonHangHuy()
    BEGIN
        DELETE FROM CAR_ORDER o
        WHERE Year(now()) > Year(DeliveryDate) AND o.`Status`='2';
    END$$
DELIMITER ;
call DonHangHuy();
SELECT ROW_COUNT();
-- E   Viết 1 thủ tục (có CustomerID parameter) để in ra thông tin của các đơn
--     hàng đã đặt hàng bao gồm: tên của khách hàng, mã đơn hàng, số lượng oto
--     và tên hãng sản xuất

DROP PROCEDURE IF EXISTS HangDat

DELIMITER $$
CREATE PROCEDURE HangDat(IN v_CustomerID TINYINT)
    BEGIN
        SELECT Name, OrderID, Amount, Maker
        FROM   CAR_ORDER o
        JOIN   CAR a ON o.CarID=a.CarID
        JOIN   CUSTOMER c ON o.CustomerID = c.CustomerID
        WHERE  o.Status= '1' AND o.CustomerID=v_CustomerID; 
    END$$
DELIMITER ;


-- F  Viết trigger để tránh trường hợp người dụng nhập thông tin không hợp lệ
--    vào database (DeliveryDate < OrderDate + 15).

DROP TRIGGER IF EXISTS KiemTra;
DELIMITER $$
CREATE TRIGGER KiemTra
BEFORE INSERT ON CAR_ORDER
FOR EACH ROW
    BEGIN
      IF (NEW.DeliveryDate > NEW.OrderDate + 15) THEN
      SIGNAL SQLSTATE '12345'
      SET MESSAGE_TEXT = 'Du lieu khong hop le' ;
    END IF;  
    END$$
DELIMITER ;    

INSERT INTO CAR_ORDER ( CustomerID, CarID, Amount, SalePrice,   OrderDate,  DeliveryDate,  DeliveryAddress, Status, NoteOrder)
VALUES                 (  2,          1,      1,   1000000000,  '2016/1/1',  '2016/1/5',     'Thai Binh'      ,1 ,      'OK'); 

