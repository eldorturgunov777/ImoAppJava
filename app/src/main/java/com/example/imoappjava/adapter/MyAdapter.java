package com.example.imoappjava.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imoappjava.model.ListData;
import com.example.imoappjava.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private final Context context;
    private final List<ListData> list;

    public MyAdapter(Context context, List<ListData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListData data = list.get(position);
        holder.imageView.setImageResource(data.getImage());
        holder.textView.setText(data.getName());
        holder.desc.setText(data.getDesc());
        holder.count.setText(Integer.toString(data.getCount()));
        if (data.getCount()>9){
            holder.count.setText("9+");
        }
        if (data.getCount()>0){
            holder.count.setVisibility(View.VISIBLE);
        }else{
            holder.count.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView imageView;
        TextView textView;
        TextView desc;
        TextView count;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_profile);
            textView = itemView.findViewById(R.id.tv_fullname);
            desc = itemView.findViewById(R.id.tv_message);
            count = itemView.findViewById(R.id.tv_count);
        }
    }
}
