package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst()); // 처음에 추가된 데이터 출력
        System.out.println(list.getLast()); // 마지막에 추가된 데이터 출력

        System.out.println("--------------------------------------");

        // 추가
        list.addFirst("서장훈"); // 맨앞으로 데이터 추가
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("------------------------------------------");

        list.addLast("김희철");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-----------------------------------------------------");

        list.add(3, "장지원");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------------------------");

        // 삭제
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        System.out.println("---------------------------------------");

        // 처음 학생과 마지막 학생이 전학 (데이터 삭제)
//        list.remove(0)
        System.out.println("처음 학생과 마지막 학생이 전학");
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.removeFirst(); // 처음 학생을 삭제
        list.removeLast();  // 마지막 학생을 삭제
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        System.out.println("----------------------------------------");

        // 변경 (수강권 양도)
        System.out.println(list.get(0));
        list.set(0, "이수근");
        System.out.println(list.get(0));

        System.out.println("----------------------------------------");

        // 확인
        System.out.println(list.indexOf("유재석"));
        if (list.contains("장지원")){
            System.out.println("수강 신청을 성공했다.");
        }
        System.out.println("수강 신청을 실패했다.");

        System.out.println("----------------------------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()){
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("----------------------------------");
        // 정렬
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list);
        for (String s: list) {
            System.out.println(s);
        }
    }
}
