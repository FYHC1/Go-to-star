package Array.ArrayListDome.Sort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> list =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            User u=new User();
            System.out.println("请输入信息");
            u.setId(sc.next());
            u.setUsename(sc.next());
            u.setPassword(sc.next());
            list.add(u);
        }
       int flag= contains(list,"h1");
        System.out.println(flag);
    }
    public static int contains(ArrayList<User> list, String id){
        for (int i = 0; i < 3; i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)) {
                return i;
            }
        }
        return -1;
    }

}