/*    */ package Experiment;
/*    */ 
/*    */ import java.awt.BorderLayout;
/*    */ import java.awt.Color;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.event.MouseEvent;
/*    */ import java.awt.event.MouseListener;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class Bouncing extends JPanel
/*    */   implements MouseListener
/*    */ {
/* 19 */   protected List<Balls> balls = new ArrayList(100);
/*    */   private int width;
/*    */   private int height;
/*    */   public static final int UPDATE_RATE = 50;
/* 23 */   int count = 0;
/*    */ 
/* 25 */   public static int random(int maxRange) { return (int)Math.round(Math.random() * maxRange); }
/*    */ 
/*    */   public Bouncing(int w, int h)
/*    */   {
/* 29 */     this.width = w;
/* 30 */     this.height = h;
/* 31 */     setLayout(new BorderLayout());
/* 32 */     addMouseListener(this);
/*    */ 
/* 34 */     begin();
/*    */   }
/*    */ 
/*    */   public Dimension getPreferredSize()
/*    */   {
/* 41 */     return new Dimension(this.width, this.height);
/*    */   }
/*    */ 
/*    */   public void begin()
/*    */   {
/* 46 */     Thread t = new Thread()
/*    */     {
/*    */       public void run()
/*    */       {
/*    */         while (true) {
/* 51 */           Bouncing.this.update();
/* 52 */           Bouncing.this.repaint();
/*    */           try {
/* 54 */             Thread.sleep(20L);
/*    */           }
/*    */           catch (InterruptedException localInterruptedException)
/*    */           {
/*    */           }
/*    */         }
/*    */       }
/*    */     };
/* 60 */     t.start();
/*    */   }
/*    */ 
/*    */   public void update() {
/* 64 */     for (Balls ball : this.balls)
/* 65 */       ball.move(this.width, this.height - 50);
/*    */   }
/*    */ 
/*    */   public void paintComponent(Graphics g)
/*    */   {
/* 71 */     super.paintComponent(g);
/* 72 */     g.setColor(Color.GRAY);
/* 73 */     g.fillRect(0, 0, this.width, this.height);
/* 74 */     g.setColor(Color.WHITE);
/* 75 */     g.fillRect(0, this.height - 25, this.width, 50);
/* 76 */     g.setColor(Color.BLUE);
/*    */ 
/* 78 */     g.drawString("Number of balls created: " + this.balls.size(), 50, this.height - 10);
/* 79 */     for (Balls ball : this.balls)
/* 80 */       ball.draw(g);
/*    */   }
/*    */ 
/*    */   public void mouseClicked(MouseEvent e)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void mouseEntered(MouseEvent e)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void mouseExited(MouseEvent e)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void mousePressed(MouseEvent e) {
/* 96 */     this.count += 1;
/* 97 */     this.balls.add(new Balls());
/*    */   }
/*    */ 
/*    */   public void mouseReleased(MouseEvent e)
/*    */   {
/*    */   }
/*    */ }

/* Location:           /Users/timcoker/Desktop/PartyBalls.jar
 * Qualified Name:     Experiment.Bouncing
 * JD-Core Version:    0.6.0
 */