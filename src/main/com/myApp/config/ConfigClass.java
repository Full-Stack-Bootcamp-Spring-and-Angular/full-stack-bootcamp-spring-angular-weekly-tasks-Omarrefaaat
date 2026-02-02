package main.com.myApp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "main.com.myApp")
@PropertySource("classpath:main/com/myApp/application.properties")
public class ConfigClass {


}
