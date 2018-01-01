package BeatBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {
    JFrame frame;
    //почему отдельно вынесли?
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buttonLabel = new JButton("Change Label");
        buttonLabel.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change Circle");
        buttonLabel.addActionListener(new ColorListener());

        label = new JLabel("I am a laber");

        MyDrawPanel panel = new MyDrawPanel();

       frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.EAST, buttonLabel);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(300,300);
        frame.setVisible(true);


    }

   public class LabelListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            label.setText("OUCH!!!");
        }
    }

    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
}
