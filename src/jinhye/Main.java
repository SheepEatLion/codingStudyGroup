package src.jinhye;

import src.jinhye.people.Client;

import java.util.*;

/**
 * 사람 2명 : 배열로 2명 공간 준비
 * 자동차 2대
 * 스캐너로 받아서 이름 나이 줘야 한다.
 * 메인에서 시작할때 [프로그램 시작]
 * 1. 사람 생성 : 배열 공간에 사람이 들어간다는 의미
 * 2. 사람 이름과 나이 등록 : 배열에서 [0] 이런식으로 인덱싱해서 그 안에 name이랑 age 값을 원하는대로 준다.
 * 3. 사람은 최대 2명이어야 한다.
 * 4. 한 사람에게 로그인할 수 있다.
 * 5. 로그인을 하면 홈화면이 뜰건데 홈화면은 { 1. 차 구매 2.차고 가기 3.탑승 }
 * 6. 차고 가기 : 현재 내가 가지고 있는 차량 명이 화면이 뜬다.
 * 7. 차 구매 : 현재 내가 1개의 차가 있다면 "구매할 수 없습니다." OR 차가 없다면 ( 1.BMW 2.마세라티 ) 선택하는 화면 보여주고 사용자가 1번 입력하면 "BMW를 구매했습니다"
 * 8. 탑승 : 내가 차를 아직 안가지고 있다면 "가지고 있는 차가 없습니다" OR 차가 있다면 ( 1. 출발하기 2. 정지하기 ) 화면 보여주고 사용자가 1번 입력하면 "출발했습니다."
 * 9. "뒤로 가시겠습니까?" ( 1. O 2. X ) 가 뜨고 1번을 입력하면 홈화면으로 이동, 2번을 입력하면 "출발했습니다" -> "뒤로 가시겠습니까?" 반복..
 */

public class Main {

    public static void main(String[] args){

        System.out.println("프로그램 시작!");

        Client jh = new Client();
        Scanner sc = new Scanner(System.in);
        //jh.name = sc.nextLine();
        //jh.age = sc.nextInt();

        jh.setName(sc.nextLine());
        jh.setAge(sc.nextInt());


    }
}



