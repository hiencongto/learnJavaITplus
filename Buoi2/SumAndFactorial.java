package learnJavaITplus.Buoi2;

import java.util.Scanner;

public class SumAndFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        int product = 1;

        //Tinh tong
        for (int i = 1; i <= num; i++)
        {
            sum +=i;
        }
        System.err.println("Tổng là "+ sum);

        //Giai thừa
        for (int i = 1; i <= num; i++)
        {
            product *= i;
        }
        System.err.println("Tích là "+product);

    }
}
