class AudioPlayer implements MediaPlayer {
    public String currentTrack;

    @Override
    public void play(String trackName) {
        System.out.println("Odtwarzanie audio: " + trackName);
        currentTrack = trackName;
    }

    @Override
    public void pause() {
        System.out.println("Zatrzymano odtwarzanie audio");
    }

    @Override
    public String getCurrentTrack() {
        return currentTrack;
    }
}