USE adventureworks;
-- Exercise 1: Subquery  
-- Question 1: Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name của ProductSubcategory là 'Saddles'.
SELECT  p.Name 
FROM    product p
WHERE   p.ProductSubcategoryID IN (SELECT ps.ProductSubcategoryID 
                        FROM productsubcategory ps
                        WHERE ps.Name='Saddles');
                        
-- Question 2: Thay đổi câu Query 1 để lấy được kết quả những người có tên 'Bo%' 
SELECT  p.Name 
FROM    product p
WHERE   p.ProductSubcategoryID IN (SELECT ps.ProductSubcategoryID 
                        FROM productsubcategory ps
                        WHERE ps.Name like 'Bo%');

-- Question 3: Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) 
			-- và Touring Bike (nghĩa là ProductSubcategoryID = 3) 
SELECT  `Name` 
FROM    product 
WHERE   ProductSubcategoryID = 3  AND ListPrice = (SELECT  min(ListPrice) 
										           FROM    product  
                                                   WHERE   ProductSubcategoryID = 3 )			
;

-- Exercise 2: JOIN nhiều bảng 
-- Question 1: Viết query lấy danh sách tên country và province được lưu  trong AdventureWorks2008sample database.

SELECT 
    c.Name AS country, s.Name AS province
FROM
    countryregion c
        JOIN
    stateprovince s ON c.CountryRegionCode = s.CountryRegionCode
;

-- Question 2: Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country Germany và Canada 

SELECT 
    c.Name AS country, s.Name AS province
FROM
    countryregion c
        JOIN
    stateprovince s ON c.CountryRegionCode = s.CountryRegionCode
WHERE
    c.Name IN ('Germany' , 'Canada')
ORDER BY c.Name ASC
;

-- Question 3: Lấy ra các trường: SalesOrderID, OrderDate, SalesPersonID, BusinessEntityID ,Bonus, SalesYTD
             -- Từ Bảng SalesOrderHeader và SalesPerson   
SELECT 
    o.SalesOrderID,
    o.OrderDate,
    o.SalesPersonID,
    p.SalesPersonID AS BusinessEntityID,
    p.Bonus,
    p.SalesYTD
FROM
    salesorderheader o
        JOIN
    salesperson p ON o.SalesPersonID = p.SalesPersonID;
    
-- Question 4:  Sử dụng câu query, thêm cột JobTitle và xóa cột SalesPersonID và BusinessEntityID. 
SELECT 
    o.SalesOrderID,
    o.OrderDate,
    e.Title AS Jobtitle,
    p.Bonus,
    p.SalesYTD
FROM
    salesorderheader o
        JOIN
    salesperson p ON o.SalesPersonID = p.SalesPersonID
        LEFT JOIN
    employee e ON e.EmployeeID = o.SalesPersonID;  






                       