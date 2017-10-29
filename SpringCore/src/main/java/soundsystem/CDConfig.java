package soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CDConfig {

    @Bean
    @Qualifier("SP")
    public CompactDisc compactDiscSP(){
        return new SgtPeppers();
    }

    @Bean
    public CompactDisc compactDiscIm(){
        return new Immortals();
    }
}
