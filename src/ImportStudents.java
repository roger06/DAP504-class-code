import java.util.ArrayList;

public class ImportStudents {

    public static String filePath = "data/students.json";

    public static void main(String[] args) {

        System.out.println("Read students from students.json\n1. Loop through\n2. read into array\n3. read into arrayList");

        Student[] studentArray = JsonToArray.jsonToArray();

        System.out.println(studentArray);

        for (Student theStudent : studentArray ) {
            System.out.println("Array "+theStudent.firstName + " " + theStudent.lastName + " "+ theStudent.email);
        }

        System.out.println("*****************************************");

        ArrayList<Student> studentArrayList = JsonToArrayList.jsonToArrayList();

        for (Student theStudent : studentArrayList ) {
            System.out.println("List : "+theStudent.firstName + " " + theStudent.lastName + " "+ theStudent.email);
        }

    }

}

