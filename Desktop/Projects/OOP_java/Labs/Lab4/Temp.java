public class Test {

    public static void main(String[] args) {
        Nameable name = new Student("Temp");
        System.out.println(name.getName());
        name = new Planet("Pluto");
        System.out.println(name.getName());
    }
}
