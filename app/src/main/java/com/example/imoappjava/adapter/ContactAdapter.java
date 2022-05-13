package com.example.imoappjava.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imoappjava.R;
import com.example.imoappjava.model.ListContacts;
import com.example.imoappjava.model.ListData;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

/**
 * Created by Eldor Turgunov on 13.05.2022.
 * Imo App Java
 * eldorturgunov777@gmail.com
 */
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    private final Context context;
    private final List<ListContacts> contacts;

    public ContactAdapter(Context context, List<ListContacts> contacts) {
        this.context = context;
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {
        ListContacts data = contacts.get(position);
        holder.imageView.setImageResource(data.getImage());
        holder.textView.setText(data.getName());

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_profile);
            textView = itemView.findViewById(R.id.tv_fullname);
        }
    }
}
