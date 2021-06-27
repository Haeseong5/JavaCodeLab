package DesignPattern.AdapterPattern;

import DesignPattern.AdapterPattern.mediaPlayer.MediaPlayer;
import DesignPattern.AdapterPattern.mediaPlayer.adapter.FormatAdapter;
import DesignPattern.AdapterPattern.mediaPlayer.mediaFile.MKV;
import DesignPattern.AdapterPattern.mediaPlayer.mediaFile.MP3;
import DesignPattern.AdapterPattern.mediaPlayer.mediaFile.MP4;

public class Player {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MP3();
        mediaPlayer.play("거북이.mp3");

        mediaPlayer = new FormatAdapter(new MP4());
        mediaPlayer.play("박수.MP4");

        mediaPlayer = new FormatAdapter(new MKV());
        mediaPlayer.play("빙고.MKV");
    }
}
