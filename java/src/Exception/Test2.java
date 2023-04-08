package Exception;

public class Test2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int a= 0;
        try {
            a= arr[10];//出现错误时自动创建ArrayIndexOutOfBoundsException的对象

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");

        }//当代码出现异常时，能够继续运行下面的代码
        System.out.println(arr[0]);
    }
}
