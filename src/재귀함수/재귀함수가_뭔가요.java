package 재귀함수;


import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/17478
public class 재귀함수가_뭔가요 {

    public static void fac(int depth, int n) {
        String under = "____".repeat(depth);

        System.out.println(under + "\"재귀함수가 뭔가요?\"");

        if (depth == n) {
            System.out.println(under + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
        } else {
            System.out.println(under + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            System.out.println(under + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            System.out.println(under + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

            fac(depth + 1, n);  // 재귀 호출
        }

        System.out.println(under + "라고 답변하였지.");
    }
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try{
//            int n = Integer.parseInt(br.readLine());
//            System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
//            fac(0, n);
//        }catch(Exception e) {
//            e.printStackTrace();
//        }
        int n = 2;
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        fac(0, n);
    }

}
/*
교수님이 출력을 원하는 재귀 횟수 N 이 주어진다.

어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.
"재귀함수가 뭔가요?"
"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.
마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.
그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어."
____"재귀함수가 뭔가요?"
____"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.
____마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.
____그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어."
________"재귀함수가 뭔가요?"
________"재귀함수는 자기 자신을 호출하는 함수라네"
________라고 답변하였지.
____라고 답변하였지.
라고 답변하였지.
 */