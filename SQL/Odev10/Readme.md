# SQL - Ödev 10

Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

1. **city** tablosu ile **country** tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.
```
SELECT city.city, country.country FROM city LEFT JOIN country ON city.country_id=country.country_id;
```
![1](https://user-images.githubusercontent.com/70747048/222131200-58eb7d2b-991f-410f-a287-b3d082247505.PNG)

---
2. **customer** tablosu ile **payment** tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.
```
SELECT payment_id, first_name, last_name FROM customer RIGHT JOIN payment  ON customer.customer_id = payment.customer_id;
```
![2](https://user-images.githubusercontent.com/70747048/222131208-b6e9f958-8e96-452a-bbd1-4cd5684caecf.PNG)

---
3. **customer** tablosu ile **rental** tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.
```
SELECT rental.rental_id, customer.first_name, customer.last_name 
FROM customer FULL JOIN rental ON customer.customer_id = rental.customer_id;
```
![3](https://user-images.githubusercontent.com/70747048/222131211-b9c5951d-f7e3-464c-9e40-ad5fc3652f01.PNG)

---
Patika Profilim : [ebruzdil](https://app.patika.dev/ebruzdil)  😊✨