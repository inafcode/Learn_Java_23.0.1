public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Ilham");
        sayHello("Ilham", "Naffi");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hallo " + firstName + " " + lastName);
    }
}
