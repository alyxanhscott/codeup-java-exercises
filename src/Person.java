public class Person {
    private static String name;

    public static String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public void sayHello() {
        System.out.println("hello from " + name);
    }

    public static void main(String[] args) {

        Person p = new Person("Allie Scott");

        System.out.println(getName());

    }


}
