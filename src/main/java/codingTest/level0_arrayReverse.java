package codingTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 배열뒤집기

 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

 제한사항
 1 ≤ num_list의 길이 ≤ 1,000
 0 ≤ num_list의 원소 ≤ 1,000
 입출력 예
 num_list	result
 [1, 2, 3, 4, 5]	[5, 4, 3, 2, 1]
 [1, 1, 1, 1, 1, 2]	[2, 1, 1, 1, 1, 1]
 [1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]
 입출력 예 설명
 입출력 예 #1

 num_list가 [1, 2, 3, 4, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 4, 3, 2, 1]을 return합니다.
 입출력 예 #2

 num_list가 [1, 1, 1, 1, 1, 2]이므로 순서를 거꾸로 뒤집은 배열 [2, 1, 1, 1, 1, 1]을 return합니다.
 입출력 예 #3

 num_list가 [1, 0, 1, 1, 1, 3, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 3, 1, 1, 1, 0, 1]을 return합니다.
 * */
public class level0_arrayReverse {
    //풀이1
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i=0; i < num_list.length ; i++){
            answer[i] = num_list[num_list.length-i-1];
        }

        return answer;
    }
    //풀이2
    public int[] solution2(int[] numList) {
        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());

        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
