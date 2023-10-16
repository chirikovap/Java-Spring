package main;

import configuration.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext( ProjectConfiguration.class);
        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(CommentService.class);
        boolean b = s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(b);
    }
}
