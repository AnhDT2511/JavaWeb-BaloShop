create database shoponline

create table Account
(
  Id                int  identity,
  Email             nvarchar(50),
  Password          nvarchar(80),
  Account_Detail_Id int,
  Role_ID           int,
  Status            int,
  Create_Date       date constraint DF_Account_Creat_Date default getdate(),
  constraint PK_Account
  primary key (Id)
)
go

create table Account_Detail
(
  Id           int identity,
  Name         nvarchar(100) not null,
  Phone_Number nvarchar(50)  not null,
  Gender       bit           not null,
  Address      nvarchar(500) not null,
  constraint PK_Account_Detail
  primary key (Id)
)
go

create table Categories
(
  Id       int identity,
  Category nvarchar(100)
)
go

create table Products
(
  Id          int identity,
  Name        nvarchar(200),
  Category_Id int,
  Price       float,
  Description nvarchar(1200),
  Quantity    int,
  Status      int,
  Image_Link  nvarchar(200),
  Note        nvarchar(1000)
)
go

create table Role
(
  Id   int identity,
  Name nvarchar(100) not null,
  constraint PK_Role
  primary key (Id)
)
go

create table Status_Account
(
  Id     int identity,
  Status nvarchar(50),
  constraint PK_Status
  primary key (Id)
)
go

create table Status_Product
(
  Id     int identity,
  Status nvarchar(50)
)
go

create table [Order]
(
  Id          int  identity,
  Account_Id  int,
  Create_Date date default getdate(),
  Total_Price decimal(18),
  Note        nvarchar(1000),
  Status      int,
  primary key (Id)
)
go

create table Order_Detail
(
  Id               int identity,
  Order_Id         int,
  Product_Id       int,
  Product_Name     nvarchar(200),
  Product_Quantity int,
  Product_Price    decimal(18),
  primary key (Id)
)
go

create table Other_Address
(
  Id           int identity,
  Name         nvarchar(200),
  Phone_Number nvarchar(100),
  Address      nvarchar(2000),
  Order_Id     int,
  primary key (Id)
)
go

create table Status_Order
(
  Id     int identity,
  Status nvarchar(200),
  primary key (Id)
)
go

SET IDENTITY_INSERT [dbo].[Account] ON
INSERT INTO shoponline.dbo.Account (Id, Email, Password, Account_Detail_Id, Role_ID, Status, Create_Date) VALUES (2, N'admin@gmail.com', N'123456', 1, 1, 1, CAST(N'2018-08-10' AS Date));
INSERT INTO shoponline.dbo.Account (Id, Email, Password, Account_Detail_Id, Role_ID, Status, Create_Date) VALUES (3, N'mod@gmail.com', N'1234567', 2, 2, 1, CAST(N'2018-08-10' AS Date));
INSERT INTO shoponline.dbo.Account (Id, Email, Password, Account_Detail_Id, Role_ID, Status, Create_Date) VALUES (7, N's2.25111211@gmail.com', N'123456', 13, 2, 1, CAST(N'2018-08-20' AS Date));
SET IDENTITY_INSERT [dbo].[Account] OFF

SET IDENTITY_INSERT [dbo].[Account_Detail] ON
INSERT INTO shoponline.dbo.Account_Detail (Id, Name, Phone_Number, Gender, Address) VALUES (1, N'Tô Hoàng Anh', N'01645090445', 1, N'22 Nguyễn Văn Cừ, Phường Ngọc Lâm, Quận Long Biên, Hà Nội');
INSERT INTO shoponline.dbo.Account_Detail (Id, Name, Phone_Number, Gender, Address) VALUES (2, N'Đinh Tuấn Anh', '01646352891', 1, N'44 Nguyễn Văn Cừ, Phường Ngọc Lâm, Quận Long Biên, Hà Nội');
INSERT INTO shoponline.dbo.Account_Detail (Id, Name, Phone_Number, Gender, Address) VALUES (13, N'Tuấn Anh', N'0973876107', 1, N'Đại Học FPT, KM29, Khu công nghệ cao Láng Hòa Lạc, Xã Thạch Hoà, Huyện Thạch Thất, Hà Nội');
SET IDENTITY_INSERT [dbo].[Account_Detail] OFF

SET IDENTITY_INSERT [dbo].[Categories] ON
INSERT INTO shoponline.dbo.Categories (Id, Category) VALUES (1, N'Balo');
INSERT INTO shoponline.dbo.Categories (Id, Category) VALUES (2, N'Túi tote');
INSERT INTO shoponline.dbo.Categories (Id, Category) VALUES (3, N'Túi bao tử');
INSERT INTO shoponline.dbo.Categories (Id, Category) VALUES (4, N'Túi đeo vai');
INSERT INTO shoponline.dbo.Categories (Id, Category) VALUES (5, N'Túi văn phòng');
SET IDENTITY_INSERT [dbo].[Categories] OFF

SET IDENTITY_INSERT [dbo].[Products] ON
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (1, N'SOLDIER GREEN/TAN', 1, 2000000, N'Balo vải bố dày có quai và đáy làm bằng da bò tự nhiên.<br>Một ngăn dây kéo lớn mặt trước.<br>Một ngăn dây kéo hông phải, 1 túi đắp hông trái.<br>Một ngăn dây kéo bên trong và 2 túi nhỏ.', 5, 1, N'soldier-green-tan.jpg', null);
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (2, N'SOLDIER CARA/BLACK', 1, 2200000, N'Balo vải bố dày có quai và đáy làm bằng da bò tự nhiên.<br>Một ngăn dây kéo lớn mặt trước.<br>Một ngăn dây kéo hông phải, 1 túi đắp hông trái.<br>Một ngăn dây kéo bên trong và 2 túi nhỏ.', 5, 2, N'soldier-cara-black.jpg', null);
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (3, N'SOLDIER JET/BLACK', 1, 2234000, N'Balo vải bố dày có quai và đáy làm bằng da bò tự nhiên.<br>Một ngăn dây kéo lớn mặt trước.<br>Một ngăn dây kéo hông phải, 1 túi đắp hông trái.<br>Một ngăn dây kéo bên trong và 2 túi nhỏ.', 5, 1, N'soldier-jet-black.jpg', null);
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (4, N'HIRO NAVY/BLACK', 1, 2200000, N'Balo vải bố dày có quai và đáy làm bằng da bò tự nhiên.<br>Một ngăn dây kéo lớn mặt trước.<br>Một ngăn dây kéo hông phải, 1 túi đắp hông trái.<br>Một ngăn dây kéo bên trong và 2 túi nhỏ.', 5, 1, N'hiro-navy-black.jpg', null);
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (5, N'HIRO RED/BEIGE', 1, 2200000, N'Balo vải bố dày có quai và đáy làm bằng da bò tự nhiên.<br>Một ngăn dây kéo lớn mặt trước.<br>Một ngăn dây kéo hông phải, 1 túi đắp hông trái.<br>Một ngăn dây kéo bên trong và 2 túi nhỏ.', 5, 1, N'hiro-red-beige.jpg', null);
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (6, N'TRAVELLER GREEN/BEIGE', 1, 1234000, N'Balo vải bố dày có quai và đáy làm bằng da bò tự nhiên.<br>Một ngăn dây kéo lớn mặt trước.<br>Một ngăn dây kéo hông phải, 1 túi đắp hông trái.<br>Một ngăn dây kéo bên trong và 2 túi nhỏ.', 5, 1, N'traveller-green-beige.jpg', null);
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (7, N'TRAVELLER NAVY/BEIGE', 1, 1234000, N'Balo vải bố dày có quai và đáy làm bằng da bò tự nhiên.<br>Một ngăn dây kéo lớn mặt trước.<br>Một ngăn dây kéo hông phải, 1 túi đắp hông trái.<br>Một ngăn dây kéo bên trong và 2 túi nhỏ.', 4, 2, N'traveller-navy-beige.jpg', null);
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (8, N'MAX GREEN/TAN', 2, 750000, N'Hoàn hảo cho các hoạt động hằng ngày.<br>Quai đeo da bò tự nhiên, một ngăn dây kéo mặt trước.<br>Một túi nhỏ bên trong.', 3, 2, N'max-green-tan.jpg', null);
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (9, N'MAX RED', 2, 750000, N'Hoàn hảo cho các hoạt động hằng ngày.<br>Quai đeo da bò tự nhiên, một ngăn dây kéo mặt trước.<br>Một túi nhỏ bên trong.', 5, 1, N'max-red.jpg', null);
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (10, N'KIRA RED/BEIGE', 3, 850000, N'Một ngăn dây kéo mặt trước.<br>Ngăn chính có 1 ngăn dây kéo bên trong.<br>Dây đeo bằng cotton, khoá nhựa chất lượng cao.<br>Có khả năng chống thấm nước.<br>Bảo hành 1 năm.', 5, 1, N'kira-red-beige.jpg', null);
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (11, N'KIRA BLACK/TAN', 3, 850000, N'Một ngăn dây kéo mặt trước.<br>Ngăn chính có 1 ngăn dây kéo bên trong.<br>Dây đeo bằng cotton, khoá nhựa chất lượng cao.<br>Có khả năng chống thấm nước.<br>Bảo hành 1 năm.', 5, 2, N'kira-black-tan.jpg', null);
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (12, N'BASTILLE COBALT', 4, 1000000, N'Balo vải bố dày có quai và đáy làm bằng da bò tự nhiên.<br>Một ngăn dây kéo lớn mặt trước.<br>Một ngăn dây kéo hông phải, 1 túi đắp hông trái.<br>Một ngăn dây kéo bên trong và 2 túi nhỏ.', 4, 1, N'bastille-cobalt.jpg', null);
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (13, N'BENJI AIRY/RED', 4, 1000000, N'Balo vải bố dày có quai và đáy làm bằng da bò tự nhiên.<br>Một ngăn dây kéo lớn mặt trước.<br>Một ngăn dây kéo hông phải, 1 túi đắp hông trái.<br>Một ngăn dây kéo bên trong và 2 túi nhỏ.', 5, 1, N'benji-airy-red.jpg', null);
INSERT INTO shoponline.dbo.Products (Id, Name, Category_Id, Price, Description, Quantity, Status, Image_Link, Note) VALUES (20, N'TRAVELLER BLACK/SAND', 1, 1499000, N'Balo vải bố dày có quai và đáy làm bằng da bò tự nhiên.<br>Một ngăn dây kéo lớn mặt trước.<br>Một ngăn dây kéo hông phải,<br>Một ngăn túi đắp có đệm phía sau.<br>Ngăn chính có 1 ngăn chống sốc cho laptop 15''- 17''.<br>Một ngăn dây kéo bên trong và 2 túi nhỏ.<br>Khoá bấm kim loại chất lượng cao.<br>Dây kéo YKK, đầu kéo bằng da bò.<br>Vải bố dày, không xù lông.<br>Có khả năng chống thấm nước. Bảo hành 1 năm.', 10, 1, N'traveller-black-sand.jpg', null);
SET IDENTITY_INSERT [dbo].[Products] OFF

SET IDENTITY_INSERT [dbo].[Role] ON
INSERT INTO shoponline.dbo.Role (Id, Name) VALUES (1, N'Admin');
INSERT INTO shoponline.dbo.Role (Id, Name) VALUES (2, N'Customer');
INSERT INTO shoponline.dbo.Role (Id, Name) VALUES (3, N'Employee');
SET IDENTITY_INSERT [dbo].[Role] OFF

SET IDENTITY_INSERT [dbo].[Status_Account] ON
INSERT INTO shoponline.dbo.Status_Account (Id, Status) VALUES (1, N'Đang hoạt động');
INSERT INTO shoponline.dbo.Status_Account (Id, Status) VALUES (2, N'Đang chờ duyệt');
INSERT INTO shoponline.dbo.Status_Account (Id, Status) VALUES (3, N'Ngừng sử dụng');
SET IDENTITY_INSERT [dbo].[Status_Account] OFF

SET IDENTITY_INSERT [dbo].[Status_Product] ON
INSERT INTO shoponline.dbo.Status_Product (Id, Status) VALUES (1, N'Còn hàng');
INSERT INTO shoponline.dbo.Status_Product (Id, Status) VALUES (2, N'Giảm giá');
INSERT INTO shoponline.dbo.Status_Product (Id, Status) VALUES (3, N'Hết hàng');
INSERT INTO shoponline.dbo.Status_Product (Id, Status) VALUES (4, N'Ngừng kinh doanh');
SET IDENTITY_INSERT [dbo].[Status_Product] OFF

SET IDENTITY_INSERT [dbo].[Status_Order] ON
INSERT INTO shoponline.dbo.Status_Order (Id, Status) VALUES (1, N'Đang xử lý');
INSERT INTO shoponline.dbo.Status_Order (Id, Status) VALUES (2, N'Đang giao hàng');
INSERT INTO shoponline.dbo.Status_Order (Id, Status) VALUES (3, N'Giao hàng thành công');
INSERT INTO shoponline.dbo.Status_Order (Id, Status) VALUES (4, N'Đang hủy đơn hàng');
INSERT INTO shoponline.dbo.Status_Order (Id, Status) VALUES (5, N'Đã hủy bỏ');
SET IDENTITY_INSERT [dbo].[Status_Order] OFF
