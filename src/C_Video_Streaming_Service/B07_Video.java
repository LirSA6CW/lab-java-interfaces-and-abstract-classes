/**
 * B07_Video — Abstract base class for all video types in the streaming service.
 * Section 3 of the lab.
 * Subclasses: B08_TvSeries, B09_Movie
 */
public abstract class B07_Video {

    private String title;
    private int duration; // in minutes

    public B07_Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // --- Getters and Setters ---

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    /**
     * Returns a readable string with all video properties.
     * Each subclass must implement this method.
     */
    public abstract String getInfo();
}