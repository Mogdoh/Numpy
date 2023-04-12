package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("C:/codes/Java/stream/test8.db");

        char[] array = {'A', 'B', 'C'};

        writer.write(array);

        writer.flush();
        writer.close();
    }
}
