package 기본적인_자료구조;
//https://www.acmicpc.net/problem/9012
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String input = br.readLine();

            Integer T = Integer.parseInt(input);

            for(int i = 0; i < T; i++) {
                String vpsStr = br.readLine();

                System.out.println(vps(vpsStr) ? "YES": "NO");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }


    }

    private static boolean vps(String vpsStr) {

        Stack<Character> stack = new Stack<>();
        // 같으면 넣고 틀리면 최근거 하나 뺴기
        char[] arr = vpsStr.toCharArray();
        boolean check = false;
        for(char c : arr) {
            if (c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    check = true;
                    break;
                }
                stack.pop();
            }
        }

        if (check || !stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}

/*
괄호 문자열은 두 개의 괄호 기호인 ( 와 ) 만으로 구성되어 있는 문자열이다. 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열 이라고 부른다. 한 쌍의 괄호 기호로 된 () 문자열은 기본 VPS 라고 부른다.
만일 X 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 (X) 도 VPS 가 된다. 그리고 두 VPS x 와 y 를 접합 시킨 새로운 문자열 xy 도 VPS 가 된다. 예를 들어 (())() 와 ((())) 은 VPS 이지만, (()(, (())())) 그리고 (() 는 모두
VPS 가 아닌 문자열이다.
VPS 인지 아닌지 판단해서 YES, NO 로 나타내어야 한다.
 */
