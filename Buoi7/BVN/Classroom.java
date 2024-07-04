package Buoi7.BVN;

public class Classroom {
    private static int INDEX = 0;
    private int id;
    private String name;

    public Classroom() {
    }

    public Classroom(String name) {
        this.id = ++INDEX;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Classroom [id=" + id + ", name=" + name + "]";
    }
}
