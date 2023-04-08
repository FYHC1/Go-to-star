package Lambda.Stream;

import java.util.ArrayList;
import java.util.Collections;

public class Text2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        Collections.addAll(list,"张三丰","李四","王五","张合","小七","小八");
       // list.stream().limit(2).forEach(s-> System.out.println(s));用limit获取前两个元素
        //list.stream().skip(2).forEach(s-> System.out.println(s));//用skip跳过前两个元素
        //System.out.println(list);

    }
}
