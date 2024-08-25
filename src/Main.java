//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Video[] videos = new Video[3];

        videos[0] = new Video("First Video");
        videos[1] = new Video("Second Video");
        videos[2] = new Video("Third Video");

        Apprentice[] apprentices = new Apprentice[2];

        apprentices[0] = new Apprentice("John Doe", 30, "M", "johnDoe");
        apprentices[1] = new Apprentice("Jane Doe", 30, "F", "janeDoe");

        View[] views = new View[2];
        views[0] = new View(apprentices[0], videos[0]);
        views[0].review();
        System.out.println(views[0]);

        views[1] = new View(apprentices[1], videos[0]);
        views[1].review(87.3f);
        System.out.println(views[1]);
    }
}