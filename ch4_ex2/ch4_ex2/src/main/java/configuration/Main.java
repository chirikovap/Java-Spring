package configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;
import service.UserService;

public class Main {
    public static void main(String args [] ) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(UserService.class);
        boolean t = s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(t);
    }
}
