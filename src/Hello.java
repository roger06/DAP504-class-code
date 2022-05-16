import java.util.ArrayList;

public class Hello {

    static ArrayList<User> userList = new ArrayList<User>();

    public static void main(String[] args) {

//        not here we're not instantiating an object but neither are we accessing a static method
        int userNum = new MyScanner().getUserInput();

        System.out.println("You entered: " + userNum);





    }

}

