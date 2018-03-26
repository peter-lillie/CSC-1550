package Exercise2;

// ************************************************************
// VoteCounterPanel.java
//
// Demonstrates a graphical user interface and event listeners to
// tally votes for two candidates, Joe and Sam.
// ************************************************************
import java.awt.*;
import java.awt.event.*;
import javax. swing. *;
public class VoteCounterPanel extends JPanel {
    private int votesForJoe, votesForSam;
    private JButton joe, sam;
    private JLabel labelJoe, labelSam;

    // ------------------------------------------------
// Constructor: Sets up the GUI.
// ------------------------------------------------
    public VoteCounterPanel() {
        votesForJoe = 0;
        joe = new JButton("Vote for Joe");
        sam = new JButton("Vote for Sam");
        joe.addActionListener(new JoeButtonListener());
        sam.addActionListener(new SamButtonListener());
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        add(joe);
        add(sam);
        add(labelJoe);
        add(labelSam);
        setPreferredSize(new Dimension(300, 400));
        setBackground(Color.cyan);
    }

    // **************************************************
// Represents a listener for button push (action) events
// **************************************************
    private class JoeButtonListener implements ActionListener {
        //---------------------------------------------
// Updates the counter and label when Vote for Joe
// button is pushed
//---------------------------------------------
        public void actionPerformed(ActionEvent event) {
            votesForJoe++;
            labelJoe.setText("Votes for Joe: " + votesForJoe);
        }
    }
    private class SamButtonListener implements ActionListener {
        //---------------------------------------------
// Updates the counter and label when Vote for Joe
// button is pushed
//---------------------------------------------
        public void actionPerformed(ActionEvent event) {
            votesForSam++;
            labelSam.setText("Votes for Sam: " + votesForSam);
        }
    }
}

