public class Video implements VideoActions{

    private String title;
    private int review;
    private int views;
    private int likes;
    private boolean isPlaying;

    public Video(String title){
        this.title = title;
        this.isPlaying = false;
        this.review = 0;
        this.views = 0;
        this.likes = 0;
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void like() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        int newReview = 0;
        newReview = (int) ((this.review + review)/this.views);
        this.review = newReview;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", review=" + review +
                ", views=" + views +
                ", likes=" + likes +
                ", isPlaying=" + isPlaying +
                '}';
    }
}
