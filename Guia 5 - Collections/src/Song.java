public class Song {
    private String name;
    private Integer duration;
    private Genre genreName;
    private Album album;
    private Artist guestedArtist;

    public Song() {
    }

    public Song(String name, Integer duration, Genre genreName, Album album, Artist guestedArtist) {
        this.name = name;
        this.duration = duration;
        this.genreName = genreName;
        this.album = album;
        this.guestedArtist = guestedArtist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Genre getGenreName() {
        return genreName;
    }

    public void setGenreName(Genre genreName) {
        this.genreName = genreName;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getGuestedArtist() {
        return guestedArtist;
    }

    public void setGuestedArtist(Artist guestedArtist) {
        this.guestedArtist = guestedArtist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", genreName=" + genreName +
                ", album=" + album +
                ", guestedArtist=" + guestedArtist +
                '}';
    }
}
