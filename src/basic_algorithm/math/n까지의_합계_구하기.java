package basic_algorithm.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/8393
public class n까지의_합계_구하기 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String input = br.readLine();

            Integer n = Integer.parseInt(input);

            int result = 0;
            for(int i = 1; i <= n; i++) {
                result += i;
            }

            System.out.println(result);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
