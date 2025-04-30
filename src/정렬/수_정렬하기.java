package 정렬;

//https://www.acmicpc.net/problem/2750


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수_정렬하기 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String input = br.readLine();

            int n = Integer.parseInt(input);
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            arr = Arrays.stream(arr).distinct().sorted().toArray();

            for(int a : arr) {
                System.out.println(a);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

/*
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

첫째 줄에 수의 개수 N (1 ~ 1000) 이 주어진다. 둘째 줄 부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 */