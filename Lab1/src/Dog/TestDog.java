package Dog;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Masi", 2);
        Dog d2 = new Dog("Bublik", 5);
        Dog d3 = new Dog("Villi");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
