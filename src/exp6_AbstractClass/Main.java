package exp6_AbstractClass;

/**
 * 定义一个手机接口，包含手机的基本操作。
 */
interface MobilePhone {
    // 打开手机的方法
    void on();
    // 关闭手机的方法
    void off();
    // 拨打电话的方法
    void makeCall();
    // 发送短信的方法
    void sendMessage();
}

/**
 * 华为手机类，实现了 MobilePhone 接口。
 */
class HuaWei implements MobilePhone {
    /**
     * 打开华为手机，输出开机信息。
     */
    @Override
    public void on() {
        System.out.println("HuaWei is on");
    }

    /**
     * 关闭华为手机，输出关机信息。
     */
    @Override
    public void off() {
        System.out.println("HuaWei is off");
    }

    /**
     * 实现 MobilePhone 接口中定义的 makeCall 方法，输出拨打电话信息。
     */
    @Override
    public void makeCall() {
        System.out.println("HuaWei is making a call");
    }

    /**
     * 实现 MobilePhone 接口中定义的 sendMessage 方法，输出发送短信信息。
     */
    @Override
    public void sendMessage() {
        System.out.println("HuaWei is sending a message");
    }

    /**
     * 给华为手机充电，输出充电信息。
     */
    public void charge() {
        System.out.println("HuaWei is charging");
    }
}

/**
 * 主类，用于测试手机功能。
 */
public class Main {
    /**
     * 程序入口点，创建华为手机对象并测试其功能。
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 创建一个华为手机对象，并将其赋值给 MobilePhone 接口类型的变量
        MobilePhone hw = new HuaWei();
        hw.on();
        hw.off();
        // 由于 hw 是 MobilePhone 接口类型，无法直接调用 charge 方法，需要强制类型转换
        ((HuaWei) hw).charge();
    }
}
