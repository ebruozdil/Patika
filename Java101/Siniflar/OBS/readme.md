# **Öğrenci Not Sistemi**
### Bu program öğrenciyi, öğretmen bilgilerini ve öğrenci notlarını yönetir.
---
## Detaylar
* Bu repository de ;
    * Main.java sınıfı programın çalıştırıldığı ve öğretmen ve öğrenci hakkındaki bilgilerinin yazdırıldığı sınıftır.
    * Teacher.java sınıfı öğretmenle ilgili niteliklerin ve metodların tanımlandığı sınıftır.
    * Course.java sınıfı kursla ilgili niteliklerin ve metodların tanımlandığı sınıftır.
    * Student.java sınıfı öğrenciyle ilgili niteliklerin ve metodların tanımlandığı sınıftır.
### **Course** Sınıfı Özellikleri :

- Nitelikler : courseTeacher, name, code, prefix, note, verbalNote
- Metotlar : Course() , addTeacher() , printTeacherInfo()

### **Teacher** Sınıfı Özellikleri :

- Nitelikler : name,mpno,branch
- Metotlar : Teacher()

### **Student** Sınıfı Özellikleri :

- Nitelikler : name, studentNo, classes, matematik, fizik, kimya, avarage, fizikAvarage, kimyaAvarage, matematikAvarage, isPass
- Metotlar : Student(), addBulkExamNote(), addBulkVerbalNote(), isChechPass(), isPass(), calcAvarage(), printNote()

## Ödev

Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
## İster ;
```
    public void calcAvarage() {
        this.fizikAvarage= (this.fizik.note*80)/100 +(this.fizik.verbalNote*20) /100;
        this.kimyaAvarage= (this.kimya.note*80)/100+(this.kimya.verbalNote*20)/100;
        this.matematikAvarege=(this.matematik.note*80)/100+(this.fizik.verbalNote*20)/100;
        this.avarage = (fizikAvarage+kimyaAvarage+matematikAvarege)/ 3;
    }
```
## Output:
```
İşlem başarılı
İşlem başarılı
İşlem başarılı
Matematik dersinin Akademisyeni : Mahmut Hoca
=========================
Öğrenci : İnek Şaban
Matematik Notu :50  | Sözlü Notu : 70  | Matematik Ortalama : 51.0 
Fizik Notu :20  | Sözlü Notu : 55  | Fizik Ortalama : 27.0
Kimya Notu :40  | Sözlü Notu : 90  | Kimya Ortalama : 50.0
Ortalama : 42.666666666666664
Sınıfta Kaldı.
=========================
Öğrenci : Güdük Necmi
Matematik Notu :100  | Sözlü Notu : 60  | Matematik Ortalama : 94.0
Fizik Notu :50  | Sözlü Notu : 70  | Fizik Ortalama : 54.0
Kimya Notu :40  | Sözlü Notu : 90  | Kimya Ortalama : 50.0
Ortalama : 66.0
Sınıfı Geçti.
=========================
Öğrenci : Hayta İsmail
Matematik Notu :50  | Sözlü Notu : 40  | Matematik Ortalama : 48.0 
Fizik Notu :20  | Sözlü Notu : 40  | Fizik Ortalama : 24.0
Kimya Notu :40  | Sözlü Notu : 60  | Kimya Ortalama : 44.0
Ortalama : 38.666666666666664
Sınıfta Kaldı.
```
---
---
## Yazar
 *Ebru Özdil*
* GitHub: [Ebru Özdil](https://github.com/ebruozdil)
* LinkedIn: [Ebru Özdil](https://www.linkedin.com/in/ebruozdil/)
---
Bu repository [patika](https://app.patika.dev/ebruzdil) adresindeki kendi projelerim için oluşturulmuştur.

---
Beğendiyseniz yıldız &#11088; vermeyi unutmayın. 😊
