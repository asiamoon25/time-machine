package 정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

//https://www.acmicpc.net/problem/10825
public class 국영수 {

    public static List<Student> solution(String[] arr) {

        List<Student> students = new ArrayList<>();
        for(String str : arr) {
            String[] strArr = str.split(" ");
            Student stu = new Student();

            stu.setName(strArr[0]);
            stu.setKrScore(Integer.parseInt(strArr[1]));
            stu.setEnglishScore(Integer.parseInt(strArr[2]));
            stu.setMathScore(Integer.parseInt(strArr[3]));

            students.add(stu);
        }
        //국어 점수가 감소하는 순서로
        //국어 점수가 같으면 영어 점수가 증가하는 순서로
        students.sort((a, b) -> {
            if (!a.getKrScore().equals(b.getKrScore())) {
                return b.getKrScore() - a.getKrScore(); // 국어 점수 내림차순
            } else if (!a.getEnglishScore().equals(b.getEnglishScore())) {
                return a.getEnglishScore() - b.getEnglishScore(); // 영어 점수 오름차순
            } else if (!a.getMathScore().equals(b.getMathScore())) {
                return b.getMathScore() - a.getMathScore(); // 수학 점수 내림차순
            } else {
                return a.getName().compareTo(b.getName()); // 이름 오름차순 (사전순)
            }
        });


        return students;
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String input = br.readLine();

            Integer N = Integer.parseInt(input);
            String[] arr = new String[N];
            for(int i = 0; i < N; i++) {
                arr[i] = br.readLine();
            }

            List<Student> result = solution(arr);

            for(int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i).toString());
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class Student {
    String name;
    Integer krScore;
    Integer englishScore;
    Integer mathScore;

    Student(){

    }

    public String getName() {
        return this.name;
    }

    public Integer getKrScore() {
        return this.krScore;
    }

    public Integer getEnglishScore() {
        return this.englishScore;
    }

    public Integer getMathScore() {
        return this.mathScore;
    }

    void setName(String name) {
        this.name = name;
    }

    void setKrScore(Integer krScore) {
        this.krScore = krScore;
    }

    void setEnglishScore(Integer englishScore) {
        this.englishScore = englishScore;
    }

    void setMathScore(Integer mathScore) {
        this.mathScore = mathScore;
    }

    public String toString() {
//        return "[ name : " + this.name + ", krScore : " + krScore + ", englishScore : " + this.englishScore + ", mathScore : " + this.mathScore + " ]";
        return this.name;
    }
}
/*
도현이네 반 학생 N명의 이름과 국어, 영어, 수학 점수가 주어진다. 이때, 다음과 같은 조건으로 학생의 성적을 정렬하는 프로그램을 작성하시오.
    1. 국어 점수가 감소하는 순서로
    2. 국어 점수가 같으면 영어 점수가 증가하는 순서로
    3. 국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
    4. 모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로(단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)

첫째 줄에 도현이네 반의 학생 수 (1 ~ 100000) 이 주어진다. 둘째 줄부터 한 줄에 하나씩 각 학생의 이름, 국어, 영어, 수학 점수가 공백으로 구분해 주어진다. 점수는 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.
이름은 알파벳 대소문자로 이루어진 문자열이고, 길이는 10자리를 넘지 않는다.
 */
