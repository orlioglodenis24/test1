package hw11;

public class Pet {
    public static class Main {
        public static void main(String[] args) {
            Cat cat = new Cat("");
            Dog dog = new Dog("");

            cat.print();
            dog.print();
        }
    }

    public String voice;

    public void voice() {};
    public void print() {};
    public Pet(String voice) {

        this.voice = voice;
    }
}

class Cat extends Pet {

    public Cat(String voice) {
        super(voice);
    }

    @Override
    public void print() {
        System.out.println("Мяу Мяу");
    }

}
class Dog extends Pet {

    public Dog(String voice) {
        super(voice);
    }
    @Override
    public void print() {
        System.out.println("гав гав");
    }
}
