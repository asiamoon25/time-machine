package basic_algorithm.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/10818
public class 최대값_최솟값_구하기 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String input = br.readLine();

            String input2 = br.readLine();

            String[] arr = input2.split(" ");

            Integer[] intArray = Arrays.stream(arr)
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);

            int max = Arrays.stream(intArray)
                    .mapToInt(Integer::intValue)
                    .max()
                    .orElseThrow();

            int min = Arrays.stream(intArray)
                    .mapToInt(Integer::intValue)
                    .min()
                    .orElseThrow();

            String result = min + " " + max;

            System.out.println(result);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
/*
N 개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */