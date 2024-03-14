package Task4;

public class Main {
    public static void main(String[] args){

        BootyBuilder builder = new BootyBuilder();

        Square s1 = new Square(20.00);
        builder.addBooty(s1);

        Circle c1 = new Circle(2.00);
        builder.addBooty(c1);


        //4.3
        System.out.println(c1.getArea());
        System.out.println(s1.getArea());


        System.out.println("The total booty area is: " + builder.getTotalArea());
    }
}