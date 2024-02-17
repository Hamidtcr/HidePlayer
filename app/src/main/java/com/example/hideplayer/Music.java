package com.example.hideplayer;

public class Music {

    private int id;
    private String MusicName;
    private String singerName;
    private int musicResId;
    private int SingerResId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusicName() {
        return MusicName;
    }

    public void setMusicName(String musicName) {
        MusicName = musicName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getMusicResId() {
        return musicResId;
    }

    public void setMusicResId(int musicResId) {
        this.musicResId = musicResId;
    }

    public int getSingerResId() {
        return SingerResId;
    }

    public void setSingerResId(int singerResId) {
        SingerResId = singerResId;
    }
}
