package Array.ComprehensiveTest;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五","小六","小七","小八");
        //第一种点名方法
        /*
        Random r=new Random();
        int index=r.nextInt(list.size());
        System.out.println(list.get(index));
         */
        //第二种点名方法
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
