package sec02.exam01;

import java.io.*;

public class CharacterConvertStringExample {
    public static void main(String[] args) throws Exception {
        write("문자변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);
    }

    public static void write(String str) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/codes/Java/stream/test1.text");
        Writer writer = new OutputStreamWriter(fos);
        writer.write(str);
        writer.flush();
        writer.close();
    }

    public static String read() throws Exception{
        FileInputStream fis = new FileInputStream("C:/codes/Java/stream/test1.text");
        Reader reader = new InputStreamReader(fis);
        char[] buffer = new char[100];
        int readCharNum = reader.read(buffer);
        reader.close();
        String data = new String(buffer,0,readCharNum);
        return data;
    }
}
