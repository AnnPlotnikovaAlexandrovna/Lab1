import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Green ", 7);
        Book b2 = new Book("Blue ", 5);
        Book b3 = new Book("Black ");
        b3.setAge(1);
        System.out.println(b1);
        b1.intoBookAge();
        b2.intoBookAge();
        b3.intoBookAge();
    }
}
