package learnJavaITplus.Buoi2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        if (num<2) 
        {
            System.out.println("Không phải số nguyên tố");
        }
        else if (num==2) 
        {
            System.err.println("Số nguyên tố");
        }
        else
        {
            for(int i = 2; i<= Math.sqrt(num); i++)
            {
                if(num%i==0)
                {
                    System.out.println("Không phải số nguyên tố");
                }
                else
                {
                    System.err.println("Số nguyên tố");
                }
            }
        }
        sc.close(); 
    }
}

