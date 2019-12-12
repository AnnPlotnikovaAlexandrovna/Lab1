import java.lang.*;
public class Book {
    private String color;
    private int age;

    public Book(String c, int a){
        color = c;
        age = a;
    }
    public Book(String c){
        color = c;
        age = 9;
    }
    public Book(){
        color = "Green";
        age = 9;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.color+", color "+this.age;
    }
    public void intoBookAge(){
        System.out.println(color+"book "+age+" years.");
    }
}

