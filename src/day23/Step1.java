package day23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Step1 {
    public static void main(String[] args) {

        String[] strArray = new String[3];
        strArray[0] = "유재석";
        strArray[1] = "강호동";
        strArray[2] = "신동엽";
        //strArray[3] = "서장훈";

        System.out.println();
        //2. 클래스타입 : 컬렉션프레임워크( 수집관련라이브러리 )

        ArrayList<String> strList = new ArrayList<>();
        strList.add("유재석");
        //strList.add(100);
        strList.add("강호동");
        strList.add("신동엽");
        System.out.println("리스트 상태" + strList);
        System.out.println("리스트 요소 호출:" + strList.get(1));
        System.out.println("리스트 길이 :" + strList.size());
        strList.remove(1);
        System.out.println("리스트 상태 1번 인덱스 삭제여:" + strList);
        System.out.println("=========================");

        SimpleList<String> simpleList = new SimpleList<>();
        simpleList.add("유재석");
        simpleList.add("강호동");
        simpleList.add("신동엽");
        System.out.println("리스트 상태 :" + simpleList);
        System.out.println("리스트 요소 호출:" + simpleList.get(1));
        System.out.println("리스트 길이:" + simpleList.size());
        simpleList.remove(1);
        System.out.println("리스트 상태 1번 인덱스 삭제요" + simpleList);

        SimpleList<Integer> intList = new SimpleList<>();
        intList.add(100);
        System.out.println("============================");


        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("김씨", 1);
        map.put("이씨", 2);
        map.put("정씨", 3);
        System.out.println(map);


        Map<String,List<String>> map1 = new HashMap<>();



        //List<String> numList = map1.get("number");

    }

}
