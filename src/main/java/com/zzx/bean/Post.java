package com.zzx.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/6 0006.
 */

public class Post {
    private String url;
    private String author;
    private String title;

    public Post(String author, String url, String title) {
        this.url=url;
        this.author=author;
        this.title=title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "[url]"+url+"\n"
                +"{author]"+author+"\n"
                +"[title]"+title;
    }
}
