/*    */ package Experiment;
/*    */ 
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.SwingUtilities;
/*    */ 
/*    */ public class Main
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  9 */     Sound.sound1.play();
/* 10 */     SwingUtilities.invokeLater(new Runnable() {
/*    */       public void run() {
/* 12 */         JFrame f = new JFrame("Bouncing Balls -- With *Richard Bao*");
/* 13 */         f.setDefaultCloseOperation(3);
/*    */ 
/* 15 */         f.setContentPane(new Bouncing(1280, 750));
/* 16 */         f.pack();
/* 17 */         f.setVisible(true);
/*    */       }
/*    */     });
/*    */   }
/*    */ }

/* Location:           /Users/timcoker/Desktop/PartyBalls.jar
 * Qualified Name:     Experiment.Main
 * JD-Core Version:    0.6.0
 */