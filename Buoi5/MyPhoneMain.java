package learnJavaITplus.Buoi5;

import java.util.ArrayList;

public class MyPhoneMain {

    // sort by quantity using bubble sort
    public static ArrayList<MyPhone> displayByQuantity(ArrayList<MyPhone> myPhones) {

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
        return myPhones;

    }

    public static void displayByPrice(ArrayList<MyPhone> myPhoneS) {
        int theHighestPrice = myPhoneS.get(0).getPrice();
        String infoHighestPrice = myPhoneS.get(0).toString();
        int theLowestPrice = myPhoneS.get(0).getPrice();
        String infoLowestPrice = myPhoneS.get(0).toString();

        for (MyPhone myPhone : myPhoneS) {
            if (myPhone.getPrice() > theHighestPrice) {
                infoHighestPrice = myPhone.toString();
            }
            if (myPhone.getPrice() < theLowestPrice) {
                infoLowestPrice = myPhone.toString();
            }
        }

        System.out.println("San pham gia cao nhat :" + infoHighestPrice);
        System.out.println("San pham gia thap nhat :" + infoLowestPrice);

    }

    public static void main(String[] args) {

        ArrayList<MyPhone> myPhoneS = new ArrayList<>();

        myPhoneS.add(new MyPhone("iphone15", "apple", 50, 1000));
        myPhoneS.add(new MyPhone("note24ultra", "samsung", 51, 950));
        myPhoneS.add(new MyPhone("8X", "honor", 60, 700));
        myPhoneS.add(new MyPhone("Reno", "oppo", 100, 750));
        myPhoneS.add(new MyPhone("14ultra", "xiaomi", 200, 800));

        displayByPrice(myPhoneS);
        displayByQuantity(myPhoneS);

        for (MyPhone myPhone : myPhoneS) {
            System.out.println(myPhone.toString());
        }

    }
}
