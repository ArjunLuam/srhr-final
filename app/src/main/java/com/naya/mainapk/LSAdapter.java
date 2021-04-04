package com.naya.mainapk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LSAdapter extends RecyclerView.Adapter<LSAdapter.ViewHolder> {
    List<ButtonNames> options;
    RecyclerViewClick recyclerViewClick;

    public LSAdapter(List<ButtonNames> options,RecyclerViewClick recyclerViewClick) {
        this.options = options;
        this.recyclerViewClick = recyclerViewClick;
    }

    @NonNull
    @Override
    public LSAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.lsitem,parent,false);
        LSAdapter.ViewHolder viewHolder = new LSAdapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LSAdapter.ViewHolder holder, int position) {
        String name = options.get(position).getName();
        holder.button.setText(name);
    }

    @Override
    public int getItemCount() {
        return options.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        Button button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            button = itemView.findViewById(R.id.button3);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recyclerViewClick.onItemClick(getAdapterPosition());

                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                }
            });
        }
    }
}
