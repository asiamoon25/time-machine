package 브루트_포스;
//https://wikidocs.net/207392

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 삼육구_369_17614 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String input = br.readLine();
            Integer N = Integer.parseInt(input);

            int count = 0;
            for(int i = 1; i <= N; i++) {
                String numStr = String.valueOf(i);
                char[] arr = numStr.toCharArray();
                for(int j = 0; j < arr.length; j++) {
                    if(arr[j] == '3') {
                        count++;
                    } else if(arr[j] == '6') {
                        count++;
                    } else if(arr[j] == '9') {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}
/*
민수는 같은 반 친구들과 369 게임을 하고 있음. 369 게임은 여러 명이 원형으로 둘러 앉아 시작 위치의 사람이 1을 외치며 시작된다.
이후 시계방향으로 돌아가며 2, 3, 4 와 같이 1씩 증가된 수가 자기 수가 된다. 순서대로 돌아오는 자기 수에 3, 6 혹은 9가 포함되어 있지 않다면 그 수를 말해야 하며, 3,6 혹은 9가 포함되어
있으면 그 개수만큼 박수를 쳐야한다. 이 규칙을 지키지 못하면 게임이 종료된다.

민수는 369 게임이 N 까지 규칙을 지키며 진행된다면 그때까지의 들은 박수의 횟수가 총 몇번인지 궁금했다. 예를 들어 N = 14 라면 3,6,9,13 에서 각각 한 번의 박수를 치게되므로 총 4회
박수를 듣게 될 것이다. N = 36 이라면 3,6,9,13,16,19,23,26,29,30,32,33,34,35,36 에서 박수를 치게 되는데, 33, 36에서는 각 각 두 번 박수를 쳐야 하므로 총 18회가 된다.

1 이상 정수 N 에 대하여 390 게임을 N 까지 규칙을 지키며 진행된다면 그때까지 듣게 되는 박수의 총 횟수를 계산하여 출력하는 프로그램을 작성하시오.
 */