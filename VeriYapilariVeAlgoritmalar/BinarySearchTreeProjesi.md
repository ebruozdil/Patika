# Proje 3
## [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

Bir düğüm her iki tarafa da referans verebiliyor. Sağ ve sol olarak. Sağ tarafında kendinden büyük elemanlar, sol tarafında ise kendinden küçük elemanlar bulunacak.

Root olarak 7 sayısını alıyoruz. Sonraki sayı kendinden küçükse soluna, büyükse sağına yazıyoruz.

```
            7
          /              5 < 7 olduğundan soluna yazıyoruz.
        5
```
          7
         /               1 < 7 olduğundan soluna yazmalıyız.
        5                Ayrıca 1<5 olduğu için 5 in de soluna yazıyoruz.
       / 
      1
```
           7
         /  \            8 > 7 olduğundan sağına yazmalıyız.
        5    8          
       / 
      1
```                        
           7             3 sayısını yerleştirmek için;
         /  \            3 < 7 olduğundan 7 nin soluna, 
        5    8           3<5 olduğundan 5 in sol tarafına,
       /               
      1                  3>1 olduğundan 1 in sağ tarafına yazıyoruz.
        \                   
         3              
```
          7             [7', 5', 1', 8', 3', 6, 0, 9, 4, 2]
         / \           
        5    8           6 sayısı için; 6 < 7 olduğundan 7 nin soluna,
       / \               6 > 5 olduğu için 5 in sağına yerleştiriyoruz.
      1   6     
        \
         3
```
           7            [7', 5', 1', 8', 3', 6', 0, 9, 4, 2]
         /  \           
        5    8          0 sayısı için; 0 < 7 olduğundan 7 nin soluna,
       / \              0 < 5 olduğu için 5 in soluna ve 
      1   6             0 < 1 olduğu için 1 in soluna yerleştiriyoruz.
     / \
    0   3
```
           7            [7', 5', 1', 8', 3', 6', 0', 9, 4, 2]
          / \           
         5    8         9 > 7 olduğundan 7 nin sağına,
        / \    \        9 > 8 olduğundan 8 in sağına yazıyoruz.
       1   6    9          
      /  \
     0    3
```
           7            [7', 5', 1', 8', 3', 6', 0', 9', 4, 2]
          / \           
         5    8         4 sayısı için; 4 < 7 olduğundan 7 nin soluna,
        / \    \        4 < 5 olduğu için 5 in soluna,
       1   6    9       4 > 1 olduğu için 1 in sağına,
      /  \              4 > 3 olduğu için 3 ün sağına yerleştiriyoruz.
     0    3
           \
            4
```
          7             [7', 5', 1', 8', 3', 6', 0', 9', 4', 2]
         / \           
        5   8           2 < 7 olduğu için 7 nin soluna,
       / \   \          2 < 5 olduğu için 5 in soluna,
      1   6   9         2 > 1 olduğundan 1 in sağına,
     / \                2 < 3 olduğundan 3 ün soluna yerleştiriyoruz.
    0   3
       / \              Ve dizideki tüm sayıları yerleştirmiş oluyoruz.
      2   4             Bu yöntem sayesinde dizideki tğm sayıları taramadan işlem yapabiliriz.
```
(Dizi içerisinde sayıların üzerine koyduğum (') işaretini tabloya yerleştirdiğimiz sayıları belli etmek için kullandım.)

---
---
[Patika.dev](www.patika.dev) profilime ***[buradan](https://app.patika.dev/ebruzdil)*** ulaşabilirsiniz.