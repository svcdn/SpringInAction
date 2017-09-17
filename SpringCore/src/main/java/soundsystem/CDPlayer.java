package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired(required = false)
    public void CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    /*
    @Autowired
    public void setCompactDisk(CompactDisc cd){
        this.cd = cd;
    }

    @Autowired
    public void insertDisc(CompactDisc cd){
        this.cd = cd;
    }
    */
    public void play() {
        cd.play();
    }
}
