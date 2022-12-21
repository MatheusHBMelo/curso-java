package composicaoDeClasses.redeSocial.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime moment;

    private static final DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(String title, String content, Integer likes) {
        this.moment = LocalDateTime.now();
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComments(Comment comment){
        comments.add(comment);
    }

    public void removeComments(Comment comment){
        comments.remove(comment);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes);
        sb.append(" likes - ");
        sb.append(dtf1.format(getMoment())).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments: \n");
        for (Comment c: comments){
            sb.append(c.getText()).append("\n");
        }
        return sb.toString();
    }
}
