package 기초_알고리즘.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/1850
public class 유클리드_호제법 {

    public static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        long a = Long.parseLong(parts[0]);
        long b = Long.parseLong(parts[1]);

        long g = gcd(a, b);

        // g 자리수 만큼 '1' 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < g; i++) {
            sb.append("1");
        }

        System.out.println(sb);
    }
}


/*
모든 자리가 1로만 이루어져있는 두 자연수 A와 B가 주어진다. 이때, A와 B의 최대 공약수를 구하는 프로그램을 작성
예를 들어, A가 111이고, B가 1111인 경우에 A와 B의 최대공약수는 1이고, A가 111이고, B가 111111인 경우에는
최대공약수가 111이다.

첫째 줄에 두 자연수 A와 B를 이루는 1의 개수가 주어진다. 입력되는 수는 2^63 보다 작은 자연수이다.

최대공약수 : 두 수의 약수 중 최대이면서 같은 약수
 */