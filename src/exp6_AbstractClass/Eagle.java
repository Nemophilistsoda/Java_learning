package exp6_AbstractClass;

public class Eagle extends Bird{
    @Override
    public void fly(){
        System.out.println("老鹰振翅飞行");
    }
    @Override
    public void predation(){
        System.out.println("捕食小型动物");
    }
}
