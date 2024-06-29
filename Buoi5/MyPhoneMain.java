package Buoi5;

import java.util.ArrayList;
import java.util.Scanner;

public class MyPhoneMain {

    public static ArrayList<MyPhone> createList() {
        Scanner sc = new Scanner(System.in);
        ArrayList<MyPhone> myPhoneS = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String name = sc.nextLine();
            String brand = sc.nextLine();
            int quantity = Integer.parseInt(sc.nextLine());
            int price = Integer.parseInt(sc.nextLine());

            myPhoneS.add(new MyPhone(name, brand, quantity, price));
        }
        return myPhoneS;
    }

    // sort by quantity using bubble sort
    public static void displayByQuantity(ArrayList<MyPhone> myPhones) {

        for (int i = 0; i < myPhones.size() - 1; i++) {
            for (int j = 0; j < myPhones.size() - 1 - i; j++) {
                if (myPhones.get(j).getQuantity() > myPhones.get(j + 1).getQuantity()) {
                    // Hoán đổi vị trí
                    MyPhone temp = myPhones.get(j);
                    myPhones.set(j, myPhones.get(j + 1));
                    myPhones.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sắp xếp tăng dần theo quantity");
        for (MyPhone myPhone : myPhones) {
            System.out.println(myPhone.toString());
        }

    }

    // print info of the highest-price and the lowest-price product
    public static void displayByPrice(ArrayList<MyPhone> myPhoneS) {
        int theHighestPrice = myPhoneS.get(0).getPrice();
        String infoHighestPrice = myPhoneS.get(0).toString();
        int theLowestPrice = myPhoneS.get(0).getPrice();
        String infoLowestPrice = myPhoneS.get(0).toString();

        for (MyPhone myPhone : myPhoneS) {
            if (myPhone.getPrice() > theHighestPrice) {
                theHighestPrice = myPhone.getPrice();
                infoHighestPrice = myPhone.toString();
            }
            if (myPhone.getPrice() < theLowestPrice) {
                theLowestPrice = myPhone.getPrice();
                infoLowestPrice = myPhone.toString();
            }
        }

        System.out.println("San pham gia cao nhat :" + infoHighestPrice);
        System.out.println("San pham gia thap nhat :" + infoLowestPrice);

    }

    // print info product that brand = samsung
    public static void displayByBrand(ArrayList<MyPhone> myPhoneS) {
        System.out.println("Sản phẩm thương hiệu samsung : ");
        for (MyPhone myPhone : myPhoneS) {
            if (myPhone.getBrand().equals("samsung")) {
                System.out.println(myPhone.toString());
            }
        }
    }

    public static void main(String[] args) {

        // ArrayList<MyPhone> myPhoneS = new ArrayList<>();

        // myPhoneS.add(new MyPhone("iphone15", "apple", 50, 1000));
        // myPhoneS.add(new MyPhone("note24ultra", "samsung", 51, 950));
        // myPhoneS.add(new MyPhone("Reno", "oppo", 100, 750));
        // myPhoneS.add(new MyPhone("14ultra", "xiaomi", 200, 800));
        // myPhoneS.add(new MyPhone("8X", "honor", 60, 700));

        ArrayList<MyPhone> myPhoneS = createList();
        displayByPrice(myPhoneS);
        displayByBrand(myPhoneS);
        displayByQuantity(myPhoneS);

    }
}
