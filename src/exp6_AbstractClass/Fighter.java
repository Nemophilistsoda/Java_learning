package exp6_AbstractClass;

public class Fighter extends Airplane{
    @Override
    public void fly(){
        System.out.println("战斗机超音速飞行");
    }
    @Override
    public void refuel(){
        System.out.println("空中加油3000L");
    }
}
