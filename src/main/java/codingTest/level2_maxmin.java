package codingTest;

public class level2_maxmin {
    public static void main(String[] args) {

        String result =  solution("1 2 5 3");

        System.out.println("ressult  " + result);

       // String result2 =  solution2("1 2 5 3");

    }

    public static String solution(String s) {
        String[] tmp = s.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(tmp[0]);

        for (int i = 1; i < tmp.length; i++) {
            n = Integer.parseInt(tmp[i]);
            if(min > n) min = n;
            if(max < n) max = n;
        }

        return min + " " + max;
    }

//    public String solution2(String s) {
//        String answer = "";
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        String[] str = s.split(" ");
//
//        for(int i=0; i<str.length; i++) {
//            arr.add(Integer.parseInt(str[i]));
//        }
//
//        answer = "" + Collections.min(arr) + " " + Collections.max(arr);
//
//        return answer;
//    }

//    public static String solution(String s) {
//        String answer = "";
//        int max = 0;
//        int min = 0;
//
//        String[] numChk = s.split(" ");
//
//        for (int i = 0; 0 < numChk.length; i++) {
//            int num = Integer.parseInt(numChk[i]);
//
//            if (i == 0) {
//                min = num;
//                max = num;
//            }
//
//            if (min > num) {
//                min = num;
//            }
//            if (max < min) {
//                max = num;
//            }
//        }
//
//        System.out.println("test" + min + max);
//
//        answer = min + " " + max;
//
//        return answer;
//    }
}
