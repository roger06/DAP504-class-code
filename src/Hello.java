import java.util.ArrayList;

public class Hello {

    static ArrayList<User> userList = new ArrayList<User>();

    public static void main(String[] args) {

        Student student = new Student();
        student.firstName = "Roger";
        student.studentNumber = "123456789";
        student.showFullName();
        student.showStudentNumber();
        Tutor tutor = new Tutor();
        tutor.firstName = "Bob";
        Admin admin = new Admin();
        admin.firstName = "Kevin";

        userList.add(student);
        userList.add(tutor);
        userList.add(admin);



        for (int i = 0; i < userList.size() ; i++) {

            System.out.println(userList.get(i).firstName);
        }

        

        userList.forEach((n) -> System.out.println(n.firstName));




    }

}

