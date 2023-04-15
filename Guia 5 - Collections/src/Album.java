public class Album {
    private Integer yearPublished;
    private String title;
    private Artist artist;

    public Album() {
    }

    public Album(Integer yearPublished, String title, Artist artist) {
        this.yearPublished = yearPublished;
        this.title = title;
        this.artist = artist;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "yearPublished=" + yearPublished +
                ", title='" + title + '\'' +
                ", artist=" + artist +
                '}';
    }
}
