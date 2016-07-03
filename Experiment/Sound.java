package Experiment;

import java.applet.Applet;
import java.applet.AudioClip;

public class Sound  {
  public static final Sound sound1 = new Sound("/tune3.wav");
  private AudioClip clip;

  public Sound(String filename) {
    try {
      this.clip = Applet.newAudioClip(Sound.class.getResource(filename));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void play() {
    try {
      new Thread() {
        public void run() {
          Sound.this.clip.loop();
        }
      }
      .start();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    sound1.play();
  }
}
