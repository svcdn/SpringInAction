package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    //private CompactDisc cd;

    private CompactDisc compactDisc;

    //去掉带参数构造函数
    /*
    @Autowired(required = false)
    public CDPlayer(CompactDisc cd){
        this.compactDisc = cd;
    }
    */
    //添加setCompactDisc并用@Qualifier("SP")指定自动绑定的bean
    @Autowired
    @Qualifier("SP")
    public void setCompactDisc(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }



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
