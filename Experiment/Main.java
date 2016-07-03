package Experiment;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
  public static void main(String[] args)  {
    Sound.sound1.play();
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        JFrame f = new JFrame("Bouncing Balls -- With *Richard Bao*");
        f.setDefaultCloseOperation(3);

        f.setContentPane(new Bouncing(1280, 750));
        f.pack();
        f.setVisible(true);
      }
    });
  }
}
