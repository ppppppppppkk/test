package day22;

public class Step5 {
    public static void main(String[] args) {
        Person person1 = new Person();
       // Applicant<Person> applicant1 = new Applicant<>(Person1);
     //   Course.registerCourse1( applicant1 );
        Course.registerCourse1( new Applicant<Worker>(new Worker() ) );











    }

}
