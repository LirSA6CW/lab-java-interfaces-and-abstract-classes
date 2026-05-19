/**
 * B08_TvSeries — Represents a TV series. Extends B07_Video.
 * Additional property: episodes (int)
 */
public class B08_TvSeries extends B07_Video {

    private int episodes;

    public B08_TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes() { return episodes; }
    public void setEpisodes(int episodes) { this.episodes = episodes; }

    @Override
    public String getInfo() {
        return "TvSeries{" +
                "title='" + getTitle() + '\'' +
                ", duration=" + getDuration() + "min" +
                ", episodes=" + episodes +
                '}';
    }
}