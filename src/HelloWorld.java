// Java程序必须包含在类中
public class HelloWorld {  // 类名必须与文件名完全一致（区分大小写）
    
    // 主方法签名必须严格如下
    public static void main(String[] args) {
        // 输出语句对比Python的print()
        System.out.println("Hello, World!");  // 注意分号结尾
        
        // 添加参数使用示例（对比Python的sys.argv）
        if (args.length > 0) {
            System.out.println("收到参数: " + args[0]);
        }
    }
}