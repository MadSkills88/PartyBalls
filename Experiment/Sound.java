/*    */ package Experiment;
/*    */ 
/*    */ import java.applet.Applet;
/*    */ import java.applet.AudioClip;
/*    */ 
/*    */ public class Sound
/*    */ {
/*  7 */   public static final Sound sound1 = new Sound("/tune3.wav");
/*    */   private AudioClip clip;
/*    */ 
/*    */   public Sound(String filename)
/*    */   {
/*    */     try
/*    */     {
/* 11 */       this.clip = Applet.newAudioClip(Sound.class.getResource(filename));
/*    */     } catch (Exception e) {
/* 13 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   public void play() {
/*    */     try {
/* 18 */       new Thread() {
/*    */         public void run() {
/* 20 */           Sound.this.clip.loop();
/*    */         }
/*    */       }
/* 22 */       .start();
/*    */     } catch (Exception ex) {
/* 24 */       ex.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 29 */     sound1.play();
/*    */   }
/*    */ }

/* Location:           /Users/timcoker/Desktop/PartyBalls.jar
 * Qualified Name:     Experiment.Sound
 * JD-Core Version:    0.6.0
 */