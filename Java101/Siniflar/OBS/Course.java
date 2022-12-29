package Siniflar.OBS;

public class Course {

    Teacher courseTeacher;
    String name;
    String code;
    String prefix;   
    int note;
    int verbalNote;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix= prefix ; 
        int note = 0;
        int verbalNote=0;

    }

    public void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.courseTeacher=teacher;
            System.out.println("İşlem başarılı");
        }else{
            System.out.println(teacher.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacherInfo(){
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    
}
