package soundsystem;

import org.springframework.stereotype.Component;

//为组件命名
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper' s Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {

        System.out.println("Playing " + title + " by " + artist);

    }
}
