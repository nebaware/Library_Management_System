package model;

public class Author {
    private String name;
    private String biography;
 private String position;
    public Author(String name, String biography String position) {
        this.name = name;
        this.biography = biography;
        this.position =position;
    }

    public String getName() {
        return name;
    }
public String getPosion() {
        return position;
    }
    public String getBiography() {
        return biography;
    }
}
