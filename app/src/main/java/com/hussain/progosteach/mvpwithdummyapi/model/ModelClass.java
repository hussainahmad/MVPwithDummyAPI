package com.hussain.progosteach.mvpwithdummyapi.model;

/**
 * Created by Hussain Sherwani
 * on 08-Jun-17
 * email: hussain.ahmed@progos.org .
 */

public class ModelClass {
    private int userId;
    private int id;
    private String title;
    private String body;

    public ModelClass(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return "ModelClass [userId=" + userId + ", id" + id + ", title=" + title + ", body=" + body + " ]";
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}