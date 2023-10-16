package main;

import comments.Comment;
import configurations.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String [] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = c.getBean(CommentService.class);
        commentService.sendComment(new Comment());
        commentService.sendComment(new Comment());
    }
}
