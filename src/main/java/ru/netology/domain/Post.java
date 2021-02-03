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

    private String postType;     //V2
    private boolean canPin;     //V2
    private boolean canDelete;  //V2
    private boolean canEdit;    //V2
    private boolean isPinned;   //V2
    private boolean markedAsAds;//V2
    private boolean isFavourite;//V2

// + get/set на все поля

}
