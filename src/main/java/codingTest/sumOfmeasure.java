package codingTest;

/**
 *
 * 약수의합
 *
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 사항
 * n은 0 이상 3000이하인 정수입니다.
 * 입출력 예
 * n	return
 * 12	28
 * 5	6
 * 입출력 예 설명
 * 입출력 예 #1
 * 12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.
 *
 * 입출력 예 #2
 * 5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
 * */
public class sumOfmeasure {
    public static void main(String[] args) {
        System.out.println("result " + solution(12));
        System.out.println("result " + solution(28));

        //SumDivisor c = new SumDivisor();
        //System.out.println(c.sumDivisor(12));
    }

    public static int solution(int n) {
        int answer = 0;

        //i가 0이면 에러발생. 습관적으로 0에서부터 시작하면 안됨
        for(int i=1 ; i<=n ; i++){
            if(n % i == 0){
                answer+= i;
            }
        }
        return answer;
    }

    //다른사람풀이
    public int sumDivisor(int num) {
        int answer = 0;
        for(int i = 1; i <= num/2; i++){
            if(num%i == 0) answer += i;
        }
        //+num 해주면 반만 돌려도된다
        return answer+num;
    }


}


