package IO.OUT;

import java.io.*;

public class Test4 {
    public static void main(String[] args) throws IOException {
         FileWriter fw =new FileWriter("D:JAVA\\aaa\\b.txt",true);
        FileReader fr=new FileReader("D:JAVA\\aaa\\b.txt");

            fw.write("小试一手");

        for (int i = 0; i < 4; i++) {
            fw.write("看看效果");
        }
        int b;
        while((b= fr.read())!=-1){
            System.out.println((char) b);
        }
        fr.close();
        fw.close();
    }
}
