import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton myButton;
    JLabel myLabel;

    MyFrame(){

        myLabel = new JLabel("This is a label");
        myButton = new JButton("Click me");


        JPanel myPanel = new JPanel();
        this.setContentPane(myPanel);

        myButton.addActionListener(this);

        this.setTitle("Let's get GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
         this.add(myLabel);
         this.add(myButton);
         this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == myButton) {

                this.myLabel.setText("Ouch, you clicked me!");

            }
    }
}
