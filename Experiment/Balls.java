package Experiment;

import java.awt.Color;
import java.awt.Graphics;

public class Balls  {
  int x = random(1000);
  int y = random(1000);
  double speedX = random(15);
  double speedY = random(15);
  int radius = random(40) + 10;
  int red = random(255);
  int green = random(255);
  int blue = random(255);
  int i = 0;

  public int random(int maxRange) {
    return (int)Math.round(Math.random() * maxRange);
  }

  public void draw(Graphics g)  {
    g.setColor(new Color(this.red, this.green, this.blue));
    g.fillOval(this.x - this.radius, this.y - this.radius, 
      2 * this.radius, 2 * this.radius);
  }

  public void move(int widthRange, int heightRange) {
    this.x = (int)(this.x + this.speedX);
    this.y = (int)(this.y + this.speedY);

    if (this.x - this.radius < 0) {
      this.speedX = (-this.speedX);
      this.x = this.radius;
    }
    else if (this.x + this.radius > widthRange) {
      this.speedX = (-this.speedX);
      this.x = (widthRange - this.radius);
    }

    if (this.y - this.radius < 0) {
      this.speedY = (-this.speedY);
      this.y = this.radius;
    } 
    else if (this.y + this.radius > heightRange)  {
      this.speedY = (-this.speedY);
      this.y = (heightRange - this.radius);
    }
  }
}
