package learnJavaITplus.Buoi5;

import java.util.ArrayList;

public class MyPhoneMain {

    public static ArrayList<MyPhone> sortByQuantity(ArrayList<MyPhone> myPhones) {

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

    public static void main(String[] args) {

        ArrayList<MyPhone> myphones = new ArrayList<>();

        myphones.add(new MyPhone("iphone15", "apple", 50, 1000));
        myphones.add(new MyPhone("note24ultra", "samsung", 51, 950));
        myphones.add(new MyPhone("8X", "honor", 60, 700));
        myphones.add(new MyPhone("Reno", "oppo", 100, 750));
        myphones.add(new MyPhone("14ultra", "xiaomi", 200, 800));

        sortByQuantity(myphones);

        for (MyPhone myphone : myphones) {
            System.out.println(myphone.toString());
        }

    }
}
