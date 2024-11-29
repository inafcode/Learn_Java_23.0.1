public class DoWhileLoop {
    public static void main(String[] args) {
        var counter = 100;
//        var counter = 1;

        do {
            System.out.println("Looping " + counter);
            counter++;
        }while (counter <= 10);
    }
}
