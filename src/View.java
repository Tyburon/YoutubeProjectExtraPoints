public class View {

    private Apprentice viewer;
    private Video video;

    public View(Apprentice viewer, Video video) {
        this.viewer = viewer;
        this.video = video;
        this.viewer.setWatchedVideosCount(viewer.getWatchedVideosCount() + 1);
        this.video.setViews(video.getViews() + 1);
    }

    public void review(){
        this.video.setReview(5);
    }

    public void review(int rate){
        this.video.setReview(rate);
    }

    public void review(float ratePercentage){
        int rate=0;
        if(ratePercentage <= 20){
            rate = 3;
        }else if(ratePercentage <= 50){
            rate = 5;
        }else if(ratePercentage <= 90){
            rate = 8;
        }else{
            rate = 10;
        }
        this.video.setReview(rate);
    }

    public Apprentice getViewer() {
        return viewer;
    }

    public void setViewer(Apprentice viewer) {
        this.viewer = viewer;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "View{" +
                "viewer=" + viewer +
                ", video=" + video +
                '}';
    }
}
