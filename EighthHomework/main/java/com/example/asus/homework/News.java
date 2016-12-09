package com.example.asus.homework;

/**
 * Created by asus on 2016/12/8.
 */

public class News {
    private String title;
    private String profile;
    public  News(String title,String profile){
        this.profile=profile;
        this.title=title;

    }

    public String getProfile() {
        return profile;
    }

    public String getTitle() {
        return title;
    }
}
