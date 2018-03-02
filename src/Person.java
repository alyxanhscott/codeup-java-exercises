public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello from " + name);
    }

    public static void main(String[] args) {

        Person p = new Person("Allie");

        p.sayHello();

        Person p1 = new Person("Tristan");

        p1.sayHello();

    }


}
