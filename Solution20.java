//프로그래머스 완주하지 못한 선수 (왜 안되지..?)

import java.util.ArrayList;
import java.util.Arrays;

public class Solution20 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden", "mislav", "mislav", "sibal"};
        String[] completion = {"kiki", "eden", "mislav"};

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(participant));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(completion));

        for(int i=0; i<list1.size(); i++) {
            list1.remove(list2.get(i));
        }

        String[] answer = list1.toArray(new String[0]);
        System.out.println(Arrays.toString(answer));
    }
}


//import java.util.ArrayList;
//        import java.util.Arrays;
//
//class Solution {
//    public String[] solution(String[] participant, String[] completion) {
//        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(participant)); // array를 Arraylist로
//        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(completion)); // array를 Arraylist로
//
//        // list1에서 list2에 있는 값을 제거.
//        for(int i=0; i<list1.size(); i++) {
//            list1.remove(list2.get(i));
//        }
//
//        //list를 다시 array로 바꿔줌.
//        String[] answer = list1.toArray(new String[0]);
//        return answer;
//    }
//}