package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import services.CommentService;

@Configuration
@ComponentScan(basePackages = "repositories")
public class ProjectConfiguration {
    @Lazy
    @Bean
    public CommentService commentService() {
        return new CommentService();
    }
}
