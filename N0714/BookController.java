package N0714;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BookController extends Input implements Activity {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Book> books = new ArrayList<>();

    public void menu() {
        while (true) {
            System.out.println("1: Them");
            System.out.println("2: Sua");
            System.out.println("3: Xoa");
            System.out.println("4: Tim kiem");
            System.out.println("6: Hien thi toan bo sach");
            System.out.println("7. Doc sach tu file");
            System.out.println("5: Thoat");
            System.out.println("Nhap lua chon cua ban: ");
            int choice = inputScannerInt(scanner);
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    System.out.println("Nhap ten sach can tim:");
                    searchByName(inputScannerString(scanner));
                    break;
                case 5:
                    return;
                case 6:
                    displayAllBooks();
                    break;
                case 7:
                    loadBooks2FromFile();
                    break;
                default:
                    System.out.println("Khong hop le.");
            }
        }
    }

    // them sach
    @Override
    public void add() {
        System.out.println("Nhap ten sach:");
        String name = inputScannerString(scanner);
        System.out.println("Nhap nha xuat ban:");
        String publishing = inputScannerString(scanner);
        books.add(new Book(name, publishing));
    }

    // sua thong tin theo id
    @Override
    public void edit() {
        System.out.println("Nhap ID sach can sua:");
        int id = inputScannerInt(scanner);
        for (Book book : books) {
            if (book.getId() == id) {
                System.out.println("Nhap ten sach moi:");
                book.setName(inputScannerString(scanner));
                System.out.println("Nhap nha xuat ban moi:");
                book.setPublishing(inputScannerString(scanner));
                return;
            }
        }
        System.out.println("Khong trung ma");
    }

    // xoa sach theo id
    @Override
    public void remove() {
        System.out.println("Nhap ID sach can xoa:");
        int id = inputScannerInt(scanner);
        for (Book book : books) {
            if (book.getId() == id) {
                try {
                    books.remove(book);
                    System.out.println("Xoa thanh cong!");
                    return;
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }
        System.out.println("Khong trung ma.");
    }

    // tim thong tin sach theo ten
    private void searchByName(String name) {
        boolean isExistBook = false;
        for (Book book : books) {
            // khong phan biet chu hoa, chu thuong
            if (book.getName().equalsIgnoreCase(name)) {
                System.out.println(book.toString());
                isExistBook = true;
            }
        }
        if (!isExistBook) {
            System.out.println("Khong tim thay.");
        }
    }

    // ham em tu them, hien thi toan bo sach
    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    // -------------------- Noi dung bai 2 ------------------------------
    // do nội dung của 2 bài riêng nên em tạo 1 array riêng để xử lý bài 2, không
    // liên quan đến bài 1
    private ArrayList<Book> books2 = new ArrayList<>();

    // ở đây đề bài sắp xếp theo tên sách, em chưa hiểu ý nghĩa tên sách là thế nào
    // nên em làm theo cả 2
    public ArrayList<Book> sortBook2ByNameUseBubbleSort(ArrayList<Book> books) {
        int n = books.size();
        // Nếu danh sách rỗng hoặc chỉ có một phần tử, không cần sắp xếp
        if (n <= 1) {
            return books;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (books.get(j).getName().compareToIgnoreCase(books.get(j + 1).getName()) > 0) {
                    Book temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        return books;
    }

    public ArrayList<Book> sortBook2ByIdUseBubbleSort(ArrayList<Book> books) {
        int n = books.size();
        // Nếu danh sách rỗng hoặc chỉ có một phần tử, không cần sắp xếp
        if (n <= 1) {
            return books;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (books.get(j).getId() > books.get(j + 1).getId()) {
                    Book temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }
        return books;
    }

    public void loadBooks2FromFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("book.txt"));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                String[] strs = str.split(";");
                books2.add(new Book(Integer.parseInt(strs[0]), strs[1], strs[2]));
            }

            System.out.println("Tong so sach la: " + books2.size());
            for (Book book : books2) {
                System.out.println(book.toString());
            }

            ArrayList<Book> sortBook2ByIdUseBubbleSort = sortBook2ByIdUseBubbleSort(books2);
            System.out.println("Sort theo ID:");
            for (Book book : sortBook2ByIdUseBubbleSort) {
                System.out.println(book.toString());
            }

            ArrayList<Book> sortBook2ByNameUseBulleSort = sortBook2ByNameUseBubbleSort(books2);
            System.out.println("Sort theo Name:");
            for (Book book : sortBook2ByNameUseBulleSort) {
                System.out.println(book.toString());
            }
        } catch (Exception e) {
            System.out.println("Khong doc duoc file.");
        }
    }

    // public void
}
