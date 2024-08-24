public class Apprentice extends User{

    private String login;
    private int watchedVideosCount;

    public Apprentice(String name, int age, String gender, String login) {
        super(name, age, gender);
        this.login = login;
        this.watchedVideosCount = 0;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getWatchedVideosCount() {
        return watchedVideosCount;
    }

    public void setWatchedVideosCount(int watchedVideosCount) {
        this.watchedVideosCount = watchedVideosCount;
    }

    @Override
    public String toString() {
        return "Apprentice{" +
                "login='" + login + '\'' +
                ", watchedVideosCount=" + watchedVideosCount +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", experience=" + experience +
                '}';
    }
}
