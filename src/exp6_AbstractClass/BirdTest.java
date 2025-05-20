package exp6_AbstractClass;

abstract class Bird {
    public abstract void breath();
}
abstract class Airplane {
    public abstract void refuel();
}

interface Flyable {
    void fly();
}

class Fighter extends Airplane implements Flyable {
    @Override
    public void refuel() {
        System.out.println("the fighter refuels in the air for 30 minutes");
    }
    
    @Override
    public void fly() {
        System.out.println("Fighter flying");
    }
}

class Eagle extends Bird implements Flyable {
    @Override
    public void breath() {
        System.out.println("Eagle breathing");
    }
    
    @Override
    public void fly() {
        System.out.println("Eagle flying");
    }
}

// class Penguin extends Bird {
//     @Override
//     public void breath() {
//         System.out.println("Penguin breathing");
//     }

// }


public class BirdTest {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.breath();
        Fighter fighter = new Fighter();
        fighter.fly();
        fighter.refuel();
    }
}