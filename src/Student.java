public class Student   {
    
   String firstName, lastName;
    String studentNumber;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void showFullName() {

        System.out.println("Student name = "
                + firstName + "  "
                + lastName

        );
    }

    public void showStudentNumber(){
        System.out.println(studentNumber);
    }
    
}
