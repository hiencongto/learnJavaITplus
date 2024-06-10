package learnJavaITplus.Buoi3;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("quân", 29, "Nam");
        Person person3 = new Person("B", 20, "Nữ", "HCM");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person2.getAddress());

        person2.setAddress("HN");
        System.out.println(person2.getAddress());

    }
}
