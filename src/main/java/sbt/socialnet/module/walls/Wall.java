package sbt.socialnet.module.walls;

public interface Wall {
    Post[] getPosts();
    boolean addPost(Post post);
    int getOwner(); //Пока int, тк нет сущности User
}
