package basic_algorithm.math;

//https://www.acmicpc.net/problem/1929


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 소수_구하기 {

    public static List<Integer> solution(String[] arr) {

        Integer m = Integer.parseInt(arr[0]);
        Integer n = Integer.parseInt(arr[1]);

        List<Integer> result = new ArrayList<>();

        for(int i = m; i <= n; i++) {
            if(isPrime(i)){
                result.add(i);
            }
        }

        return result;
    }

    private static boolean isPrime(int number) {

        if(number < 2) {
            return false;
        }

        if(number == 2) {
            return true;
        }

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        try{
//            String input = br.readLine();
//
//            Integer M = Integer.parseInt(input.split(" ")[0]);
//            Integer N = Integer.parseInt(input.split(" ")[1]);
//        }catch(Exception e) {
//            e.printStackTrace();
//        }
        String[] arr = {"3", "16"};

        System.out.println(Arrays.toString(solution(arr).toArray()));

        List<Integer> result = solution(arr);
        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
/*
첫째 줄에 자연수 M 과 N 이 빈 칸을 사이에 두고 주어진다. M 이상 N 이하의 소수가 하나 이상 있는 입력만 주어진다.

한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */