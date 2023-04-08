package Exception;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("测试异常");
        System.out.println(2/0);//jvm虚拟机处理方案：输出代码信息，停止往下执行代码
        System.out.println("异常测试");
    }
}
