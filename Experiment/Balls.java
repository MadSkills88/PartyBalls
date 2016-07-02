/*    */ package Experiment;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics;
/*    */ 
/*    */ public class Balls
/*    */ {
/* 12 */   int x = random(1000);
/* 13 */   int y = random(1000);
/* 14 */   double speedX = random(15);
/* 15 */   double speedY = random(15);
/* 16 */   int radius = random(40) + 10;
/* 17 */   int red = random(255);
/* 18 */   int green = random(255);
/* 19 */   int blue = random(255);
/* 20 */   int i = 0;
/*    */ 
/*    */   public int random(int maxRange)
/*    */   {
/*  9 */     return (int)Math.round(Math.random() * maxRange);
/*    */   }
/*    */ 
/*    */   public void draw(Graphics g)
/*    */   {
/* 24 */     g.setColor(new Color(this.red, this.green, this.blue));
/* 25 */     g.fillOval(this.x - this.radius, this.y - this.radius, 
/* 26 */       2 * this.radius, 2 * this.radius);
/*    */   }
/*    */ 
/*    */   public void move(int widthRange, int heightRange)
/*    */   {
/* 32 */     this.x = (int)(this.x + this.speedX);
/* 33 */     this.y = (int)(this.y + this.speedY);
/*    */ 
/* 35 */     if (this.x - this.radius < 0)
/*    */     {
/* 37 */       this.speedX = (-this.speedX);
/* 38 */       this.x = this.radius;
/* 39 */     } else if (this.x + this.radius > widthRange)
/*    */     {
/* 41 */       this.speedX = (-this.speedX);
/* 42 */       this.x = (widthRange - this.radius);
/*    */     }
/*    */ 
/* 45 */     if (this.y - this.radius < 0)
/*    */     {
/* 47 */       this.speedY = (-this.speedY);
/* 48 */       this.y = this.radius;
/* 49 */     } else if (this.y + this.radius > heightRange)
/*    */     {
/* 51 */       this.speedY = (-this.speedY);
/* 52 */       this.y = (heightRange - this.radius);
/*    */     }
/*    */   }
/*    */ }

/* Location:           /Users/timcoker/Desktop/PartyBalls.jar
 * Qualified Name:     Experiment.Balls
 * JD-Core Version:    0.6.0
 */