package DesignPattern.AdapterPattern.mediaPlayer.adapter;

import DesignPattern.AdapterPattern.mediaPlayer.MediaPackage;
import DesignPattern.AdapterPattern.mediaPlayer.MediaPlayer;

public class FormatAdapter implements MediaPlayer {

    MediaPackage mediaPackage;

    public FormatAdapter(MediaPackage mediaPackage){
        this.mediaPackage = mediaPackage;
    }

    @Override
    public void play(String fileName) {
        System.out.print("Using Adapter ---> ");
        mediaPackage.playFile(fileName);
    }
}
