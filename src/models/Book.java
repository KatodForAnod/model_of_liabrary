package models;

import java.util.List;

public class Book {
    private String name;
    private String author;
    private int id;
    private Double rating;
    private String Description;
    private List<String> comments;

    public Book(String name, String author, int id, Double rating, String description, List<String> comments) {
        this.name = name;
        this.author = author;
        this.id = id;
        this.rating = rating;
        Description = description;
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}
