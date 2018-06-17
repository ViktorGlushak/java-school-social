package sbt.socialnet.module.walls;


public interface Post {
    int getAuthor(); //Пока int, тк нет сущности User
    String getBody();
    Comment[] getComments();
    boolean addComent(Comment comment);
}
