package exp5_class_object;

import javax.swing.plaf.TreeUI;

class Student{
    private int id;
    private String name;
    private boolean isMale;
    private String birth;

    public Student(){  
        //默认构造方法 相当于python的__init__方法  
        // 为什么是public？ 因为我们希望用户可以调用这个方法  
        // 什么是void？ 因为我们不需要返回值  
        // 为什么是Student？ 因为我们希望返回的是一个Student对象
    }

    // use Eclipse to generate constructor, getter and setter
    // 完全构造方法
    public Student(int id, String name, boolean isMale, String birth) {
        this.id = id;
        this.name = name;
        this.isMale = isMale;
        this.birth = birth;
    }
    // 部分/构造方法  为什么是部分？ 因为我们只需要传入部分参数  例如只传入id和name
    // Getter & Setter (Eclipse可自动生成)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean isMale() {  
        return isMale;
    }
    public void setIsMale(boolean isMale) {  
        this.isMale = isMale;
    }
    public String getBirth() {   
        return birth;
    }
    public void setBirth(String birth) {  
        this.birth = birth;
    }   

    // ...其他getter/setter...
    // toString()方法
    @Override  // 重写toString()方法  为什么是@Override？ 因为我们希望返回的是一个字符串
    public String toString(){
        return "Student: [id=" + id + ", name=" + name + ", isMale=" + isMale + ", birth=" + birth + "]";
    }

}

class Complex{
    private double real;
    private double image;

    public Complex(double real, double image){
        this.real = real;
        this.image = image;
    }
    public double getreal(){
        return real;
    }
    public void setreal(double real){
        this.real = real;
    }
    public double getimage(){
        return image;
    }
    public void setimage(double image){
        this.image = image; 
    }
    @Override
    public String toString(){
        return real + (image >= 0 ? "+" : "") + image + "i";
    }
    public void printInfo(){
        System.out.println(this.toString());  
    }
    public Complex add(Complex another){
        return new Complex(
            this.real + another.real,
            this.image + another.image
        );
    }
public boolean equals(Complex another){
    if (this.real == another.real && this.image == another.image){
        return true;
    }
    return false;
    }
}

public class test {
    public static void main(String[] args){
        Student s1 = new Student(1, "Tom", true, "1990-01-01"); 
        Student s2 = new Student(28, "Grapesoda", true, "2004-05-20");

        // what bout tryin test the default constructor?
        Student s3 = new Student();
        s3.setId(30);
        s3.setName("IAA");
        s3.setIsMale(false);
        s3.setBirth("2077-5-20");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, -2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.add(c2));  // 3+4i + 1-2i = 4+2i

        System.out.println(c1.equals(c2));  

    }
}