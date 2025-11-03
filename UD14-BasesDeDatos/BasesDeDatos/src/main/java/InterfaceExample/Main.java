package InterfaceExample;

public class Main {
    public static void main(String[] args) {
        ByTwo num = new ByTwo();

        Series ob;

        for (int i = 0; i < 5; i++) {
            System.out.println(num.getNext());
        }
    }
}
