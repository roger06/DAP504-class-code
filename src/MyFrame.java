import javax.swing.*;

public class MyFrame extends JFrame {


     MyFrame(){

        JLabel myLabel = new JLabel("This is a label");
        JButton myButton = new JButton("Click me");
        JPanel myPanel = new JPanel();
        this.setContentPane(myPanel);
        

        this.setTitle("Let's get GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
         this.add(myLabel);
         this.add(myButton);
         this.setVisible(true);

    }


}
