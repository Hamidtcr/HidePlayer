package com.example.hideplayer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {


    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MusicViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class MusicViewHolder extends RecyclerView.ViewHolder{
        private TextView itemNameMusic;
        private TextView itemNameSinger;
        private SimpleDraweeView itemCoverMusic;
        private ImageView itemMoreMusic;
        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            itemNameMusic=itemView.findViewById(R.id.nameMusicItem);
            itemNameSinger=itemView.findViewById(R.id.singerMusicItem);
            itemCoverMusic=itemView.findViewById(R.id.igMusicItem);
            itemMoreMusic=itemView.findViewById(R.id.igMoreMusicItem);
        }
        public void bindMusic(Music music){
            itemNameMusic.setText(music.getMusicName());
            itemNameSinger.setText(music.getSingerName());
        }
    }
}
