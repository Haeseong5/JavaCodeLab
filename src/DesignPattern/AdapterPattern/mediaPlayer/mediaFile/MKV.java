package DesignPattern.AdapterPattern.mediaPlayer.mediaFile;

import DesignPattern.AdapterPattern.mediaPlayer.MediaPackage;
import DesignPattern.AdapterPattern.mediaPlayer.MediaPlayer;

public class MKV implements MediaPackage {

    @Override
    public void playFile(String fileName) {
        System.out.println(this.getClass().getSimpleName() + " : " + fileName);
    }
}
