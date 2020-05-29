package com.nonexistentware.igor.wallpapershq.ViewHolder;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nonexistentware.igor.wallpapershq.Interface.ItemClickListener;
import com.nonexistentware.igor.wallpapershq.R;

public class ListWallpaperViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ItemClickListener itemClickListener;

    public ImageView wallpaper;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public ListWallpaperViewHolder(@NonNull View itemView) {
        super(itemView);
        wallpaper = (ImageView) itemView.findViewById(R.id.image);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onclick(view, getAdapterPosition());
    }
}
