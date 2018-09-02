package com.tanmoy.blogapp.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Blog {

    @Id
    @GeneratedValue
    private Long id;
    @Column( name = "title" )
    private String title;

    @Lob
    @Column( name = "text" )
    private String text;

    private Date date;

    public Blog() {
    }

    public Blog(String title, String text) {
        this.title = title;
        this.text = text;
        date = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
