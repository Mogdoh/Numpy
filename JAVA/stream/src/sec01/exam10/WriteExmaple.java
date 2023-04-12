package sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExmaple {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("C:/codes/Java/stream/test10.db");

        String str = "ABC";

        writer.write(str);
        writer.flush();
        writer.close();
    }
}
