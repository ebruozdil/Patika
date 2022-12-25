package Siniflar.OBS;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut hoca", "TRH", "05531234567");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "05564");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "101111");
        
        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "101", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100, 50, 50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "444", "4", tarih, fizik, biyoloji);
        s2.addBulkExamNote(50, 30, 70);
        s2.isPass();
    }
}
