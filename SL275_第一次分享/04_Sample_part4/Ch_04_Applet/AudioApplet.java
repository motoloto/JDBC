/* <applet code="AudioApplet.class" width="500" height="600">
   </applet>
*/

/*
   appletviewer AudioApplet.java
*/
import java.awt.*;
import java.applet.*;
public class AudioApplet extends Applet {
  AudioClip loopMusic;
  public void init() {
        loopMusic = getAudioClip(getCodeBase(), "ling.au");  //music.mid
  } 
  public void start() {
      //loopMusic.play();        // play once
      loopMusic.loop();          // play loop
  }
  public void stop() {
      loopMusic.stop();
  }
}
