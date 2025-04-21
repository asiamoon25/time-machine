package 기본적인_자료구조;

import java.util.Stack;

public class 스택 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        int n = 14;

        String command1 = "push 1";
        String command2 = "push 2";
        String command3 = "top";
        String command4 = "size";
        String command5 = "empty";
        String command6 = "pop";
        String command7 = "pop";
        String command8 = "pop";
        String command9 = "size";
        String command10 = "empty";
        String command11 = "pop";
        String command12 = "push 3";
        String command13 = "empty";
        String command14 = "top";
        doCommand(stack, command1);
        doCommand(stack, command2);
        doCommand(stack, command3);
        doCommand(stack, command4);
        doCommand(stack, command5);
        doCommand(stack, command6);
        doCommand(stack, command7);
        doCommand(stack, command8);
        doCommand(stack, command9);
        doCommand(stack, command10);
        doCommand(stack, command11);
        doCommand(stack, command12);
        doCommand(stack, command13);
        doCommand(stack, command14);


    }

    public static void doCommand(Stack<Integer> stack, String commandLine) {

        if(commandLine.startsWith("push")) {
            String number = commandLine.split(" ")[1];
            stack.push(Integer.parseInt(number));
        }else {
            if("pop".equals(commandLine)){

                if(stack.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } else if("size".equals(commandLine)) {
                System.out.println(stack.size());
            } else if("empty".equals(commandLine)) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            } else if("top".equals(commandLine)){
                if(stack.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
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