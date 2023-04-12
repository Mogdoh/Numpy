package sec01.exam05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // map 컬랙션 생성
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("홍길동", 30);
        map.put("이몽룡", 26);
        map.put("성춘향", 21);
        map.put("이방자", 21);
        System.out.println("총 엔트리 수:" + map.size());

        //객체 찾기
        System.out.println("\t홍길동 : "+ map.get("홍길동"));  // 이름(키)으로 점수를 검색
        System.out.println();

        //객체 루핑
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ":" + value);
        }
        System.out.println();

        //객체 삭제
        map.remove("홍길동");
        System.out.println("총 엔트리 수:" + map.size());

        //객체를 하나씩 루핑
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String , Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String , Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ":" + value);
        }
        System.out.println();

        /*
        * in Python:
        * for var in iterable:
        * */
        // 위의 함수와 결과값이 똑같다
        for (Map.Entry<String , Integer> entry:entrySet
             ) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ":" + value);
        }
        System.out.println();


        //객체 전체 삭제
        map.clear();
        System.out.println("총 엔트리 수: " + map.size());
    }
}
