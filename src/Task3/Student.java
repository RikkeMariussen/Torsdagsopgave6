package Task3;

import java.util.ArrayList;

public class Student extends Person {
//Det er usynligt, men alt der står i Person står nu også i Teacher.
//Nedarvede felter (attributer, variabler)
//name
//...
ArrayList<String> passedCourse = new ArrayList<>();
    ArrayList<String> currentCourse = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourse) {
        super(name); //Read as super.Person(); -- It can be something completely different and made up, but we choose not to here'
        //We are missing the class specific variables, so we add them now.
        this.passedCourse = passedCourse;
    }

    @Override
    public boolean addCourse(String course){
if(passedCourse.contains(course)) {
    System.out.println(getName()+" has already passed " + course);
return false;
}else{
    currentCourse.add(course);
} return true;
}
}
/*3.3 Lav to ArrayList i Student kaldet passedCourses og currentCourses.
Lav to ArrayList i Teacher kaldet canTeach og currentCourses.
Lav om i konstruktørerne, så der skal gives en ArrayList passedCourses
eller canTeach med som parameter, når objektet oprettes.*/
