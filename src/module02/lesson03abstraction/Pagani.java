package module02.lesson03abstraction;

public class Pagani extends Car implements Flying {
    public Pagani(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started!");
    }

    @Override
    public void fly() {
        System.out.println("Flying..");
    }
}
