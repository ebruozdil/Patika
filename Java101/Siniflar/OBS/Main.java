package Siniflar.OBS;

public class Main {
    public static void main(String[] args) {
        Course matematik = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        matematik.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        matematik.printTeacherInfo();
        Student s1 = new Student("İnek Şaban", 4, "14015", matematik, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "25464", matematik, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "22657", matematik, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();   
    }
}
