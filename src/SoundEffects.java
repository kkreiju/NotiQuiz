import java.io.File;
import javax.sound.sampled.*;

public class SoundEffects {
    public void playTrack(String sfx){
        try {
            File music = new File("resources\\" + sfx);
            AudioInputStream audiostream = AudioSystem.getAudioInputStream(music);
            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);
            clip.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
