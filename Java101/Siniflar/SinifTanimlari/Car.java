package Siniflar.SinifTanimlari;

public class Car {
     //nitelikler
     String type;
     String model;
     String color;
     int speed;
     int speedLimit=180;

    // Constructor (Kurucu) Metot
    //Kurucu metotların isimleri Sınıf ismiyle aynı olmak zorundadır.
     Car (String type, String model, String color){
        this.type=type;
        this.model=model;
        this.color=color;
        this.speed=0; //Varsayılan değeri constructor içinde tanımlamak daha doğru olur.
     }
     Car(){

     }

     //davranışlar
     void increaseSpeed(int increment){
         if((this.speed+increment) < this.speedLimit ){
             this.speed+= increment;
         }else{System.out.println(model+" ile Hız sınırını aştınız! Hız limiti: "+speedLimit);}
     }

     void decreaseSpeed(int decrease){
         if(this.speed>0){
             this.speed -= decrease;
         }
     }

     void printSpeed(){
         System.out.println(model+" Hızınız : "+ speed);
     }

     void printInfo() {
        System.out.println("========info========");
        System.out.println("Model  : " + this.model);
        System.out.println("Color  : " + this.color);
        System.out.println("Type  : " + this.type);
        System.out.println("Speed  : " + this.speed);
    }
}
