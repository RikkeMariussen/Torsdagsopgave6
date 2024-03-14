package Task1;

public class Outprint {
    public void methodA(String input) {
        System.out.println("J");
        System.out.println(methodC(input));
        System.out.println("V");
        System.out.println(methodC(input));

    }

    public void methodB(String start) {
        System.out.println('E');
        System.out.println('R');
    }

    public String methodC(String input) {
        input = "A";
        return input;
    }

    public void methodD(int number) {
        System.out.println("S");
        if (number > 5) {
            System.out.println("J");
        }
        System.out.println("O");
        System.out.println("V");
        System.out.println("T");

    }
}