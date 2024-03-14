package Task1;

public class Main {
    public static void main(String[] args) {

        Outprint outPrint = new Outprint();
        //   System.out.println("flows.methodA(\"Hello, world\");");
        //   flows.methodA("Hello, world");
        System.out.println("outPrint.methodA();");
        outPrint.methodA("start");

        System.out.println("outPrint.methodB();");
        outPrint.methodB("Hello, world");

        System.out.println("outPrint.methodC();");
        outPrint.methodC("Hello, world");

        System.out.println("outPrint.methodD();");
        outPrint.methodD(25);
    }
}