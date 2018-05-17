package pt.ua.ihc1718.musicapp.model;

import java.util.List;

public class Artist {
    private int id;
    private String name;
    private String biography;
    private List<Album> top3Albums;
    private List<Track> top3Tracks;

    public Artist(int id, String name, String biography, List<Album> top3Albums, List<Track> top3Tracks) {
        this.id = id;
        this.name = name;
        this.biography = biography;
        this.top3Albums = top3Albums;
        this.top3Tracks = top3Tracks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<Album> getTop3Albums() {
        return top3Albums;
    }

    public void setTop3Albums(List<Album> top3Albums) {
        this.top3Albums = top3Albums;
    }

    public List<Track> getTop3Tracks() {
        return top3Tracks;
    }

    public void setTop3Tracks(List<Track> top3Tracks) {
        this.top3Tracks = top3Tracks;
    }
}
