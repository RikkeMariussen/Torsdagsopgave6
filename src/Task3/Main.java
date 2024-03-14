package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> listOfPersons = new ArrayList<>();

        //Make a student and add what courses they have taught
        ArrayList<String> passedS1 = new ArrayList<>();
        passedS1.add("dat1");
        Student s1 = new Student("Rasmus", passedS1);
        listOfPersons.add(s1);

        //Make a teacher and add what courses they can teach
        ArrayList<String> canTeachT1 = new ArrayList<>();
        canTeachT1.add("dat1");
        Teacher t1 = new Teacher("Tess", canTeachT1);
        listOfPersons.add(t1);

        ArrayList<String> passedS2 = new ArrayList<>();
        passedS2.add("dat1");
        passedS2.add("Java 1.0");
        Student s2 = new Student("Rolf", passedS2);
        listOfPersons.add(s2);
        //New courses/currentCourses
        s2.addCourse("Java 2.0");

        ArrayList<String> passedS3 = new ArrayList<>();
        passedS3.add("dat1");
        passedS3.add("Java 1.0");
        Student s3 = new Student("Rikke", passedS3);
        listOfPersons.add(s3);
        s3.addCourse("dat2");

        //Courses skal addes hernede
        for(Person p : listOfPersons){
            System.out.println("Name: " + p.getName());
            if(p instanceof Student){
                Student student = (Student) p;
                p.addCourse("Java 1.0");
                //for nye kurser add dem her
                System.out.println("Passed Courses: " + student.passedCourse);
                System.out.println("Current Courses: " + student.currentCourse);
            }else if(p instanceof Teacher) {
                Teacher teacher = (Teacher) p;
                p.addCourse("Java 1.0");
                //for nye kurser add dem her
                System.out.println("Can Teach Courses: " + teacher.canTeach);
                System.out.println("Current Courses: " + teacher.currentCourse);
            }
            System.out.println();
        }

        //For at tilføje enkelte stud. til nye fag skal de skrives her med deres s#

        }

    }
/*Her skal vi arbejde med tre klasser hvor de to arver fra den tredje.
Vi skal se hvad der sker, når to subklasser (children) implementerer en metode forskelligt
og vi skal se hvordan subklasser kan behandles som deres superklasser.

3.3 Lav to ArrayList i Student kaldet passedCourses og currentCourses.
Lav to ArrayList i Teacher kaldet canTeach og currentCourses. Lav om i konstruktørerne,
så der skal gives en ArrayList passedCourses eller canTeach med som parameter, når objektet oprettes.;*/