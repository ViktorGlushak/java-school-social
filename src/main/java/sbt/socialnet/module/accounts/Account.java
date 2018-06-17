package sbt.socialnet.module.accounts;

public interface Account {
    String getEmail();
    String getPasswordHash();
    Profile getProfile();
}
