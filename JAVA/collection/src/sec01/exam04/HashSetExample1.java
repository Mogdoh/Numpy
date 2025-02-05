package sec01.exam04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("JAVA");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java"); // 중복
        set.add("iBATIS");

        int size = set.size();
        System.out.println("size = " + size);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("size = " + set.size());

        for (String element : set) {
            System.out.println("\t" + element);
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.println("비어있어요");
        }
    }
}
