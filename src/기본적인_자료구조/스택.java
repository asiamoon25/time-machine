package 기본적인_자료구조;
//https://www.acmicpc.net/problem/10828
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 스택 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String input = br.readLine();

            Integer n = Integer.parseInt(input);
            List<Integer> result = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                String command = br.readLine();

                if(command.startsWith("push")) {
                    String number = command.split(" ")[1];
                    stack.push(Integer.parseInt(number));
                }else {
                    if("pop".equals(command)){
                        if(stack.isEmpty()){
                            result.add(-1);
                        } else {
                            result.add(stack.pop());
                        }
                    } else if("size".equals(command)) {
                        result.add(stack.size());
                    } else if("empty".equals(command)) {
                        result.add(stack.isEmpty() ? 1 : 0);
                    } else if("top".equals(command)){
                        if(stack.isEmpty()){
                            result.add(-1);
                        } else {
                            result.add(stack.peek());
                        }
                    }
                }
            }


            for(int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
/*
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 5가지이다.

1. push X  : 정수 X 를 스택에 넣는 연산이다.
2. pop : 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1 을 출력한다.
3. size : 스택에 들어있는 정수의 개수를 출력한다.
4. empty : 스택이 비어있으면 1, 아니면 0을 출력한다.
5. top : 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1 을 출력한다.
 */