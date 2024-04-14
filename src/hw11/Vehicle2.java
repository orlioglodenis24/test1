package hw11;

abstract class Vehicle2 {
    /*
  Создайте абстрактный класс Vehicle с абстрактным методом drive().
  Этот метод будет предназначен для переопределения в производных классах.
  Создайте два производных класса: Car и Motorcycle.
  Оба класса должны реализовывать абстрактный метод drive(),
  выводя сообщения "Car is being driven" и "Motorcycle is being driven"
  соответственно.

В методе main(), создайте массив объектов типа Vehicle, включающий
объекты типа Car и Motorcycle. Затем пройдитесь по массиву, вызывая
 метод drive() для каждого элемента. Используйте полиморфизм для вызова
 правильной
 реализации drive() в зависимости от типа транспортного средства.
     */
    public static void main(String[] args) {
        Vehicle2[] vehicles = {new Car0(), new Motorcycle0()};
        for(Vehicle2 vej:vehicles){
            vej.drive2();
            vej.gas();
            System.out.println();
        }
    }

    abstract void drive2();
    public void gas(){};

}
 class Car0 extends Vehicle2{
   void drive2(){
       System.out.println("Car is being driven");
   };
   public void gas(){
       System.out.println("гассс машина");
   }
}
 class Motorcycle0 extends Vehicle2{
   void drive2(){
        System.out.println("Motorcycle is being driven");
    };
     public void gas(){
         System.out.println("гассс мотоциклик ");
     }
}

