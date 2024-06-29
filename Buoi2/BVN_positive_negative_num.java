package Buoi2;

import java.util.Scanner;

public class BVN_positive_negative_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();

        if (inputNum == 0) {
            System.out.println(inputNum);
        } else if (inputNum > 0) {
            System.out.println("Đây là số dương");
        } else {
            System.out.println("Đây là số âm");
        }
        sc.close();

        // trị tuyệt đối
        System.err.println(Math.abs(inputNum));
    }
}
