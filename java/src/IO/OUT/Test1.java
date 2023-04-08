package IO.OUT;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:JAVA\\aaa\\a.txt");//当a.txt不存在时创建a文本文件并写入a
        fos.write(97);
        fos.close();
    }
}
