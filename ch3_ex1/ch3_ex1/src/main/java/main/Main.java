package main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import proxies.EmailCommentNotificationProxy;
import repositories.Comment;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(
                        ProjectConfiguration.class);
        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");
        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
