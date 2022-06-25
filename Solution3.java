// 프로그래머스 가운데 글자 가져오기 (완료!)

public class Solution3 {
    public static void main(String[] args) {
        String str = "abcdefsdaff";
        int stringlen = str.length();
        System.out.println(stringlen);
        String result = "";

        if(stringlen % 2 == 0) {
            result = str.substring(stringlen/2-1,stringlen/2+1);
        } else {
            result = str.substring(stringlen/2, stringlen/2+1);
        }

        System.out.println(result);
        System.out.println(str);

    }
}
