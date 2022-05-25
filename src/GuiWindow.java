import javax.swing.*;

public class GuiWindow {
    private JPanel mainPanel;
    private JLabel myLabel;

    public static void main(String[] args) {

        JFrame frame = new JFrame("My GUI");
        frame.setContentPane(new GuiWindow().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,400);
        frame.setVisible(true);

    }
}
