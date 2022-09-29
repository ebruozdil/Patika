# Proje 2

## [16,21,11,8,12,22] -> Merge Sort
## Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
Merge sorte yöntemine göre diziyi sıralarken, diziyi ikiye bölüyoruz ve bölünün parçaları sonraki adımda tekrar ikiye bölerek tek eleman kalana kadar parçalıyoruz. 

|                                                               |  |  |  |16|21|11|8 |12|22|  |  |
|                     -                                         |- |- |- | -| -|- |- | -|- | -|- |
|Diziyi ikiye ayırıyoruz.                                       |  |  |16|21|11| -|8 |12|22|- |- |
|Ayırdığımız diziyi tekrar ikiye bölüyoruz                      |- |16|21| -|11|- |8 |12| -|22|- |
|Dizi tek tek ayrılana kadar aşama aşama bölmeye devam ediyoruz.|16|- |21| -|11|- |8 | -|12| -|22|

Bölme işlemi bitikten sonra, tek elemanlı dizilerimizi ikili ikili sıralayarak birleştiriyoruz. Sonraki adımlarda birleştirirken önce iki tarafın ilk elemanlarını sıralıyoruz, sonra ikinci sıradaki elemanları sıralayarak yazıyoruz ve bu şekilde sıralı dizi elde edinceye kadar bu işleme devam ediyoruz.

|                                                |16|- |21| -|11|- | 8| -|12| -|22|
|                     -                          |- |- |- | -| -|- |- | -|- |- | -|
|İkili ikili sıralayarak birleştiriyoruz.        | -|16|21|- |11|- | 8|12| -|22|- |
|                                                |- |- |11|16|21|- | 8|12|22|- |- |
|                                                |- |- |- |8 |11|12|16|21|22|- |- |
|                      | | | | | | | | | | | |
---
## Big-O gösterimini yazınız.
Recursive bir fonksiyon olduğu için sürekli kendini çağırarak diziyi hep ikiye bölmektedir. Her bölünmüş dizinin Merge işlemi için de dizinin uzunluğu olan n işlem yapıldığından O(n*(logn)) --> O(6*(log6)) olacaktır.

---
---
[Patika.dev](www.patika.dev) profilime ***[buradan](https://app.patika.dev/ebruzdil)*** ulaşabilirsiniz.