/**
 * B09_Movie — Represents a movie. Extends B07_Video.
 * Additional property: rating (double)
 */
public class B09_Movie extends B07_Video {

    private double rating;

    public B09_Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    @Override
    public String getInfo() {
        return "Movie{" +
                "title='" + getTitle() + '\'' +
                ", duration=" + getDuration() + "min" +
                ", rating=" + rating +
                '}';
    }
}