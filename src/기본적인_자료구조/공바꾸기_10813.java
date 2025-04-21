package 기본적인_자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 공바꾸기_10813 {

    public static int[] solution(int[] nArr, int[] arr) {

        int i = arr[0] - 1;
        int j = arr[1] - 1;

        int temp = 0;

        temp = nArr[j];

        nArr[j] = nArr[i];

        nArr[i] = temp;

        return nArr;
    }

    public static void main(String[] args) {
//        int n = 5;
//
//        int[] n_arr = {1,2,3,4,5}; // 1 3 2 4 5 /
//
//        int[] arr1 = {1, 2};
//        n_arr = solution(n_arr, arr1);
//
//        int[] arr2 = {3, 4};
//        n_arr = solution(n_arr, arr2);
//
//        int[] arr3 = {1, 4};
//        n_arr = solution(n_arr, arr3);
//
//        int[] arr4 = {2, 2};
//        n_arr = solution(n_arr, arr4);
//
//        System.out.println("final : " + Arrays.toString(n_arr));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String input = br.readLine();
            String[] strArr = input.split( " ");
            Integer n = Integer.parseInt(strArr[0]);
            Integer m = Integer.parseInt(strArr[1]);
            int[] n_arr = new int[n];

            for(int i = 0; i < n; i++) {
                n_arr[i] = i + 1;
            }

            for(int i = 0; i < m; i++) {
                String[] arrStr = br.readLine().split(" ");

                int[] arr = new int[2];

                arr[0] = Integer.parseInt(arrStr[0]);
                arr[1] = Integer.parseInt(arrStr[1]);


                n_arr = solution(n_arr, arr);
            }

            for(int i = 0; i < n_arr.length; i++) {
                System.out.print(n_arr[i] + " ");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}

/*
각 바구니에는 1 ~ N 까지 번호가 매겨져 있다. 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있음.

도현이는 앞으로 M 번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.

공을 어떻게 바꿀지가 주어졌을 때, M 번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.


첫째 줄에 N, M이 주어진다.
둘째 줄 부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 각 방법은 두 정수 i j 로 이루어져 있으며, i 번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다.
 */