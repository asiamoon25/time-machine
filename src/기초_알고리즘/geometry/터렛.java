package 기초_알고리즘.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.acmicpc.net/problem/1002
public class 터렛 {
/*
    적이 무한대일 경우
        적이 있을 수 있는 위치의 개수가 무한대일 경우 -1 을 출력. 이 경우는 두 좌표가 일치하고, 원의 크기도 같을 때임. 두 점이 같고, 거리도 둘 다 같다면 원이 하나만 그려지고, 원이 그려지는 모든 좌표에 적이 있을 수 있음.
        이런 경우에 -1 을 출력함.

    적이 하나 있을 때
        두 원이 만나는 점이 하나 있을 때임. 즉 두 원이 내접하거나 외접하는 경우임. 외접, 내접 하는 경우도 적이 하나 밖에 없음.

    적이 둘 있을 때
        적이 둘 있는 경우는 원을 그렸을 때 두 점에서 만날 경우임.

    적이 없을 때
        적이 없을 때는 따로 계산하지 않아도 됨.
 */
    public static List<Integer> solution(String[] arr) {
        List<Integer> result = new ArrayList<>();
        for(String str : arr) {
            int[] int_arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

            int x1 = int_arr[0];
            int y1 = int_arr[1];
            int r1 = int_arr[2];

            int x2 = int_arr[3];
            int y2 = int_arr[4];
            int r2 = int_arr[5];

            double d = distance(x1,x2,y1,y2);

            double rMax = Math.max(r1, r2);
            double rMin = Math.min(r1, r2);

            double a = rMax - rMin;
            double b = rMax + rMin;

            if(d == 0 && r1 == r2) {
                result.add(-1);
                continue;
            }

            if(a < d && d < b) {
                result.add(2);
                continue;
            }

            if(rMax + rMin == d) {
                result.add(1);
                continue;
            }

            if(rMax - rMin == d) {
                result.add(1);
                continue;
            }

            if(rMax + rMin > d) {
                result.add(0);
                continue;
            }

            if(rMax - rMin < d) {
                result.add(0);
                continue;
            }


        }


        return result;
    }

    private static double distance(int x1, int x2, int y1, int y2) {

       double d;

       int xd, yd;

       xd = (int) Math.pow((x2-x1) , 2);
       yd = (int) Math.pow((y2-y1) , 2);

       d = Math.sqrt(xd + yd);
       return d;
    }

    public static void main(String[] args) {
        String t = "3";
        String[] arr = new String[3];
        String swkh = "0 0 13 40 0 37"; // 석원 과 규현의 좌표
        String swkh2 = "0 0 3 0 7 4";
        String swkh3 = "1 1 1 1 1 5";
        arr[0] = swkh;
        arr[1] = swkh2;
        arr[2] = swkh3;
        List<Integer> result = solution(arr);

        for(Integer res : result) {
            System.out.println(res);
        }
    }
}

/*
이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.

조규현의 좌표
$(x_1, y_1)$와 백승환의 좌표 $(x_2, y_2)$가 주어지고, 조규현이 계산한 류재명과의 거리 $r_1$과 백승환이 계산한 류재명과의 거리 $r_2$가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.

첫째 줄에 테스트 케이스의 개수 T 가 주어짐. 각 테스트 케이스는 다음과 같이 이루어져 있음.
한 줄에 공백으로 구분ㄷ뇐 여섯 정수 x1, y1, r1, x2,y2,r2 가 주어진다.

각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1 을 출력한다.
 */