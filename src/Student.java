public class Student extends User {
    
   
    String studentNumber;

    public void showFullName() {

        System.out.println("Student name = "
                + getFirstName() + "  "
                + lastName

        );
    }

    public void showStudentNumber(){
        System.out.println(studentNumber);
    }
    
}
