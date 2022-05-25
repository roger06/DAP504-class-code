import java.util.ArrayList;

public class Hello {



    public static void main(String[] args) {

        String modCode = "Those who find themselves ridiculous, sit down next to me...";

        Student test = new Student("charlie", "Smith");

        char[] chars = modCode.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }



    }

}

