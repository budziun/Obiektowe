public class MediaPlayerTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();

        audioPlayer.play("Piosenka 1");
        System.out.println("Aktualny utwór: " + audioPlayer.getCurrentTrack());
        audioPlayer.pause();

        videoPlayer.play("Film 1");
        System.out.println("Aktualny utwór: " + videoPlayer.getCurrentTrack());
        videoPlayer.pause();
    }
}