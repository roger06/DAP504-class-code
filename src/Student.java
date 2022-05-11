public class Student extends User {
    
   
    String studentNumber;

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
