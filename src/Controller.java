import javax.swing.*;
import java.util.ArrayList;

public class Controller {

    static ArrayList<User> userList = new ArrayList<User>();

    public static void main(String[] args) {

        JLabel myLabel = new JLabel("This is a label");
        
        JFrame frame = new JFrame();
        frame.setTitle("Let's get GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        frame.add(myLabel);

        frame.setVisible(true);

    }

}

