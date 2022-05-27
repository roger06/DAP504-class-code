import com.google.gson.annotations.SerializedName;

public class Student {
    @SerializedName("first_name")   // perhaps not the prettiest way, but this works.
    public String firstName;

    @SerializedName("last_name")
    String lastName;
    String studentNumber;
    String email;



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

    public void showStudentNumber() {
        System.out.println(studentNumber);
    }

}
