abstract class Vehicle{
    String brand;
    String model;
    int speed;
    Vehicle( String brand,String model,int speed){
        this.brand=brand;
        this.model=model;
        this.speed=speed;
       
    }
    abstract void move();
    void displayInfo(){
        System.out.println("brand"+brand);
        System.out.println("model"+model);
        System.out.println("speed"+speed);
    }
}
class Car extends Vehicle{
    int numberOfDoors;
        Car(String brand,String model,int speed,int numberOfDoors){
            super(brand,model,speed);
            this.numberOfDoors=numberOfDoors;
            System.out.println("numberOfDoors"+numberOfDoors);
        }
        void move(){
            System.out.println("If it's a Car, it drives");
        }

}
class Boat extends Vehicle{
    String hullType;
        Boat(String brand,String model,int speed,String hullType){
            super(brand,model,speed);
            this.hullType=hullType;
            System.out.println("hullType"+hullType);
        }
        void move(){
            System.out.println("If it's a Boat, it sails");
        }

}

class AbstractVehicle{
    public static void main(String[] args){
        Car c=new Car("bmw","competition",200,4);
        c.displayInfo();
        c.move();
        Boat b=new Boat("bmw jetski","competition",200,"carbon Fibre");
        b.displayInfo();
        b.move();
    }
}