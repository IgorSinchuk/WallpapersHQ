package com.nonexistentware.igor.wallpapershq.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nonexistentware.igor.wallpapershq.Interface.ItemClickListener;
import com.nonexistentware.igor.wallpapershq.R;


public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView categoryName, description;
    public ImageView coverImage;

    ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public CategoryViewHolder(@NonNull View itemView) {
        super(itemView);
        categoryName = (TextView) itemView.findViewById(R.id.name);
        description = (TextView) itemView.findViewById(R.id.description);
        coverImage = (ImageView) itemView.findViewById(R.id.image);

        description.setVisibility(View.INVISIBLE);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onclick(view, getAdapterPosition());
    }
}
