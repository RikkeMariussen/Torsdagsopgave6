package Task3;
import java.util.ArrayList;

public class Teacher extends Person {
//Det er usynligt, men alt der står i Person står nu også i Teacher.
//Nedarvede felter (attributer, variabler)
//name
//...
ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourse = new ArrayList<>();


    public Teacher(String name, ArrayList<String> canTeach) {
        super(name); //Read as super.Person(); -- It can be something completely different and made up, but we choose not to here'
        //We are missing the class specific variables, so we add them now.
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course)){
            currentCourse.add(course);
            return true;
        }else{
            System.out.println(getName() + " cannot teach " + course);
            return false;
        }
   }
}
