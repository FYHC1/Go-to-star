package Lambda.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Text1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        Collections.addAll(list,"张三丰","李四","王五","张合","小七","小八");
       Stream stream1= list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3);
       Stream stream2= list.stream().filter(s->s.startsWith("小"));
       Stream.concat(stream1,stream2).forEach(s-> System.out.println(s));//合并stream流
    }
}
