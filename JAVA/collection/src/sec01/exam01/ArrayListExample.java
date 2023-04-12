package sec01.exam01;

import sec01.exam02.Board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2,"Database");
        list.add("iBATIS");

        int size = list.size();
        System.out.println("size =" + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("skill = " + skill);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println("str = " + str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("iBATIS");

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println("str = " + str);
        }
    }
}


