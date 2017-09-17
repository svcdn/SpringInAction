package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//设置扫描的基础包
@ComponentScan("soundsystem")
//@ComponentScan(basePackages = "soundsystem")
//多个基础包
//@ComponentScan(basePackages = {"soundsystem","video"})
//类名设置基础包
//@ComponentScan(basePackageClasses = {CDPlayer.class,DVDPlayer.class})
public class CDPlayerConfig {

}
