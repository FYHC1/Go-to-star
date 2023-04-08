package Exception;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        GirlFriend gf=new GirlFriend();
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("输入你女朋友的名字");
            String name= sc.nextLine();
            gf.setName(name);
            System.out.println("输入你女朋友的年龄");
            int age=sc.nextInt();
            gf.setAge(age);
        } catch(NumberFormatException e){
            System.out.println("xvx");
        }
    }
}
