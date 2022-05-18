import java.util.ArrayList;

public class Hello {

    static ArrayList<User> userList = new ArrayList<User>();

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.firstName = "Bob";

        Student student2 = new Student();
        student2.firstName = "Susan";

        UserManager.selectStudent(student1, student2);


    }

}

