package soundsystem;

import org.springframework.context.annotation.*;

import javax.naming.Name;

@Configuration
//导入CDConfig配置
//@Import(CDConfig.class)
//@ImportResource("classpath:beans.xml")
//设置扫描的基础包
//@ComponentScan("soundsystem")
//@ComponentScan(basePackages = "soundsystem")
//多个基础包
//@ComponentScan(basePackages = {"soundsystem","video"})
//类名设置基础包
//@ComponentScan(basePackageClasses = {CDPlayer.class,DVDPlayer.class})
public class CDPlayerConfig {

    /*
    //使用@Bean注解并添加名称
    @Bean//(name="lonelyHeartClubBand")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }
    */

    //改为默认构造函数创建bean
    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer();
    }

}
