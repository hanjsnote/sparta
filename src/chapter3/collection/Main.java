package chapter3.collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //배열의 한계
        //선언과 동시에 길이를 설정 필요
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        //배열의 정적인 특징의 한계
//        numbers[3] = 40;

        //컬렉션
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // ArrayList 활용
        ArrayList<String> names = new ArrayList<>();

        //데이터 추가
        names.add("Spartan");
        names.add("Steve");
        names.add("Isac");
        names.add("1");
        names.add("2");

        //ArrayList는 순서 보장
        System.out.println(names);

        //중복 데이터 허용
        names.add("Spartan");
        System.out.println("names: " + names);

        //데이터 단건 조회
        String name1 = names.get(0);
        System.out.println("name1 = " + name1);

        //데이터 삭제
        names.remove("Steve");
        System.out.println("names = " + names);


        //HashSet 사용 방법
        HashSet<String> uniqueNames = new HashSet<>();

        //데이터 추가
        uniqueNames.add("Spartan");
        uniqueNames.add("Steve");
        uniqueNames.add("Isac");
        uniqueNames.add("1");
        uniqueNames.add("2");

        //순서 보장 안함
        System.out.println("uniqueNames = " + uniqueNames);
        //get() 활용불가
//        uniqueNames.get();
        //중복 데이터 불가
        uniqueNames.add("Spartan");
        System.out.println("uniqueName = " + uniqueNames);
        //데이터 제거
        uniqueNames.remove("Spartan");
        System.out.println("uniqueNames = " + uniqueNames);

            //HashMap 활용
            //<키(""), 값(0)> -> 저장
            HashMap<String, Integer> memberMap = new HashMap<>();

            //데이터 추가
            memberMap.put("Steve", 16);
            memberMap.put("Spartan", 35);
            memberMap.put("Isac", 23);
            memberMap.put("John", 30);
            memberMap.put("Alice", 6);

            //순서 보장 X
            System.out.println("memberMap = " + memberMap);

            //키 중복 불가: 값이 덮어쓰기 발생
            memberMap.put("Alice", 5);
            System.out.println("membermap = " + memberMap);

            //단건 조회
            Integer spartanNum = memberMap.get("Spartan");
            System.out.println("spartanNum = " + spartanNum);

            //삭제
            memberMap.remove("Spartan");
            System.out.println("memberMap = " + memberMap);

            //키 확인
            Set<String> keySet = memberMap.keySet();    //HashMap에서 키는 중복되면 안된다 즉 Map의 key는 항상 유일해야 하므로 자연스럽게 자바에서는 Set 자료구조로 제공된다
            System.out.println("keySet = " + keySet);

            //값 확인
            Collection<Integer> values = memberMap.values(); //Map의 값(value)은 중복될 수도 있고 순서도 없다 그래서 특별히 Set나 List가 아닌 상위 타입인 Collection으로 반환한다.
            System.out.println("values = " + values);

    }

}
