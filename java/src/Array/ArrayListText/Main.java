package Array.ArrayListText;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
           ArrayList<student> list = new ArrayList<>();
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请输入你的选择");
            Scanner sc = new Scanner(System.in);
            String option = sc.next();
            switch (option) {
                case "1":
                    addstu(list);
                    break;
                case "2":
                    deletestu(list);
                    break;
                case "3":
                    removestu(list);
                    break;
                case "4":
                    referstu(list);
                    break;
                case "5":
                    System.exit(0);
                defanlt:
                System.out.println("没有这个选项");
                break;
            }


        }

    }


    public static void addstu(ArrayList<student> list) {
        student s=new student();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入id");
        while (true) {
            String id=sc.next();
            boolean flag=contains(list,id);
            System.out.println(flag);
            if(flag){
                System.out.println("此id已存在请重新输入");
            }else{
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入姓名");
        String name=sc.next();
        s.setName(name);
        System.out.println("请输入年龄");
        String age=sc.next();
        s.setAge(age);
        System.out.println("请输入地址");
        String address=sc.next();
        s.setAddress(address);
        list.add(s);
    }

    public static void deletestu(ArrayList<student> list) {
    }

    public static void removestu(ArrayList<student> list){

    }
    public static void referstu(ArrayList<student> list){
        if(list.size()==0){
            System.out.println("暂无数据，请输入数据后查询");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            student s=list.get(i);
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }
    }


    public static boolean contains(ArrayList<student> list,String id){
        return getindex(list,id)>=0;
    }
    public static int getindex(ArrayList<student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            student stu=list.get(i);
            String sid=stu.getId();
            if(sid.equals(id)){
                return i;
            }
        }
        return -1;
    }

}
