package Exercise6;

//************************************************************
// TelephonePanel.java
//
// Lays out a (functionless) GUI like a telephone keypad with a title.
// Illustrates use of BorderLayout and GridLayout.
//************************************************************
import java.awt.*;
import javax.swing.*;
public class TelephonePanel extends JPanel
{
    public TelephonePanel()
    {
//set BorderLayout for this panel


//create a JLabel with "Your Telephone" title

        JLabel title = new JLabel("Your Telephone");

//add title label to north of this panel

        add(title, new BorderLayout());
      //  title.add(BorderLayout, North);
//create panel to hold keypad and give it a 4x3 GridLayout
        GridLayout keyLayout = new GridLayout(4,3);
//add buttons representing keys to key panel

        JPanel keypanel = new JPanel(keyLayout);
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttona = new JButton("*");
        JButton button0 = new JButton("0");
        JButton buttonp = new JButton("#");

        keypanel.add(button1);
        keypanel.add(button2);
        keypanel.add(button3);
        keypanel.add(button4);
        keypanel.add(button5);
        keypanel.add(button6);
        keypanel.add(button7);
        keypanel.add(button8);
        keypanel.add(button9);
        keypanel.add(buttona);
        keypanel.add(button0);
        keypanel.add(buttonp);


//add key panel to center of this panel
        add(keypanel, new BorderLayout());
    }
}