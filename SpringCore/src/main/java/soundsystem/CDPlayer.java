package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    //private CompactDisc cd;

    private CompactDisc compactDisc;


    @Autowired(required = false)
    public CDPlayer(CompactDisc cd){
        this.compactDisc = cd;
    }


    /*
    @Autowired
    public void setCompactDisc(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }
    */


    /*
    @Autowired
    public void insertDisc(CompactDisc cd){
        this.cd = cd;
    }
    */
    public void play() {
        compactDisc.play();
    }
}
