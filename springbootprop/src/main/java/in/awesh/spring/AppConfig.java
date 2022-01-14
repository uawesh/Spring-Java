package in.awesh.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@Configuration
@ComponentScan("in.awesh.spring")
@PropertySource("classpath:app.txt")
public class AppConfig {

}
