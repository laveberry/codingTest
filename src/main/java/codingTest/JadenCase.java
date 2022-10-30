package codingTest;

/*
level2
* JadenCase 문자열 만들기

* JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 1 이상 200 이하인 문자열입니다.
s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
숫자는 단어의 첫 문자로만 나옵니다.
숫자로만 이루어진 단어는 없습니다.
공백문자가 연속해서 나올 수 있습니다.
입출력 예
s	return
"3people unFollowed me"	"3people Unfollowed Me"
"for the last week"	"For The Last Week"
 * */
public class JadenCase {

    public static void main(String[] args) {
        System.out.println("result1 "+ solution("3people unFollowed me"));
        System.out.println("result2 " + solution("for the last week"));

    }
    //내풀이
    public static String solution(String s) {
        String answer = "";

        String[] str = s.toLowerCase().split("");
        String result = "";

        for(int i=0; i< str.length ; i++){
            //첫시작 또는
            if(i==0 || (i!=0 && str[i-1].equals(" "))) {
                result = str[i].toUpperCase();
                answer += result;
            }
            else{
                answer += str[i];
            }
        }
        return answer;
    }

    //다른사람 풀이
    // Sunhee Shin , 조희준 , LimHanGyeol , wonsangki , 모아나 외 9 명
        public String solution2(String s) {
            String answer = "";
            String[] sp = s.toLowerCase().split("");
            boolean flag = true;

            for(String ss : sp) {
                answer += flag ? ss.toUpperCase() : ss;
                flag = ss.equals(" ") ? true : false;
            }

            return answer;
        }
}
