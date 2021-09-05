package com.example.room;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class roomViewAdapter extends RecyclerView.Adapter<roomViewAdapter.ViewHolder> {

    private ArrayList<Room> rooms = new ArrayList<>();

    private Context context;

    public roomViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override 
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_room_view_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull roomViewAdapter.ViewHolder holder, int position) {
        holder.roomImage.setImageResource(rooms.get(position).getImageView());
        holder.name.setText(rooms.get(position).getName());
        holder.price.setText(rooms.get(position).getPricing());
        holder.place.setText(rooms.get(position).getDesc());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return rooms.size();
    }

    public void setRoom(ArrayList<Room> rooms) {
        this.rooms = rooms;
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView roomImage;
        private TextView name, place, price;
        private CardView parent;


        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            roomImage =itemView.findViewById(R.id.roomImage);
            place = itemView.findViewById(R.id.place);
            price = itemView.findViewById(R.id.price);
            parent = itemView.findViewById(R.id.parent);
        }
    }
}