package Lambda.quote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        Collections.addAll(list,"张三丰,21","李四,22","王五,23","张合,24","小七,25","小八,26");
        Student[] arr=list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
