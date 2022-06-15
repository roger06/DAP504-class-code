public class Hello {

    public static void main(String[] args) {

        String studentType = "fulltime";
        System.out.println(studentType);

        if (studentType == "fulltime") {
            studentType = StudentType.DA.toString();
        }

        System.out.println(studentType);

        for (StudentType x : StudentType.values() ) {

            System.out.println(x);
            
        }

    } // end main()


}

