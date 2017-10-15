package soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
//导入XML中的CompactDisc配置
@ImportResource("classpath:cd-config.xml")
@Import(CDPlayerConfig.class)
public class SoundSystemConfig {

}
