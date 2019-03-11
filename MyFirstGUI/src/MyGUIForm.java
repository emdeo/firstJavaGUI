import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// extends JFrame to inherit all java.swing properties and methods
public class MyGUIForm extends JFrame {

    // To display window with title and dimensions as specified in MyGUIForm() below
    // Objects automatically update according to modifications made in the form designer
    private JPanel rootPanel;
    private JButton myButton;
    private JLabel myLabel;
    private JTextArea myTextArea;

    public MyGUIForm(){
        // To display title, button and text field in the window (as specified in the form designer)
        add(rootPanel);

        setTitle("GUI title");
        setSize(400,500);

        // Allows to close the GUI entirely when the cross button is clicked
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // So that the button actually achieve something,
        // right-click your form button and select "Create listener"
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel, "You clicked the button");
            }
        });
    }
}
