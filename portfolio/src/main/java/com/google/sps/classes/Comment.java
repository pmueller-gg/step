package com.google.sps.classes;

public class Comment {
    private String comment;
    private String nickname;
    private long timestamp;
    private long id;

    public Comment(String comment, String nickname, long timestamp, long id) {
        this.comment = comment;
        this.nickname = nickname;
        this.timestamp = timestamp;
        this.id = id;
    }

    public String getComment() {
        return this.comment;
    }

    public String getNickName() {
        return this.nickname;
    }

    public long getTimeStamp() {
        return this.timestamp;
    }

    public long getId() {
        return this.id;
    }
}
