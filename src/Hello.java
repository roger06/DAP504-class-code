import java.util.ArrayList;

public class Hello {

    static ArrayList<User> userList = new ArrayList<User>();

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setFirstName("Bob");

        System.out.println("Student 1's name is : " + student1.giveFirstName();
        Student student2 = new Student();
        student2.setFirstName("Susan");
        System.out.println("Student 2's name is : " + student2.giveFirstName());


        System.out.println(UserManager.selectStudent(student1, student2).giveFirstName());



    }

}

