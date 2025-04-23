package 기초_알고리즘.geometry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/14215
public class 세막대 {
    public static int solution(String[] arr) {

        int[] int_arr = Arrays.stream(arr).mapToInt(Integer :: parseInt).toArray();

        int_arr = Arrays.stream(int_arr)
                        .boxed()
                                .sorted()
                                        .mapToInt(Integer::intValue)
                                                .toArray();


        int a = int_arr[0];
        int b = int_arr[1];
        int c = int_arr[2];

        if(a + b <= c) {
            c = a + b - 1;
        }

        return a + b + c;
    }

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
//            String[] arr = {"1", "2", "3"};
            String input = br.readLine();

            String[] arr = input.split(" ");

            System.out.println(solution(arr));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
/*
    a,b,c 인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있음.
    세 막대를 이용해서 아래 조건을 만족하는 삼각형을 만들려고 한다.
        * 각 막대의 길이는 양의 정수임.
        * 세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
        * 삼각형의 둘레를 최대로 해야함.

    a,b,c 가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오.
    ----

    삼각형을 만들 때 가장 긴 변은 나머지 두 변의 합보다 클 수 없음.

    두 변의 합이 가장 긴 변보다 1이라도 커야 삼각형을 만들 수 있음. 각 막대의 길이는 양의 정수이기 때문에 가장 긴 변을 (a+b) - 1 로 정하면 됨.
    a + b > c

 */