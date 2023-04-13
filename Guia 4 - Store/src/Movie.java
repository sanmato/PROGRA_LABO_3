import java.util.Date;

public class Movie {
    private String name;
    private Date releaseDate;
    private Integer durationInMinutes;
    private String audienceClasification;
    private String country;
    private String description;
    private Integer stock;
    private MovieGender gender;

    private Integer popularity = 0;


    public Movie(String name, Date releaseDate, Integer durationInMinutes, String audienceClasification, String country,
            String description, Integer stock, MovieGender gender) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.durationInMinutes = durationInMinutes;
        this.audienceClasification = audienceClasification;
        this.country = country;
        this.description = description;
        this.stock = stock;
        this.gender = gender;
    }

    public Movie() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getAudienceClasification() {
        return audienceClasification;
    }

    public void setAudienceClasification(String audienceClasification) {
        this.audienceClasification = audienceClasification;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }    

    public MovieGender getGender() {
        return gender;
    }

    public void setGender(MovieGender gender) {
        this.gender = gender;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", durationInMinutes=" + durationInMinutes +
                ", audienceClasification='" + audienceClasification + '\'' +
                ", country='" + country + '\'' +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", gender=" + gender +
                ", popularity=" + popularity +
                '}';
    }
}
