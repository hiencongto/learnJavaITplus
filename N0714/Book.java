package N0714;

import java.io.Serializable;

public class Book implements Serializable {
    private static int INDEX = 0;
    private int id;
    private String name;
    private String publishing;

    public Book() {

    }

    public Book(String name, String publishing) {
        this.id = ++INDEX;
        this.name = name;
        this.publishing = publishing;
    }

    public Book(int id, String name, String publishing) {
        this.id = id;
        this.name = name;
        this.publishing = publishing;
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

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    // thong tin sach
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", publishing=" + publishing + "]";
    }

}
