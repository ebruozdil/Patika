# SQL - Ödev 9

Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

1. city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```
SELECT city.city, country.country FROM city INNER JOIN country ON city.country_id=country.country_id;
```
![1](https://user-images.githubusercontent.com/70747048/222116313-0a9effd2-621a-4a3c-9c2a-aa54dfd451db.PNG)

---
2. customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```
SELECT payment_id, first_name, last_name FROM customer INNER JOIN payment ON customer.customer_id = payment.customer_id;
```
![2](https://user-images.githubusercontent.com/70747048/222116317-4e3b77d8-d47d-4129-815c-39083ecc7c9e.PNG)

---
3. customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
```
SELECT rental.rental_id, customer.first_name, customer.last_name 
FROM customer INNER JOIN rental ON customer.customer_id = rental.customer_id;
```
![3](https://user-images.githubusercontent.com/70747048/222116320-752a2b02-3477-49de-9534-a0dd43a73bd5.PNG)

---
Patika Profilim : [ebruzdil](https://app.patika.dev/ebruzdil)  😊✨