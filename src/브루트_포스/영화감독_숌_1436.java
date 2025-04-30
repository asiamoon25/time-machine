package 브루트_포스;
// https://www.acmicpc.net/problem/1436


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 영화감독_숌_1436 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String input = br.readLine();

            int n = Integer.parseInt(input);
            int num = 666;

            int result = num;

            while (n - 1 > 0) {
                num += 1;
                String numStr = String.valueOf(num);
                if (numStr.contains("666")){
                    result = num;
                    n -= 1;
                }
            }

            System.out.println(num);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
/*
666은 종말을 나타내는 수라고 한다. 따라서, 많은 블록버스터 영화에서는 666 이 들어간 제목을 많이 사용한다. 영화감독 숀은 세상의 종말이라는 시리즈 영화 감독이다. 조지 루카스는 스타워즈를 만들 때,
스타워즈 1, 스타워즈 2, 스타워즈 3, 스타워즈 4, 스타워즈 5, 스타워즈 6 과 같이 이름을 지었고, 피터 잭슨은 반지의 제왕을 만들 때, 반지의 제왕1, 반지의 제왕2, 반지의 제왕 3 과 같이 영화 제목을 지었다.
하지만 숌은 자신이 조지 루카스와 피터 잭슨을 뛰어넘는다는 것을 보여주기 위해서 영화 제몸ㄱ을 좀 다르게 만들기로 했다.

종말의 수란 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수를 말한다. 제일 작은 종말의 수는 666이고, 그 다음으로 큰 수는 1666,2666,3666,... 이다. 따라서, 숌은 첫 번째 영화의 제목은 "세상의 종말 666", 두 번째 영화 제목은
"세상의 종말 1666" 와 같이 이름을 지을 것이다. 일반화 해서 생각한다면, N 번째 영화의 제목은 세상의 종말(N 번쨰로 작은 종말의 수) 와 같다.
숌이 만든 N 번째 영화의 제목이 들어간 수를 출력하는 프로그램을 작성하시오. 숌은 이 시리즈를 항상 차례대로 만들고, 다른 영화는 만들지 않는다.
 */