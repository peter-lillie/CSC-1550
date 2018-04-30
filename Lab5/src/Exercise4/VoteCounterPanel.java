package Exercise4;

// ************************************************************
// VoteCounterPanel.java
//
// Demonstrates a graphical user interface and event listeners to
// tally votes for two candidates, Joe and Sam.
// ************************************************************
import java.awt.*;
import java.awt.event.*;
import javax. swing.*;

public class VoteCounterPanel extends JPanel {
    private int votesForJoe, votesForSam;
    private JButton joe, sam;
    private JLabel labelJoe, labelSam, labelWinning;

    // ------------------------------------------------
// Constructor: Sets up the GUI.
// ------------------------------------------------
    public VoteCounterPanel() {
        votesForJoe = 0;
        joe = new JButton("Vote for Joe");
        sam = new JButton("Vote for Sam");
        joe.addActionListener(new Exercise4.VoteCounterPanel.VoteButtonListener());
        sam.addActionListener(new Exercise4.VoteCounterPanel.VoteButtonListener());
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        labelWinning = new JLabel();
        add(joe);
        add(sam);
        add(labelJoe);
        add(labelSam);
        add(labelWinning);
        setPreferredSize(new Dimension(250, 150));
        setBackground(Color.cyan);
    }

    // **************************************************
// Represents a listener for button push (action) events
// **************************************************
    private class VoteButtonListener implements ActionListener {
        //---------------------------------------------
// Updates the counter and label when Vote for Joe
// button is pushed
//---------------------------------------------
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == joe) {
                votesForJoe++;
                labelJoe.setText("Votes for Joe: " + votesForJoe);
            }
            else if(event.getSource() == sam) {
                votesForSam++;
                labelSam.setText("Votes for Sam: " + votesForSam);
            }

            if(votesForSam > votesForJoe) {
                labelWinning.setText("Sam is winning!");
            }
            else if(votesForJoe == votesForSam) {
                labelWinning.setText("The contestants are tied!");
            }
            else {
                labelWinning.setText("Joe is winning!");
            }
        }
    }
}
