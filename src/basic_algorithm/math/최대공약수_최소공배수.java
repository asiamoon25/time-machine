package basic_algorithm.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2609
public class 최대공약수_최소공배수 {

    public static String solution(String[] arr) {

        Integer number = Integer.parseInt(arr[0]);
        Integer number2 = Integer.parseInt(arr[1]);

        int gcd = number > number2 ?  gcd(number, number2) : gcd(number2, number);

        int lcm = number * number2 / gcd;

        String result = gcd + " " + lcm;

        return result;
    }

    private static int gcd(int number, int number2) { // 최대 공약수

        if(number2 == 0) return number;

        return gcd(number2, number % number2);
    }

    public static void main(String[] args) {

//        String[] arr = {"24", "18"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String input = br.readLine();
            String[] arr = input.split(" ");
            String[] result = solution(arr).split(" ");

            System.out.println(result[0]);
            System.out.println(result[1]);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}


/*
두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000 이하의 자연수이며 사이에 한 칸의 공백이 주어짐.

첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
 */