package Siniflar.SinifTanimlari;

public class Main {
    public static void main(String[] args) {
    Car audi = new Car("Sports","Audi","red");
 /*   audi.model= "Audi ";
    audi.type= "sport";
    audi.speed=10;
    audi.increaseSpeed(20);
    audi.decreaseSpeed(10);*/
    audi.increaseSpeed(20);
    audi.printSpeed(); 
    audi.printInfo();
    
    System.out.println("---");

    Car bmw = new Car("Sports" , "BMW" , "blue");
    // bmw.model= "BMW";
    // bmw.speed= 20;
    bmw.increaseSpeed(30);
    bmw.increaseSpeed(40);
    bmw.decreaseSpeed(20);
    bmw.increaseSpeed(150);
    bmw.printInfo();

    System.out.println("---");
    
    Car mercedes= new Car();
    mercedes.model= "Mercedes";
    mercedes.speed=30;
    mercedes.increaseSpeed(20);
    mercedes.printInfo();
}
}
