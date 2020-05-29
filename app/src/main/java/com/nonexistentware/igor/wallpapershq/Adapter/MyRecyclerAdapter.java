package com.nonexistentware.igor.wallpapershq.Adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bluehomestudio.progresswindow.ProgressWindow;
import com.nonexistentware.igor.wallpapershq.Common.Common;
import com.nonexistentware.igor.wallpapershq.Database.Recent;
import com.nonexistentware.igor.wallpapershq.Interface.ItemClickListener;
import com.nonexistentware.igor.wallpapershq.Model.WallpaperItem;
import com.nonexistentware.igor.wallpapershq.R;
import com.nonexistentware.igor.wallpapershq.ViewHolder.ListWallpaperViewHolder;
import com.nonexistentware.igor.wallpapershq.ViewWallpaper;
import com.squareup.picasso.Callback;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<ListWallpaperViewHolder> {

    private Context context;
    private List<Recent> recents;
    private ProgressWindow progressWindow;

    public MyRecyclerAdapter(Context context, List<Recent> recents) {
        this.context = context;
        this.recents = recents;
    }

    @NonNull
    @Override
    public ListWallpaperViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_wallpaper_item, parent, false);
        int height = parent.getMeasuredHeight()/2;
        itemView.setMinimumHeight(height);
        return new ListWallpaperViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListWallpaperViewHolder holder, final int position) {
        Picasso.with(context)
                .load(recents.get(position).getImageLink())
                .networkPolicy(NetworkPolicy.OFFLINE)
                .into(holder.wallpaper, new Callback() {
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError() {
                        Picasso.with(context)
                                .load(recents.get(position).getImageLink())
                                .error(R.drawable.ic_terrain_black_24dp)
                                .into(holder.wallpaper, new Callback() {
                                    @Override
                                    public void onSuccess() {

                                    }

                                    @Override
                                    public void onError() {
                                        Log.e("ERROR_BASE", "Could not fetch image");
                                    }
                                });
                    }
                });

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onclick(View view, int position) {
                Intent intent = new Intent(context, ViewWallpaper.class);
                WallpaperItem wallpaperItem = new WallpaperItem();
                wallpaperItem.setCategoryId(recents.get(position).getCategoryId());
                wallpaperItem.setImageLink(recents.get(position).getImageLink());
                Common.select_image = wallpaperItem;
                Common.select_image_key = recents.get(position).getKey();
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recents.size();
    }

}
