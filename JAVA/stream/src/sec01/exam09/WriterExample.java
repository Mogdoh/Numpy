package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("C:/codes/Java/stream/test9.db");

        char[] array = {'A', 'B', 'C', 'D', 'E'};
        writer.write(array, 1,3);

        writer.flush();
        writer.close();
    }
}
