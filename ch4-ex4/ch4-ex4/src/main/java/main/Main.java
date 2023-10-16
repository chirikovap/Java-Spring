package main;

import configuration.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        System.out.println("Before retrieving the CommentService");
        var s1 = c.getBean(CommentService.class);
        System.out.println("After retrieving the CommentService");
    }
}
