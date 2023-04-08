package File;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args){
        File a=new File("D:JAVA");
        File b=new File("bbb");
        System.out.println( a.exists());
        System.out.println( b.exists());
        File c=new File("a","b");
        c.mkdirs();
        System.out.println(a.exists());
        System.out.println(c.exists());
    }
}
