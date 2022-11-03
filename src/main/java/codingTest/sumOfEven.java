package codingTest;

import java.util.stream.IntStream;

/**
 * 짝수의 합
 *
 * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 0 < n ≤ 1000
 *
 * 입출력 예
 * n	result
 * 10	30
 * 4	6
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * n이 10이므로 2 + 4 + 6 + 8 + 10 = 30을 return 합니다.
 * 입출력 예 #2
 *
 * n이 4이므로 2 + 4 = 6을 return 합니다.
 * */
public class sumOfEven {

    public static void main(String[] args) {

    }

    public int solution(int n) {
        int answer = 0;
        if(n%2!=0) n=n-1;

        while(n>1){
            answer+=n;
            n-=2;
        }

        return answer;
    }

    //다른사람풀이1
    public int solution2(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    }

    //다른사람풀이2
    public int solution3(int n) {
        return IntStream.rangeClosed(0, n)
                .filter(e -> e % 2 == 0)
                .sum();
    }
}
