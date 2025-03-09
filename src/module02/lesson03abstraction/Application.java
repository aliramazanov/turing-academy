package module02.lesson03abstraction;

public class Application {

    public static void main(String[] args) {
        Porsche porsche = new Porsche("911");
        porsche.startEngine();

        Pagani pagani = new Pagani("Zonda");
        pagani.fly();
    }
}

// Abstract Class vs Interface