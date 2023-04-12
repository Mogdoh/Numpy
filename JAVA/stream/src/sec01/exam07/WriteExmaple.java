package sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExmaple {
    public static void main(String[] args) throws Exception{
        Writer writer= new FileWriter("C:/codes/Java/stream/test7.db");

        char a ='A';
        char b ='B';
        char c ='C';

        writer.write(a);
        writer.write(b);
        writer.write(c);

        writer.flush();
        writer.close();
    }
}
