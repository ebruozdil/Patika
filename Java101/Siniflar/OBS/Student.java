package Siniflar.OBS;

public class Student {
    String name;
    String studentNo;    
    int classes;
    Course matematik ;
    Course fizik;
    Course kimya;
    double avarage; //ortalaması
    boolean isPass; //sınıfı geçti mi geçmedi mi

    Student(String name, int classes, String studentNo,  Course matematik, Course fizik, Course kimya){
        this.name=name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.matematik = matematik;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int matematik, int fizik, int kimya) {
        if (matematik >= 0 && matematik <= 100) {
            this.matematik.note = matematik;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }
    
    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.matematik.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }


    public void isPass() {
        if (this.matematik.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.matematik.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}