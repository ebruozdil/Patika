package Siniflar.MaasHesaplayici;

public class Employee {
    String name;      //çalışan isim soyisim
    double salary;   //çalışanın maaşı
    int workHours;  //haftalık çalışma saati
    int hireYear;  //işe başlangıç yılı

    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        double tax=0;
        if (salary>1000){
            tax= (salary*3)/100;
            return tax;
        }
        return tax;
    }

    public int bonus(){
        int bonus=0;
        if (workHours>40){
            int extraHours= workHours-40;
            bonus=extraHours*30;
            return bonus;
        }
    return bonus;
    }

    public double raiseSalary(){
        int year = 2021;
        int workYears= year - hireYear;
        double raise=0;
        if(workYears<10){
            raise= (salary*5)/100 ;
            return raise;
        }else if (9< workYears && workYears <20){
            raise= (salary*10)/100 ;
            return raise;
        }else if(19<workYears){
            raise= (salary*15)/100 ;
            return raise;
        }
    return raise;
    }

    public String toString() {
        System.out.println("Adı : "+ name);
        System.out.println("Maaşı : "+salary);
        System.out.println("Çalışma Saati : "+workHours);
        System.out.println("Başlangıç Yılı : "+hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : "+ raiseSalary());
        double newSalary = salary-tax()+bonus();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+newSalary);
        double sumSalary = salary+raiseSalary();
        System.out.println("Toplam Maaş : "+sumSalary);
        return super.toString();
    }
    
}
