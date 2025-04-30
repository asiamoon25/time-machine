package 정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
//https://www.acmicpc.net/problem/10814
public class 나이순_정렬 {

    public static int solution(String[] arr) {
        // 1. 나이는 오름차순
        // 2. 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬

        List<Person> personList = new ArrayList<>();


        for(int i = 0; i < arr.length; i++) {
            Person person = new Person();
            String[] personInfo = arr[i].split(" ");

            person.setName(personInfo[1]);
            person.setAge(Integer.parseInt(personInfo[0]));
            person.setIndex(i);
            personList.add(person);
        }


        personList.sort((a, b) -> {
           if(a.age != b.age) {
               return a.age - b.age;
           } else {
               return a.index - b.index;
           }
        });


        for(Person person : personList) {
            System.out.println(person.toString());
        }
        return 0;
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

            solution(arr);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class Person {
    String name;
    Integer age;
    Integer index;

    public String getName() {
        return this.name;
    }

    public Integer age() {
        return this.age;
    }

    public Integer index() {
        return this.index;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(Integer age) {
        this.age = age;
    }

    void setIndex(Integer index) {
        this.index = index;
    }

    public String toString() {
//        return "[ name : " + this.name + ", age : " + age + ", index : " + index + "]";

        return this.age + " " + this.name;
    }
}

/*
온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.

첫째 줄에 온라인 저지 회원 수 N 이 주어짐(1 ~ 100000)

둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열임.
입력은 가입한 순서로 주어짐.
 */