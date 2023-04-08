package Array.ComprehensiveTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,0,0,0,0);//用1和0代表男女概率
        ArrayList<String> blist=new ArrayList<>();
        Collections.addAll(blist,"张三","李四","王五","小六","小七","小八");//创建男生集合，并添加元素
        ArrayList glist=new ArrayList();
        Collections.addAll(glist,"小花","小丽","小美","小舞");
        Random r=new Random();
        int index=r.nextInt(list.size());
        if(list.get(index)==1){
            //当为1时点名男生
            Collections.shuffle(blist);
            System.out.println(blist.get(0));
        }
        else{
            //当为0时点名女生
            Collections.shuffle(glist);
            System.out.println(glist.get(0));
        }
    }
}
