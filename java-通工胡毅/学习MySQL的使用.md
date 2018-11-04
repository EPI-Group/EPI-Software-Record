####了解MySQL: 
1.MySQL 是一个数据库管理系统，管理多个数据库，及数据库之间的表关系、有结构、 表数据.
2. MySQL 是一个数据库的服务器(3306)，提供 DBMS 服务，基于 C/S

####1.MySQL的下载
下载[MySQL地址](https://dev.mysql.com/downloads/mysql/)
![](https://upload-images.jianshu.io/upload_images/14263125-f2a339dde1f1ec4f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
选择下载对应的版本,及其型号
####2.MySQL的安装
先解压到自己的目录下,打开解压后的MySql文件在根目录下创建my.ini (mysql配置文件)
######step1:将mysql5.7解压到D盘根目录
      在解压开目录中新建一个文件夹data
######step2:在mysql5.7目录下有一个my-default.ini改名为了my.ini
      其内容为下(建议直接复制 )
#--------------------------------
[client]
port=3306
default-character-set=utf8
[mysqld]
port=3306
character_set_server=utf8
basedir=D:\mysql-5.7.16-winx64\
datadir=D:\mysql-5.7.16-winx64\data
sql_mode=NO_ENGINE_SUBSTITUTION,STRICT_TRANS_TABLES 
#--------------------------------
step3:将D:\mysql-5.7.16-winx64\bin加入path环境变量
step4:用管理员打开命令行窗口输入：mysqld --initialize --user=mysql --console
      以上这步是在D:\mysql-5.7.16-winx64\data下生成脚本，
      记住管理员密码
step5:安装服务：命令行输入：
     mysqld install MySQL --defaults-file="D:\mysql-5.7.16-winx64\my.ini"
step6:services.msc打开服务，启动mysql服务
step7:在命令行输入mysql -uroot -p回车
      输入管理员密码
step8:修改mysql管理员密码
    set password=password('123'); 
#----------------------------------
* 这样之后,就可以使用MySQL数据库
####3.学习MySQL的操作语法与命令(不区分英文的大小写)
*在电脑命令指示窗口中输入下列命令
######1.连接MySQL数据库
```
mysql -uroot -p     //登录数据库
输入密码
```
######2.对数据管理
```
show batabases;      //查看数据库
create mybase;    //创建数据库mybase
use mybase;          //使用此数据库mybase
show tables;      //查看表格
/*
	添加列,添加字段
	alter table 表名 add 列名 数据类型 约束
*/
ALTER TABLE users ADD tell INT;
/*
	修改列,在原有的列上修改
	修改列名,数据类型约束
	alter table 表名 modify 列名 数据类型 约束;
*/
ALTER TABLE users MODIFY tell VARCHAR(50);
/*
	修改列名
	alter table 表名 change 旧列名 新列名 数据类型 约束;
*/
ALTER TABLE users CHANGE tell newtell DOUBLE;
/*
	删除列
	alter table 表名 drop 列名;
*/
ALTER TABLE users DROP newtell;
/*
	修改表名
	rename table 表名 to 新名
*/
RENAME TABLE users TO newusers;
```
######3.创建表格
```
create table users(                                 //创建表格users
      id int prinmary key auto_increment,           //表格第一列id  primary key非空约束     auto_increment自动增长   最后用逗号连接
      uname varchar(20),                        //定义第二列uname   20个字符 
      uprice  double       //最后一列后面什么都不加
);                   //分号结尾
```
**表格的增删改查**
######4.增
```
/*
	项数据表中添加数据 insert
	格式:
	    insert into 表名(列名1,列名2,列名3) values (值1,值2,值3);
	    注意:
	       列名,表名问题
	       对应问题,个数,数据类型
	       
*/
INSERT INTO product (id,pname,price) VALUES (1,'笔记本',6488.53);
INSERT INTO product (id,pname,price) VALUES (2,'智能手机',6488.53);
/*
	添加数据格式,不考虑主键
	格式:
	  insert into 表名 (列名) values (值);
*/
INSERT INTO product (pname,price) VALUES ('洗衣机',1210);
```
######5.删
```
/*
  删除表中的数据
	格式:
	  delete from 表名 where 条件
	  drop table 表名 删除整个数据表
*/
DELETE FROM product WHERE id = 8;
```
######6.改
```
/*
	数据在原有的基础上修改
	  格式:
	    update 表名 set 列1=值1,列2=值2 where 条件
	    where 条件:数据中的唯一性
*/
UPDATE product SET price = 15999 WHERE id = 2;      //条件后可以用and   or  not  连接
```
######7.查
```
/*
	查询指定列的数据
	格式:
	  select 列名1,列名2 form 表名
*/
SELECT zname,zmoney FROM zhangwu;
/*
	查询所有列的数据
	格式:
	  select * from 表名
*/
SELECT * FROM zhangwu;
/*
	查询去掉重复记录
	distinct 关键字 跟随列名
*/
SELECT DISTINCT zname FROM zhangwu;
SELECT * FROM zhangwu;
/*
	查询重新命名列(临时改,实际表没有改)
	as 关键字
*/
SELECT zname AS '名称' FROM zhangwu;
/*
	查询数据中,直接进行数学计算
	列名数字进行计算
*/
SELECT zname AS '名称',zmoney+1000 AS '求1000和' FROM zhangwu;

//查询吃饭支出
SELECT * FROM zhangwu WHERE zname = '吃饭支出';

// 查询金额大于1000
SELECT * FROM zhangwu WHERE zmoney > 1000;

//查询金额在100到5000之间
SELECT * FROM zhangwu WHERE zmoney >= 100 AND zmoney <=5000; 

//改造成between and 方式
SELECT * FROM zhangwu WHERE zmoney BETWEEN 100 AND 5000;

// 查询金额是 1000,3500,5000
SELECT * FROM zhangwu WHERE zmoney IN (1000,3500,5000);

// like 模糊查询 配合通配符
// 查询所有支出
SELECT * FROM zhangwu WHERE zname LIKE '%支出%';

//查询账务名字,五个字符
SELECT * FROM zhangwu WHERE zname LIKE '_____';

//查询账务名,不为空
SELECT * FROM zhangwu WHERE zname IS NOT NULL;
SELECT * FROM zhangwu WHERE NOT (zname IS NULL);
```
##学完语法就可以进行,MySQL数据库的使用,和简单个制作表格
