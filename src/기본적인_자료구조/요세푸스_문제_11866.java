package 기본적인_자료구조;
//https://www.acmicpc.net/problem/11866


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class 요세푸스_문제_11866 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String input = br.readLine();
            String[] arr = input.split(" ");

            Integer n = Integer.parseInt(arr[0]);
            Integer k = Integer.parseInt(arr[1]);

            Deque<Integer> deque = new LinkedList<>();

            for(int i = 0; i < n; i++) {
                deque.add(i + 1);
            }

            Queue<Integer> queue = new LinkedList<>();

            while(deque.size() != 0) {
                for(int i = 0; i < k - 1; i++) {
                    int a = deque.pop();

                    deque.addLast(a);
                }

                queue.add(deque.pop());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("<");

            Iterator<Integer> iter = queue.iterator();
            while(iter.hasNext()) {
                sb.append(iter.next());
                if(iter.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append(">");
            System.out.println(sb.toString());
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

/*
1 번 부터 N번 까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(<=N) 가 주어진다. 이제 순서대로 K 번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서룰 (N, K)-요세푸슷 순열 이라고한다. 예를 들어 (7,3) 요세푸스 순열은 <3,6,2,7,5,1,4> 이다.

N과 K가 주어지면 (N, K) 요세푸스 순열을 구하는 프로그램을 작성하시오.
 */

