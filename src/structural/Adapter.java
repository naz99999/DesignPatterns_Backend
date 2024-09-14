package structural;

interface MediaPlayer {
    void play(String audioFile, String filename);
}

interface AdvancedMediaPlayer {
    void playVlc(String filename);

    void playMp4(String filename);
}

class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file " + filename);
    }

    @Override
    public void playMp4(String filename) {
    }
}

class Mp4 implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file " + filename);
    }
}

class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String file) {
        if (file.equalsIgnoreCase("vlc")) {
            this.advancedMediaPlayer = new VlcPlayer();
        } else {
            this.advancedMediaPlayer = new Mp4();
        }
    }

    @Override
    public void play(String file, String filename) {
        if (file.equalsIgnoreCase("vlc")) {
            this.advancedMediaPlayer.playVlc(filename);
        } else {
            this.advancedMediaPlayer.playMp4(filename);
        }

    }
}

class Adapter {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaAdapter("vlc");
        mediaPlayer.play("vlc", "heronaruto");

    }
}

