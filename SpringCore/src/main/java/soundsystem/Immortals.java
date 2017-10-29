package soundsystem;


import org.springframework.stereotype.Component;

//为组件命名
@Component("bigHero6")
public class Immortals implements CompactDisc {

    private String title = "Immortals";
    private String artist = "Fall Out Boy";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
