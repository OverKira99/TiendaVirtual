package com.alejandrobeltran.tiendavirtual;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private ArrayList<Category> listCategory;

    public CategoryAdapter(ArrayList<Category> listObjets) {
        this.listCategory = listObjets;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_category, parent, false);
        return new ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        holder.associate(listCategory.get(position));
    }

    @Override
    public int getItemCount() {
        return listCategory.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView myImage;
        private TextView nameCategory;
        private CardView cvColor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            myImage = itemView.findViewById(R.id.iv_image_category);
            nameCategory = itemView.findViewById(R.id.tv_category_name);
            cvColor =itemView.findViewById(R.id.cv_color_category);

        }

        public void associate(Category myCategory) {
            nameCategory.setText(myCategory.getNameCategory());
            cvColor.setCardBackgroundColor(myCategory.getColorCategory());
            Picasso.get().load(myCategory.getIconCategory()).into(myImage);
        }
    }
}