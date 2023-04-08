package IO.OUT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException, IOException {
        FileOutputStream fos = new FileOutputStream("D:JAVA\\aaa\\wc2.mp4", true);
        FileInputStream fis = new FileInputStream("D:JAVA\\aaa\\wc1.mp4");
       int b;
        byte[] str = new byte[1024];
        while ((b = fis.read(str)) != -1) {
            fos.write(str,0,b);
           // System.out.println();
        }

        fis.close();
        fos.close();
    }
}
