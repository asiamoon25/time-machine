package basic_algorithm.geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/2292
public class 벌집 {
    public static int solution(String str) {


        int cnt = 1;
        int ans = 1;
        Integer N = Integer.parseInt(str);
        while(cnt < N) {
            cnt += ans * 6;
            ans += 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String n = br.readLine();
            System.out.println(solution(n));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

/*
위의 그림과 같이 육각형으로 이루어진 벌집이 있다.
그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
예를 들면, 13까지는 3개, 58까지는 5개를 지난다.

입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
 */