package BaekJoon_Recursion;

import java.util.Scanner;

public class _9498_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        if (100>= A && A>=90 ){
            System.out.println("A");
        }
        else if(90>A && A>=80){
            System.out.println("B");
        }
        else if(80>A && A>=70){
            System.out.println("C");
        }
        else if(70>A && A>=60){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
