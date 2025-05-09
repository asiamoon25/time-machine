package 브루트_포스;
// https://www.acmicpc.net/problem/2531


public class 회전_초밥 {

    private static int solution(String[] arr) {



        return 0;
    }
    public static void main(String[] args) {

    }

}
/*
회전 초밥 음식점에는 회전하는 벨트 위에 여러 가지 종류의 초밥이 접시에 담겨 놓여 있고, 손님은 이 중에서 자기가 좋아하는 초밥을 골라서 먹음. 초밥의 종류를 번호로 표현할 때, 다음 그림은 회전 초밥 음식점의 벨트 상태의 예를 보여주고 있다.

벨트 위에는 같은 종류의 초밥이 둘 이상 있을 수 있다.

    1. 원래 회전 초밥은 손님이 마음대로 초밥을 고르고, 먹은 초밥만큼식대를 계산하지만, 벨트의 임의의 한 위치부터 k 개의 접시를 연속해서 먹을 경우 할인된 정액 가격으로 제공한다.
    2. 각 고객에게 초밥의 종류 하나가 쓰인 쿠폰을 발행하고, 1번 행사에 참가할 경우 이 쿠폰에 적혀진 종류의 초밥 하나를 추가로 무료로 제공한다. 만약 이 번호에 적혀진 초밥이 현재 벨트 위에 없을 경우, 요리사가 새로 만들어 손님에게 제공한다.

위 할인 행사에 참여하여 가능한 한 다양한 종류의 초밥을 먹으려고 한다. 위 그림의 예를 가지고 생각해보자, k = 4 이고, 30번 초밥을 쿠폰으로 받았다고 가정하자. 쿠폰을 고려하지 않으면 4가지 다른 초밥을 먹을 수 있는 경우는 (9, 7, 30, 2), (30, 2, 7, 9)
(2, 7, 9, 25) 세 가지 경우가 있는데, 30번 초밥을 추가로 쿠폰으로 먹을 수 있으므로 (2,7,9,25) 를 고르면 5가지 종류의 초밥을 먹을 수 있다.

회전 초밥 음식점의 벨트 상태, 메뉴에 있는 초밥의 가짓수, 연속해서 먹는 접시의 개수, 쿠폰 번호가 주어졌을 때, 손님이 먹을 수 있는 초밥 가짓수의 최댓값을 구하는 프로그램을 작성하시오.

N 번쨰 초밥을 먹은 후 다음 초밥이 첫 번째 초밥이 되기 위해서는 인덱스를 항상 확인해야 함.

if( N <= idx) {
    idx -= N;
}

이렇게 초밥의 길이를 따져가며 인덱스가 N보다 크거나 같으면 N 만큼 줄여주는 방법이 있음. 하지만 이렇게 하는 것보다 쉬운 방법은 % 연산을 사용하는 것임.

idx %= N

N 이 10이고 idx 가 3 이라면 3을 10으로 나눈 나머지는 3임. 즉 N 보다 작은 경우 아무 변화가 없음. 만약 idx 가 13이라면 10으로 나눈 나머지인 3을 가지게 됨. 따라서 크기를 비교할 필요가 없게됨. 그리고 혹시라도 k 값이 너무 커서
idx 가 23인 경우가 생겼다 하더라도 10으로 나눈 나머지는 3이기 때문에 문제 없이 사용이 가능함. N 을 빼주는 방법으로 했더라면 23 - 10 으로 13 이 되어 범위를 벗어나게 되는 것을 신경쓸 필요가 없게 됨.
 */