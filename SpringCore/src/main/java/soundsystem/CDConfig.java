package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")
public class CDConfig {

    @Autowired
    Environment env;

    @Bean
    @Qualifier("SP")
    public CompactDisc compactDiscSP(){
        return new SgtPeppers(env.getProperty("disc.title"),env.getProperty("disc.artist"));
    }

    @Bean
    public CompactDisc compactDiscIm(){
        return new Immortals();
    }
}
