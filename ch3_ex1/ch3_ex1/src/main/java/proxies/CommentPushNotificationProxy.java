package proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import repositories.Comment;

@Component
@Qualifier("PUSH")
class CommentPushNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println( "Sending push notification for comment: " + comment.getText());
    }
}
