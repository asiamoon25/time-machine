package 재귀함수;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/10872
public class 팩토리얼_10872 {


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String nStr = br.readLine();

            Integer n = Integer.parseInt(nStr);

            int result = 1;
            while(n > 0) {
                result *= n;

                n -= 1;
            }

            System.out.println(result);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

/*
0보다 크거나 같은 정수 N 이 주어진다. 이때 N! 를 출력하는 프로그램을 작성하시오.
 */