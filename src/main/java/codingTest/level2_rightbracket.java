package codingTest;

import java.util.Stack;

/*
* 스택/큐 > 올바른 괄호
괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어

"()()" 또는 "(())()" 는 올바른 괄호입니다.
")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
입출력 예
s	answer
"()()"	true
"(())()"	true
")()("	false
"(()("	false
입출력 예 설명
입출력 예 #1,2,3,4
문제의 예시와 같습니다.
* */
public class level2_rightbracket {

    public static void main(String[] args) {
        //스택 - 후입선출 / 큐 - 선입선출
        System.out.println(solution("(())()"));
        System.out.println(solution("(()("));
    }


    static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(')  // 현재 (가 들어갈 자리면 스택에 넣는다.
                stack.push('(');
            else{
                if(stack.isEmpty()) // 현재 )가 들어갈 자리인데 스택이 비어있을경우 -> false
                    return false;
                else
                    stack.pop();    // 현재 )가 들어갈 상태에서 스택에 괄호('(')가 있는경우 -> pop
            }
        }
        answer = (stack.isEmpty()) ? true : false;
        return answer;
    }


}
