package proxies;
import repositories.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
