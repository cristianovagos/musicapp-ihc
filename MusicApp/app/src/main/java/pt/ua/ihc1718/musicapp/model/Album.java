package pt.ua.ihc1718.musicapp.model;

import java.util.List;

public class Album {
    private int id;
    private String name;
    private List<Track> tracks;
    private List<Artist> guestArtists;
    private String year;
    private String launchDate;
    private String genre;

    public Album(int id, String name, List<Track> tracks, List<Artist> guestArtists, String year, String launchDate, String genre) {
        this.id = id;
        this.name = name;
        this.tracks = tracks;
        this.guestArtists = guestArtists;
        this.year = year;
        this.launchDate = launchDate;
        this.genre = genre;
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

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public List<Artist> getGuestArtists() {
        return guestArtists;
    }

    public void setGuestArtists(List<Artist> guestArtists) {
        this.guestArtists = guestArtists;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
