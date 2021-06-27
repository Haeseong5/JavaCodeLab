package DesignPattern.AdapterPattern.mediaPlayer.mediaFile;

import DesignPattern.AdapterPattern.mediaPlayer.MediaPlayer;

public class MP3 implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println(this.getClass().getSimpleName() + " : " + fileName);
    }
}
