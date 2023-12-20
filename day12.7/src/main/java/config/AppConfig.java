package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //mandatory cls level annotation
@ComponentScan(basePackages = {"dependency","dependent"})
public class AppConfig {

}
