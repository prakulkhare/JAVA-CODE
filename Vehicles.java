import java.util.*;
class Vehicle{
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayInfo(){
        System.out.println("Make:"+make+",Model:"+model+",Year:"+year);
    }
}
class Car extends Vehicle{
    int numberofdoors;
    boolean isAutomatic;
    Car(String make, String model, int year,int numberofdoors,boolean isAutomatic){
        super(make,model,year);
        this.numberofdoors = numberofdoors;
        this.isAutomatic = isAutomatic;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Doors:"+numberofdoors+",Automatic:"+isAutomatic);
    }
}
class ElectricCar extends Car{
    double batteryCapacity;
    int range;
ElectricCar(String make, String model, int year,int numberofdoors,boolean isAutomatic,double batteryCapacity,int range){
    super(make,model,year,numberofdoors,isAutomatic);
    this.batteryCapacity = batteryCapacity;
    this.range = range;
}
    void displayInfo(){
        super.displayInfo();
        System.out.println("BatteryCapacity:"+batteryCapacity+",Range:"+range);
    }
} 
class Bike extends Vehicle{
    String type;
    boolean hasCarrier;
    Bike(String make, String model, int year, String type, boolean hasCarrier){
        super(make,model,year);
        this.type = type;
        this.hasCarrier = hasCarrier;
    }
    
    void displayInfo(){
        super.displayInfo();
    System.out.println("Type:"+type+",Carrier:"+hasCarrier);
    }
}

public class Vehicles{
    public static void main(String[] args){
        Car c = new Car("Audi","5002d",2016,4,true);
        Bike b = new Bike("Yamaha","R15",2017,"Sports",false);
        c.displayInfo();
        b.displayInfo();

        Vehicle[] Stock = {c,b};
        for(Vehicle i : Stock){
            i.displayInfo();
        }

    }
}
