package Experiment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class Bouncing extends JPanel implements MouseListener {
  protected List<Balls> balls = new ArrayList(100);
  private int width;
  private int height;
  public static final int UPDATE_RATE = 50;
  int count = 0;

  public static int random(int maxRange) { return (int)Math.round(Math.random() * maxRange); }

  public Bouncing(int w, int h) {
    this.width = w;
    this.height = h;
    setLayout(new BorderLayout());
    addMouseListener(this);

    begin();
  }

  public Dimension getPreferredSize() {
    return new Dimension(this.width, this.height);
  }

  public void begin() {
    Thread t = new Thread() {
      public void run() {
        while (true) {
          Bouncing.this.update();
          Bouncing.this.repaint();
          try {
            Thread.sleep(20L);
          }
          catch (InterruptedException localInterruptedException)
          {
          }
        }
      }
    };
    t.start();
  }

  public void update() {
    for (Balls ball : this.balls)
      ball.move(this.width, this.height - 50);
  }

  public void paintComponent(Graphics g)  {
    super.paintComponent(g);
    g.setColor(Color.GRAY);
    g.fillRect(0, 0, this.width, this.height);
    g.setColor(Color.WHITE);
    g.fillRect(0, this.height - 25, this.width, 50);
    g.setColor(Color.BLUE);

    g.drawString("Number of balls created: " + this.balls.size(), 50, this.height - 10);
    for (Balls ball : this.balls)
      ball.draw(g);
  }

  public void mouseClicked(MouseEvent e)  {}

  public void mouseEntered(MouseEvent e)  {}

  public void mouseExited(MouseEvent e) {}

  public void mousePressed(MouseEvent e) {
    this.count += 1;
    this.balls.add(new Balls());
  }

  public void mouseReleased(MouseEvent e) {}
}
