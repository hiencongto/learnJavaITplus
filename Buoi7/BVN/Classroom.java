package Buoi7.BVN;

public class Classroom {
    private String name;

    public Classroom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

