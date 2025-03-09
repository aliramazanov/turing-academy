package module02.lesson03abstraction;

public class Porsche extends Car {

    public Porsche(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine starts");
    }
}
