package hw11;
/*
Создайте иерархию классов, включающую базовый класс Vehicle и
производные классы Car и Motorcycle. Класс Vehicle должен содержать
метод drive(), который выводит сообщение "Vehicle is being driven".
Класс Car должен переопределять метод drive(), чтобы выводить сообщение
"Car is being driven". Класс Motorcycle также должен переопределять метод
drive(),чтобы выводить сообщение "Motorcycle is being driven"
 */

public class Vehicle {

    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.drive();
      Cart car =new Cart();
      car.drive();
      Motorcycle motorcycle =new Motorcycle();
      motorcycle.drive();
    }

    public void drive(){
        System.out.println("Vehicle is being driven");
    }
}
class Cart extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Car is being driven");
        super.drive();
    }
}
class Motorcycle extends  Vehicle{
    @Override
    public void drive() {
        System.out.println("Motorcycle is being driven");
        super.drive();
    }
}
