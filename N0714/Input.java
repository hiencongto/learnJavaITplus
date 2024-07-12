package N0714;

import java.util.Scanner;

public class Input {

    // nhap sai kieu int thi nhap lai
    public Integer inputScannerInt(Scanner scanner) {
        while (true) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                return num;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // nhap sai kieu string thi nhap lai
    // theo em biet thi nhap string k co exception nhung van lam theo de bai
    public String inputScannerString(Scanner scanner) {
        while (true) {
            try {
                String str = scanner.nextLine();
                return str;
            } catch (Exception e) {
                System.out.println("Hay nhap lai");
            }
        }
    }
}
