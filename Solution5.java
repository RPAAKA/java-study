//프로그래머스 문자열을 정수로 바꾸기 (완료)
public class Solution5 {
    public static void main(String[] args) {
        String s = "15235";
        int answer = 0;

        answer = Integer.parseInt(s);
        //answer = Integer.valueOf(s)

        System.out.println(answer);
    }
}
