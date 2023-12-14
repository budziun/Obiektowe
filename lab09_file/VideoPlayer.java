class VideoPlayer implements MediaPlayer {
    public String currentTrack;

    @Override
    public void play(String trackName) {
        System.out.println("Odtwarzanie wideo: " + trackName);
        currentTrack = trackName;
    }

    @Override
    public void pause() {
        System.out.println("Zatrzymano odtwarzanie wideo");
    }

    @Override
    public String getCurrentTrack() {
        return currentTrack;
    }
}