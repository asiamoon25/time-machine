package 재귀함수;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 팩토리얼_3_27434 {
    public static BigInteger fac(int a, int n) {
        BigInteger num = BigInteger.valueOf(a);

        if(a < n) {
            int b = (a + n) / 2;
            num = fac(a,b).multiply(fac(b + 1, n));
        }

        return num;
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            Integer n = Integer.parseInt(br.readLine());

            System.out.println(fac(1, n));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

/*
0보다 크거나 작은 정수 N 이 주어진다, 이때, N! 을 출력하는 프로그램을 작성하시오.
100000 이라서 BigInteger 써야함.
 */