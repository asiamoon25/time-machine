package 기초_알고리즘.math.에라토스테네스의_체;

import java.util.List;

//https://www.acmicpc.net/problem/2960
public class 에라토스테네스의_체 {

    public static List<Integer> solution(String[] arr) {

        Integer N = Integer.parseInt(arr[0]);

        Integer K = Integer.parseInt(arr[1]);

        boolean[] boolean_array = new boolean[N + 1];

        boolean_array[0] = false;
        boolean_array[1] = false;
        for(int i = 2; i <= N; i++) {
            boolean_array[i] = true;
        }


        int count = 0;

        for(int i = 0; i < N + 1; i++) {

        }


        return null;
    }


    public static void main(String[] args) {



    }
}

/*
에라토스테네스의 체는 N보다 작거나 같은 모든 소수를 찾는 유명한 알고리즘이다.

이 알고리즘은 다음과 같다.

    1. 2부터 N까지 모든 정수를 적는다.
    2. 아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
    3. P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
    4. 아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.

N, K가 주어졌을 때, K번째 지우는 수를 구하는 프로그램을 작성하시오.
 */