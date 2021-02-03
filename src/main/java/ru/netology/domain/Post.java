package ru.netology.domain;

public class Post {
    private int postID;
    private int AuthorID;
    private int ownerID;  //id владельца стены, на которой размещена запись
    private int postTime;
    private String text;
    private int replyOwnerID;
    private int replyPostID;
    private String imageURL;
    private boolean complain; // пожаловаться
    private boolean bookmark; // в закладки

// + get/set на все поля

}
