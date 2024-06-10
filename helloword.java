package learnJavaITplus;
import java.util.Scanner;

public class helloword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Hello world");
        // System.out.print("hien");
        // System.out.println("hinhienhe");
        // long a = 5;
        // float b = a ;
        // System.out.println(b);
        // nextInt()	Đọc một giá trị kiểu int.
        // nextFloat()	Đọc một giá trị kiểu float.
        // nextBoolean()	Đọc một giá trị kiểu Boolean.
        // nextLine()	Đọc một dòng văn bản.
        // next()	Đọc một từ.
        // nextByte()	Đọc một giá trị ở dạng byte.
        // nextDouble()	Đọc một giá trị kiểu double.
        // nextShort()	Đọc một giá trị kiểu short.
        // nextLong()	Đọc một giá trị kiểu long.

        System.out.print("Nhap mot tu bat ky: ");
        String chuoi_ky_tu = input.nextLine();
        System.out.println(chuoi_ky_tu);
        input.close();

    }
}