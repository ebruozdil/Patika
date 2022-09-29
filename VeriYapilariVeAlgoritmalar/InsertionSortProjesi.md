# Proje 1
## [22,27,16,2,18,6] -> Insertion Sort

## 1 ) Yukarıda verilen dizinin sort türüne göre aşamalarını yazınız.
( Bir çok kaynakta uygulayacağım yöntemin adı ***selection sort*** olarak geçse de kodluyoruz eğitiminde ***insertion sort*** olarak öğretildiğinden dolayı bu şekilde uyguluyorum.)

- Algoritma her aşamada diziyi tarıyor ve verilen örüntüye ait en küçük elemanı buluyor. İlk olarak en baştaki sayı ile yer değiştiriyor. Devamında ise ikinci en küçük elemanı buluyor ve 2. sıra ile değiştiriyor. Baktın ki 2.sıradaki eleman en küçük hiç dokunmuyor. Hemen 3. sıraya geç. 4, 5 derken dizi sıralanıyor.

|1.Adım|2'|27|16|22'|18|6|     
|------|- |- |- |-|- |-| 

n elemanlı dizinin n elemanını tarıyor ve en küçük elemanı olarak 2 yi buluyor ve 1.sıraya koyuyor. 1. sıradaki sayıyı ise 2 yi aldığı yere koyuyor.

|2.Adım|2|6'|16|22|18|27'|     
|------|- |- |- |-|- |-|

Diziyi 2. kez taradığında ilk eleman zaten en küçük olduğundan n elemanı taramak yerine n-1 elemanı tarıyor ve 6 yı bulup 2.sıraya koyuyor 2.sıradakini ise 6 yı bulduğu yere koyuyor.

|3.Adım|2|6|16|22|18|27|     
|------|- |- |- |-|- |-|

Diziyi 3. kez taradığında n-2 elemanı tarıyor ve en küçük sayının 16 olduğunu ve doğru yerde olduğu için yer değiştirme yapmıyoruz.

|4.Adım|2|6|16|18'|22'|27|     
|------|- |- |- |-|- |-|
        

|5.Adım|2|6|16|18|22|27|     
|------|- |- |- |-|- |-|


## 2 ) Big-O gösterimini yazınız.

- O(n^2)
## 3 ) Time Complexity: 
### Average case: Aradığımız sayının ortada olması,
- Worst case ile best casein ortalamasını aldığımızda n^2 olarak buluruz. O(n^2)
### Worst case: Aradığımız sayının sonda olması, 
- Tam ters verilmiş dizi, bu durumda dizinin her bir elemanı bir gerisindekinden küçük olacaktır. Yani n+(n-1)+(n-2)+...+1+0=[n*(n-1)]/2 = [n^2-n]/2 kere dolaşacaktır.Burada çarpılan ve çıkarılan değerin önemi küçük olduğundan üssü en büyük sayıdan : O(n^2) gelir.
### Best case: Aradığımız sayının dizinin en başında olması.
- Tam sıralı dizi, n tane sayinin üzerinden birer defa geçer ve hiç birini geriye doğru ilerletme gereği olmadığı için bu tek geçişle kalır. Yani n
## 4 ) Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.
- 18 sayısı, dizi sıralı bir hale geldiğinde tam orta konuma düşmektedir. Bu nedenle Average case kapsamına girer.
---
---
## [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

|1.Adım|2'|3|5|8|7'|9|4|15|6|     
|------|- |- |- |-|- |- |- |- |-|

|2.Adım|2|3'|5|8|7|9|4|15|6|     
|------|-|-|-|-|-|-|-|-|-|

|3.Adım|2|3|4'|8|7|9|5'|15|6|     
|------|-|-|-|-|-|-|-|-|-|

|4.Adım|2|3|4|5'|7|9|8'|15|6|     
|------|-|-|-|-|-|-|-|-|-|
---
---
[Patika.dev](www.patika.dev) profilime ***[buradan](https://app.patika.dev/ebruzdil)*** ulaşabilirsiniz.