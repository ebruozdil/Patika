package Siniflar.OBS;

public class Student {
    String name;
    String studentNo;    
    int classes;
    Course matematik ;
    Course fizik;
    Course kimya;
    double avarage; //ortalaması
    double fizikAvarage;
    double kimyaAvarage;
    double matematikAvarege;
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
        if ((matematik >= 0 && matematik <= 100)&& (fizik >= 0 && fizik <= 100) && (kimya >= 0 && kimya <= 100)){
            this.matematik.note = matematik;
            this.fizik.note = fizik;
            this.kimya.note = kimya;
        }
    }
    public void addBulkVerbalNote(int verbalMatematik, int verbalFizik, int verbalKimya){
        if(verbalMatematik >=0 && verbalMatematik <=100){
            this.matematik.verbalNote = verbalMatematik;
        }
        if(verbalFizik >=0 && verbalFizik <=100){
            this.fizik.verbalNote = verbalFizik;
        }
        if(verbalKimya >=0 && verbalKimya <=100){
            this.kimya.verbalNote = verbalKimya;
        }
    }
    public void calcAvarage() {
        this.fizikAvarage= (this.fizik.note*80)/100 +(this.fizik.verbalNote*20) /100;
        this.kimyaAvarage= (this.kimya.note*80)/100+(this.kimya.verbalNote*20)/100;
        this.matematikAvarege=(this.matematik.note*80)/100+(this.fizik.verbalNote*20)/100;
        this.avarage = (fizikAvarage+kimyaAvarage+matematikAvarege)/ 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }


    public void isPass() {
        if (this.matematik.note == 0 || this.matematik.verbalNote == 0 ||this.fizik.note == 0 || this.fizik.verbalNote == 0|| this.kimya.note == 0||this.kimya.verbalNote == 0) {
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
        System.out.println("Matematik Notu :" + this.matematik.note +    "  | Sözlü Notu : "+this.matematik.verbalNote+ "  | Matematik Ortalama : "+ matematikAvarege);
        System.out.println("Fizik Notu :" + this.fizik.note +        "  | Sözlü Notu : "+this.fizik.verbalNote+"  | Fizik Ortalama : "+ fizikAvarage);
        System.out.println("Kimya Notu :" + this.kimya.note +        "  | Sözlü Notu : "+this.kimya.verbalNote+"  | Kimya Ortalama : "+kimyaAvarage);
    }
}











/*public static void CourseAdd() {
        System.out.println("Course Additional Screen:");
        System.out.println("Select the course you want to add:");
        System.out.println("1-History\n2-Math\n3-Chemical\n4-Biological\n5-Language");
        int input = scanner.nextInt();
      
            switch (input) {
                case 1:
                    if (!(stdCourses.contains("History"))) {
                        stdCourses.add("History");
                    } else {
                        System.out.println("You've already taken the history lesson:");
                        CourseAdd();
                    }
                    break;
                case 2:
                    if (!(stdCourses.contains("Math"))) {
                        stdCourses.add("Math");
                    } else {
                        System.out.println("You've already taken the Math lesson:");
                        CourseAdd();
                    }
                    break;
                case 3:
                    if (!(stdCourses.contains("Chemical"))) {
                        stdCourses.add("Chemical");
                    } else {
                        System.out.println("You've already taken the Chemical lesson:");
                        CourseAdd();
                    }
                    break;
                case 4:
                    if (!(stdCourses.contains("Biological"))) {
                        stdCourses.add("Biological");
                        System.out.println("Biological Added.");
                    
                    } else {
                        System.out.println("You've already taken the Biological lesson:");
                        CourseAdd();
                    }
                    break;
                case 5:
                    if (!(stdCourses.contains("Language"))){
                        stdCourses.add("Language");
                    } else {
                        System.out.println("You've already taken the Language lesson:");
                        CourseAdd();
                    }
                    break;
                default:
                    System.out.println("Enter a Valid Input");
                    CourseAdd();
        }
    }
}*/