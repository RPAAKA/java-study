//프로그래머스 문자열 내 p와 y의 개수 (완료!)


public class Solution16 {
    public static void main(String[] args) {
        String str = "pPoooyY";

        int countp = 0;
        int county = 0;

        for (int i=0; i<str.length(); i++) {
            if((str.charAt(i) == 'p') || (str.charAt(i) == 'P')) {
                countp ++;
            }
        }

        for (int i=0; i<str.length(); i++) {
            if((str.charAt(i)) == 'y' || (str.charAt(i))=='Y') {
                county ++;
            }
        }

        System.out.println(countp);
        System.out.println(county);

        if(countp == county) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
