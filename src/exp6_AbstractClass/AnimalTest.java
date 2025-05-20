package exp6_AbstractClass;

// 1. 抽象类Animal
abstract class Animal {
    public abstract void walk();  // 抽象方法
}

// 2. 接口Flyable
interface Flyable {
    void fly();
}

// 3. Bird类继承Animal并实现Flyable
class Bird extends Animal implements Flyable {
    @Override
    public void walk() {
        System.out.println("小鸟在地上蹦蹦跳跳");
    }
    
    @Override
    public void fly() {
        System.out.println("小鸟在天空中翱翔");
    }
}

// 测试类
public class AnimalTest {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
    }
}