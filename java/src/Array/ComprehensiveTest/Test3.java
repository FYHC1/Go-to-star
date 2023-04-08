package Array.ComprehensiveTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五","小六","小七","小八","小花","小丽","小美","小舞");
        for (int j = 0; j < 4; j++) {
            int count=list.size();
            for (int i = 0; i < count; i++) {
                Random r=new Random();
                int index=r.nextInt(list.size());
                String name=list.remove(index);
                list1.add(name);
                System.out.println(name);
            }
            list.addAll(list1);
            list1.clear();
        }
    }
}
