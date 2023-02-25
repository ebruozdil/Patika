# SQL - Ödev 8

1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
```
CREATE TABLE employee (
	id INTEGER,
	name VARCHAR(50), 
	birthday DATE, 
	email VARCHAR(100)
);
```

![1](https://user-images.githubusercontent.com/70747048/221367909-3bf444c3-b914-4d2d-aa51-609e1c73e04b.png)

---

2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
```
insert into employee (id, name, birthday, email) values (1, 'Burr', '1906-04-05', 'bprudham0@privacy.gov.au');
insert into employee (id, name, birthday, email) values (2, 'Nixie', '2000-01-06', 'nkimble1@google.ru');
insert into employee (id, name, birthday, email) values (3, 'Klarrisa', '1955-02-20', 'kyendall2@yale.edu');
insert into employee (id, name, birthday, email) values (4, 'Vivia', '1910-05-29', 'vbernakiewicz3@acquirethisname.com');
insert into employee (id, name, birthday, email) values (5, 'Gayler', null, 'gschiementz4@utexas.edu');
insert into employee (id, name, birthday, email) values (6, 'Ring', '2002-07-01', 'rcoard5@google.it');
insert into employee (id, name, birthday, email) values (7, 'Lon', '1961-12-16', null);
insert into employee (id, name, birthday, email) values (8, 'Terrell', '1902-08-25', null);
insert into employee (id, name, birthday, email) values (9, 'Ceil', '2003-06-06', 'cbilborough8@youtu.be');
insert into employee (id, name, birthday, email) values (10, 'Fabiano', '1981-09-05', 'fweavers9@uiuc.edu');
insert into employee (id, name, birthday, email) values (11, 'Bart', null, 'bspradberya@gov.uk');
insert into employee (id, name, birthday, email) values (12, 'Bren', '1926-06-11', 'bdeeneyb@digg.com');
insert into employee (id, name, birthday, email) values (13, 'Rey', null, null);
insert into employee (id, name, birthday, email) values (14, 'Alyssa', '1960-04-15', 'ahassand@domainmarket.com');
insert into employee (id, name, birthday, email) values (15, 'Marjory', null, 'mlitte@networksolutions.com');
insert into employee (id, name, birthday, email) values (16, 'Ardis', '1991-10-23', null);
insert into employee (id, name, birthday, email) values (17, 'Lorianne', '1976-09-04', 'lfalkusg@blogger.com');
insert into employee (id, name, birthday, email) values (18, 'Harmon', null, null);
insert into employee (id, name, birthday, email) values (19, 'Inez', '1936-02-23', null);
insert into employee (id, name, birthday, email) values (20, 'Reinwald', '1923-04-07', null);
insert into employee (id, name, birthday, email) values (21, 'Vinny', '1928-09-08', null);
insert into employee (id, name, birthday, email) values (22, 'Karry', '1974-04-28', null);
insert into employee (id, name, birthday, email) values (23, 'Markus', '1953-12-31', 'mparcellsm@biblegateway.com');
insert into employee (id, name, birthday, email) values (24, 'Adrian', '1912-04-10', 'arapin@ft.com');
insert into employee (id, name, birthday, email) values (25, 'Billie', '1965-10-09', 'bmckennano@indiatimes.com');
insert into employee (id, name, birthday, email) values (26, 'Ellsworth', '1986-07-09', 'elundbergp@prlog.org');
insert into employee (id, name, birthday, email) values (27, 'Krystal', '1917-06-08', null);
insert into employee (id, name, birthday, email) values (28, 'Tisha', '2002-12-26', 'tcaheyr@narod.ru');
insert into employee (id, name, birthday, email) values (29, 'Shurwood', null, null);
insert into employee (id, name, birthday, email) values (30, 'Bax', '1911-12-22', 'bputsont@sogou.com');
insert into employee (id, name, birthday, email) values (31, 'Maggi', '1933-06-21', null);
insert into employee (id, name, birthday, email) values (32, 'Geneva', '1937-02-24', null);
insert into employee (id, name, birthday, email) values (33, 'Leanor', '1983-08-31', 'lmcmonniesw@sphinn.com');
insert into employee (id, name, birthday, email) values (34, 'Elfie', '1922-09-02', 'esiaspinskix@archive.org');
insert into employee (id, name, birthday, email) values (35, 'Booth', '1949-09-16', 'balloney@360.cn');
insert into employee (id, name, birthday, email) values (36, 'Lanna', '1983-05-21', null);
insert into employee (id, name, birthday, email) values (37, 'Ollie', '1973-11-20', null);
insert into employee (id, name, birthday, email) values (38, 'Elsie', '2017-08-25', 'emacrorie11@mit.edu');
insert into employee (id, name, birthday, email) values (39, 'Arnold', '2011-09-05', 'apinchback12@paypal.com');
insert into employee (id, name, birthday, email) values (40, 'Hall', null, 'hpailin13@nps.gov');
insert into employee (id, name, birthday, email) values (41, 'Roarke', '1964-08-14', 'rkittel14@ovh.net');
insert into employee (id, name, birthday, email) values (42, 'Kaye', '1981-02-08', null);
insert into employee (id, name, birthday, email) values (43, 'Vale', '1942-04-29', null);
insert into employee (id, name, birthday, email) values (44, 'Noak', '1953-11-01', 'nridolfi17@paginegialle.it');
insert into employee (id, name, birthday, email) values (45, 'Charley', '1992-05-05', 'cbaumaier18@jalbum.net');
insert into employee (id, name, birthday, email) values (46, 'Holmes', null, null);
insert into employee (id, name, birthday, email) values (47, 'Benedetta', null, null);
insert into employee (id, name, birthday, email) values (48, 'Tarrance', '1936-06-17', null);
insert into employee (id, name, birthday, email) values (49, 'Gerhard', '1906-01-20', null);
insert into employee (id, name, birthday, email) values (50, 'Selma', '1989-06-30', null);
```

![2](https://user-images.githubusercontent.com/70747048/221367911-f33c9007-7d33-4d96-ac70-034d57200eb2.png)


![2](https://user-images.githubusercontent.com/70747048/221367912-637d9c01-7bf0-4afc-9ffb-ed3b70cc2d87.png)

---

3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
```
UPDATE employee
SET name = 'Ebru'
WHERE id= 2;

UPDATE employee
SET name ='Patika Ödev 8'
WHERE id IN (1, 6, 10, 11, 5);

UPDATE employee
SET birthday='1999-06-28'
WHERE name='Ebru';

UPDATE employee
SET birthday = '2000-2-11'
WHERE name LIKE 'M%';

UPDATE employee
SET name= 'Mevlüt'
WHERE id=15;
```

![3](https://user-images.githubusercontent.com/70747048/221367915-9d807c1b-0415-4d4b-84d2-df1a45b223ad.png)

---

4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
```
DELETE FROM employee
WHERE name='Lon'
RETURNING *;

DELETE FROM employee
WHERE name='Rey'
RETURNING *;

DELETE FROM employee
WHERE id>35
RETURNING *;

DELETE FROM employee
WHERE name LIKE 'A%'
RETURNING *;

DELETE FROM employee
WHERE id BETWEEN 18 AND 22
RETURNING *;
```

![4](https://user-images.githubusercontent.com/70747048/221367916-795fd301-1534-410f-8db2-7fec1131f8dc.png)

---

Patika Profilim : [ebruzdil](https://app.patika.dev/ebruzdil)  😊✨