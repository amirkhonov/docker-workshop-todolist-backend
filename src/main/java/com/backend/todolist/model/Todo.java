package com.backend.todolist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue
    private long id;

    @NotEmpty(message = "Title is required")
    private String title;

    @NotNull(message = "Target date is required")
    private Date targetDate;

    private String username;

    private boolean isCompleted;

    protected Todo() {
    }

    public Todo(String title, Date targetDate, String username) {
        super();
        this.title = title;
        this.targetDate = targetDate;
        this.username = username;
        this.isCompleted = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id + ", title=" + title + ", targetDate=" + targetDate + ", username=" + username
                + ", isCompleted=" + isCompleted + "]";
    }

}
