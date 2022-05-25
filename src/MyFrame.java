import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton myButton;
    JPanel myPanel;

     MyFrame(){

        JLabel myLabel = new JLabel("This is a label");
         myPanel = new JPanel();

        myButton = new JButton("Click me");
        myButton.addActionListener(this);

        this.setContentPane(myPanel);
        this.setTitle("Let's get GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
         myPanel.add(myButton);
         myPanel.add(myLabel);
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

       if(e.getSource() == myButton) {

           System.out.println("button is clicked");
       }
       }

    }

