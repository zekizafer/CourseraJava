public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person zeki = new Person();
        zeki.setAge(17);
        System.out.println(zeki.getAge());
        zeki.setSize(2);
        zeki.setWeight(80);

        zeki.scream("I am screaming right now");
        zeki.laugh();
    }
}
