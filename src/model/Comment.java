package model;

import java.util.Date;

public class Comment {
    private Long id;
    private Long user_id;
    private Long book_id;
    private String comment;
    private Double rating_value;
    private Date created_at;

    public Comment(Long id, Long user_id, Long book_id, String comment, Double rating_value){
        this.id = id;
        this.user_id = user_id;
        this.book_id = book_id;
        this.comment = comment;
        this.rating_value = rating_value;
        this.created_at = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Double getRating_value() {
        return rating_value;
    }

    public void setRating_value(Double rating_value) {
        this.rating_value = rating_value;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}
