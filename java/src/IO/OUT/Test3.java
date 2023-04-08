package IO.OUT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:JAVA\\aaa\\skd2.png",true);
        FileInputStream fis=new FileInputStream("D:JAVA\\aaa\\3903.png");
        long start=System.currentTimeMillis();
        int len;
        byte[] str=new byte[1024];
        while((len=fis.read(str))!=-1){
            fos.write(str,0,len);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        fis.close();
        fos.close();
    }
}
