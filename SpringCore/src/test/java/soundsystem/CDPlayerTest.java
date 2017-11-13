package soundsystem;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SoundSystemConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer player;

    //添加@Qualifier("SP")指定自动绑定的bean
    @Qualifier("SP")
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull("cd对象为空",cd);
    }


    @Test
    public void play(){
        player.play();

        //检查控制台输出是否正确
        Assert.assertEquals("player输出不正确",
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
                systemOutRule.getLogWithNormalizedLineSeparator());
    }


}