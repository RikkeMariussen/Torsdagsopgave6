package Task4;

import java.util.ArrayList;

public class BootyBuilder {
    ArrayList<Shape> listOfBooties = new ArrayList<>();
   // int totalArea;

    public BootyBuilder(){
    }

    public void addBooty(Shape s){
        listOfBooties.add(s);
    }

    /*
    public double getTotalArea2(){
        double sum = 0.00;
        for(Shape bBooty : listOfBooties){
            if(bBooty instanceof Square) {
                sum += ((Square) bBooty).getArea();
            } else if (bBooty instanceof Circle){
                sum += ((Circle) bBooty).getArea();
            }
        }
        return sum;
    }
    */

    public double getTotalArea(){
        double totalArea = 0;
        for(int i = 0; i < listOfBooties.size() ; i++){
            totalArea += listOfBooties.get(i).getArea();
        }
        return totalArea;
    }


}
