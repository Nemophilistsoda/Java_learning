package exp5_class_object;
// import java.lang.Math

class Shape {
    public double calcArea() {  // 计算面积的方法，默认返回0.0
        return 0;  // 子类必须重写这个方法
    }
}

class Square extends Shape {  // 正方形类，继承自Shape
    // 下面这一行是属性字段 相当于python的实例变量
    private float width;  // 正方形的宽度 为什么是private？ 因为我们不希望用户直接访问width，而是通过方法来访问width

    // 下面这一行是构造方法 相当于python的__init__方法
    public Square(int width) {  // 构造方法，初始化宽度  为什么是int？ 因为我们希望用户传入的是整数
        this.width = width;  // 注意this的用法，this.width表示类的成员变量width
    }

    // 下面这一行是方法 相当于python的方法
    public double calcArea() {  // 注意返回类型是double  为什么是double？ 因为我们希望返回的是一个浮点数
        return width * width;  // 计算正方形面积  为什么是width * width？ 因为正方形的面积是宽度的平方
    }
}

class Triangle extends Shape {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double calcArea(){
        float p = (a + b + c) / 2;  // 计算半周长
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));  // 使用海伦公式计算面积
        // 这里需要导入Math类，因为Math类中有sqrt()方法可以计算平方根
        // 如何导入Math类？ 可以使用import java.lang.Math; 或者使用import static java.lang.Math.*;
    }
}

class Circle extends Shape{
    private float r;
    public Circle(float r){
        this.r = r;
    }
    public double calcArea(){
        return Math.PI * r * r;  // 计算圆的面积  为什么是Math.PI？ 因为Math.PI是一个常量，代表圆周率
    }
}

public class class_object {
    public static void main(String[] args){  // 主方法 相当于python的main函数
        // 下面这一行是创建对象 相当于python的实例化
        Shape s1 = new Square(2);
        Shape s2 = new Triangle(3, 4, 5);
        Shape s3 = new Circle(2);

        // 下面这一行是调用方法 相当于python的方法调用
        System.out.println("s1的面积是：" + s1.calcArea());
        System.out.println("s2的面积是：" + s2.calcArea());
        System.out.println("s3的面积是：" + s3.calcArea());
    }
}
